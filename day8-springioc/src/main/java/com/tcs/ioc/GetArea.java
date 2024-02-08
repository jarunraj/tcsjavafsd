package com.tcs.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("circle.xml");
		context.registerShutdownHook();
		Circle c = (Circle) context.getBean("c");
		c.calculateArea();
		context.close();
	}
}
