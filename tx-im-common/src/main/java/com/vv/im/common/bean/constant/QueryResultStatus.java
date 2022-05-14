package com.vv.im.common.bean.constant;

/**
 * 用户状态
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 20:04
 */
public class QueryResultStatus {
    /**
     * 前台运行状态
     */
    public static final String ONLINE = "Online";

    /**
     * 后台运行状态
     */
    public static final String PUSH_ONLINE = "PushOnline";

    /**
     * 未登录状态
     */
    public static final String OFFLINE = "Offline";

    private QueryResultStatus() {

    }
}
