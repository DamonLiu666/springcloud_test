package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/consumer")
public class ConsumerController {
	
	@Autowired
	private RestTemplate restTemp;

	@RequestMapping(path = "/getConsumer", method = RequestMethod.GET)
	public String getConsumer() {
		String result = restTemp.getForObject("http://springcloud-provider1/provider/getProvider", String.class);
		return result;
	}
}
