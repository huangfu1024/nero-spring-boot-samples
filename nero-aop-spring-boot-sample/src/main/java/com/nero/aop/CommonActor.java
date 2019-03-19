package com.nero.aop;

import org.springframework.stereotype.Component;

/**
 * <p>
 * date : 2019-03-19
 * time : 17:05
 * </p>
 *
 * @author Nero
 */
@Component
public class CommonActor implements Actor {

    @Override
    public void performance() throws Exception {
        System.out.println("我是一名普通演员，开始我的表演");
        throw new Exception("出现火灾。");
    }
}
