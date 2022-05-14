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
 * 撤回指定用户发送的消息-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 13:53
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteGroupMsgBySenderRequest implements ToJson {
    /**
     * 要撤回消息的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 被撤回消息的发送者 ID
     */
    @JsonProperty("Sender_Account")
    private String senderAccount;


    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
