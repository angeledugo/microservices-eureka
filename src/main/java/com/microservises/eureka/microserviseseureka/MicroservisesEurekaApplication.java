package com.microservises.eureka.microserviseseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroservisesEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservisesEurekaApplication.class, args);
	}

}
