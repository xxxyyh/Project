package com.threebody.shoppingcart;

import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import com.github.pagehelper.PageInterceptor;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})//表明session共享取消安全验证
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 600)
@EnableEurekaClient
@MapperScan("com.threebody.shoppingcart.mapper") //扫描mapper接口
@EnableCaching  //开启缓存
public class TbShoppingCartProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbShoppingCartProviderApplication.class, args);
	}
	
	 

}
