package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 增加群成员-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 14:12
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupAddMemberRequest implements ToJson {
    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 是否静默加人。0：非静默加人；1：静默加人。不填该字段默认为0
     */
    @JsonProperty("Silence")
    private Integer silence;

    /**
     * 待添加的群成员数组
     */
    @JsonProperty("MemberList")
    private List<GroupMemberRequestItem> memberList;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
