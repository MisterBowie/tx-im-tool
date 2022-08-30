package com.vv.im.common.http;

import com.vv.im.common.error.TxErrorException;
import okhttp3.*;

import java.io.IOException;
import java.util.Objects;

/**
 * <prev>
 * OkHttp请求器
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/13
 */

public class ImOkHttpSimplePostRequestExecutor extends SimplePostRequestExecutor<OkHttpClient> {

    public ImOkHttpSimplePostRequestExecutor(RequestHttp requestHttp) {
        super(requestHttp);
    }

    @Override
    public String execute(String uri, String postEntity) throws TxErrorException, IOException {
        RequestBody body = RequestBody.create(MediaType.parse("text/plain; charset=utf-8"),postEntity);
        Request request = new Request.Builder().url(uri).post(body).build();
        Response response = requestHttp.getRequestHttpClient().newCall(request).execute();
        return this.handleResponse(Objects.requireNonNull(response.body()).string());
    }
}
