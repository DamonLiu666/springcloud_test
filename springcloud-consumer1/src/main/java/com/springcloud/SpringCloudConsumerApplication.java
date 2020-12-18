package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.springcloud.myRule.myRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "springcloud-consumer1", configuration = myRule.class)
public class SpringCloudConsumerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringCloudConsumerApplication.class, args);
	}
	
	@Bean
	@LoadBalanced	//开启负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
