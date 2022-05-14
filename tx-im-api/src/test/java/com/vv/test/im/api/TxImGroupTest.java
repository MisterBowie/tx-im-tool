package com.vv.test.im.api;

import com.google.inject.Inject;
import com.vv.im.api.service.TxImGroupService;
import com.vv.im.api.service.TxImService;
import com.vv.im.common.bean.constant.GroupType;
import com.vv.im.common.bean.model.group.GroupInfo;
import com.vv.im.common.bean.request.group.*;
import com.vv.im.common.bean.response.group.GroupCreateResult;
import com.vv.im.common.bean.response.group.GroupGetInfoResult;
import com.vv.im.common.bean.response.group.ImportGroupMemberResult;
import com.vv.test.im.test.ApiTestModule;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * <prev>
 * 群组测试
 * <prev>
 *
 * @author <a href="https://github.com/MisterBowie">MisterBowie</a>
 * @date 2022/5/14
 */

@Guice(modules = ApiTestModule.class)
@Slf4j
public class TxImGroupTest {
    private String groupId = "213213123";

    @Inject
    private TxImService txImService;

    /**
     * 测试群创建
     */
    @Test
    public void testCreate() {
        GroupCreateRequest createRequest = new GroupCreateRequest();
        createRequest.setMaxMemberCount(200);
        createRequest.setGroupId(groupId);
        createRequest.setName("测试组");
        createRequest.setFaceUrl("群头像");
        createRequest.setType(GroupType.PUBLIC);
        final TxImGroupService service = txImService.getGroupService();
        final GroupCreateResult group = service.createGroup(createRequest);
        assertEquals(0, group.getErrorCode().intValue());
    }

    @Test
    public void testDestroy() {
        GroupDestroyRequest request = new GroupDestroyRequest();
        request.setGroupId(groupId);
        final TxImGroupService service = txImService.getGroupService();
        final GroupCreateResult group = service.destroyGroup(request);
        assertEquals(0, group.getErrorCode().intValue());
    }

    @Test
    public void testGroupImportMemberAndRemove() {
        //创建群
        testCreate();
        //导入成员
        final TxImGroupService service = txImService.getGroupService();
        ImportGroupMemberRequest request = new ImportGroupMemberRequest();
        request.setGroupId(groupId);
        GroupMemberItem groupMemberItem = new GroupMemberItem();
        groupMemberItem.setMemberAccount(TxImAccountTest.testSingleStr);
        request.setMemberList(Arrays.asList(groupMemberItem));
        final ImportGroupMemberResult importGroupMemberResult = service.importGroupMember(request);
        assertEquals(0, importGroupMemberResult.getErrorCode().intValue());

        // 判断信息是否正确
        GroupGetInfoRequest groupInfoRequest = new GroupGetInfoRequest();
        groupInfoRequest.setGroupIdList(Arrays.asList(groupId));
        ResponseFilter responseFilter = new ResponseFilter();
        responseFilter.setMemberInfoFilter(Arrays.asList("Account"));
        groupInfoRequest.setResponseFilter(responseFilter);
        final GroupGetInfoResult groupInfoResult = service.getGroupInfo(groupInfoRequest);
        final List<GroupInfo> groupInfoList = groupInfoResult.getGroupInfo();
        Assert.assertEquals(1, groupInfoList.size());
        final GroupInfo groupInfo = groupInfoList.get(0);
        final List<MemberProfile> memberList = groupInfo.getMemberList();
        Assert.assertEquals(1, memberList.size());
        Assert.assertEquals(TxImAccountTest.testSingleStr, memberList.get(0).getMemberAccount());
        // 销毁
        testDestroy();
    }


}
