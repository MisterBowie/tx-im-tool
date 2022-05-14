package com.vv.im.common.bean.response.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 查询帐号在线状态-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:07
 */

@Data
public class AccountQueryOnlineStatusResult {
    /**
     * 返回的用户在线状态结构化信息
     */
    @JsonProperty("QueryResult")
    private List<QueryResultItem> queryResult;

    /**
     * 状态查询失败的帐号列表，在此列表中的目标帐号，状态查询失败或目标帐号不存在。若状态全部查询成功，则 ErrorList 为空
     */
    @JsonProperty("ErrorList")
    private List<QueryResultErrorItem> errorList;


}
