package com.example.oa.security.filter;

import cn.hutool.core.util.ObjectUtil;
import com.example.oa.common.constant.Constants;
import com.example.oa.common.utils.JwtUtil;
import com.example.oa.common.utils.SecurityContextUtil;
import com.example.oa.security.custom.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private JwtUtil jwtUtil;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        {
            //请求头是否有token
            String token = request.getHeader(Constants.TOKEN_KEY);
            if(!StringUtils.hasLength(token)) {
                LoginUser user = jwtUtil.getLoginUser(request); // 从 redis 中读取出用户信息
                // user 如果为 null 则说明 token 是无效的，然后通过 token 将用户登录信息保存到 AuthenticationManager 中
                if(ObjectUtil.isNotNull(user) && ObjectUtil.isNull(SecurityContextUtil.getAuthentication())) {
                    jwtUtil.verifyToken(user);
                    UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
                    authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(authenticationToken);
                }
            }
        }
        filterChain.doFilter(request, response);
    }
}
