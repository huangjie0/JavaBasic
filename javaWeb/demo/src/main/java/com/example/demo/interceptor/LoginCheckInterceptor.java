package com.example.demo.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.Result;
import com.example.demo.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class LoginCheckInterceptor implements HandlerInterceptor {
    @Override //目标资源运行执行运行 true放行 false拦截
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
        System.out.println("preHandle方法运行了");

        //获取请求url
        String url = req.getRequestURI();
        log.info(url);

        if(url.contains("login")){
            return true;
        }

        String jwt = req.getHeader("token");
        if(!StringUtils.hasLength(jwt)){
            Result error = Result.error("NOT_LOGIN");
            //将对象转为json格式
            String noLogin = JSONObject.toJSONString(error);
            res.getWriter().write(noLogin);
            return false;
        }
        try {
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {
            //解析失败
            Result error = Result.error("Parsing_failure");
            //将对象转为json格式
            String noLogin = JSONObject.toJSONString(error);
            res.getWriter().write(noLogin);
            return false;
        }
        return true;
    }

    @Override //目标资源运行之后执行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle方法执行了");
    }

    @Override //视图渲染完毕，最后
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion方法执行");
    }
}
