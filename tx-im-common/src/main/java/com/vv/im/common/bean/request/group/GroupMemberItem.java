package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 19:15
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupMemberItem {
    /**
     * 待导入的群成员帐号
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 待导入群成员角色；目前只支持填 Admin，不填则为普通成员 Member
     */
    @JsonProperty("Role")
    private String role;

    /**
     * 待导入群成员的入群时间
     */
    @JsonProperty("JoinTime")
    private Integer joinTime;

    /**
     * 待导入群成员的未读消息计数
     */
    @JsonProperty("UnreadMsgNum")
    private Integer unreadMsgNum;


}
