package com.example.MicroservicesPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesPracticeApplication.class, args);
	}

}
