package com.rising.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.rising.sun"})
public class SunApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunApplication.class, args);
//		SpringApplication application = new SpringApplication(SunApplication.class);
//		System.out.println("my springboot!");
//		application.run(args);
	}
}
