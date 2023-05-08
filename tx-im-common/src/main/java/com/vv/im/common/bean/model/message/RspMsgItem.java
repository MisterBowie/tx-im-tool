package com.vv.im.common.bean.model.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.Data;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/01 13:40
 */
@Data
public class RspMsgItem {
    /**
     * 消息的发送者
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 是否是空洞消息，当消息被删除或者消息过期后，MsgBody 为空，该字段为1，撤回的消息，该字段为2
     */
    @JsonProperty("IsPlaceMsg")
    private Integer isPlaceMsg;

    /**
     * 消息内容，详情请参见 消息内容 MsgBody 说明
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 字段为 1 时表示系统消息
     */
    @JsonProperty("IsSystemMsg")
    private Integer isSystemMsg;

    /**
     * 消息的优先级，用于消息去重，有客户端发消息时填写，如果没有填，服务端会自动生成，
     * 1表示 High 优先级消息，2表示 Normal 优先级消息，3表示 Low 优先级消息，4表示 Lowest 优先级消息
     */
    @JsonProperty("MsgPriority")
    private Integer msgPriority;

    /**
     * 消息随机数，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgRandom")
    private Long msgRandom;

    /**
     * 消息序列号，用于标记该条消息，值越小发送的越早，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息被发送的时间戳，server 的时间
     */
    @JsonProperty("MsgTimeStamp")
    private Integer msgTimeStamp;


    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
