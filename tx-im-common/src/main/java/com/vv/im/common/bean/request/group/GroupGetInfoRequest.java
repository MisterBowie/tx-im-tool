package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.ToJson;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 获取群详细资料-请求参数
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:33
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupGetInfoRequest implements ToJson {
    /**
     * 需要拉取的群组列表
     */
    @JsonProperty("GroupIdList")
    private List<String> groupIdList;

    /**
     * 包含三个过滤器：GroupBaseInfoFilter，MemberInfoFilter，AppDefinedDataFilter_Group，
     * 分别是基础信息字段过滤器，成员信息字段过滤器，群组维度的自定义字段过滤器
     */
    @JsonProperty("ResponseFilter")
    private ResponseFilter responseFilter;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
