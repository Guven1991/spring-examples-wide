package com.guven.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.guven.aop.service.MessageService.mesajVer(..))")
    public void mesajVerMetodundanOnce(JoinPoint joinPoint){
        System.out.println("Mesaj ver komutundan önce paramaetre yakalandi param:" + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.guven.aop.service.*.*(..))")
    public void mesajVerMetotundanSonra(JoinPoint joinPoint){
        System.out.println("Mesaj ver komutundan sonra paramaetre yakalandi param:" + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}
