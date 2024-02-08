package com.tcs.oops.encapsulation.statictest;

import java.lang.reflect.Method;

public class StaticDemo {
	
	int data;
	static int item;
	
	static {
		System.out.println("From static block in StaticDemo");
	}
	{
		System.out.println("From non-static block in StaticDemo");
	}
	
	static class MyClass {
		
	}
	
	class MyClass1 {
		
	}
	
	void method() {
		data = 10;
		item = 30;
	}
	static void operation() {
		//data = 2;
	}
	
}
