package com.sailesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ServiceRegisterEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegisterEurekaServerApplication.class, args);
	}

}
