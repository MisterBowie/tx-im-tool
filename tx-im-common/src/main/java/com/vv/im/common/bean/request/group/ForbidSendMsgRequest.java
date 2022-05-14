package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 批量禁言和取消禁言-请求参数
 *
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:41
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ForbidSendMsgRequest implements ToJson {
    /**
     * 需要查询的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 需要禁言的用户帐号，最多支持500个帐号
     */
    @JsonProperty("Members_Account")
    private List<String> membersAccount;

    /**
     * 无符号类型。需禁言时间，单位为秒，为0时表示取消禁言，4294967295为永久禁言。
     */
    @JsonProperty("ShutUpTime")
    private Long shutUpTime;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
