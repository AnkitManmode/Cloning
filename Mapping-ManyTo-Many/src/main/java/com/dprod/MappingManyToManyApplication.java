package com.dprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappingManyToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingManyToManyApplication.class, args);
		System.out.println("Success");
	}
}
