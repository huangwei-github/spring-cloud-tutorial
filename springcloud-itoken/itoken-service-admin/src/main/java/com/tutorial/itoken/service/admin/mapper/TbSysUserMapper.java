package com.tutorial.itoken.service.admin.mapper;

import com.tutorial.itoken.service.admin.domain.TbSysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TbSysUserMapper extends tk.mybatis.mapper.common.Mapper<TbSysUser> {
}
