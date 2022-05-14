package com.vv.im.common.bean.request.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Apple Push Notification Service
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 11:03
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApnsInfo {
    @JsonProperty("Sound")
    private String sound;

    /**
     * 这个字段缺省或者为0表示需要计数，为1表示本条消息不需要计数，即右上角图标数字不增加。
     */
    @JsonProperty("BadgeMode")
    private Integer badgeMode;

    /**
     * 该字段用于标识 APNs 推送的标题，若填写则会覆盖最上层 Title。
     */
    @JsonProperty("Title")
    private String title;

    /**
     * 该字段用于标识 APNs 推送的子标题。
     */
    @JsonProperty("SubTitle")
    private String subTitle;

    /**
     * 该字段用于标识 APNs 携带的图片地址，当客户端拿到该字段时，可以通过下载图片资源的方式将图片展示在弹窗上。
     */
    @JsonProperty("Image")
    private String image;

    /**
     * 为1表示开启 iOS 10 的推送扩展，默认为0。
     */
    @JsonProperty("MutableContent")
    private Integer mutableContent;
}
