package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.bean.model.message.TIMMsgElement;
import com.vv.im.common.bean.request.common.OfflinePushInfo;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 在群组中发送普通消息-请求参数
 *
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:46
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SendGroupMsgRequest implements ToJson {
    /**
     * 向哪个群组发送消息
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 无符号32位整数。如果5分钟内两条消息的随机值相同，后一条消息将被当做重复消息而丢弃
     */
    @JsonProperty("Random")
    private Integer random;

    /**
     * 消息的优先级
     */
    @JsonProperty("MsgPriority")
    private String msgPriority;

    /**
     * 消息体，详细可参阅 消息格式描述
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息来源帐号，选填。如果不填写该字段，则默认消息的发送者为调用该接口时使用的 App 管理员帐号。
     * 除此之外，App 亦可通过该字段“伪造”消息的发送者，从而实现一些特殊的功能需求。
     * 需要注意的是，如果指定该字段，必须要确保字段中的帐号是存在的
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 线推送信息配置，详细可参阅 消息格式描述
     */
    @JsonProperty("OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    /**
     * 消息回调禁止开关，只对单条消息有效，
     * ForbidBeforeSendMsgCallback 表示禁止发消息前回调，ForbidAfterSendMsgCallback 表示禁止发消息后回调
     */
    @JsonProperty("ForbidCallbackControl")
    private List<String> forbidCallbackControl;

    /**
     * 1表示消息仅发送在线成员，默认0表示发送所有成员，AVChatRoom(直播群)不支持该参数
     */
    @JsonProperty("OnlineOnlyFlag")
    private Integer onlineOnlyFlag;

    /**
     * 消息发送权限，NoLastMsg 只对单条消息有效，表示不更新最近联系人会话；NoUnread 不计未读，只对单条消息有效。
     * （如果该消息 OnlineOnlyFlag 设置为1，则不允许使用该字段。）
     */
    @JsonProperty("SendMsgControl")
    private List<String> sendMsgControl;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("cloudCustomData")
    private String cloudCustomData;


    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }



}
