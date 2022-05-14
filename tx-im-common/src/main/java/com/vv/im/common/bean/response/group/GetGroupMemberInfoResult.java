package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.request.group.MemberProfile;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 获取群成员详细资料-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 19:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetGroupMemberInfoResult extends BaseResponse {
    /**
     * 本群组的群成员总数
     */
    @JsonProperty("MemberNum")
    private Integer memberNum;

    /**
     * 获取到的群成员列表，其中包含了全部或者指定的群成员信息，成员信息字段详情请参阅 群成员资料
     */
    @JsonProperty("MemberList")
    private List<MemberProfile> memberList;

    /**
     * 下一次请求应该传的 Next 值，仅查询 Community（社群）时会返回该字段
     */
    @JsonProperty("Next")
    private String next;


    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
