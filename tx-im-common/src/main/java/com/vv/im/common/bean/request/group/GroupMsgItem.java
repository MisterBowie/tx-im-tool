package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.model.message.TIMMsgElement;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 15:23
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
public class GroupMsgItem {
    /**
     * 指定消息发送者
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 消息发送时间
     */
    @JsonProperty("SendTime")
    private Integer sendTime;

    /**
     * 32位随机数；如果5分钟内两条消息的随机值相同，后一条消息将被当做重复消息而丢弃
     */
    @JsonProperty("Random")
    private Integer random;

    /**
     * TIM 消息，详情请参阅 TIMMsgElement对象的定义
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

}
