package com.vv.im.common.bean.request.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @since 2021/07/29 15:37
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ImportFriendItem {
    /**
     * 好友的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * From_Account 对 To_Account 的好友备注，详情可参见 标配好友字段
     */
    @JsonProperty("Remark")
    private String remark;

    /**
     * From_Account 对 To_Account 的好友备注时间
     */
    @JsonProperty("RemarkTime")
    private Integer remarkTime;

    /**
     * From_Account 对 To_Account 的分组信息，详情可参见 标配好友字段
     */
    @JsonProperty("GroupName")
    private List<String> groupName;

    /**
     * 加好友来源字段，详情可参见 标配好友字段
     */
    @JsonProperty("AddSource")
    private String addSource;

    /**
     * From_Account 和 To_Account 形成好友关系时的附言信息，详情可参见 标配好友字段
     */
    @JsonProperty("AddWording")
    private String addWording;

    /**
     * From_Account 和 To_Account 形成好友关系的时间
     */
    @JsonProperty("AddTime")
    private Integer addTime;

    /**
     * From_Account 对 To_Account 的自定义好友数据，每一个成员都包含一个 Tag 字段和一个 Value 字段，详情可参见 自定义好友字段
     */
    @JsonProperty("CustomItem")
    private List<CustomItem> customItemList;

}
