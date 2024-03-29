package com.tcs.client.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/api/client")
public class HelloServiceResource {
	
	@Autowired
	RestTemplate template;
	public static String CLIENT_SERVICE="clientService";
	
	@GetMapping
	@CircuitBreaker(name="CLIENT_SERVICE", fallbackMethod = "callOnFail")
	public String callServer() {
		//String url = "http://localhost:8093/rest/service/status";
		String url = "http://localhost:8094/rest/service";
		String output = template.getForObject(url, String.class);
		return output;
	}	
	public String callOnFail(Exception e) {
		return "message from callOnFail";
	}
	
}
