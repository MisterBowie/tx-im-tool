package com.vv.im.common.bean.response.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 查询帐号-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 15:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountCheckResult extends BaseResponse {
    /**
     * 单个帐号的结果对象数组
     */
    @JsonProperty("ResultItem")
    private List<AccountCheckResultItem> resultItems;


    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
