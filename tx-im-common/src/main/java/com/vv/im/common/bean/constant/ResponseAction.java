package com.vv.im.common.bean.constant;

/**
 * 加好友回应方式
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 20:48
 */
public class ResponseAction {
    /**
     * 同意且添加对方为好友
     */
    public static final String AGREE_AND_ADD = "Response_Action_AgreeAndAdd";

    /**
     * 同意对方加自己为好友
     */
    public static final String AGREE = "Response_Action_Agree";

    /**
     * 拒绝对方的加好友请求
     */
    public static final String REJECT = "Response_Action_Reject";

    private ResponseAction() {

    }
}
