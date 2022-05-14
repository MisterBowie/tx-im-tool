package com.vv.im.common.bean.response.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.utils.json.JsonBuilderUtil;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:04
 */
public class AccountDeleteResultItem {
    /**
     * 单个帐号的错误码，0表示成功，非0表示失败
     */
    @JsonProperty("ResultCode")
    private Integer resultCode;

    /**
     * 单个帐号删除失败时的错误描述信息
     */
    @JsonProperty("ResultInfo")
    private String resultInfo;

    /**
     * 请求删除的帐号的 UserID
     */
    @JsonProperty("UserID")
    private String userId;

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

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
