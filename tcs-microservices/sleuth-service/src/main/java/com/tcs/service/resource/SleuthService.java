package com.tcs.service.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class SleuthService {
	
	private static final Logger logger = LoggerFactory.getLogger(SleuthService.class);
	
	@GetMapping("/data")
	public String sendResponse() {
		logger.info("In service: ");
		return "from Service";
	}
//	@Value("name")
//	String str;
//	
//	@Autowired
//	Environment environment;
//	
//	@GetMapping
//	public String Welcome() {
//		String port = environment.getProperty("server.port");
//		return "Programming Microservice @ " + port + " App name: " + str;
//	}
//	
//	@GetMapping("/status")
//	public String status() {
//		return "Up and runnning";
//	}

}
