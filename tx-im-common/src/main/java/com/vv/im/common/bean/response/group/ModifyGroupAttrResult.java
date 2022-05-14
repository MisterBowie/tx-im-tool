package com.vv.im.common.bean.response.group;

import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;

/**
 * 修改群自定义属性-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 10:55
 */
public class ModifyGroupAttrResult extends BaseResponse {
    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
