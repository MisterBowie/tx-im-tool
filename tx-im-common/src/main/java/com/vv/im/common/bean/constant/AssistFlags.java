package com.vv.im.common.bean.constant;

/**
 * 会话辅助标志位
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 17:35
 */
public class AssistFlags {
    /**
     * 是否支持置顶会话
     */
    public static final int BIT_0 = 0;

    /**
     * 是否返回空会话
     */
    public static final int BIT_1 = 1;

    /**
     * 是否支持置顶会话分页
     */
    public static final int BIT_2 = 2;

    private AssistFlags() {

    }
}
