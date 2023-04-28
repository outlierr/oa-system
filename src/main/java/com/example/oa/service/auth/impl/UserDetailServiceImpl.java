package com.example.oa.service.auth.impl;

import com.example.oa.common.enums.MenuType;
import com.example.oa.common.enums.UserStatus;
import com.example.oa.entity.auth.SysUser;
import com.example.oa.exception.ServiceException;
import com.example.oa.security.custom.LoginUser;
import com.example.oa.service.auth.SysMenuService;
import com.example.oa.service.auth.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserService userService;
    @Autowired
    private SysMenuService menuService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = userService.lambdaQuery().eq(SysUser::getUsername, username).one();
        if (user == null) {
            throw new ServiceException("该用户不存在");
        }
        if (Objects.equals(user.getStatus(), UserStatus.DISABLE.getCode())) {
            throw new ServiceException("该用户已停用");

        }
        Set<SimpleGrantedAuthority> authorities = menuService.getMenuPermsByUserId(user.getId())
                .stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toSet());

        return new LoginUser(user, authorities);
    }
}
