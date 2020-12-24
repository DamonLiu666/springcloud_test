package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.service.ProviderFeignClient;

@RestController
@RequestMapping(path = "/consumer")
public class ConsumerController {

	@Autowired
	private ProviderFeignClient providerFeignClient;
	
	@RequestMapping(value = "/getConsumer", method = RequestMethod.GET)
	public String getConsumer() {
		return this.providerFeignClient.getProvider();
	}
}
