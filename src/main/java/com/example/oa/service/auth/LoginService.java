package com.example.oa.service.auth;

import org.springframework.stereotype.Service;

public interface LoginService {
    String login(String username, String password);

}
