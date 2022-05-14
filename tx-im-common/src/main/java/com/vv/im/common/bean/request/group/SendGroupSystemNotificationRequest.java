package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.utils.json.JsonBuilderUtil;

import java.util.List;

/**
 * 在群组中发送系统通知-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 17:09
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendGroupSystemNotificationRequest implements ToJson {
    /**
     * 向哪个群组发送系统通知
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 接收者群成员列表，请填写接收者 UserID，不填或为空表示全员下发
     */
    @JsonProperty("ToMembers_Account")
    private List<String> toMembersAccount;

    /**
     * 系统通知的内容
     */
    @JsonProperty("Content")
    private String content;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
