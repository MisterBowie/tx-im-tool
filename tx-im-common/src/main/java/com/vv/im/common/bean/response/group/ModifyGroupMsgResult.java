package com.vv.im.common.bean.response.group;

import com.vv.im.common.bean.response.BaseResponse;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.Data;

import java.io.Serializable;

/**
 * 修改群聊历史消息-结果
 *
 * @author bingo
 * @since 2022/7/20 11:43
 */
@Data
public class ModifyGroupMsgResult extends BaseResponse implements Serializable {
    private static final long serialVersionUID = -942817793511393977L;

    @Override
    public String toString() {
        return JsonBuilderUtil.toJson(this);
    }
}
