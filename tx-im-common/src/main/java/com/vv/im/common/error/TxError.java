package com.vv.im.common.error;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <prev>
 * 腾讯IM全局错误码
 * <prev>
 * 腾讯IM文档: <a href="https://cloud.tencent.com/document/product/269/1519#rest-api-.E5.85.AC.E5.85.B1.E9.94.99.E8.AF.AF.E7.A0.81">错误码文档地址</a>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/11
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TxError implements Serializable {

    /**
     * 请求处理的结果，OK 表示处理成功，FAIL 表示失败，如果为 FAIL，ErrorInfo 带上失败原因
     */

    @JsonProperty("ErrorCode")
    private Integer errorCode;

    @JsonProperty("ActionStatus")
    private String actionStatus;

    @JsonProperty("ErrorInfo")
    private String errorInfo;

    public static TxError fromJson(String json) {
        return JsonBuilderUtil.string2Obj(json, TxError.class);
    }

    @Override
    public String toString() {
        return "错误代码：" + this.errorCode + ", 错误信息：" + this.errorInfo ;
    }
}
