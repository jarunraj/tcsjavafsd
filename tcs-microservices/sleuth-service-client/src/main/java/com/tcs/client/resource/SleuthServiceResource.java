package com.tcs.client.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/api/client")
public class SleuthServiceResource {
	
	@Autowired
	RestTemplate template;
	private static final Logger logger = LoggerFactory.getLogger(SleuthServiceResource.class);
	
	@GetMapping
	public String callService() {
		logger.info("In Client");
		String url = "http://localhost:8096/service/data";
		String output = template.getForObject(url, String.class);
		return output;
	}
	
//	@GetMapping
//	@CircuitBreaker(name="CLIENT_SERVICE", fallbackMethod = "callOnFail")
//	public String callServer() {
//		//String url = "http://localhost:8093/rest/service/status";
//		String url = "http://localhost:8094/rest/service";
//		String output = template.getForObject(url, String.class);
//		return output;
//	}	
//	public String callOnFail(Exception e) {
//		return "message from callOnFail";
//	}
	
}
