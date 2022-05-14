package com.vv.im.common.bean.model.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.request.group.AppDefinedDataItem;
import com.vv.im.common.bean.request.group.AppMemberDefinedDataItem;
import com.vv.im.common.bean.request.group.MemberProfile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 21:02
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupInfo {
    /**
     * 群组 ID，App 内保证唯一，其格式前缀为 @TGS#。另外，App 亦可自定义群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群组形态，包括 Public（陌生人社交群），Private（即 Work，好友工作群），
     * ChatRoom（即 Meeting，会议群），AVChatRoom（直播群），Community（社群）
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 群名称，最长30字节，使用 UTF-8 编码，1个汉字占3个字节
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 群简介，最长240字节，使用 UTF-8 编码，1个汉字占3个字节
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 群公告，最长300字节，使用 UTF-8 编码，1个汉字占3个字节
     */
    @JsonProperty("Notification")
    private String notification;

    /**
     * 群头像 URL，最长100字节
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 群主 ID（需是 已导入 的帐号）。填写后自动添加到群成员中；如果不填，群没有群主
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 群组的创建时间
     */
    @JsonProperty("CreateTime")
    private Integer createTime;

    /**
     * 群资料的每次变都会增加该值
     */
    @JsonProperty("InfoSeq")
    private Integer infoSeq;

    /**
     * 群组最后一次信息变更时间
     */
    @JsonProperty("LastInfoTime")
    private Integer lastInfoTime;

    /**
     * 群组内最后发消息的时间
     */
    @JsonProperty("LastMsgTime")
    private Integer lastMsgTime;

    /**
     * 群内下一条消息的 Seq
     */
    @JsonProperty("NextMsgSeq")
    private Integer nextMsgSeq;

    /**
     * 当前成员数量
     */
    @JsonProperty("MemberNum")
    private Integer memberNum;

    /**
     * 最大群成员数量，缺省时的默认值：付费套餐包上限，例如体验版是20，如果升级套餐包，需按照修改群基础资料修改这个字段
     */
    @JsonProperty("MaxMemberNum")
    private Integer maxMemberNum;

    /**
     * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），
     * DisableApply（禁止加群），不填默认为 NeedPermission（需要验证）
     * 仅当创建支持申请加群的 群组 时，该字段有效
     */
    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    /**
     * 群组维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台 进行配置，详情请参阅 自定义字段
     */
    @JsonProperty("AppDefinedData")
    private List<AppDefinedDataItem> appDefinedData;

    /**
     * 初始群成员列表，最多100个；成员信息字段详情请参阅 群成员资料
     */
    @JsonProperty("MemberList")
    private List<MemberProfile> memberList;

    /**
     * 群成员维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台 进行配置，详情请参阅 自定义字段
     */
    @JsonProperty("AppMemberDefinedData")
    private List<AppMemberDefinedDataItem> appMemberDefinedData;

}
