package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecallRetItem {
    /**
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 单个消息的被撤回结果：0表示成功；其它表示失败
     */
    @JsonProperty("RetCode")
    private Integer retCode;


    @Override
    public String toString() {
        return "RecallRetItem{" +
                "msgSeq=" + msgSeq +
                ", retCode=" + retCode +
                '}';
    }
}
