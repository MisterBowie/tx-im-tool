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

/**
 * 转让群主-请求参数
 *
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 17:12
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupChangeOwnerRequest implements ToJson {
    /**
     * 要被转移的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 新群主 ID
     */
    @JsonProperty("NewOwner_Account")
    private String newOwnerAccount;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
