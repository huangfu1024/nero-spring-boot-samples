package com.nero.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>
 * date : 2019-03-19
 * time : 17:01
 * </p>
 *
 * @author Nero
 */
@Aspect
@Component
public class MakeUpAspect {

    @Pointcut("execution(public void com.nero.aop.Funnyman.performance())")
    public void performance(){}

    @Before("performance()")
    public void makeUp(){
        System.out.println("给喜剧演员化妆");
    }


}

