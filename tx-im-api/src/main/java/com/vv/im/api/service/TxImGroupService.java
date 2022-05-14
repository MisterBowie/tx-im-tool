package com.vv.im.api.service;

import com.vv.im.common.bean.request.group.*;
import com.vv.im.common.bean.response.group.*;

/**
 * <prev>
 * 群聊操作service
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/14
 */

public interface TxImGroupService {

    /**
     * 获取 App 中的所有群组
     *
     * @param getAppidGroupListRequest 请求参数
     * @return 结果
     */
    public GroupGetAppIdListResult getAppIdGroupList(GetAppIdGroupListRequest getAppidGroupListRequest);

    /**
     * 创建群组
     *
     * @param createGroupRequest 请求参数
     * @return 结果
     */
    public GroupCreateResult createGroup(GroupCreateRequest createGroupRequest);

    /**
     * 获取群详细资料
     *
     * @param getGroupInfoRequest 请求参数
     * @return 结果
     */
    public GroupGetInfoResult getGroupInfo(GroupGetInfoRequest getGroupInfoRequest);

    /**
     * 获取群成员详细资料
     *
     * @param getGroupMemberInfoRequest 请求参数
     * @return 结果
     */
    public GetGroupMemberInfoResult getGroupMemberInfo(GetGroupMemberInfoRequest getGroupMemberInfoRequest);

    /**
     * 修改群基础资料
     *
     * @param modifyGroupBaseInfoRequest 请求参数
     * @return 结果
     */
    public ModifyGroupBaseInfoResult modifyGroupBaseInfo(ModifyGroupBaseInfoRequest modifyGroupBaseInfoRequest);

    /**
     * 增加群成员
     *
     * @param addGroupMemberRequest 请求参数
     * @return 结果
     */
    public GroupAddMemberResult addGroupMember(GroupAddMemberRequest addGroupMemberRequest);

    /**
     * 删除群成员
     *
     * @param deleteGroupMemberRequest 请求参数
     * @return 结果
     */
    public DeleteGroupMemberResult deleteGroupMember(DeleteGroupMemberRequest deleteGroupMemberRequest);

    /**
     * 修改群成员资料
     *
     * @param modifyGroupMemberInfoRequest 请求参数
     * @return 结果
     */
    public ModifyGroupMemberInfoResult modifyGroupMemberInfo(ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest);

    /**
     * 解散群组
     *
     * @param destroyGroupRequest 请求参数
     * @return 结果
     */
    public GroupCreateResult destroyGroup(GroupDestroyRequest destroyGroupRequest);

    /**
     * 获取用户所加入的群组
     *
     * @param getJoinedGroupListRequest 请求参数
     * @return 结果
     */
    public GetJoinGroupListResult getJoinGroupList(GetJoinedGroupListRequest getJoinedGroupListRequest);

    /**
     * 查询用户在群组中的身份
     *
     * @param getRoleInGroupRequest 请求参数
     * @return 结果
     */
    public GetRoleInGroupResult getRoleInGroup(GetRoleInGroupRequest getRoleInGroupRequest);


    /**
     * 批量禁言和取消禁言
     *
     * @param forbidSendMsgRequest 请求参数
     * @return 结果
     */
    public ForbidSendMsgResult forbidSendMsg(ForbidSendMsgRequest forbidSendMsgRequest);

    /**
     * 获取被禁言群成员列表
     *
     * @param getGroupShuttedUinRequest 请求参数
     * @return 结果
     */
    public GetGroupShuttedUinResult getGroupShuttedUin(GetGroupShuttedUinRequest getGroupShuttedUinRequest);

    /**
     * 在群组中发送普通消息
     *
     * @param sendGroupMsgRequest 请求参数
     * @return 结果
     */
    public SendGroupMsgResult sendGroupMsg(SendGroupMsgRequest sendGroupMsgRequest);

    /**
     * 在群组中发送系统消息
     *
     * @param request 请求参数
     * @return 结果
     */
    public SendGroupSystemNotificationResult sendGroupSystemNotification(SendGroupSystemNotificationRequest request);

    /**
     * 转让群主
     *
     * @param changeGroupOwnerRequest 请求参数
     * @return 结果
     */
    public ChangeGroupOwnerResult changeGroupOwner(GroupChangeOwnerRequest changeGroupOwnerRequest);

    /**
     * 撤回群消息
     *
     * @param groupMsgRecallRequest 请求参数
     * @return 结果
     */
    public GroupMsgRecallResult groupMsgRecall(GroupMsgRecallRequest groupMsgRecallRequest);

    /**
     * 导入群基础资料
     *
     * @param importGroupRequest 请求参数
     * @return 结果
     */
    public ImportGroupResult importGroup(ImportGroupRequest importGroupRequest);

    /**
     * 导入群消息
     *
     * @param importGroupMsgRequest 请求参数
     * @return 结果
     */
    public ImportGroupMsgResult importGroupMsg(ImportGroupMsgRequest importGroupMsgRequest);

    /**
     * 导入群成员
     *
     * @param importGroupMemberRequest 请求参数
     * @return 结果
     */
    public ImportGroupMemberResult importGroupMember(ImportGroupMemberRequest importGroupMemberRequest);

    /**
     * 设置成员未读消息计数
     *
     * @param setUnreadMsgNumRequest 请求参数
     * @return 结果
     */
    public SetUnreadMsgNumResult setUnreadMsgNum(SetUnreadMsgNumRequest setUnreadMsgNumRequest);

    /**
     * 撤回指定用户发送的消息
     *
     * @param deleteGroupMsgBySenderRequest 请求参数
     * @return 结果
     */
    public DeleteGroupMsgBySenderResult deleteGroupMsgBySender(DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest);

    /**
     * 拉取群历史消息
     *
     * @param groupMsgGetSimpleRequest 请求参数
     * @return 结果
     */
    public GroupMsgGetSimpleResult groupMsgGetSimple(GroupMsgGetSimpleRequest groupMsgGetSimpleRequest);

    /**
     * 获取直播群在线人数
     *
     * @param getOnlineMemberNumRequest 请求参数
     * @return 结果
     */
    public GetOnlineMemberNumResult getOnlineMemberNum(GetOnlineMemberNumRequest getOnlineMemberNumRequest);

    /**
     * 获取群自定义属性
     *
     * @param getGroupAttrRequest 请求参数
     * @return 结果
     */
    public GroupGetAttrResult getGroupAttr(GetGroupAttrRequest getGroupAttrRequest);

    /**
     * 修改群自定义属性
     *
     * @param modifyGroupAttrRequest 请求参数
     * @return 结果
     */
    public ModifyGroupAttrResult modifyGroupAttr(ModifyGroupAttrRequest modifyGroupAttrRequest);

    /**
     * 清空群自定义属性
     *
     * @param clearGroupAttrRequest 请求参数
     * @return 结果
     */
    public ClearGroupAttrResult clearGroupAttr(ClearGroupAttrRequest clearGroupAttrRequest);

    /**
     * 重置群自定义属性
     *
     * @param setGroupAttrRequest 请求参数
     * @return 结果
     */
    public SetGroupAttrResult setGroupAttr(SetGroupAttrRequest setGroupAttrRequest);

}
