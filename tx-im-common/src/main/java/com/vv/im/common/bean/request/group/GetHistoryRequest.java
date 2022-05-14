package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 下载最近消息记录-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 20:28
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetHistoryRequest implements ToJson {
    /**
     * 消息类型，C2C 表示单发消息 Group 表示群组消息
     */
    @JsonProperty("ChatType")
    private String chatType;

    /**
     * 需要下载的消息记录的时间段
     * 2015120121表示获取2015年12月1日21:00 - 21:59的消息的下载地址。
     * 该字段需精确到小时。每次请求只能获取某天某小时的所有单发或群组消息记录
     */
    @JsonProperty("MsgTime")
    private String msgTime;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
