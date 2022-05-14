package com.vv.im.common.bean.request.account;

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
 * 查询帐号在线状态-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2021/7/30 17:35
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AccountQueryOnlineStatusRequest implements ToJson {
    /**
     * 是否需要返回详细的登录平台信息。0表示不需要，1表示需要
     */
    @JsonProperty("IsNeedDetail")
    private Integer isNeedDetail;

    /**
     * 需要查询这些 UserID 的登录状态，一次最多查询500个 UserID 的状态
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
