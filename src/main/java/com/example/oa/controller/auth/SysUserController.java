package com.example.oa.controller.auth;

import com.example.oa.common.result.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/system/sysUser")
public class SysUserController {
    //用户条件分页查询
    @ApiOperation("用户条件分页查询")
    @GetMapping("{page}/{limit}")
    public Result list(@PathVariable Long page,
                        @PathVariable Long limit
                        ) {
        return null;
    }
}
