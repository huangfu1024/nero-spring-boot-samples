package com.nero.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * <p>
 * date : 2019-03-19
 * time : 15:37
 * </p>
 *
 * @author Nero
 */
@Component
public class PersonPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Man){
            System.out.println("postProcessBeforeInitialization: name is " + ((Person) bean).getName());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof Man){
            System.out.println("postProcessAfterInitialization: name is " + ((Person) bean).getName());
        }
        return bean;
    }
}
