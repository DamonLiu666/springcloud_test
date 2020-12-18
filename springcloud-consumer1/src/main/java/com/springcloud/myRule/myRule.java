package com.springcloud.myRule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class myRule {
	
	@Bean
	public IRule ribbonRule() {
	    return new RandomRule();
	}

}
