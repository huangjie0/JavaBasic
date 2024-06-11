package com.example.demo.aop;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.mapper.OperateLogMapper;
import com.example.demo.pojo.OperateLog;
import com.example.demo.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;

@Component
@Slf4j
@Aspect
public class LogAspect {

    @Autowired
    private OperateLogMapper operateLogMapper;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Around("@annotation(com.example.demo.anno.Log)")
    public Object aroundAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        //操作人的id信息
        //获取请求头的jwt令牌，解析令牌
        String jwt = httpServletRequest.getHeader("token");
        Claims claims = JwtUtils.parseJWT(jwt);
        //操作人
        Integer operateUser = (Integer) claims.get("id");
        //当前操作时间
        LocalDateTime operateTime = LocalDateTime.now();
        String className = joinPoint.getTarget().getClass().getName();
        //获取方法名
        String methodName = joinPoint.getSignature().getName();

        Object[] args = joinPoint.getArgs();
        String methodParams = Arrays.toString(args);

        long begin = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        String returnValue = JSONObject.toJSONString(result);

        Long costTime = end - begin;

        OperateLog operateLog = new OperateLog(null,operateUser,operateTime,className,methodName,methodParams,returnValue,costTime);

        operateLogMapper.insert(operateLog);
        log.info("AOP记录操作日志：{}",operateLog);

        return result;
    }

}
