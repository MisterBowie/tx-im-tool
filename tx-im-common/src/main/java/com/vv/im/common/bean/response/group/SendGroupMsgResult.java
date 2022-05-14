package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.Data;

/**
 * 在群组中发送普通消息-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:25
 */
@Data
public class SendGroupMsgResult extends BaseResponse {
    /**
     * 消息发送的时间戳，对应后台 server 时间
     */
    @JsonProperty("MsgTime")
    private Integer msgTime;

    /**
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("msgSeq")
    private Long msgSeq;



    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
