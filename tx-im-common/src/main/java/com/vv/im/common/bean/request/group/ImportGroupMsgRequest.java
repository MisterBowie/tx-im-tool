package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 导入群消息-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 17:45
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImportGroupMsgRequest implements ToJson {
    /**
     * 要导入消息的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 会话更新识别，为1的时候标识触发会话更新，默认不触发（avchatroom 群不支持）。
     */
    @JsonProperty("RecentContactFlag")
    private Integer recentContactFlag;

    /**
     * 导入的消息列表
     */
    @JsonProperty("MsgList")
    private List<GroupMsgItem> msgList;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
