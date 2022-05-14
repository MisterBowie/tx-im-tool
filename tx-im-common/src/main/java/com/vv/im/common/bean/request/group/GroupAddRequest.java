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
 * 添加分组-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 15:33
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupAddRequest implements ToJson {
    /**
     * 需要为该 UserID 添加新分组
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 新增分组列表
     */
    @JsonProperty("GroupName")
    private List<String> groupName;

    /**
     * 需要加入新增分组的好友的 UserID 列表
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }

}
