package com.example.oa.controller;

import com.example.oa.service.auth.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private SysUserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/test")
    public Object test() {
        System.out.println(authenticationManager);
        return "214214";
    }
}
