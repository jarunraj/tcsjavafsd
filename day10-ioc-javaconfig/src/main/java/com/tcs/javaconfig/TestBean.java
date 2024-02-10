package com.tcs.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBean {

	@Autowired
	static HelloService service;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld hello = (HelloWorld) ctxt.getBean("helloBean");
		System.out.println(hello.message());
		//HelloService service = (HelloService) ctxt.getBean("helloservice");
		service.callHello();
		
	}

}
