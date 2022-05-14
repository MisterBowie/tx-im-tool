package com.vv.im.common.bean.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.vv.im.common.bean.constant.MsgType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 抽象消息元素
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2022/05/04 16:24
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "MsgType", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = TIMTextMsgElement.class, name = MsgType.TIM_TEXT_ELEM),
        @JsonSubTypes.Type(value = TIMVideoFileMsgElement.class, name = MsgType.TIM_VIDEO_FILE_ELEM),
        @JsonSubTypes.Type(value = TIMCustomMsgElement.class, name = MsgType.TIM_CUSTOM_ELEM),
        @JsonSubTypes.Type(value = TIMSoundMsgElement.class, name = MsgType.TIM_SOUND_ELEM),
        @JsonSubTypes.Type(value = TIMImageMsgElement.class, name = MsgType.TIM_IMAGE_ELEM),
        @JsonSubTypes.Type(value = TIMLocationMsgElement.class, name = MsgType.TIM_LOCATION_ELEM),
        @JsonSubTypes.Type(value = TIMFileMsgElement.class, name = MsgType.TIM_FILE_ELEM),
        @JsonSubTypes.Type(value = TIMFaceMsgElement.class, name = MsgType.TIM_FACE_ELEM)
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class TIMMsgElement {
    /**
     * TIM 消息对象类型
     */
    @JsonProperty("MsgType")
    private String msgType;
    
}
