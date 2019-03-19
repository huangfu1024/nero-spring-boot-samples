package com.nero.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * <p>
 * date : 2019-03-19
 * time : 14:48
 * </p>
 *
 * @author Nero
 */
@Component
//@Scope("prototype")
public class Man implements Person, InitializingBean {

    @Autowired
    private NameFactory nameFactory;

    @Override
    public String getName() {
        return nameFactory.getName();
    }

    @Override
    public int getSex() {
        return 1;
    }


    @Override
    public void afterPropertiesSet() {
        System.out.println("afterPropertiesSet: name is " + this.getName());
    }

    @PostConstruct
    public void postConstruct(){

        System.out.println("postConstruct: name is " + this.getName());

    }
}
