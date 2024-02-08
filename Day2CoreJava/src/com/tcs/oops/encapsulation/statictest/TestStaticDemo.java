package com.tcs.oops.encapsulation.statictest;

public class TestStaticDemo {
	public static void main(String[] args) {
		System.out.println("From TestStaticDemo");
		StaticDemo sd;
		//StaticDemo.operation();
		sd = new StaticDemo();
		StaticDemo sd1 = new StaticDemo();
		StaticDemo sd2 = new StaticDemo();
	}
}
