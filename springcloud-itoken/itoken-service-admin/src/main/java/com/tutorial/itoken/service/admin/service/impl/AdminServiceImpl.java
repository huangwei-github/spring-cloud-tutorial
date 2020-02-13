package com.tutorial.itoken.service.admin.service.impl;

import com.tutorial.itoken.service.admin.domain.TbSysUser;
import com.tutorial.itoken.service.admin.mapper.TbSysUserMapper;
import com.tutorial.itoken.service.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional(readOnly = true)
public class AdminServiceImpl implements AdminService {

    @Autowired
    private TbSysUserMapper sysUserMapper;

    @Override
    public void register(TbSysUser tbSysUser) {
        sysUserMapper.insert(tbSysUser);
    }

    @Override
    public TbSysUser login(String loginCode, String plantPassword) {
        Example example = new Example(TbSysUser.class);
        example.createCriteria().andEqualTo("loginCode", loginCode);
        TbSysUser user = sysUserMapper.selectOneByExample(example);
        if (null != user) {
            String password = DigestUtils.md5DigestAsHex(plantPassword.getBytes());
            if (password.equals(user.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
