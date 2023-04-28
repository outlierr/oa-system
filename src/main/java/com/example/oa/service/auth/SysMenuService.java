package com.example.oa.service.auth;

import com.example.oa.entity.system.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Set;

/**
* @author admin
* @description 针对表【sys_menu(菜单表)】的数据库操作Service
* @createDate 2023-04-25 15:59:24
*/
public interface SysMenuService extends IService<SysMenu> {
    List<SysMenu> getPermsByUserId(Long userId);
}
