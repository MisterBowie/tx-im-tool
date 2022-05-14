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
import java.util.Map;

/**
 * 修改群成员资料-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:32
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ModifyGroupMemberInfoRequest implements ToJson {
    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 要操作的群成员
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 成员身份，Admin/Member 分别为设置/取消管理员
     */
    @JsonProperty("Role")
    private String role;

    /**
     * 消息屏蔽类型
     */
    @JsonProperty("MsgFlag")
    private String msgFlag;

    /**
     * 群名片（最大不超过50个字节）
     */
    @JsonProperty("NameCard")
    private String nameCard;

    /**
     * 群成员维度的自定义字段，默认情况是没有的，可以通过 即时通信 IM 控制台 进行配置，详情请参阅 群组系统
     */
    @JsonProperty("AppMemberDefinedData")
    private List<Map<String, Object>> appMemberDefinedData;

    /**
     * 需禁言时间，单位为秒，0表示取消禁言
     */
    @JsonProperty("ShutUpTime")
    private Long shutUpTime;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
