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
import java.util.Map;

/**
 * 导入群基础资料-请求参数
 *
 *  @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 17:17
 */
@JsonInclude(JsonInclude.Include.NON_NULL)

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImportGroupRequest implements ToJson {
    /**
     * 群主 ID，自动添加到群成员中。如果不填，群没有群主
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 群组类型，包括 Public（陌生人社交群），Private（同新版本中的Work，好友工作群），
     * ChatRoom（同新版本中的Meeting，会议群）、Community（社群）
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 为了使得群组 ID 更加简单，便于记忆传播，腾讯云支持 App 在通过 REST API 创建群组时自定义群组 ID。详细请参阅 群组系统
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
     * 最大群成员数量，最大为6000，不填默认为2000个
     */
    @JsonProperty("MaxMemberCount")
    private Integer maxMemberCount;

    /**
     * 申请加群处理方式。包含 FreeAccess（自由加入），NeedPermission（需要验证），
     * DisableApply（禁止加群），不填默认为NeedPermission（需要验证）
     */
    @JsonProperty("ApplyJoinOption")
    private String applyJoinOption;

    /**
     * 群组的创建时间
     */
    @JsonProperty("CreateTime")
    private Integer createTime;

    /**
     * 群组维度的自定义字段，默认情况是没有的，需要开通，详细请参阅 群组系统
     */
    @JsonProperty("AppDefinedData")
    private List<Map<String, Object>> appDefinedData;


    @Override
    public String toJson() {
        return JsonBuilderUtil.toJson(this);
    }



}
