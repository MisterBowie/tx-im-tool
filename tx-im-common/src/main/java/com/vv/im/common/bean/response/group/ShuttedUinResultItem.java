package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShuttedUinResultItem {
    /**
     * 被禁言的成员 ID
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 被禁言到的时间
     */
    @JsonProperty("ShuttedUntil")
    private Integer shuttedUntil;

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
