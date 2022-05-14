package com.vv.im.common.bean.response.group;

import com.vv.im.common.utils.json.JsonBuilderUtil;

/**
 * 撤回指定用户发送的消息-结果
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 13:55
 */
public class DeleteGroupMsgBySenderResult {
    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
