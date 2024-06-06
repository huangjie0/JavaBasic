//package com.example.demo.filter;
//
//import com.alibaba.fastjson.JSONObject;
//import com.example.demo.pojo.Result;
//import com.example.demo.utils.JwtUtils;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.util.StringUtils;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Slf4j
////@WebFilter(urlPatterns = "/*")
//public class LoginCheckFilter implements Filter {
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) servletRequest;
//        HttpServletResponse res = (HttpServletResponse) servletResponse;
//
//        //获取请求url
//        String url = req.getRequestURI();
//        log.info(url);
//
//        if(url.contains("login")){
//            filterChain.doFilter(servletRequest,servletResponse);
//            return;
//        }
//
//        String jwt = req.getHeader("token");
//        if(!StringUtils.hasLength(jwt)){
//            Result error = Result.error("NOT_LOGIN");
//            //将对象转为json格式
//            String noLogin = JSONObject.toJSONString(error);
//            res.getWriter().write(noLogin);
//            return;
//        }
//        try {
//            JwtUtils.parseJWT(jwt);
//        } catch (Exception e) {
//            //解析失败
//            Result error = Result.error("Parsing_failure");
//            //将对象转为json格式
//            String noLogin = JSONObject.toJSONString(error);
//            res.getWriter().write(noLogin);
//            return;
//        }
//
//        //放行
//        filterChain.doFilter(servletRequest,servletResponse);
//
//    }
//}
