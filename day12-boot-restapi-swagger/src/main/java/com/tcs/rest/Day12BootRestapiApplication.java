package com.tcs.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Day12BootRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day12BootRestapiApplication.class, args);
	}

}
