package com.vv.test.im.test;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.vv.im.api.service.TxImService;
import com.vv.im.api.service.impl.TxImServiceImpl;
import com.vv.im.common.error.TxRuntimeException;
import com.vv.im.common.service.TxService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
public class ApiTestModule implements Module {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private static final String TEST_CONFIG_XML = "test-config.xml";

    @Override
    public void configure(Binder binder) {
        TestConfig config = new TestConfig();
        config.setAppId(1400673042);
        config.setAdminUser("administrator");
        config.setKey("5895c94b0484284fc582e8e0b14a18c7a1d1577b844d6f8168ee2b810fd0c53a");
        config.setExpireTime(3123213l);
        TxImService imService = new TxImServiceImpl();
        imService.setTxImConfig(config);
        binder.bind(TxImService.class).toInstance(imService);
        binder.bind(TestConfig.class).toInstance(config);
    }

}
