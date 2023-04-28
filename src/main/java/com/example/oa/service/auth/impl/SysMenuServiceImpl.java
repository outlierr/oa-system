package com.example.oa.service.auth.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.oa.entity.system.SysMenu;
import com.example.oa.service.auth.SysMenuService;
import com.example.oa.mapper.SysMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author admin
* @description 针对表【sys_menu(菜单表)】的数据库操作Service实现
* @createDate 2023-04-25 15:59:24
*/
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu>
    implements SysMenuService{
    @Autowired
    private SysMenuMapper menuMapper;
    @Override
    public List<SysMenu> getPermsByUserId(Long userId) {
        if(userId == 1) {
            return this.lambdaQuery().eq(SysMenu::getStatus,1).list();
        }
        return menuMapper.findPermsByUserId(userId);
    }
}




