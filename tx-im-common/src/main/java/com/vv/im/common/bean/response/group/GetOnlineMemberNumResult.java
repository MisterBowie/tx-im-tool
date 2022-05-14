package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 获取直播群在线人数-结果
 *
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 13:33
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetOnlineMemberNumResult extends BaseResponse {
    /**
     * 该群组的在线人数
     */
    @JsonProperty("OnlineMemberNum")
    private Integer onlineMemberNum;

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
