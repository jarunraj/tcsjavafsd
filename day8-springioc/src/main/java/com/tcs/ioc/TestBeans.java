package com.tcs.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.registerShutdownHook();
		Object obj = context.getBean("b");
		B b = (B) obj;
		b.other();
		C c = (C) context.getBean("c");
		c.other();
		System.out.println(context.isPrototype("a"));
		System.out.println(context.isSingleton("b"));
		System.out.println(context.isPrototype("c"));
		context.close();
	}
}
