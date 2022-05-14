package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 查询用户在群组中的身份-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetRoleInGroupResult extends BaseResponse {
    /**
     * 拉取到的成员角色，包括：Owner(群主)，Admin(群管理员)，Member(普通群成员），NotMember(非群成员)
     */
    @JsonProperty("UserIdList")
    private List<UserIdListItem> userIdList;

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
