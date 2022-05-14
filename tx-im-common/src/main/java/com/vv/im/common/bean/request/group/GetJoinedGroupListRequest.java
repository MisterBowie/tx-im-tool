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
 * 获取用户所加入的群组-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:39
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetJoinedGroupListRequest implements ToJson {
    /**
     * 需要查询的用户帐号
     */
    @JsonProperty("Member_Account")
    private String memberAccount;

    /**
     * 是否获取用户加入的 AVChatRoom(直播群)，0表示不获取，1表示获取。默认为0
     */
    @JsonProperty("WithHugeGroups")
    private Integer withHugeGroups;

    /**
     * 是否获取用户已加入但未激活的 Private（即新版本中 Work，好友工作群) 群信息，0表示不获取，1表示获取。默认为0
     */
    @JsonProperty("WithNoActiveGroups")
    private Integer withNoActiveGroups;

    /**
     * 单次拉取的群组数量，如果不填代表所有群组
     */
    @JsonProperty("Limit")
    private Integer limit;

    /**
     * 从第多少个群组开始拉取
     */
    @JsonProperty("Offset")
    private Integer offset;

    /**
     * 拉取哪种群组类型，例如 Public(陌生人社交群)，Private（即新版本Work，好友工作群)，
     * ChatRoom （即新版本Meeting，会议群），AVChatRoom(直播群)，Community（社群），不填为拉取所有
     */
    @JsonProperty("GroupType")
    private String groupType;

    /**
     * 分别包含 GroupBaseInfoFilter 和 SelfInfoFilter 两个过滤器；
     * GroupBaseInfoFilter 表示需要拉取哪些基础信息字段，详情请参阅 群组系统；
     * SelfInfoFilter 表示需要拉取用户在每个群组中的哪些个人资料，详情请参阅 群组系统 。
     */
    @JsonProperty("ResponseFilter")
    private ResponseFilter responseFilter;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
