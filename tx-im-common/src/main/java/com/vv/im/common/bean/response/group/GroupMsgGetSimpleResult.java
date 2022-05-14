package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.model.message.RspMsgItem;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 拉取群历史消息-结果
 *
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 13:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupMsgGetSimpleResult extends BaseResponse {
    /**
     * 请求中的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 是否返回了请求区间的全部消息
     * 当成功返回了请求区间的全部消息时，值为1
     * 当消息长度太长或者区间太大（超过20）导致无法返回全部消息时，值为0
     * 当消息长度太长或者区间太大（超过20）且所有消息都过期时，值为2
     */
    @JsonProperty("IsFinished")
    private Integer isFinished;

    /**
     * 返回的消息列表
     */
    @JsonProperty("RspMsgList")
    private List<RspMsgItem> rspMsgList;


    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
