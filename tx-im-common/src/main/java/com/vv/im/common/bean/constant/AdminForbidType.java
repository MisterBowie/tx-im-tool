package com.vv.im.common.bean.constant;

/**
 * 管理员禁止加好友标识
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 15:53
 */
public class AdminForbidType {
    /**
     * 默认值，允许加好友
     */
    public static final String NONE = "AdminForbid_Type_None";

    /**
     * 禁止该用户发起加好友请求
     */
    public static final String SEND_OUT = "AdminForbid_Type_SendOut";

    private AdminForbidType() {

    }
}
