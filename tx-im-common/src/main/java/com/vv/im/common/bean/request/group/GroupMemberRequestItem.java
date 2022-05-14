package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 14:14
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupMemberRequestItem {
    /**
     * 待添加的群成员 UserID
     */
    @JsonProperty("Member_Account")
    private String memberAccount;


}
