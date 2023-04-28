package com.example.oa.controller.auth;

import com.example.oa.common.result.Result;
import com.example.oa.entity.auth.SysMenu;
import com.example.oa.service.auth.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysMenuController {
    @Autowired
    private SysMenuService menuService;
    @GetMapping("/getNodes")
    public Result getNodes() {
        return Result.ok(menuService.findNodes());
    }
}
