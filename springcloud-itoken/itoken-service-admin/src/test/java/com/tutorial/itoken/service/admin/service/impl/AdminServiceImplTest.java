package com.tutorial.itoken.service.admin.service.impl;

import com.tutorial.itoken.service.admin.AdminApplication;
import com.tutorial.itoken.service.admin.domain.TbSysUser;
import com.tutorial.itoken.service.admin.service.AdminService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AdminApplication.class)
@Transactional
@Rollback
public class AdminServiceImplTest {

    @Autowired
    private AdminService adminService;

    @Test
    public void testRegister() {
        TbSysUser sysUser = new TbSysUser();
        sysUser.setUserCode(UUID.randomUUID().toString());
        sysUser.setLoginCode("mrhuangwe@foxmail.com");
        sysUser.setPassword(DigestUtils.md5DigestAsHex("123456789".getBytes()));
        adminService.register(sysUser);
    }

    @Test
    public void TbSysUser() {
        TbSysUser user = adminService.login("mrhuangwe@foxmail.com", "123456789");
        Assert.assertNotNull(user);
    }

}