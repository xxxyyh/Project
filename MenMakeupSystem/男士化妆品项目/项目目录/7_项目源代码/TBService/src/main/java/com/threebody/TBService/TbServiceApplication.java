package com.threebody.TBService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbServiceApplication.class, args);
	}
}
