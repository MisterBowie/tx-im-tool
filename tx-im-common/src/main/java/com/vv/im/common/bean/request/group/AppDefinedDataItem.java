package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 群组维度的自定义字段
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 20:57
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppDefinedDataItem {
    /**
     * String 类型，长度不超过16字节，其命名仅支持英文大小写字母、数字、下划线
     */
    @JsonProperty("Key")
    private String key;

    /**
     * Value 为用户自定义 Buffer，可以为二进制数据，群维度的 Value 长度不超过512字节，群成员维度的 Value 长度不超过64字节
     */
    @JsonProperty("Value")
    private Object value;


}
