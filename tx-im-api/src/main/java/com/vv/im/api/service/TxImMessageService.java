package com.vv.im.api.service;

import com.vv.im.common.bean.request.msg.*;
import com.vv.im.common.bean.response.msg.*;

import java.io.IOException;

public interface TxImMessageService {
    /**
     * 单发单聊消息
     *
     * @param request 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SendMsgResult sendMsg(SendMsgRequest request) throws IOException;

    public SendMsgResult sendMsg(SendMsgRequest sendMsgRequest, long random) throws IOException;

    /**
     * 批量发单聊消息
     *
     * @param batchSendMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public BatchSendMsgResult batchSendMsg(BatchSendMsgRequest batchSendMsgRequest) throws IOException;

    public BatchSendMsgResult batchSendMsg(BatchSendMsgRequest batchSendMsgRequest, long random) throws IOException;

    /**
     * 导入单聊消息
     *
     * @param importMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImportMsgResult importMsg(ImportMsgRequest importMsgRequest) throws IOException;

    public ImportMsgResult importMsg(ImportMsgRequest importMsgRequest, long random) throws IOException;


    /**
     * 查询单聊消息
     *
     * @param adminGetRoamMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AdminRoamMsgResult getRoamMsg(AdminGetRoamMsgRequest adminGetRoamMsgRequest) throws IOException;

    public AdminRoamMsgResult getRoamMsg(AdminGetRoamMsgRequest adminGetRoamMsgRequest, long random) throws IOException;

    /**
     * 撤回单聊消息
     *
     * @param adminMsgWithdrawRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AdminMsgWithdrawResult msgWithdraw(AdminMsgWithdrawRequest adminMsgWithdrawRequest) throws IOException;

    public AdminMsgWithdrawResult msgWithdraw(AdminMsgWithdrawRequest adminMsgWithdrawRequest, long random) throws IOException;

    /**
     * 设置单聊消息已读
     *
     * @param adminSetMsgReadRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AdminSetMsgReadResult setMsgRead(AdminSetMsgReadRequest adminSetMsgReadRequest) throws IOException;

    public AdminSetMsgReadResult setMsgRead(AdminSetMsgReadRequest adminSetMsgReadRequest, long random) throws IOException;

    /**
     * 查询单聊未读消息计数
     *
     * @param getC2cUnreadMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public C2cUnreadMsgNumResult getC2cUnreadMsgNum(GetC2cUnreadMsgRequest getC2cUnreadMsgRequest) throws IOException;

    public C2cUnreadMsgNumResult getC2cUnreadMsgNum(GetC2cUnreadMsgRequest getC2cUnreadMsgRequest, long random) throws IOException;

    /**
     * 修改单聊历史消息
     *
     * @param modifyC2cMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ModifyC2cMsgResult modifyC2cMsg(ModifyC2cMsgRequest modifyC2cMsgRequest) throws IOException;

    public ModifyC2cMsgResult modifyC2cMsg(ModifyC2cMsgRequest modifyC2cMsgRequest, long random) throws IOException;

    /**
     * 拉取单聊消息扩展
     *
     * @param getKeyValuesRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetKeyValuesResult getKeyValues(GetKeyValuesRequest getKeyValuesRequest) throws IOException;

    public GetKeyValuesResult getKeyValues(GetKeyValuesRequest getKeyValuesRequest, long random) throws IOException;

    /**
     * 设置单聊消息扩展
     *
     * @param setKeyValuesRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SetKeyValuesResult setKeyValues(SetKeyValuesRequest setKeyValuesRequest) throws IOException;

    public SetKeyValuesResult setKeyValues(SetKeyValuesRequest setKeyValuesRequest, long random) throws IOException;
}
