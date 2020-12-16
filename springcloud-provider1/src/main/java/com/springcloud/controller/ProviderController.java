package com.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/provider")
public class ProviderController {

	@RequestMapping(path = "/getProvider", method = RequestMethod.GET)
	public String getProvider() {
		return "Provider1";
	}
}
