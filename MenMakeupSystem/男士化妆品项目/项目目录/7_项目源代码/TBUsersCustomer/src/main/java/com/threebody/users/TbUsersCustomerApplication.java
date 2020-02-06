package com.threebody.users;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.github.pagehelper.PageInterceptor;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableEurekaClient // 表明是客户端
@EnableFeignClients // 表明是服务消费者 Feign方式
public class TbUsersCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbUsersCustomerApplication.class, args);
	}

	@Bean
	public PageInterceptor pageHelper() {
		PageInterceptor pageInterceptor = new PageInterceptor();
		Properties properties = new Properties();
		properties.setProperty("helperDialect", "mysql");
		properties.setProperty("reasonable", "true");
		properties.setProperty("offsetAsPageNum", "true");
		pageInterceptor.setProperties(properties);
		return pageInterceptor;
	}

}
