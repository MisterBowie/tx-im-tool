package com.vv.im.common.bean.response.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.Data;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 21:04
 */
@Data
public class GroupIdItem {
    /**
     * 群ID
     */
    @JsonProperty("GroupId")
    private String groupId;
    

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
