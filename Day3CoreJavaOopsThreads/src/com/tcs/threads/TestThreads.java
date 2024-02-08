package com.tcs.threads;

public class TestThreads {

	public static void main(String[] args) {
		System.out.println("Started the main()");
		
		MyThread t1 = new MyThread("T1");
		t1.setDaemon(true);
		t1.start();
		MyThread t2 = new MyThread("T2");
		t2.setDaemon(true);
		t2.start();
	
		try {
			t2.join();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Exiting the main()");
	}
	
}
