package com.vv.im.api.service.impl;

import com.vv.im.api.service.TxImMessageService;
import com.vv.im.common.bean.request.msg.*;
import com.vv.im.common.bean.response.group.GroupGetAppIdListResult;
import com.vv.im.common.bean.response.msg.*;
import com.vv.im.common.constants.ErrorCode;
import com.vv.im.common.error.TxError;
import com.vv.im.common.error.TxErrorException;
import com.vv.im.common.service.TxService;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.RequiredArgsConstructor;

import javax.xml.ws.ServiceMode;
import java.io.IOException;

@RequiredArgsConstructor
public class TxImMessageServiceImpl implements TxImMessageService {

    private final TxService txService;


    /**
     * 单聊消息服务名
     */
    public static final String SERVICE_NAME = "openim";

    public static final String SERVICE_NAME_MSG_EXT = "openim_msg_ext_http_svc";

    /**
     * 单聊消息相关命令字
     */
    public static final String SEND_MSG_COMMAND = "sendmsg";
    public static final String IMPORT_MSG_COMMAND = "importmsg";
    public static final String BATCH_SEND_MSG_COMMAND = "batchsendmsg";
    public static final String ADMIN_GET_ROAM_MSG_COMMAND = "admin_getroammsg";
    public static final String ADMIN_MSG_WITHDRAW_COMMAND = "admin_msgwithdraw";
    public static final String ADMIN_SET_MSG_READ_COMMAND = "admin_set_msg_read";
    public static final String GET_C2C_UNREAD_MSG_NUM_COMMAND = "get_c2c_unread_msg_num";
    public static final String MODIFY_C2C_MSG_COMMAND = "modify_c2c_msg";
    public static final String GET_KEY_VALUES_COMMAND = "get_key_values";
    public static final String SET_KEY_VALUES_COMMAND = "set_key_values";


    /**
     * 单发单聊消息
     *
     * @param request 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SendMsgResult sendMsg(SendMsgRequest request) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, SEND_MSG_COMMAND), request.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, SendMsgResult.class);
        }
        throw new TxErrorException(txError);
    }

    public SendMsgResult sendMsg(SendMsgRequest sendMsgRequest, long random) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, SEND_MSG_COMMAND), sendMsgRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, SendMsgResult.class);
        }
        throw new TxErrorException(txError);
    }

    /**
     * 批量发单聊消息
     *
     * @param batchSendMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public BatchSendMsgResult batchSendMsg(BatchSendMsgRequest batchSendMsgRequest) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, BATCH_SEND_MSG_COMMAND), batchSendMsgRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, BatchSendMsgResult.class);
        }
        throw new TxErrorException(txError);
    }

    public BatchSendMsgResult batchSendMsg(BatchSendMsgRequest batchSendMsgRequest, long random) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, BATCH_SEND_MSG_COMMAND), batchSendMsgRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, BatchSendMsgResult.class);
        }
        throw new TxErrorException(txError);
    }

    /**
     * 导入单聊消息
     *
     * @param importMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImportMsgResult importMsg(ImportMsgRequest importMsgRequest) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, IMPORT_MSG_COMMAND), importMsgRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ImportMsgResult.class);
        }
        throw new TxErrorException(txError);
    }

    public ImportMsgResult importMsg(ImportMsgRequest importMsgRequest, long random) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, IMPORT_MSG_COMMAND, random), importMsgRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ImportMsgResult.class);
        }
        throw new TxErrorException(txError);
    }

    /**
     * 查询单聊消息
     *
     * @param adminGetRoamMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AdminRoamMsgResult getRoamMsg(AdminGetRoamMsgRequest adminGetRoamMsgRequest) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, ADMIN_GET_ROAM_MSG_COMMAND), adminGetRoamMsgRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, AdminRoamMsgResult.class);
        }
        throw new TxErrorException(txError);
    }

    public AdminRoamMsgResult getRoamMsg(AdminGetRoamMsgRequest adminGetRoamMsgRequest, long random) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, ADMIN_GET_ROAM_MSG_COMMAND, random), adminGetRoamMsgRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, AdminRoamMsgResult.class);
        }
        throw new TxErrorException(txError);
    }

    /**
     * 撤回单聊消息
     *
     * @param adminMsgWithdrawRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AdminMsgWithdrawResult msgWithdraw(AdminMsgWithdrawRequest adminMsgWithdrawRequest) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, ADMIN_MSG_WITHDRAW_COMMAND), adminMsgWithdrawRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, AdminMsgWithdrawResult.class);
        }
        throw new TxErrorException(txError);
    }

    public AdminMsgWithdrawResult msgWithdraw(AdminMsgWithdrawRequest adminMsgWithdrawRequest, long random) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, ADMIN_MSG_WITHDRAW_COMMAND, random), adminMsgWithdrawRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, AdminMsgWithdrawResult.class);
        }
        throw new TxErrorException(txError);
    }

    /**
     * 设置单聊消息已读
     *
     * @param adminSetMsgReadRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AdminSetMsgReadResult setMsgRead(AdminSetMsgReadRequest adminSetMsgReadRequest) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, ADMIN_SET_MSG_READ_COMMAND), adminSetMsgReadRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, AdminSetMsgReadResult.class);
        }
        throw new TxErrorException(txError);
    }

    public AdminSetMsgReadResult setMsgRead(AdminSetMsgReadRequest adminSetMsgReadRequest, long random) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, ADMIN_SET_MSG_READ_COMMAND, random), adminSetMsgReadRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, AdminSetMsgReadResult.class);
        }
        throw new TxErrorException(txError);
    }

    /**
     * 查询单聊未读消息计数
     *
     * @param getC2cUnreadMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public C2cUnreadMsgNumResult getC2cUnreadMsgNum(GetC2cUnreadMsgRequest getC2cUnreadMsgRequest) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, GET_C2C_UNREAD_MSG_NUM_COMMAND), getC2cUnreadMsgRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, C2cUnreadMsgNumResult.class);
        }
        throw new TxErrorException(txError);
    }

    public C2cUnreadMsgNumResult getC2cUnreadMsgNum(GetC2cUnreadMsgRequest getC2cUnreadMsgRequest, long random) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, GET_C2C_UNREAD_MSG_NUM_COMMAND, random), getC2cUnreadMsgRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, C2cUnreadMsgNumResult.class);
        }
        throw new TxErrorException(txError);
    }

    /**
     * 修改单聊历史消息
     *
     * @param modifyC2cMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ModifyC2cMsgResult modifyC2cMsg(ModifyC2cMsgRequest modifyC2cMsgRequest) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, MODIFY_C2C_MSG_COMMAND), modifyC2cMsgRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ModifyC2cMsgResult.class);
        }
        throw new TxErrorException(txError);
    }

    public ModifyC2cMsgResult modifyC2cMsg(ModifyC2cMsgRequest modifyC2cMsgRequest, long random) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, MODIFY_C2C_MSG_COMMAND, random), modifyC2cMsgRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, ModifyC2cMsgResult.class);
        }
        throw new TxErrorException(txError);
    }

    /**
     * 拉取单聊消息扩展
     *
     * @param getKeyValuesRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetKeyValuesResult getKeyValues(GetKeyValuesRequest getKeyValuesRequest) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, GET_KEY_VALUES_COMMAND), getKeyValuesRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GetKeyValuesResult.class);
        }
        throw new TxErrorException(txError);
    }

    public GetKeyValuesResult getKeyValues(GetKeyValuesRequest getKeyValuesRequest, long random) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, GET_KEY_VALUES_COMMAND, random), getKeyValuesRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, GetKeyValuesResult.class);
        }
        throw new TxErrorException(txError);
    }

    /**
     * 设置单聊消息扩展
     *
     * @param setKeyValuesRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SetKeyValuesResult setKeyValues(SetKeyValuesRequest setKeyValuesRequest) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME_MSG_EXT, SET_KEY_VALUES_COMMAND), setKeyValuesRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, SetKeyValuesResult.class);
        }
        throw new TxErrorException(txError);
    }

    public SetKeyValuesResult setKeyValues(SetKeyValuesRequest setKeyValuesRequest, long random) throws IOException {
        final String post = txService.post(txService.getUrl(SERVICE_NAME_MSG_EXT, SET_KEY_VALUES_COMMAND,random), setKeyValuesRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, SetKeyValuesResult.class);
        }
        throw new TxErrorException(txError);
    }
}
