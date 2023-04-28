package com.example.oa.api;

import com.example.oa.OaSystemApplicationTests;
import com.example.oa.common.dto.LoginDTO;

public class IndexControllerTest extends OaSystemApplicationTests {
    static {
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setUsername("admin");
        loginDTO.setPassword("admin");
    }


}
