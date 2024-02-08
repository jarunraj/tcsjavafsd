package com.tcs.threads;

public class MyThread extends Thread {
	String name;

	public MyThread(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(name +"is executing task "+ i);
		}
	}
}
