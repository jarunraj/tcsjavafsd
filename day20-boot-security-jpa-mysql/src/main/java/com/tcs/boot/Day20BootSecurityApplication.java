package com.tcs.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = com.tcs.boot.repository.UserRepository.class)
public class Day20BootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day20BootSecurityApplication.class, args);
	}

}
