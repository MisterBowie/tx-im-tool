package com.vv.test.im.api;

import cn.hutool.core.util.RandomUtil;
import com.google.inject.Inject;
import com.vv.im.api.service.TxImAccountService;
import com.vv.im.api.service.TxImService;
import com.vv.im.common.bean.request.account.AccountDeleteItem;
import com.vv.im.common.bean.request.account.AccountDeleteRequest;
import com.vv.im.common.bean.request.account.AccountImportRequest;
import com.vv.im.common.bean.request.account.AccountMultiImportRequest;
import com.vv.im.common.bean.response.account.AccountDeleteResult;
import com.vv.im.common.bean.response.account.AccountImportResult;
import com.vv.im.common.bean.response.account.MultiAccountImportResult;
import com.vv.im.common.service.TxService;
import com.vv.test.im.test.ApiTestModule;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

/**
 * <prev>
 *
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/13
 */

@Guice(modules = ApiTestModule.class)
@Slf4j
public class TxImAccountTest {
    public static final String testSingleStr = "123";
    private String[] testStr = {"2857", "2590"};
    @Inject
    private TxImService txImService;

    /**
     * 测试单个导入
     */
    @Test
    public void testImport() {
        final TxImAccountService service = txImService.getAccountService();
        AccountImportRequest accountImportRequest = new AccountImportRequest();
        accountImportRequest.setNick("测试" + testSingleStr);
        accountImportRequest.setFaceUrl("测试头像" + testSingleStr);
        accountImportRequest.setUserId(testSingleStr);
        final AccountImportResult accountImportResult = service.accountImport(accountImportRequest);
        assertEquals(0, accountImportResult.getErrorCode().intValue());
    }


    @Test
    public void testMultImport() {
        final TxImAccountService service = txImService.getAccountService();
        AccountMultiImportRequest request = new AccountMultiImportRequest();
//        request.setAccounts(Arrays.asList(testStr));
        final MultiAccountImportResult multiAccountImportResult = service.multiAccountImport(request);
        assertEquals(0, multiAccountImportResult.getErrorCode().intValue());
    }

    @Test
    public void testDeleteUser() {
        final TxImAccountService service = txImService.getAccountService();
        AccountDeleteRequest accountDeleteRequest = new AccountDeleteRequest();
        final List<AccountDeleteItem> collect = Arrays.stream(testStr).map(item -> {
            AccountDeleteItem accountDeleteItem = new AccountDeleteItem();
            accountDeleteItem.setUserId(item);
            return accountDeleteItem;
        }).collect(Collectors.toList());
        accountDeleteRequest.setDeleteItemList(collect);
        final AccountDeleteResult accountDeleteResult = service.accountDelete(accountDeleteRequest);
        log.info("testDeleteUser 返回数据:{}",accountDeleteResult.toString());
        assertEquals(0, accountDeleteResult.getErrorCode().intValue());
    }
}
