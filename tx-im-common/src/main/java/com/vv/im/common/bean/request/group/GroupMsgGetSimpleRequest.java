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
 * 拉取群历史消息-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 13:46
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupMsgGetSimpleRequest implements ToJson {
    /**
     * 要拉取历史消息的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 拉取消息的最大 seq
     */
    @JsonProperty("ReqMsgSeq")
    private Integer reqMsgSeq;

    /**
     * 拉取的历史消息的条数，目前一次请求最多返回20条历史消息，所以这里最好小于等于20
     */
    @JsonProperty("ReqMsgNumber")
    private Integer reqMsgNumber;


    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
