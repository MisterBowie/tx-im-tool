package com.vv.im.common.error;

/**
 * <prev>
 * Tx Im专用的RuntimeException
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/13
 */

public class TxRuntimeException extends RuntimeException {
    public TxRuntimeException(Throwable e) {
        super(e);
    }

    public TxRuntimeException(String msg) {
        super(msg);
    }

    public TxRuntimeException(String msg, Throwable e) {
        super(msg, e);
    }
}
