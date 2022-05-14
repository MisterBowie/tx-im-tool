package com.vv.im.common.service;

import com.vv.im.common.bean.ToJson;
import com.vv.im.common.config.TxImConfig;
import com.vv.im.common.error.TxErrorException;
import com.vv.im.common.http.RequestExecutor;

/**
 * <prev>
 * 通用的Service
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/11
 */

public interface TxService {
    /**
     * 当本Service没有实现某个API的时候，可以用这个，针对所有微信API中的POST请求.
     *
     * @param url 请求接口地址
     * @param obj 请求对象，实现了ToJson接口
     * @return 接口响应字符串
     * @throws TxErrorException 异常
     */
    String post(String url, ToJson obj) throws TxErrorException;

    /**
     * 当本Service没有实现某个API的时候，可以用这个，针对所有微信API中的POST请求.
     *
     * @param postData 请求参数json值
     * @param url      请求接口地址
     * @return 接口响应字符串
     * @throws TxErrorException 异常
     */
    String post(String url, String postData) throws TxErrorException;

    /**
     * 当本Service没有实现某个API的时候，可以用这个，针对所有微信API中的POST请求.
     *
     * @param url 请求接口地址
     * @param obj 请求对象
     * @return 接口响应字符串
     * @throws TxErrorException 异常
     */
    String post(String url, Object obj) throws TxErrorException;

    /**
     * <pre>
     * Service没有实现某个API的时候，可以用这个，
     * 比{@link #post}方法更灵活，可以自己构造RequestExecutor用来处理不同的参数和不同的返回类型。
     * </pre>
     *
     * @param <T>      .
     * @param <E>      .
     * @param executor 执行器
     * @param uri      接口请求地址
     * @param data     参数或请求数据
     * @return . t
     * @throws TxErrorException the wx error exception
     */
    <T, E> T execute(RequestExecutor<T, E> executor, String uri, E data) throws TxErrorException;

    /**
     * 初始化http请求对象.
     */
    void initHttp();

    /**
     * 设置参数配置
     *
     * @param config
     */
    void setTxImConfig(TxImConfig config);


    /**
     * 获取请求地址
     * @param serviceName
     * @param command
     * @return
     */
    public String getUrl(String serviceName, String command);
}
