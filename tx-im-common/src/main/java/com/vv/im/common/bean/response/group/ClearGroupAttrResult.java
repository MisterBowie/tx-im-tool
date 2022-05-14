package com.vv.im.common.bean.response.group;

import com.vv.im.common.bean.ToJson;
import com.vv.im.common.utils.json.JsonBuilderUtil;

/**
 * 清空群自定义属性-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:02
 */
public class ClearGroupAttrResult implements ToJson {

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }
}
