package com.vv.im.common.bean.constant;

/**
 * 消息接收选项
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 19:50
 */
public class MsgFlag {
    /**
     * 接收并提示
     */
    public static final String ACCEPT_AND_NOTIFY = "AcceptAndNotify";

    /**
     * 接收不提示
     */
    public static final String ACCEPT_NOT_NOTIFY = "AcceptNotNotify";

    /**
     * 屏蔽群消息
     */
    public static final String DISCARD = "Discard";

    private MsgFlag() {

    }
}
