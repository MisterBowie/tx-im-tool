package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserIdListItem {
    /**
     * 成员id
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 成员角色
     */
    @JsonProperty("Role")
    private String role;

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
