package com.nero.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopDemoApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("commonActor")
	private Actor commonActor;

	@Autowired
	@Qualifier("funnyman")
	private Actor funnyman;



	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		commonActor.performance();
		System.out.println("-----------------");
		funnyman.performance();
	}
}
