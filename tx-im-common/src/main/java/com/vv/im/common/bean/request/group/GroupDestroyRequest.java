package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 解散群组-请求参数
 *
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:36
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupDestroyRequest implements ToJson {
    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
