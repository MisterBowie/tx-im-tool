package com.vv.im.common.bean.request.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2021/7/30 17:09
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AccountImportItem implements ToJson {
    /**
     * 帐号的 UserID
     */
    @JsonProperty("UserID")
    private String userId;
    /**
     * 帐号的昵称
     */
    @JsonProperty("Nick")
    private String nick;
    /**
     * 帐号的头像
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
