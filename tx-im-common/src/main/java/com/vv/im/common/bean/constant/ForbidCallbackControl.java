package com.vv.im.common.bean.constant;

/**
 * 消息回调禁止开关，只对单条消息有效
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 19:12
 */
public class ForbidCallbackControl {
    /**
     * 禁止发消息前回调
     */
    public static final String BEFORE = "ForbidBeforeSendMsgCallback";

    /**
     * 禁止发消息后回调
     */
    public static final String AFTER = "ForbidAfterSendMsgCallback";

    private ForbidCallbackControl() {

    }
}
