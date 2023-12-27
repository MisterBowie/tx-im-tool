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
 * 导入多个帐号-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2021/7/30 17:07
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AccountMultiImportRequest implements ToJson {
    /**
     * 用户名，单个用户名长度不超过32字节，单次最多导入100个用户名
     */
    @JsonProperty("AccountList")
    private List<AccountImportItem> accounts;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
