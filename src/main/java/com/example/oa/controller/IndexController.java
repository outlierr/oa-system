package com.example.oa.controller;

import com.example.oa.common.constant.Constants;
import com.example.oa.common.dto.LoginDTO;
import com.example.oa.common.result.Result;
import com.example.oa.service.auth.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {
    @Autowired
    private LoginService loginService;
    @PostMapping("/login")
    public Result login(@RequestBody LoginDTO dto) {
        String token = loginService.login(dto.getUsername(), dto.getPassword());
        Map<String, Object> map = new HashMap<>(1);
        map.put(Constants.TOKEN_KEY, token);
        return Result.ok(map);
    }
}
