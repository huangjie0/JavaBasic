package com.example.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(urlPatterns = "/*")
public class AbcFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("abc拦截前，执行的逻辑");
        //放行操作
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("abc拦截后，执行后的逻辑");
    }
}
