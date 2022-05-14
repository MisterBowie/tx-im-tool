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
 * 删除分组-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 15:41
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupDeleteRequest implements ToJson {
    /**
     * 需要删除该 UserID 的分组
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 要删除的分组列表
     */
    @JsonProperty("GroupName")
    private List<String> groupName;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
