package com.vv.im.common.bean.request.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 离线推送
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 10:52
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OfflinePushInfo {
    /**
     * 0表示推送，1表示不离线推送。
     */
    @JsonProperty("PushFlag")
    private Integer pushFlag;

    /**
     * 离线推送标题。该字段为 iOS 和 Android 共用
     */
    @JsonProperty("Title")
    private String title;

    /**
     * 离线推送内容。该字段会覆盖上面各种消息元素 TIMMsgElement 的离线推送展示文本。
     * 若发送的消息只有一个 TIMCustomElem 自定义消息元素，该 Desc 字段会覆盖 TIMCustomElem 中的 Desc 字段。
     * 如果两个 Desc 字段都不填，将收不到该自定义消息的离线推送。
     */
    @JsonProperty("Desc")
    private String desc;

    /**
     * 离线推送透传内容。由于国内各 Android 手机厂商的推送平台要求各不一样，
     * 请保证此字段为 JSON 格式，否则可能会导致收不到某些厂商的离线推送。
     */
    @JsonProperty("Ext")
    private String ext;

    /**
     * Android离线推送信息
     */
    @JsonProperty("AndroidInfo")
    private AndroidInfo androidInfo;

    /**
     * Apple Push Notification Service
     */
    @JsonProperty("ApnsInfo")
    private ApnsInfo apnsInfo;


}
