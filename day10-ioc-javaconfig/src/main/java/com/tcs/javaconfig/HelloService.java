package com.tcs.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "helloservice")
public class HelloService {
	
	@Autowired
	HelloWorldImpl hello;
	
	void callHello() {
		hello.message();
	}
}
