package com.vv.im.common.bean.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * <prev>
 * 基础返回类
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/13
 */

@Data
public class BaseResponse {

    @JsonProperty("ErrorCode")
    private Integer errorCode;

    @JsonProperty("ActionStatus")
    private String actionStatus;

    @JsonProperty("ErrorInfo")
    private String errorInfo;
}
