package com.tcs.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Day13BootRestExceptionsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Day13BootRestExceptionsApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(Day13BootRestExceptionsApplication.class, args);
		
		String beans[] = context.getBeanDefinitionNames();
		
		for(String bean : beans) {
			System.out.println(bean);
		}
		
	}

}
