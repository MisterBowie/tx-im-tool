package com.vv.im.common.http;

import com.vv.im.common.error.TxErrorException;

import java.io.IOException;

/**
 * http请求执行器.
 *
 * @param <T> 返回值类型
 * @param <E> 请求参数类型
 * @author Daniel Qian
 */
public interface RequestExecutor<T, E> {

  /**
   * 执行http请求.
   *
   * @param uri    uri
   * @param data   数据
   * @return 响应结果
   * @throws TxErrorException 自定义异常
   * @throws IOException      io异常
   */
  T execute(String uri, E data) throws TxErrorException, IOException;

  /**
   * 执行http请求.
   *
   * @param uri     uri
   * @param data    数据
   * @param handler http响应处理器
   * @throws TxErrorException 自定义异常
   * @throws IOException      io异常
   */
  void execute(String uri, E data, ResponseHandler<T> handler) throws TxErrorException, IOException;


}
