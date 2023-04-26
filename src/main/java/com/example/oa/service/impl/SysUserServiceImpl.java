package com.example.oa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.oa.entity.system.SysUser;
import com.example.oa.service.SysUserService;
import com.example.oa.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【sys_user(用户表)】的数据库操作Service实现
* @createDate 2023-04-25 15:59:24
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




