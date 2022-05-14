package com.vv.im.common.bean.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.constant.MsgType;

/**
 * 语音消息元素
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:44
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TIMSoundMsgElement extends TIMMsgElement {
    /**
     * MsgContent 为 TIM 消息对象
     */
    @JsonProperty("MsgContent")
    private SoundMsgContent msgContent;

    public TIMSoundMsgElement() {
        this(null);
    }

    public TIMSoundMsgElement(SoundMsgContent msgContent) {
        super(MsgType.TIM_SOUND_ELEM);
        this.msgContent = msgContent;
    }

    public TIMSoundMsgElement(String url, String uuid, Integer size, Integer second, Integer downloadFlag) {
        this(new SoundMsgContent(url, uuid, size, second, downloadFlag));
    }

    public SoundMsgContent getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(SoundMsgContent msgContent) {
        this.msgContent = msgContent;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SoundMsgContent {
        @JsonProperty("Url")
        private String url;

        @JsonProperty("UUID")
        private String uuid;

        @JsonProperty("Size")
        private Integer size;

        @JsonProperty("Second")
        private Integer second;

        @JsonProperty("Download_Flag")
        private Integer downloadFlag;

        public SoundMsgContent() {
        }

        public SoundMsgContent(String url, String uuid, Integer size, Integer second, Integer downloadFlag) {
            this.url = url;
            this.uuid = uuid;
            this.size = size;
            this.second = second;
            this.downloadFlag = downloadFlag;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getSecond() {
            return second;
        }

        public void setSecond(Integer second) {
            this.second = second;
        }

        public Integer getDownloadFlag() {
            return downloadFlag;
        }

        public void setDownloadFlag(Integer downloadFlag) {
            this.downloadFlag = downloadFlag;
        }
    }
}
