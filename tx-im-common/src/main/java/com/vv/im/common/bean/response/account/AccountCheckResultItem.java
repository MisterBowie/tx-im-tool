package com.vv.im.common.bean.response.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.utils.json.JsonBuilderUtil;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:24
 */
public class AccountCheckResultItem {
    /**
     * 单个帐号的检查结果：0表示成功，非0表示失败
     */
    @JsonProperty("ResultCode")
    private Integer resultCode;

    /**
     * 单个帐号检查失败时的错误描述信息
     */
    @JsonProperty("ResultInfo")
    private String resultInfo;

    /**
     * 请求检查的帐号的 UserID
     */
    @JsonProperty("UserID")
    private String userId;

    /**
     * 单个帐号的导入状态：Imported 表示已导入，NotImported 表示未导入
     */
    @JsonProperty("AccountStatus")
    private String accountStatus;

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
