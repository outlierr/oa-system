package com.example.oa.service.auth.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.oa.common.enums.UserStatus;
import com.example.oa.common.result.ResultCodeEnum;
import com.example.oa.common.utils.JwtUtil;
import com.example.oa.entity.system.SysUser;
import com.example.oa.exception.ServiceException;
import com.example.oa.service.auth.SysUserService;
import com.example.oa.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
* @author admin
* @description 针对表【sys_user(用户表)】的数据库操作Service实现
* @createDate 2023-04-25 15:59:24
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




