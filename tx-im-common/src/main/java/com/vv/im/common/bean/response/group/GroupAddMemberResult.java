package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 增加群成员-结果
 *
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 14:17
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupAddMemberResult extends BaseResponse {
    /**
     * 返回添加的群成员结果
     */
    @JsonProperty("MemberList")
    private List<MemberResultItem> memberList;


    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
