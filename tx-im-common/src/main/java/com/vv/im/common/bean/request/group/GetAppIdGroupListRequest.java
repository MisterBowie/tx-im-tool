package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 获取 App 中的所有群组-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 21:01
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetAppIdGroupListRequest implements ToJson {
    /**
     * 本次获取的群组 ID 数量的上限，不得超过 10000。如果不填，默认为最大值 10000
     */
    @JsonProperty("Limit")
    private Integer limit;

    /**
     * 群太多时分页拉取标志，第一次填0，以后填上一次返回的值，返回的 Next 为0代表拉完了
     */
    @JsonProperty("Next")
    private Integer next;

    /**
     * 如果仅需要返回特定群组形态的群组，可以通过 GroupType 进行过滤，
     * 但此时返回的 TotalCount 的含义就变成了 App 中属于该群组形态的群组总数。不填为获取所有类型的群组。
     * 群组形态包括 Public（公开群），Private（即 Work，好友工作群），ChatRoom（即 Meeting，会议群），
     * AVChatRoom（音视频聊天室），BChatRoom（在线成员广播大群）和社群（Community）
     */
    @JsonProperty("GroupType")
    private String groupType;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
