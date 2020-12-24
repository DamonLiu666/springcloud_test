package com.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "springcloud-provider1", fallbackFactory = ProviderFeignClientFallbackFactory.class)
public interface ProviderFeignClient {

	@RequestMapping(value = "/provider/getProvider", method = RequestMethod.GET)
	public String getProvider();
}
