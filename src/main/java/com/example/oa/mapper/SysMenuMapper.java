package com.example.oa.mapper;

import com.example.oa.entity.auth.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author admin
* @description 针对表【sys_menu(菜单表)】的数据库操作Mapper
* @createDate 2023-04-25 15:59:24
* @Entity com.example.oa.entity.system.SysMenu
*/
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    List<SysMenu> findMenuPermsByUserId(Long userId);
    List<SysMenu> findMenuByUserId(Long userId);

}




