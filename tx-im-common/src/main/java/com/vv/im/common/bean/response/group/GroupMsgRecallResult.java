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
 * 撤回群消息-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupMsgRecallResult extends BaseResponse {
    /**
     * 消息撤回请求的详细结果
     */
    @JsonProperty("RecallRetList")
    private List<RecallRetItem> recallRetList;

    public List<RecallRetItem> getRecallRetList() {
        return recallRetList;
    }

    public void setRecallRetList(List<RecallRetItem> recallRetList) {
        this.recallRetList = recallRetList;
    }

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
