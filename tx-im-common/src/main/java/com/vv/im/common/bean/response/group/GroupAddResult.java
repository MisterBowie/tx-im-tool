package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.bean.response.relation.ResultItem;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 添加分组-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 17:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupAddResult extends BaseResponse {
    /**
     * 好友加入新增分组的结果对象数组
     */
    @JsonProperty("ResultItem")
    private List<ResultItem> resultItemList;

    /**
     * 返回处理失败的用户列表，仅当存在失败用户时才返回该字段
     */
    @JsonProperty("Fail_Account")
    private List<String> failAccount;

    /**
     * 返回最新的分组 Sequence
     */
    @JsonProperty("CurrentSequence")
    private Integer currentSequence;

    /**
     * 详细的客户端展示信息
     */
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;


    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
