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
 * 导入单个帐号-请求参数
 *
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2021/07/29 14:56
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AccountImportRequest implements ToJson {
    /**
     * 用户名，长度不超过32字节
     */
    @JsonProperty("UserID")
    private String userId;

    /**
     * 用户昵称
     */
    @JsonProperty("Nick")
    private String nick;

    /**
     * 用户头像 URL
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;


    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
