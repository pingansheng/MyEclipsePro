package com.pas.notify;

import java.lang.reflect.Method;

/*
 * 异常通知
 */
public class ThrowsAdvice implements org.springframework.aop.ThrowsAdvice {
	
	public void afterThrowing(Method m,Object[] os,Object
	target,Exception throwable)
	{
		System.out.println("异常通知-出事了"+throwable.getMessage());
	}

}
