package com.spring.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.spring.activemq")
public class SpringActiveMqAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActiveMqAppApplication.class, args);
	}

}

