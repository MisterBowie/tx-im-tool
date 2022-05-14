package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 修改群自定义属性-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 10:52
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ModifyGroupAttrRequest implements ToJson {
    /**
     * 修改自定义属性的群id
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 自定义属性列表，key 为自定义属性的键，value 为自定义属性的值
     */
    @JsonProperty("GroupAttr")
    private List<GroupAttr> groupAttrs;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
