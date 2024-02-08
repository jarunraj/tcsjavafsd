package com.tcs.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	A a;
	
	@Qualifier("a1")
	public void setA(A a) {
		this.a = a;
	}
	public void other(){
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
