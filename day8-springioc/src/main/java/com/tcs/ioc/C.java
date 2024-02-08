package com.tcs.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class C {
	A a;
	public C() {
		// TODO Auto-generated constructor stub
	}
	public C(A a) {
		super();
		this.a = a;
	}
	public void other() {
		System.out.println(getClass());
		a.method();
	}
	@PostConstruct
	public void start() {
		System.out.println(getClass()+".init() method is called");
	}
	@PreDestroy
	public void terminate() {
		System.out.println(getClass()+".destroy() method is called");
	}
}
