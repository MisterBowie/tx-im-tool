package com.vv.im.common.bean.response.group;

import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;

/**
 * 设置成员未读消息计数-结果
 *
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 13:58
 */
public class SetUnreadMsgNumResult extends BaseResponse {
    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
