package com.threebody.orders.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@Configuration
public class MyHystrixConfig {
	
	@Bean
	public ServletRegistrationBean getServlet(){
		HystrixMetricsStreamServlet hmss=new HystrixMetricsStreamServlet();
		ServletRegistrationBean srb=new ServletRegistrationBean(hmss);
		srb.setLoadOnStartup(1);
		srb.addUrlMappings("/actuator/hystrix.stream");
		srb.setName("HystrixMetricsStreamServlet");
		return srb;
	}

}
