package com.example.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class DemoFilter implements Filter {

    @Override //初始化方法，只会调用一次
    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
        System.out.println("init初始化方法执行了");
    }

    @Override //每次发请求，就会拦截操作，调用多次
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //放行
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override //销毁方法，只会调用一次
    public void destroy() {
//        Filter.super.destroy();
        System.out.println("销毁方法执行了");
    }
}
