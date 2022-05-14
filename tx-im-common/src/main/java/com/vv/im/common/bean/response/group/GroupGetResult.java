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
 * 拉取分组-结果
 *
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 17:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupGetResult extends BaseResponse {
    /**
     * 拉取分组的结果对象数组
     */
    @JsonProperty("ResultItem")
    private List<GroupGetResultItem> resultItemList;

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

    public List<GroupGetResultItem> getResultItemList() {
        return resultItemList;
    }

    public void setResultItemList(List<GroupGetResultItem> resultItemList) {
        this.resultItemList = resultItemList;
    }

    public Integer getCurrentSequence() {
        return currentSequence;
    }

    public void setCurrentSequence(Integer currentSequence) {
        this.currentSequence = currentSequence;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
