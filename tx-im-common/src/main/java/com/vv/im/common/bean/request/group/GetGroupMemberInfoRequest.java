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
 * 获取群成员详细资料-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:04
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetGroupMemberInfoRequest implements ToJson {
    /**
     * 需要拉取成员信息的群组的 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 需要获取哪些信息， 如果没有该字段则为群成员全部资料，成员信息字段详情请参阅 群成员资料
     */
    @JsonProperty("MemberInfoFilter")
    private List<String> memberInfoFilter;

    /**
     * 拉取指定身份的群成员资料。如没有填写该字段，默认为所有身份成员资料，成员身份可以为：“Owner”，“Admin”，“Member”
     */
    @JsonProperty("MemberRoleFilter")
    private List<String> memberRoleFilter;

    /**
     * 默认情况是没有的。该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段，
     * 群成员维度的自定义字段详情请参阅 自定义字段
     */
    @JsonProperty("AppDefinedDataFilter_GroupMember")
    private List<String> appDefinedDataFilterGroupMember;

    /**
     * 一次最多获取多少个成员的资料，不得超过6000。如果不填，则获取群内全部成员的信息
     */
    @JsonProperty("Limit")
    private Integer limit;

    /**
     * 从第几个成员开始获取，如果不填则默认为0，表示从第一个成员开始获取
     */
    @JsonProperty("Offset")
    private Integer offset;

    /**
     * 上一次拉取到的成员位置，社群必填，社群不支持 Offset 参数，使用 Next 参数，首次调用填写""，续拉使用返回中的 Next 值
     */
    @JsonProperty("Next")
    private String next;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
