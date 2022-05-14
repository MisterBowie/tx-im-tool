package com.vv.im.common.bean.constant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 触发回调的命令字
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:38
 */
public class ClientCmd {
    /**
     * 加好友请求
     */
    public static final Set<String> FRIEND_ADD = new HashSet<>(Arrays.asList("friend_add", "FriendAdd"));

    /**
     * 加好友回应
     */
    public static final Set<String> FRIEND_RESPONSE = new HashSet<>(Arrays.asList("friend_response", "FriendResponse"));

    private ClientCmd() {

    }
}
