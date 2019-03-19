package com.nero.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>
 * date : 2019-03-19
 * time : 16:50
 * </p>
 *
 * @author Nero
 */
@Aspect
@Component
public class StageAspect {

    @Pointcut("execution(public void com.nero.aop.Actor.performance())")
    public void performance(){}


    @Before("performance()")
    public void arrange(){
        System.out.println("开始布置舞台");

    }

    @After("performance()")
    public void clean(){
        System.out.println("开始清理舞台");

    }
}
