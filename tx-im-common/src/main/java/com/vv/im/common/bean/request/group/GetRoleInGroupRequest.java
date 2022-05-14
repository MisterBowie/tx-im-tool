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
 * 查询用户在群组中的身份-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:40
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetRoleInGroupRequest implements ToJson {
    /**
     * 需要查询的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 表示需要查询的用户帐号，最多支持500个帐号
     */
    @JsonProperty("User_Account")
    private List<String> userAccount;


    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
