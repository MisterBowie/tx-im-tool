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
 * 删除帐号-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2021/7/30 17:08
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AccountDeleteRequest  implements ToJson {
    /**
     * 请求删除的帐号对象数组，单次请求最多支持100个帐号
     */
    @JsonProperty("DeleteItem")
    private List<AccountDeleteItem> deleteItemList;
    

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
