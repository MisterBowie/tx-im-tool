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
 * 获取用户所加入的群组-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 10:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetJoinGroupListResult extends BaseResponse {
    /**
     * 用户所加入的群组个数
     */
    @JsonProperty("TotalCount")
    private Integer totalCount;

    /**
     * 拉取到的群组信息，返回的结果是根据过滤器中设置的过滤字段进行过滤后的信息，字段详情请参阅 群组数据结构介绍
     */
    @JsonProperty("GroupIdList")
    private List<GroupIdListResultItem> groupIdList;


    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
