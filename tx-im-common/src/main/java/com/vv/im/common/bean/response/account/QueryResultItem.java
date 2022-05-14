package com.vv.im.common.bean.response.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.utils.json.JsonBuilderUtil;

import java.util.List;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:10
 */
public class QueryResultItem {
    /**
     * 返回的用户的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 返回的用户状态
     */
    @JsonProperty("Status")
    private String status;

    /**
     * 详细的登录平台信息
     */
    @JsonProperty("Detail")
    private List<QueryResultDetailItem> detail;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<QueryResultDetailItem> getDetail() {
        return detail;
    }

    public void setDetail(List<QueryResultDetailItem> detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
