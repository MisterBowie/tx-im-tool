package com.vv.im.api.service;

import com.vv.im.common.bean.request.account.*;
import com.vv.im.common.bean.response.account.*;
import com.vv.im.common.service.TxService;

/**
 * <prev>
 * 用户操作service
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/12
 */

public interface TxImAccountService {
    /**
     * 初始化用户Sig
     * @param userId
     * @return
     */
    public String initUserSig(String userId);

    /**
     * 导入单个帐号
     *
     * @param accountImportRequest 请求参数
     * @return 结果
     */
    public AccountImportResult accountImport(AccountImportRequest accountImportRequest);


    /**
     * 导入多个帐号
     *
     * @param multiAccountImportRequest 请求参数
     * @return 结果
     */
    public MultiAccountImportResult multiAccountImport(AccountMultiImportRequest multiAccountImportRequest);


    /**
     * 删除帐号
     *
     * @param accountDeleteRequest 请求参数
     * @return 结果
     */
    public AccountDeleteResult accountDelete(AccountDeleteRequest accountDeleteRequest);


    /**
     * 查询帐号
     *
     * @param accountCheckRequest 请求参数
     * @return 结果
     */
    public AccountCheckResult accountCheck(AccountCheckRequest accountCheckRequest);


    /**
     * 失效帐号登录状态
     *
     * @param kickRequest 请求参数
     * @return 结果
     */
    public AccountKickResult kick(AccountKickRequest kickRequest);

    /**
     * 查询帐号在线状态
     *
     * @param queryOnlineStatusRequest 请求参数
     * @return 结果
     */
    public AccountQueryOnlineStatusResult queryOnlineStatus(AccountQueryOnlineStatusRequest queryOnlineStatusRequest);
}
