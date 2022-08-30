package com.vv.im.common.http;

import com.vv.im.common.error.TxError;
import com.vv.im.common.error.TxErrorException;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * <prev>
 * 简单的POST请求执行器，请求的参数是String, 返回的结果也是String
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/13
 */

public abstract class SimplePostRequestExecutor<H> implements RequestExecutor<String, String> {

    protected RequestHttp<H> requestHttp;

    public SimplePostRequestExecutor(RequestHttp requestHttp) {
        this.requestHttp = requestHttp;
    }

    @Override
    public void execute(String uri, String data, ResponseHandler<String> handler)
            throws TxErrorException, IOException {
        handler.handle(this.execute(uri, data));
    }


    @NotNull
    public String handleResponse(String responseContent) throws TxErrorException {
        if (responseContent.isEmpty()) {
            throw new TxErrorException("无响应内容");
        }

        if (responseContent.startsWith("<xml>")) {
            //xml格式输出直接返回
            return responseContent;
        }

        TxError error = TxError.fromJson(responseContent);
        if (error.getErrorCode() != 0) {
            throw new TxErrorException(error);
        }
        return responseContent;
    }
}
