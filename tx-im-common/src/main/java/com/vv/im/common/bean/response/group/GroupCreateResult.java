package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建群组-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupCreateResult extends BaseResponse {
    /**
     * 创建成功之后的群 ID，由即时通信 IM 后台分配
     */
    @JsonProperty("GroupId")
    private String groupId;


    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
