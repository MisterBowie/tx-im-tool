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
 * 删除单个会话-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2021/10/11 10:49
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeleteRecentContactRequest implements ToJson {
    /**
     * 请求删除该 UserID 的会话
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 会话类型：1 表示 C2C 会话；2 表示 G2C 会话
     */
    @JsonProperty("Type")
    private Integer type;

    /**
     * C2C 会话才赋值，C2C 会话方的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * G2C 会话才赋值，G2C 会话的群 ID
     */
    @JsonProperty("ToGroupid")
    private String toGroupId;

    /**
     * 是否清理漫游消息：1 表示清理漫游消息；0 表示不清理漫游消息
     */
    @JsonProperty("ClearRamble")
    private Integer clearRamble;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
