package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.Data;

/**
 * 导入群基础资料-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:44
 */
@Data
public class ImportGroupResult extends BaseResponse {
    /**
     * 创建成功之后的群 ID，由 IM 云后台分配或者用户指定
     */
    @JsonProperty("GroupId")
    private String groupId;


    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
