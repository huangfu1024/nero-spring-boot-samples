package com.nero.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * <p>
 * date : 2019-03-19
 * time : 14:49
 * </p>
 *
 * @author Nero
 */
@Component
@Primary
public class Woman implements Person {
    @Override
    public String getName() {
        return "lili";
    }

    @Override
    public int getSex() {
        return 0;
    }
}
