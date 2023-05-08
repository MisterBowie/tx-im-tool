package com.vv.im.common.bean.response.msg;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;

import java.io.Serializable;

/**
 * 设置单聊消息已读-请求参数
 *
 * @author bingo
 * @since 2021/7/31 15:29
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminSetMsgReadRequest extends BaseResponse implements Serializable, ToJson {
    private static final long serialVersionUID = -7492790600359646282L;
    /**
     * 进行消息已读的用户 UserId
     */
    @JsonProperty("Report_Account")
    private String reportAccount;

    /**
     * 进行消息已读的单聊会话的另一方用户 UserId
     */
    @JsonProperty("Peer_Account")
    private String peerAccount;

    /**
     * 时间戳（秒），该时间戳之前的消息全部已读。若不填，则取当前时间戳
     */
    @JsonProperty("MsgReadTime")
    private Integer msgReadTime;

    public AdminSetMsgReadRequest() {
    }

    public AdminSetMsgReadRequest(String reportAccount, String peerAccount) {
        this.reportAccount = reportAccount;
        this.peerAccount = peerAccount;
    }

    public AdminSetMsgReadRequest(String reportAccount, String peerAccount, Integer msgReadTime) {
        this.reportAccount = reportAccount;
        this.peerAccount = peerAccount;
        this.msgReadTime = msgReadTime;
    }

    private AdminSetMsgReadRequest(Builder builder) {
        this.reportAccount = builder.reportAccount;
        this.peerAccount = builder.peerAccount;
        this.msgReadTime = builder.msgReadTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getReportAccount() {
        return reportAccount;
    }

    public void setReportAccount(String reportAccount) {
        this.reportAccount = reportAccount;
    }

    public String getPeerAccount() {
        return peerAccount;
    }

    public void setPeerAccount(String peerAccount) {
        this.peerAccount = peerAccount;
    }

    public Integer getMsgReadTime() {
        return msgReadTime;
    }

    public void setMsgReadTime(Integer msgReadTime) {
        this.msgReadTime = msgReadTime;
    }

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }


    public static final class Builder {
        private String reportAccount;
        private String peerAccount;
        private Integer msgReadTime;

        private Builder() {
        }

        public AdminSetMsgReadRequest build() {
            return new AdminSetMsgReadRequest(this);
        }

        public Builder reportAccount(String reportAccount) {
            this.reportAccount = reportAccount;
            return this;
        }

        public Builder peerAccount(String peerAccount) {
            this.peerAccount = peerAccount;
            return this;
        }

        public Builder msgReadTime(Integer msgReadTime) {
            this.msgReadTime = msgReadTime;
            return this;
        }
    }
}
