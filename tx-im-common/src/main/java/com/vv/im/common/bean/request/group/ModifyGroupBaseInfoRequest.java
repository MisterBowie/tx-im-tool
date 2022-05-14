package com.vv.im.common.bean.request.group;

import cn.hutool.json.JSONUtil;
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
 * 修改群基础资料-请求参数
 *
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:11
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ModifyGroupBaseInfoRequest implements ToJson {
    /**
     * 需要修改基础信息的群组的 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群名称，最长30字节
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 群简介，最长240字节
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 群公告，最长300字节
     */
    @JsonProperty("Notification")
    private String notification;

    /**
     * 群头像 URL，最长100字节
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    /**
     * 最大群成员数量
     * 私有群、公开群和聊天室：该字段阈值请参考 群组系统 和 计费概述 中的群成员人数上限相关说明
     * 音视频聊天室和在线成员广播大群：该字段为无效字段，无需填写
     */
    @JsonProperty("MaxMemberNum")
    private Integer maxMemberNum;

    /**
     * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群）
     */
    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    /**
     * 默认情况是没有的。开通群组维度的自定义字段详情请参见 自定义字段
     */
    @JsonProperty("ShutUpAllMember")
    private String shutUpAllMember;

    /**
     * 群内群成员禁言，只有群管理员和群主以及系统管理员可以发言
     */
    @JsonProperty("AppDefinedData")
    private List<AppDefinedDataItem> appDefinedData;

    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }



}
