package com.springcloud.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class TestFilter extends ZuulFilter{

	/**
	 * 当前filter是否生效；
	 * 默认为false
	 * 返回true代表开启filter
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
	 * 执行过滤的逻辑
	 */
	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
		
		//TODO...
		
		context.setResponseStatusCode(4000000);
		context.setSendZuulResponse(false);
		context.setResponseBody("XXX");
		
		return null;
	}

	/**
	 * 过滤器类型
	 * pre		前置过滤,常用于身份验证、日志记录等
	 * route	路由后过滤
	 * error	异常过滤,常用于异常处理
	 * post		远程服务调用后过滤,常用于收集服务信息、统计服务性能指标等
	 */
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	/**
	 * 同类型过滤器的执行顺序；值越小，执行优先级越高
	 */
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
