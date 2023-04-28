package com.example.oa.service.auth;

import com.example.oa.entity.auth.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author admin
* @description 针对表【sys_role(角色)】的数据库操作Service
* @createDate 2023-04-25 15:59:24
*/
public interface SysRoleService extends IService<SysRole> {
    void remove(Long id);
}
