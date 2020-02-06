package com.threebody.useraddress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient   //表明是客户端
@EnableFeignClients   //表明是服务消费者 Feign方式
public class TbUserAddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbUserAddressApplication.class, args);
	}

}
