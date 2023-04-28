package com.example.oa.common.utils;

import com.example.oa.security.custom.LoginUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityContextUtil {
    public static LoginUser getPrincipal() {
        return (LoginUser) getAuthentication().getPrincipal();
    }
    public static long getUserId() {
        return getPrincipal().getUser().getId();
    }
    public static Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
