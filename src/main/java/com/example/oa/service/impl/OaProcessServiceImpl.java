package com.example.oa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.oa.entity.process.OaProcess;
import com.example.oa.service.OaProcessService;
import com.example.oa.mapper.OaProcessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【oa_process(审批类型)】的数据库操作Service实现
* @createDate 2023-04-25 15:59:24
*/
@Service
public class OaProcessServiceImpl extends ServiceImpl<OaProcessMapper, OaProcess>
    implements OaProcessService{

}




