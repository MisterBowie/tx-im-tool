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
 * 获取 App 中的所有群组-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 21:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupGetAppIdListResult extends BaseResponse {
    /**
     * App 当前的群组总数。如果仅需要返回特定群组形态的群组，可以通过 GroupType 进行过滤，
     * 但此时返回的 TotalCount 的含义就变成了 App 中该群组形态的群组总数；
     * 例如：假设 App 旗下总共 50000 个群组，其中有 20000 个为公开群组，
     * 如果将请求包体中的 GroupType 设置为 Public，那么不论 Limit 和 Offset 怎样设置，
     * 应答包体中的 TotalCount 都为 20000，且 GroupIdList 中的群组全部为公开群组
     */
    @JsonProperty("TotalCount")
    private Integer totalCount;

    /**
     * 获取到的群组 ID 的集合
     */
    @JsonProperty("GroupIdList")
    private List<GroupIdItem> groupIdList;

    /**
     * 分页拉取的标志
     */
    @JsonProperty("Next")
    private Integer next;


    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
