package com.vv.im.common.http;

/**
 * Created by ecoolper on 2017/4/22.
 *
 * @author ecoolper
 */
public interface RequestHttp<H> {

    /**
     * 返回httpClient.
     *
     * @return 返回httpClient
     */
    H getRequestHttpClient();

}
