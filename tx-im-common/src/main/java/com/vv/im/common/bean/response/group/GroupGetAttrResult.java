package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.request.group.GroupAttr;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 获取群自定义属性-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 10:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupGetAttrResult extends BaseResponse {
    /**
     * 自定义属性的键值对
     */
    @JsonProperty("GroupAttrAry")
    private List<GroupAttr> groupAttrs;


    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
