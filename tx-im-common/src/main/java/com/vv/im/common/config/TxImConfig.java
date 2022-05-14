package com.vv.im.common.config;

import lombok.Data;

/**
 * <prev>
 * 腾讯IM配置类。
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/13
 */

@Data
public class TxImConfig {
    /**
     * 应用ID
     */
    private long appId;
    /**
     * key
     */
    private String key;

    /**
     * adminUser 管理员名称
     */
    private String adminUser;

    /**
     * 过期时间长度。
     */
    private Long expireTime;
}
