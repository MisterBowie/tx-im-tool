package com.vv.im.common.bean.response.group;

import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;

/**
 * 批量禁言和取消禁言-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:19
 */
public class ForbidSendMsgResult extends BaseResponse {
    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
