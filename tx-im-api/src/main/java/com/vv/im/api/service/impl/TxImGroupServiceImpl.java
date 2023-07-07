package com.vv.im.api.service.impl;

import com.vv.im.api.service.TxImGroupService;
import com.vv.im.common.bean.request.group.*;
import com.vv.im.common.bean.response.group.*;
import com.vv.im.common.constants.ErrorCode;
import com.vv.im.common.error.TxError;
import com.vv.im.common.error.TxErrorException;
import com.vv.im.common.service.TxService;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.AllArgsConstructor;

import java.io.IOException;

/**
 * <prev>
 *
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/14
 */

@AllArgsConstructor
public class TxImGroupServiceImpl implements TxImGroupService {
    private final TxService txService;

    /**
     * 群组管理服务名
     */
    public static final String SERVICE_NAME = "group_open_http_svc";
    public static final String SERVICE_NAME_ATTR = "group_open_attr_http_svc";
    public static final String SERVICE_NAME_CHATROOM = "group_open_avchatroom_http_svc";
    public static final String SERVICE_NAME_OPEN_IM = "openim";
    public static final String SERVICE_NAME_MILLION_GROUP = "million_group_open_http_svc";
    public static final String SERVICE_NAME_OPEN_IM_MSG_EXT = "openim_msg_ext_http_svc";

    /**
     * 群组管理相关命令字
     */
    public static final String GET_APPID_GROUP_LIST_COMMAND = "get_appid_group_list";
    public static final String CREATE_GROUP_COMMAND = "create_group";
    public static final String GET_GROUP_INFO_COMMAND = "get_group_info";
    public static final String GET_GROUP_MEMBER_INFO_COMMAND = "get_group_member_info";
    public static final String MODIFY_GROUP_BASE_INFO_COMMAND = "modify_group_base_info";
    public static final String ADD_GROUP_MEMBER_COMMAND = "add_group_member";
    public static final String DELETE_GROUP_MEMBER_COMMAND = "delete_group_member";
    public static final String MODIFY_GROUP_MEMBER_INFO_COMMAND = "modify_group_member_info";
    public static final String DESTROY_GROUP_COMMAND = "destroy_group";
    public static final String GET_JOINED_GROUP_LIST_COMMAND = "get_joined_group_list";
    public static final String GET_ROLE_IN_GROUP_COMMAND = "get_role_in_group";
    public static final String FORBID_SEND_MSG_COMMAND = "forbid_send_msg";
    public static final String GET_GROUP_MUTED_ACCOUNT_COMMAND = "get_group_muted_account";
    public static final String SEND_GROUP_MSG_COMMAND = "send_group_msg";
    public static final String SEND_GROUP_SYSTEM_NOTIFICATION_COMMAND = "send_group_system_notification";
    public static final String CHANGE_GROUP_OWNER_COMMAND = "change_group_owner";
    public static final String GROUP_MSG_RECALL_COMMAND = "group_msg_recall";
    public static final String IMPORT_GROUP_COMMAND = "import_group";
    public static final String IMPORT_GROUP_MSG_COMMAND = "import_group_msg";
    public static final String IMPORT_GROUP_MEMBER_COMMAND = "import_group_member";
    public static final String SET_UNREAD_MSG_NUM_COMMAND = "set_unread_msg_num";
    public static final String DELETE_GROUP_MSG_BY_SENDER_COMMAND = "delete_group_msg_by_sender";
    public static final String GROUP_MSG_GET_SIMPLE_COMMAND = "group_msg_get_simple";
    public static final String GET_ONLINE_MEMBER_NUM_COMMAND = "get_online_member_num";
    public static final String GET_MEMBERS_COMMAND = "get_members";
    public static final String MODIFY_USER_INFO_COMMAND = "modify_user_info";
    public static final String GET_GROUP_ATTR_COMMAND = "get_group_attr";
    public static final String MODIFY_GROUP_ATTR_COMMAND = "modify_group_attr";
    public static final String CLEAR_GROUP_ATTR_COMMAND = "clear_group_attr";
    public static final String SET_GROUP_ATTR_COMMAND = "set_group_attr";
    public static final String MODIFY_GROUP_MSG_COMMAND = "modify_group_msg";
    public static final String SEND_BROADCAST_MSG_COMMAND = "send_broadcast_msg";
    public static final String GET_GROUP_MSG_RECEIPT_COMMAND = "get_group_msg_receipt";
    public static final String GET_GROUP_MSG_RECEIPT_DETAIL_COMMAND = "get_group_msg_receipt_detail";
    public static final String CREATE_GROUP_TOPIC_COMMAND = "create_topic";
    public static final String GET_GROUP_TOPIC_COMMAND = "get_topic";
    public static final String MODIFY_GROUP_TOPIC_COMMAND = "modify_topic";
    public static final String IMPORT_GROUP_TOPIC_COMMAND = "import_topic";
    public static final String DESTROY_GROUP_TOPIC_COMMAND = "destroy_topic";
    public static final String GET_GROUP_BAN_MEMBER_COMMAND = "get_group_ban_member";
    public static final String BAN_GROUP_MEMBER_COMMAND = "ban_group_member";
    public static final String UNBAN_GROUP_MEMBER_COMMAND = "unban_group_member";
    public static final String GROUP_GET_KEY_VALUES_COMMAND = "group_get_key_values";
    public static final String GROUP_SET_KEY_VALUES_COMMAND = "group_set_key_values";
    public static final String GET_GROUP_COUNTER_COMMAND = "get_group_counter";
    public static final String UPDATE_GROUP_COUNTER_COMMAND = "update_group_counter";
    public static final String DELETE_GROUP_COUNTER_COMMAND = "delete_group_counter";

    @Override
    public GroupGetAppIdListResult getAppIdGroupList(GetAppIdGroupListRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, GET_APPID_GROUP_LIST_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GroupGetAppIdListResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public GroupCreateResult createGroup(GroupCreateRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, CREATE_GROUP_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GroupCreateResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public GroupGetInfoResult getGroupInfo(GroupGetInfoRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, GET_GROUP_INFO_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GroupGetInfoResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public GetGroupMemberInfoResult getGroupMemberInfo(GetGroupMemberInfoRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, GET_GROUP_MEMBER_INFO_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GetGroupMemberInfoResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public ModifyGroupBaseInfoResult modifyGroupBaseInfo(ModifyGroupBaseInfoRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, MODIFY_GROUP_BASE_INFO_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ModifyGroupBaseInfoResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public GroupAddMemberResult addGroupMember(GroupAddMemberRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, ADD_GROUP_MEMBER_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GroupAddMemberResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public DeleteGroupMemberResult deleteGroupMember(DeleteGroupMemberRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, DELETE_GROUP_MEMBER_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, DeleteGroupMemberResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public ModifyGroupMemberInfoResult modifyGroupMemberInfo(ModifyGroupMemberInfoRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, MODIFY_GROUP_MEMBER_INFO_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ModifyGroupMemberInfoResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public GroupCreateResult destroyGroup(GroupDestroyRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, DESTROY_GROUP_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GroupCreateResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public GetJoinGroupListResult getJoinGroupList(GetJoinedGroupListRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, GET_JOINED_GROUP_LIST_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GetJoinGroupListResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public GetRoleInGroupResult getRoleInGroup(GetRoleInGroupRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, GET_ROLE_IN_GROUP_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GetRoleInGroupResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public ForbidSendMsgResult forbidSendMsg(ForbidSendMsgRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, FORBID_SEND_MSG_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ForbidSendMsgResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public GetGroupShuttedUinResult getGroupShuttedUin(GetGroupShuttedUinRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, GET_GROUP_MUTED_ACCOUNT_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GetGroupShuttedUinResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public SendGroupMsgResult sendGroupMsg(SendGroupMsgRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, SEND_GROUP_MSG_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, SendGroupMsgResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public SendGroupSystemNotificationResult sendGroupSystemNotification(SendGroupSystemNotificationRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, SEND_GROUP_SYSTEM_NOTIFICATION_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, SendGroupSystemNotificationResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public ChangeGroupOwnerResult changeGroupOwner(GroupChangeOwnerRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, CHANGE_GROUP_OWNER_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ChangeGroupOwnerResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public GroupMsgRecallResult groupMsgRecall(GroupMsgRecallRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, GROUP_MSG_RECALL_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GroupMsgRecallResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public ImportGroupResult importGroup(ImportGroupRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, IMPORT_GROUP_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ImportGroupResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public ImportGroupMsgResult importGroupMsg(ImportGroupMsgRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, IMPORT_GROUP_MSG_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ImportGroupMsgResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public ImportGroupMemberResult importGroupMember(ImportGroupMemberRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, IMPORT_GROUP_MEMBER_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ImportGroupMemberResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public SetUnreadMsgNumResult setUnreadMsgNum(SetUnreadMsgNumRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, SET_UNREAD_MSG_NUM_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, SetUnreadMsgNumResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public DeleteGroupMsgBySenderResult deleteGroupMsgBySender(DeleteGroupMsgBySenderRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, DELETE_GROUP_MSG_BY_SENDER_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, DeleteGroupMsgBySenderResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public GroupMsgGetSimpleResult groupMsgGetSimple(GroupMsgGetSimpleRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, GROUP_MSG_GET_SIMPLE_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GroupMsgGetSimpleResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public GetOnlineMemberNumResult getOnlineMemberNum(GetOnlineMemberNumRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, GET_ONLINE_MEMBER_NUM_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GetOnlineMemberNumResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public GroupGetAttrResult getGroupAttr(GetGroupAttrRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME_ATTR, GET_GROUP_ATTR_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GroupGetAttrResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public ModifyGroupAttrResult modifyGroupAttr(ModifyGroupAttrRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, MODIFY_GROUP_ATTR_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ModifyGroupAttrResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public ClearGroupAttrResult clearGroupAttr(ClearGroupAttrRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, CLEAR_GROUP_ATTR_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ClearGroupAttrResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public SetGroupAttrResult setGroupAttr(SetGroupAttrRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, SET_GROUP_ATTR_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, SetGroupAttrResult.class);
        }
        throw new TxErrorException(txError);
    }


    /**
     * 修改群聊历史消息
     *
     * @param request 请求参数
     * @return 结果
     */
    public ModifyGroupMsgResult modifyGroupMsg(ModifyGroupMsgRequest request) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME_OPEN_IM, MODIFY_GROUP_MSG_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ModifyGroupMsgResult.class);
        }
        throw new TxErrorException(txError);
    }
}
