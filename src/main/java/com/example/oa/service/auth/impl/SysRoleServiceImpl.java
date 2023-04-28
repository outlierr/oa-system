package com.example.oa.service.auth.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.oa.entity.auth.SysRole;
import com.example.oa.service.auth.SysRoleService;
import com.example.oa.mapper.SysRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【sys_role(角色)】的数据库操作Service实现
* @createDate 2023-04-25 15:59:24
*/
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole>
    implements SysRoleService{
    @Override
    public void remove(Long id) {
    }
}




