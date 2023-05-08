package com.vv.im.api.service.impl;

import com.vv.im.api.service.TxImAccountService;
import com.vv.im.common.bean.request.account.*;
import com.vv.im.common.bean.response.account.*;
import com.vv.im.common.constants.ErrorCode;
import com.vv.im.common.error.TxError;
import com.vv.im.common.error.TxErrorException;
import com.vv.im.common.service.TxService;
import com.vv.im.common.utils.SigUtil;
import com.vv.im.common.utils.json.JsonBuilderUtil;
import lombok.RequiredArgsConstructor;

/**
 * <prev>
 * 账号管理实现类
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/12
 */
@RequiredArgsConstructor
public class TxImAccountServiceImpl implements TxImAccountService {
    private final TxService txService;

    /**
     * 帐号管理服务名
     */
    private static final String SERVICE_NAME = "im_open_login_svc";
    private static final String SERVICE_NAME_OPEN_IM = "openim";

    /**
     * 帐号管理相关命令字
     */
    private static final String ACCOUNT_IMPORT_COMMAND = "account_import";
    private static final String MULTI_ACCOUNT_IMPORT_COMMAND = "multiaccount_import";
    private static final String ACCOUNT_DELETE_COMMAND = "account_delete";
    private static final String ACCOUNT_CHECK_COMMAND = "account_check";
    private static final String KICK_COMMAND = "kick";
    private static final String QUERY_ONLINE_STATUS_COMMAND = "query_online_status";

    @Override
    public String initUserSig(String userId) {
        return SigUtil.genUserSig(userId,txService.getTxImConfig().getExpireTime(), txService.getTxImConfig().getAppId(), txService.getTxImConfig().getKey());
    }

    @Override
    public AccountImportResult accountImport(AccountImportRequest accountImportRequest) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, ACCOUNT_IMPORT_COMMAND), accountImportRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, AccountImportResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public MultiAccountImportResult multiAccountImport(AccountMultiImportRequest multiAccountImportRequest) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, MULTI_ACCOUNT_IMPORT_COMMAND), multiAccountImportRequest.toJson());
        final MultiAccountImportResult result = JsonBuilderUtil.string2Obj(post, MultiAccountImportResult.class);
        if (ErrorCode.SUCCESS.getCode().equals(result.getErrorCode())) {
            return result;
        }
        throw new TxErrorException(result);
    }

    @Override
    public AccountDeleteResult accountDelete(AccountDeleteRequest accountDeleteRequest) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, ACCOUNT_DELETE_COMMAND), accountDeleteRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, AccountDeleteResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public AccountCheckResult accountCheck(AccountCheckRequest accountCheckRequest) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, ACCOUNT_CHECK_COMMAND), accountCheckRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, AccountCheckResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public AccountKickResult kick(AccountKickRequest kickRequest) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME, KICK_COMMAND), kickRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, AccountKickResult.class);
        }
        throw new TxErrorException(txError);
    }

    @Override
    public AccountQueryOnlineStatusResult queryOnlineStatus(AccountQueryOnlineStatusRequest queryOnlineStatusRequest) {
        final String post = txService.post(txService.getUrl(SERVICE_NAME_OPEN_IM, QUERY_ONLINE_STATUS_COMMAND), queryOnlineStatusRequest.toJson());
        final TxError txError = TxError.fromJson(post);
        if (ErrorCode.SUCCESS.getCode().equals(txError.getErrorCode())) {
            return JsonBuilderUtil.string2Obj(post, AccountQueryOnlineStatusResult.class);
        }
        throw new TxErrorException(txError);
    }
}
