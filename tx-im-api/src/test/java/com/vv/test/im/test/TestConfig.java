package com.vv.test.im.test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.vv.im.common.config.TxImConfig;
import com.vv.test.im.utils.XStreamInitializer;

import java.io.InputStream;
import java.util.concurrent.locks.Lock;

/**
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@XStreamAlias("xml")
public class TestConfig extends TxImConfig {

  public static TestConfig fromXml(InputStream is) {
    XStream xstream = XStreamInitializer.getInstance();
    xstream.processAnnotations(TestConfig.class);
    return (TestConfig) xstream.fromXML(is);
  }



}
