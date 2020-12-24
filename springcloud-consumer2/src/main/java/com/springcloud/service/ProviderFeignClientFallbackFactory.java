package com.springcloud.service;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class ProviderFeignClientFallbackFactory implements FallbackFactory<ProviderFeignClient>{

	@Override
	public ProviderFeignClient create(Throwable cause) {
		// TODO Auto-generated method stub
		return new ProviderFeignClient() {
			
			@Override
			public String getProvider() {
				// TODO Auto-generated method stub
				return "发生熔断!!! 异常信息: " + cause.getMessage();
			}
		};
	}

}
