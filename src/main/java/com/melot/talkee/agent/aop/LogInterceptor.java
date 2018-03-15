package com.melot.talkee.agent.aop;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * Created by mn on 2017/11/24.
 */
@Aspect
@Component
public class LogInterceptor {
    private static Logger logger=Logger.getLogger("LogInterceptor");
    @Pointcut("execution(public * com.melot.talkee.agent.controller..*.*(..))")
    public void addLog(){}

    @Around("addLog()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        logger.info("-------------------------------------------------");
       logger.info("请求方法："+point.getTarget().getClass().toString()+"."+point.getSignature().getName());
       logger.info("请求参数："+JSONObject.toJSONString(point.getArgs()));
        Object o=   point.proceed();
       logger.info("接口返回值："+ JSONObject.toJSONString(o));
        logger.info("-------------------------------------------------");
        return o;
    }

}
