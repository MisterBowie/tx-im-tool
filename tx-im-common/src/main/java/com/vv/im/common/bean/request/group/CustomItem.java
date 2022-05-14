package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hyh
 * @since 2021/07/29 15:45
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomItem {
    /**
     * 自定义好友字段的名称，使用前请通过即时通信 IM 控制台 >【应用配置】>【功能配置】申请自定义好友字段
     */
    @JsonProperty("Tag")
    private String tag;

    /**
     * 自定义好友字段的值
     */
    @JsonProperty("Value")
    private Object value;

}
