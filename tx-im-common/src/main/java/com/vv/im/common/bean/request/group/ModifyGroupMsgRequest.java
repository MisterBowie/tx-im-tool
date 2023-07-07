package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.bean.model.message.TIMMsgElement;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 修改群聊历史消息-请求参数
 *
 * @author bingo
 * @since 2022/7/20 11:04
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ModifyGroupMsgRequest implements ToJson {
    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 请求修改的消息 seq
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息内容
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    /**
     * 话题的 ID，仅社群支持此选项
     */
    @JsonProperty("TopicId")
    private String topicId;

    public ModifyGroupMsgRequest() {
    }

    public ModifyGroupMsgRequest(String groupId, Long msgSeq) {
        this.groupId = groupId;
        this.msgSeq = msgSeq;
    }

    public ModifyGroupMsgRequest(String groupId, Long msgSeq, List<TIMMsgElement> msgBody,
                                 String cloudCustomData, String topicId) {
        this.groupId = groupId;
        this.msgSeq = msgSeq;
        this.msgBody = msgBody;
        this.cloudCustomData = cloudCustomData;
        this.topicId = topicId;
    }

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
