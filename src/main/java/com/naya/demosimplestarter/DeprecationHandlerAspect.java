package com.naya.demosimplestarter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Evgeny Borisov
 */

@Aspect
public class DeprecationHandlerAspect {

    @Pointcut("execution(* com.naya..*.*(..))")
    public void allBusinessMethods(){}

    @Before("@annotation(Deprecated) && allBusinessMethods()")
    public void handleDeprecated(JoinPoint jp) {
        System.out.println("deperecated method was used "+jp.getSignature().getName());
    }
}
