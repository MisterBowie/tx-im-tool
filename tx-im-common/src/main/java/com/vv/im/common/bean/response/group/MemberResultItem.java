package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 群成员添加返回ITEM 信息
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 14:19
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberResultItem {
    /**
     * 返回的群成员 UserID
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 加人结果：0-失败；1-成功；2-已经是群成员；3-等待被邀请者确认
     */
    @JsonProperty("Result")
    private Integer result;

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
