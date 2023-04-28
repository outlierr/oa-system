package com.example.oa.service.auth.impl;

import com.example.oa.common.utils.JwtUtil;
import com.example.oa.exception.ServiceException;
import com.example.oa.security.custom.LoginUser;
import com.example.oa.service.auth.LoginService;
import com.example.oa.service.auth.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private SysUserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    public String login(String username, String password) {

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authenticate = null;
        try {
            authenticate = authenticationManager.authenticate(authenticationToken);
        }catch (Exception e) {
            throw new ServiceException(e.getMessage());
        }

        return jwtUtil.createToken((LoginUser) authenticate.getPrincipal());
    }

//    private void loginPreCheck() {
//        // 判断查询结果是否为空
//        if (null == sysUser) {
//            throw new ServiceException(ResultCodeEnum.ERROR.getCode(), "用户不存在");
//        }
//        // 判断密码是否匹配
//        if (!passwordEncoder.matches(password, sysUser.getPassword())) {
//            throw new ServiceException(ResultCodeEnum.ERROR.getCode(), "密码错误");
//        }
//        // 判断用户是否被禁用
//        if (Objects.equals(sysUser.getStatus(), UserStatus.DISABLE.getCode())) {
//            throw new ServiceException(ResultCodeEnum.ERROR.getCode(), "用户被禁用");
//        }
//    }
}
