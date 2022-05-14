package com.vv.im.api.service.impl;

import okhttp3.*;

import java.io.IOException;

/**
 * <prev>
 *
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/13
 */

public class TxImOkhttpServiceImpl extends BaseTxImServiceImpl<OkHttpClient> {

    private OkHttpClient httpClient;

    @Override
    public void initHttp() {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        httpClient = clientBuilder.build();
    }

    @Override
    public OkHttpClient getRequestHttpClient() {
        return httpClient;
    }
}
