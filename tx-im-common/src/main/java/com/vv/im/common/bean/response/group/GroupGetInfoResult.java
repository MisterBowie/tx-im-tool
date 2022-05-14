package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.model.group.GroupInfo;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.Data;

import java.util.List;

/**
 * 获取群详细资料-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2021/8/1 11:47
 */
@Data
public class GroupGetInfoResult extends BaseResponse {
    /**
     * 返回结果为群组信息数组，内容包括群基础资料字段、群成员资料字段、群组维度自定义字段和群成员维度自定义字段，
     * 字段详情请参阅 群组数据结构介绍
     */
    @JsonProperty("GroupInfo")
    private List<GroupInfo> groupInfo;

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
