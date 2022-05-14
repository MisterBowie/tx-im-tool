package com.vv.im.common.bean.constant;

/**
 * 禁言时间
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 19:33
 */
public class NoSpeakingTime {
    /**
     * 取消禁言
     */
    public static final long NEVER = 0;

    /**
     * 永久禁言
     */
    public static final long FOREVER = 0xFFFFFFFFL;

    private NoSpeakingTime() {

    }
}
