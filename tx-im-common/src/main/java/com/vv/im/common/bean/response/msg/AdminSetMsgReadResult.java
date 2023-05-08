package com.vv.im.common.bean.response.msg;

import com.vv.im.common.bean.ToJson;
import com.vv.im.common.bean.response.BaseResponse;

import java.io.Serializable;

/**
 * 设置单聊消息已读-结果
 *
 * @author hyh
 * @since 2021/07/28 20:32
 */
public class AdminSetMsgReadResult extends BaseResponse implements Serializable, ToJson {
    private static final long serialVersionUID = -418920513736327493L;

    @Override
    public String toString() {
        return "AdminSetMsgReadResult{" +
                ", actionStatus='" + getActionStatus() + '\'' +
                ", errorInfo='" + getErrorInfo() + '\'' +
                ", errorCode=" + getErrorCode() +
                '}';
    }

    @Override
    public String toJson() {
        return null;
    }
}
