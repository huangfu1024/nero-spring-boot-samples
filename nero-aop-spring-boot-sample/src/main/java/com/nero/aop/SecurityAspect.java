package com.nero.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>
 * date : 2019-03-19
 * time : 17:09
 * </p>
 *
 * @author Nero
 */
@Component
@Aspect
public class SecurityAspect {

    @Pointcut("execution(public void com.nero.aop.Actor.performance())")
    public void performance() {
    }

    @AfterThrowing(value = "performance()", throwing = "ex")
    public void protection(Exception ex) {

        System.out.println(ex.getMessage() + "，让领导先走。");

    }
}
