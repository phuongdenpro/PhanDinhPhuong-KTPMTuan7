package com.example.springbootmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceApplication.class, args);
	}

}
