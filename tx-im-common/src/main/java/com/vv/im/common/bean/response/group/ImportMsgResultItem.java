package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:46
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImportMsgResultItem {
    /**
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息的时间戳
     */
    @JsonProperty("MsgTime")
    private Integer msgTime;

    /**
     * 单条消息导入结果
     * 0表示单条消息成功
     * 10004表示单条消息发送时间无效
     * 80001表示单条消息包含脏字，拒绝存储此消息
     * 80002表示为消息内容过长，目前支持8000字节的消息，请调整消息长度
     */
    @JsonProperty("Result")
    private Integer result;



    @Override
    public String toString() {
        return "ImportMsgResultItem{" +
                "msgSeq=" + msgSeq +
                ", msgTime=" + msgTime +
                ", result=" + result +
                '}';
    }
}
