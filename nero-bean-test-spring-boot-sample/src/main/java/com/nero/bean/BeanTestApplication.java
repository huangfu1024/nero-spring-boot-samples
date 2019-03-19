package com.nero.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeanTestApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(BeanTestApplication.class, args);

		Person p = (Person)configurableApplicationContext.getBean("man");
		System.out.println(p.toString());

	}

}
