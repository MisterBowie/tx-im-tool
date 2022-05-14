package com.vv.im.common.bean.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vv.im.common.bean.constant.MsgType;

/**
 * 文本消息元素
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TIMTextMsgElement extends TIMMsgElement {
    /**
     * MsgContent 为 TIM 消息对象
     */
    @JsonProperty("MsgContent")
    private TextMsgContent msgContent;

    public TIMTextMsgElement() {
        super(MsgType.TIM_TEXT_ELEM);
    }

    public TIMTextMsgElement(TextMsgContent msgContent) {
        super(MsgType.TIM_TEXT_ELEM);
        this.msgContent = msgContent;
    }

    public TIMTextMsgElement(String text) {
        this(new TextMsgContent(text));
    }

    public TextMsgContent getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(TextMsgContent msgContent) {
        this.msgContent = msgContent;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TextMsgContent {
        @JsonProperty("Text")
        private String text;

        public TextMsgContent() {
        }

        public TextMsgContent(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
