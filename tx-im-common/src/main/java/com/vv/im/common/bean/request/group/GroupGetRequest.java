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
 * 拉取分组-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 15:43
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupGetRequest implements ToJson {
    /**
     * 指定要拉取分组的用户的 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 是否需要拉取分组下的 User 列表, Need_Friend_Type_Yes: 需要拉取, 不填时默认不拉取, 只有 GroupName 为空时有效
     */
    @JsonProperty("NeedFriend")
    private String needFriend;

    /**
     * 要拉取的分组名称
     */
    @JsonProperty("GroupName")
    private List<String> groupName;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
