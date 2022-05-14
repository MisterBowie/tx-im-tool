package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberProfile {
    /**
     * 群成员 ID
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 群内身份
     */
    @JsonProperty("Role")
    private String role;

    /**
     * 入群时间
     */
    @JsonProperty("JoinTime")
    private Integer joinTime;

    /**
     * 该成员当前已读消息 Seq
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息接收选项
     */
    @JsonProperty("MsgFlag")
    private String msgFlag;

    /**
     * 最后发送消息的时间
     */
    @JsonProperty("LastSendMsgTime")
    private Integer lastSendMsgTime;

    /**
     * 0表示未被禁言，否则为禁言的截止时间
     */
    @JsonProperty("ShutUpUntil")
    private Integer shutUpUntil;

    /**
     * 群名片
     */
    @JsonProperty("NameCard")
    private String nameCard;

    /**
     * 返回的群成员自定义字段信息
     */
    @JsonProperty("AppMemberDefinedData")
    private List<AppMemberDefinedDataItem> appMemberDefinedData;

}
