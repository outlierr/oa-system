package com.example.oa.common.utils;

import com.example.oa.entity.auth.SysMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {
    public static List<SysMenu> buildTree(List<SysMenu> list) {
        ArrayList<SysMenu> menuList = new ArrayList<>();
        list.stream()
                .filter(menu -> menu.getParentId() == 0)
                .forEach(menu -> menuList.add(findChildren(menu,list))); // 将所有的根节点放入 menuList;
        return menuList;
    }

    /**
     *
     * @param sysMenu
     * @param list
     * @return
     */
    public static SysMenu findChildren(SysMenu sysMenu, List<SysMenu> list) {
        for (SysMenu it : list) {
            if(sysMenu.getId().longValue() == it.getParentId().longValue()) {
                if (sysMenu.getChildren() == null) {
                    sysMenu.setChildren(new ArrayList<>());
                }
                sysMenu.getChildren().add(findChildren(it,list));
            }
        }
        return sysMenu;
    }
}
