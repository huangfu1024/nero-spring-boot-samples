package com.nero.aop;

import org.springframework.stereotype.Component;

/**
 * <p>
 * date : 2019-03-19
 * time : 16:44
 * </p>
 *
 * @author Nero
 */
@Component
public class Funnyman implements Actor {

    @Override
    public void performance() {
        System.out.println("我是喜剧演员，开始我的表演");
    }
}
