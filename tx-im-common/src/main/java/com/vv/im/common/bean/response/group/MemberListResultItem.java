package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberListResultItem {
    /**
     * 返回的群成员帐号
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 导入结果：0表示失败；1表示成功；2 表示已经是群成员
     */
    @JsonProperty("Result")
    private Integer result;

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
