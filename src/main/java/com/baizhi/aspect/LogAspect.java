package com.baizhi.aspect;

import ch.qos.logback.classic.Logger;
import com.baizhi.annotation.LogAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
@Aspect
public class LogAspect {

    @Pointcut(value = "@annotation(com.baizhi.annotation.LogAnnotation)")
    public  void pointcutAnnoation(){
    }
    
    @Around(value = "pointcutAnnoation()")
    public  Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("this is aop before");
        //什么事
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method =signature.getMethod();
        String name = method.getAnnotation(LogAnnotation.class).name();
        System.out.println(name);
        //什么人
        ServletRequestAttributes requestAttributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        Object user = requestAttributes.getRequest().getSession().getAttribute("user");
        //当前系统时间
        long time = new Date().getTime();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(time);
        Date parse = simpleDateFormat.parse(format);

        //执行结果
        Object proceed=null;

        try {
            proceed = proceedingJoinPoint.proceed();
            System.out.println("执行结果为true");
        } catch (Exception e) {
            System.out.println("执行结果为false");
            e.printStackTrace();
        }
        return  proceed;
    }
}
