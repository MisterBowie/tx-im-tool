package com.vv.im.api.service.impl;

import com.vv.im.api.service.TxImGroupService;
import com.vv.im.api.service.TxImService;
import com.vv.im.common.config.TxImConfig;
import com.vv.im.common.http.ImOkHttpSimplePostRequestExecutor;
import com.vv.im.common.http.RequestExecutor;
import com.vv.im.common.http.RequestHttp;
import com.vv.im.api.service.TxImAccountService;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.error.TxError;
import com.vv.im.common.error.TxErrorException;
import com.vv.im.common.error.TxRuntimeException;
import com.vv.im.common.utils.SigUtil;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/**
 * <prev>
 * service基类
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/12
 */

@Slf4j
public abstract class BaseTxImServiceImpl<H> implements TxImService, RequestHttp<H> {
    private TxImAccountService accountService = new TxImAccountServiceImpl(this);
    private TxImGroupService groupService = new TxImGroupServiceImpl(this);
    private int retrySleepMillis = 1000;
    private int maxRetryTimes = 5;
    private static final String VERSION = "v4";
    private static final String DEFAULT_DOMAIN = "console.tim.qq.com";
    private static final String FORMAT_URL = "https://%s/%s/%s/%s?sdkappid=%d&identifier=%s&usersig=%s&random=%d&contenttype=json";
    private TxImConfig imConfig;

    @Override
    public String post(String url, ToJson obj) throws TxErrorException {
        return this.post(url, obj.toJson());
    }

    @Override
    public String post(String url, String postData) throws TxErrorException {
        return execute(new ImOkHttpSimplePostRequestExecutor(this), url, postData);
    }

    @Override
    public String post(String url, Object obj) throws TxErrorException {
        return this.post(url, JsonBuilderUtil.toJson(obj));
    }

    /**
     * 向TX IM端发送请求，在这里执行的策略是当发生access_token过期时才去刷新，然后重新执行请求，而不是全局定时请求
     */
    @Override
    public <T, E> T execute(RequestExecutor<T, E> executor, String uri, E data) throws TxErrorException {
        int retryTimes = 0;
        do {
            try {
                return this.executeInternal(executor, uri, data);
            } catch (TxErrorException e) {
                if (retryTimes + 1 > this.maxRetryTimes) {
                    log.error("重试达到最大次数【{}】", maxRetryTimes);
                    //最后一次重试失败后，直接抛出异常，不再等待
                    throw new TxErrorException(TxError.builder()
                            .errorCode(e.getError().getErrorCode())
                            .errorInfo("TX IM服务端异常，超出重试次数！")
                            .build());
                }

                TxError error = e.getError();
                // -1 系统繁忙, 1000ms后重试
                if (error.getErrorCode() == -1) {
                    int sleepMillis = this.retrySleepMillis * (1 << retryTimes);
                    try {
                        log.warn("TX IM系统繁忙，{} ms 后重试(第{}次)", sleepMillis, retryTimes + 1);
                        Thread.sleep(sleepMillis);
                    } catch (InterruptedException e1) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    throw e;
                }
            }
        } while (retryTimes++ < this.maxRetryTimes);

        log.warn("重试达到最大次数【{}】", this.maxRetryTimes);
        throw new TxRuntimeException("TX IM服务端异常，超出重试次数");
    }

    private <T, E> T executeInternal(RequestExecutor<T, E> executor, String uri, E data) throws TxErrorException {
        try {
            T result = executor.execute(uri, data);
            log.debug("\n【请求地址】: {}\n【请求参数】：{}\n【响应数据】：{}", uri, data, result);
            return result;
        } catch (TxErrorException e) {
            TxError error = e.getError();
            if (error.getErrorCode() != 0) {
                log.error("\n【请求地址】: {}\n【请求参数】：{}\n【错误信息】：{}", uri, data, error);
                throw new TxErrorException(error, e);
            }
            return null;
        } catch (IOException e) {
            log.error("\n【请求地址】: {}\n【请求参数】：{}\n【异常信息】：{}", uri, data, e.getMessage());
            throw new TxErrorException(e);
        }
    }

    /**
     * 获取请求 URL
     *
     * @param serviceName 内部服务名
     * @param command     命令字
     * @return url
     */
    public String getUrl(String serviceName, String command) {
        String sig = getAdminUserSig();
        long random = ThreadLocalRandom.current().nextLong(0, 0x100000000L);
        return String.format(FORMAT_URL, DEFAULT_DOMAIN, VERSION, serviceName, command,
                imConfig.getAppId(), imConfig.getAdminUser(), sig, random);
    }

    /**
     * 获取签名
     *
     * @return 签名
     */
    private String getAdminUserSig() {
        if (Objects.isNull(imConfig)) {
            throw new TxErrorException("请检查是否缺少了IM配置");
        }
        return SigUtil.genUserSig(imConfig.getAdminUser(), imConfig.getExpireTime(), imConfig.getAppId(), imConfig.getKey());
    }

    /**
     * 获取签名
     *
     * @return 签名
     */
    public String getUserSig(String userId) throws TxErrorException {
        if (Objects.isNull(imConfig)) {
            throw new TxErrorException("请检查是否缺少了IM配置");
        }
        return SigUtil.genUserSig(userId, imConfig.getExpireTime(), imConfig.getAppId(), imConfig.getKey());
    }


    @Override
    public void setTxImConfig(TxImConfig imConfig) {
        this.imConfig = imConfig;
        this.initHttp();
    }

    @Override
    public TxImAccountService getAccountService() {
        return accountService;
    }

    @Override
    public TxImGroupService getGroupService() {
        return groupService;
    }

   public TxImConfig getTxImConfig(){
        return imConfig;
    }

}
