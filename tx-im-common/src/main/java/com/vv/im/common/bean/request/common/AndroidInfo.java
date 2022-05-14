package com.vv.im.common.bean.request.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 10:55
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AndroidInfo {
    /**
     * Android 离线推送声音文件路径。
     */
    @JsonProperty("Sound")
    private String sound;

    /**
     * 华为手机 EMUI 10.0 及以上的通知渠道字段。
     * 该字段不为空时，会覆盖控制台配置的 ChannelID 值；该字段为空时，不会覆盖控制台配置的 ChannelID 值。
     */
    @JsonProperty("HuaWeiChannelID")
    private String huaweiChannelId;

    /**
     * 小米手机 MIUI 10 及以上的通知类别（Channel）适配字段。
     * 该字段不为空时，会覆盖控制台配置的 ChannelID 值；该字段为空时，不会覆盖控制台配置的 ChannelID 值。
     */
    @JsonProperty("XiaoMiChannelID")
    private String xiaomiChannelId;

    /**
     * OPPO 手机 Android 8.0 及以上的 NotificationChannel 通知适配字段。
     * 该字段不为空时，会覆盖控制台配置的 ChannelID 值；该字段为空时，不会覆盖控制台配置的 ChannelID 值。
     */
    @JsonProperty("OPPOChannelID")
    private String oppoChannelId;

    /**
     * Google 手机 Android 8.0 及以上的通知渠道字段。
     * Google 推送新接口（上传证书文件）支持 channel id，旧接口（填写服务器密钥）不支持。
     */
    @JsonProperty("GoogleChannelID")
    private String googleChannelId;

    /**
     * VIVO 手机推送消息分类，“0”代表运营消息，“1”代表系统消息，不填默认为1。
     */
    @JsonProperty("VIVOClassification")
    private Integer vivoClassification;

    /**
     * 华为推送通知消息分类，取值为 LOW、NORMAL，不填默认为 NORMAL。
     */
    @JsonProperty("HuaWeiImportance")
    private String huaweiImportance;

    /**
     * 在控制台配置华为推送为“打开应用内指定页面”的前提下，传“1”表示将透传内容 Ext 作为 Intent 的参数，
     * “0”表示将透传内容 Ext 作为 Action 参数。不填默认为0。两种传参区别可参见 华为推送文档。
     */
    @JsonProperty("ExtAsHuaweiIntentParam")
    private Integer extAsHuaweiIntentParam;


}
