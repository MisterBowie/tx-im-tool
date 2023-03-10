package com.vv.im.api.service;

import com.vv.im.common.service.TxService;

/**
 * <prev>
 *
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/13
 */


public interface TxImService extends TxService {
    /**
     * 获取账户的Service
     * @return
     */
    public TxImAccountService getAccountService();

    /**
     * 获取群组的service
     * @return
     */
    public TxImGroupService getGroupService();

    /**
     * 初始化用户Sig
     * @param userId
     * @return
     */
    public String initUserSig(String userId);
}
