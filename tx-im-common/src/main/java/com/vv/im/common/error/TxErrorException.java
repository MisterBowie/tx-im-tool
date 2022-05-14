package com.vv.im.common.error;

import com.vv.im.common.bean.response.BaseResponse;
import lombok.Data;

/**
 * <prev>
 *
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/11
 */
@Data
public class TxErrorException extends RuntimeException {

    private final TxError error;

    private static final int DEFAULT_ERROR_CODE = -99;

    public TxErrorException(String message) {
        this(TxError.builder().errorCode(DEFAULT_ERROR_CODE).errorInfo(message).build());
    }

    public TxErrorException(TxError error) {
        super(error.toString());
        this.error = error;
    }

    public TxErrorException(BaseResponse result) {
        super(result.getErrorInfo());
        this.error = TxError.builder().errorInfo(result.getErrorInfo()).errorCode(result.getErrorCode()).actionStatus(result.getActionStatus()).build();
    }

    public TxErrorException(TxError error, Throwable cause) {
        super(error.toString(), cause);
        this.error = error;
    }

    public TxErrorException(Throwable cause) {
        super(cause.getMessage(), cause);
        this.error = TxError.builder().errorCode(DEFAULT_ERROR_CODE).errorInfo(cause.getMessage()).build();
    }
}
