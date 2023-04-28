package com.example.oa.service.auth.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.oa.entity.system.SysLoginLog;
import com.example.oa.service.auth.SysLoginLogService;
import com.example.oa.mapper.SysLoginLogMapper;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【sys_login_log(系统访问记录)】的数据库操作Service实现
* @createDate 2023-04-25 15:59:24
*/
@Service
public class SysLoginLogServiceImpl extends ServiceImpl<SysLoginLogMapper, SysLoginLog>
    implements SysLoginLogService{

}




