package com.example.oa.service.auth.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.oa.entity.auth.SysOperLog;
import com.example.oa.service.auth.SysOperLogService;
import com.example.oa.mapper.SysOperLogMapper;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【sys_oper_log(操作日志记录)】的数据库操作Service实现
* @createDate 2023-04-25 15:59:24
*/
@Service
public class SysOperLogServiceImpl extends ServiceImpl<SysOperLogMapper, SysOperLog>
    implements SysOperLogService{

}




