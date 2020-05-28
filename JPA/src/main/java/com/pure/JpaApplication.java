package com.pure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		System.out.println(System.getenv());
		SpringApplication.run(JpaApplication.class, args);
	}

}
