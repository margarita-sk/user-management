package com.smartclinic.usermanagement.audit.spring;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
//    @Pointcut("@annotation(Log)")
    public void logPointcut(){
    }

//    @Before("logPointcut()")
    public void logAllMethodCallsAdvice(){
        System.out.println("In Aspect");
    }
}
