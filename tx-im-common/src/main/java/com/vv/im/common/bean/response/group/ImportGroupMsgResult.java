package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 导入群消息-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImportGroupMsgResult extends BaseResponse {
    /**
     * 具体的消息导入结果
     */
    @JsonProperty("ImportMsgResult")
    private List<ImportMsgResultItem> importMsgResult;


    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
