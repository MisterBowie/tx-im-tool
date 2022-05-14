package com.vv.im.common.bean.response.relation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hyh
 * @since 2021/07/29 15:55
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResultItem {
    /**
     * 请求添加/删除的好友的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * To_Account 的处理结果，0表示成功，非0表示失败，非0取值的详细描述请参见 错误码说明
     */
    @JsonProperty("ResultCode")
    private Integer resultCode;

    /**
     * To_Account 的错误描述信息，成功时该字段为空
     */
    @JsonProperty("ResultInfo")
    private String resultInfo;


    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
