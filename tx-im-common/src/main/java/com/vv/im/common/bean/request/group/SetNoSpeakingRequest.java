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
 * 设置全局禁言-请求参数
 *
 * @author xy
 * @since 2022/05/04 11:39
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SetNoSpeakingRequest implements ToJson {
    /**
     * 设置禁言配置的帐号
     */
    @JsonProperty("Set_Account")
    private String setAccount;

    /**
     * 单聊消息禁言时间，单位为秒，非负整数，最大值为4294967295（十六进制 0xFFFFFFFF）
     * 0表示取消该帐号的单聊消息禁言
     * 4294967295表示该帐号被设置永久禁言
     * 其它值表示该帐号具体的禁言时间
     */
    @JsonProperty("C2CmsgNospeakingTime")
    private Long msgNoSpeakingTime;

    /**
     * 群组消息禁言时间，单位为秒，非负整数，最大值为4294967295（十六进制 0xFFFFFFFF）
     * 0表示取消该帐号的群组消息禁言
     * 4294967295表示该帐号被设置永久禁言
     * 其它值表示该帐号的具体禁言时间
     */
    @JsonProperty("GroupmsgNospeakingTime")
    private Long groupMsgNoSpeakingTime;


    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
