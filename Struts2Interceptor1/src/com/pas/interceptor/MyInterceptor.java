package com.pas.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

	private String hello;
	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public void destroy() {
		System.out.println("destory...."+hello);
	}

	public void init() {

		System.out.println("init...."+hello);

	}

	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("À¹½ØÆ÷1½øÈë");
		String res=invocation.invoke();
		System.out.println("À¹½Ø1½áÊø"+hello);
		return res;
	}

}
