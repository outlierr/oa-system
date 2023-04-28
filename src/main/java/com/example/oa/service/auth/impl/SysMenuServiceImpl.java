package com.example.oa.service.auth.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.oa.common.enums.MenuType;
import com.example.oa.common.utils.MenuUtil;
import com.example.oa.entity.auth.SysMenu;
import com.example.oa.service.auth.SysMenuService;
import com.example.oa.mapper.SysMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author admin
 * @description 针对表【sys_menu(菜单表)】的数据库操作Service实现
 * @createDate 2023-04-25 15:59:24
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu>
        implements SysMenuService {
    @Autowired
    private SysMenuMapper menuMapper;

    /**
     * // 查看用户下的后端接口访问权限（按钮）
     *
     * @param userId
     * @return
     */
    @Override
    public Set<String> getMenuPermsByUserId(Long userId) {
        List<SysMenu> list = null;
        if (userId == 1) {
            list = this.lambdaQuery()
                    .eq(SysMenu::getStatus, 1)
                    .eq(SysMenu::getType,2).list();
        } else {
            list = menuMapper.findMenuPermsByUserId(userId);
        }
        return list.stream()
                        .filter(menu -> Objects.equals(menu.getType(), MenuType.BUTTON.getCode()))
                        .map(SysMenu::getPerms)
                        .collect(Collectors.toSet());
    }

    /**
     *
     *获取用户的菜单和权限列表(包括按钮)，构造成树形,在菜单管理下的课件，角色可以有分配的菜单和权限进行操作
     * @param userId
     * @return
     */
    @Override
    public List<SysMenu> getMenuByUserId(Long userId) {
        List<SysMenu> list = null;
        if (userId == 1) {
            list = this.lambdaQuery().eq(SysMenu::getStatus, 1).orderByAsc(SysMenu::getSortValue).list();
        }else {
            list = menuMapper.findMenuByUserId(userId);
        }

        return null;
    }

    /**
     * 登录用户左侧菜单
     * @return
     */
    @Override
    public List<SysMenu> findNodes() {
        List<SysMenu> menuList = this.lambdaQuery().list();
        if (CollectionUtil.isEmpty(menuList)) {
            return null;
        }
        return MenuUtil.buildTree(menuList);
    }
}




