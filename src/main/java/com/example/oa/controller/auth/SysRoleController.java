package com.example.oa.controller.auth;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.oa.common.dto.SysRoleQueryDTO;
import com.example.oa.common.result.Result;
import com.example.oa.common.utils.PageUtil;
import com.example.oa.entity.auth.SysRole;
import com.example.oa.service.auth.SysRoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
public class SysRoleController {
    @Autowired
    private SysRoleService roleService;

    /**
     * 条件分页查询
     * @param page 当前页
     * @param limit 每页显示记录数
     * @param dto 条件对象
     * @return
     */
    @ApiOperation("条件分页查询")
    @GetMapping("list/{page}/{limit}")
    public Result pageQueryRole(@PathVariable Long page,
                                @PathVariable Long limit,
                                @RequestBody SysRoleQueryDTO dto) {
        //1 创建Page对象，传递分页相关参数
        //page 当前页  limit 每页显示记录数
        Page<SysRole> pageParam = new Page<>(page,limit);

        //2 封装条件，判断条件是否为空，不为空进行封装
        String roleName = dto.getRoleName();
        LambdaQueryChainWrapper<SysRole> lambdaQuery = roleService.lambdaQuery();
        if(StringUtils.hasLength(roleName)) {
            //封装 like模糊查询
            lambdaQuery.like(SysRole::getRoleName,roleName);
        }

        //3 调用方法实现
        IPage<SysRole> pageModel = lambdaQuery.page(pageParam);

        return Result.ok(PageUtil.genPageVO(pageModel));
    }
    @ApiOperation(value = "获取用户详情")
    @GetMapping("view/{id}")
    public Result get(@PathVariable Long id) {
        SysRole role = roleService.getById(id);
        return Result.ok(role);
    }

    @ApiOperation(value = "修改角色")
    @PutMapping("update")
    public Result updateById(@RequestBody SysRole role) {
        roleService.updateById(role);
        return Result.ok();
    }

    @DeleteMapping("/remove")
    public Result remove(@PathVariable Long id) {
        roleService.remove(id);
        return Result.ok();
    }
}
