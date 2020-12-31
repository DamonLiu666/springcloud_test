package com.springcloud.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

@Component
public class TestFallBack implements FallbackProvider{

	/**
	 * 当前fallback处理的是哪一个服务；
	 * return 返回的是服务名称
	 * 通配符“*”表示为所有服务提供容错处理。
	 */
	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 容错逻辑
	 */
	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		// TODO Auto-generated method stub
		return null;
	}

}
