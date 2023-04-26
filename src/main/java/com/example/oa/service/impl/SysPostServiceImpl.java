package com.example.oa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.oa.entity.system.SysPost;
import com.example.oa.service.SysPostService;
import com.example.oa.mapper.SysPostMapper;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【sys_post(岗位信息表)】的数据库操作Service实现
* @createDate 2023-04-25 15:59:24
*/
@Service
public class SysPostServiceImpl extends ServiceImpl<SysPostMapper, SysPost>
    implements SysPostService{

}




