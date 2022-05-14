package com.vv.im.common.bean.response.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.response.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 导入多个帐号-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MultiAccountImportResult extends BaseResponse {
    /**
     * 导入失败的帐号列表
     */
    @JsonProperty("FailAccounts")
    private List<String> failAccounts;
}
