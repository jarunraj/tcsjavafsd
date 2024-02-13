package com.tcs.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day11BootMysqlApplication implements CommandLineRunner {

	@Autowired
	ProductRepository repo;
	
	public static void main(String[] args) {
		
		SpringApplication.run(Day11BootMysqlApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		p1.setpDescription("A digital television");
		p1.setpAmount(75000);
		repo.save(p1);
		
		p2.setpDescription("A smart phone");
		p2.setpAmount(50000);
		repo.save(p2);
		
		p3.setpDescription("A wifi router");
		p3.setpAmount(10000);
		repo.save(p3);
	}

}
