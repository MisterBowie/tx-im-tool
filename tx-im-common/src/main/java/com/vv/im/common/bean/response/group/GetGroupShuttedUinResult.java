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
 * 获取被禁言群成员列表-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetGroupShuttedUinResult extends BaseResponse {
    /**
     * 返回结果为禁言用户信息数组，内容包括被禁言的成员 ID，及其被禁言到的时间（使用 UTC 时间，即世界协调时间）
     */
    @JsonProperty("ShuttedUinList")
    private List<ShuttedUinResultItem> shuttedUinList;

    
    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
