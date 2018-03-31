package com.rising.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SunApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SunApplication.class, args);
		SpringApplication application = new SpringApplication(SunApplication.class);
		System.out.println("my springboot!");
		application.run(args);
	}
}
