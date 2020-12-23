package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(path = "/consumer")
public class ConsumerController {
	
	@Autowired
	private RestTemplate restTemp;

	@HystrixCommand(fallbackMethod = "getDefaultResp") //发生熔断时，调用getDefaultResp方法
	@RequestMapping(path = "/getConsumer", method = RequestMethod.GET)
	public String getConsumer() {
		String result = restTemp.getForObject("http://springcloud-provider1/provider/getProvider", String.class);
		return result;
	}
	
	public String getDefaultResp() {
		return "发生熔断!!!";
	}
}
