package com.pas.notify;

import java.lang.reflect.Method;

/*
 * �쳣֪ͨ
 */
public class ThrowsAdvice implements org.springframework.aop.ThrowsAdvice {
	
	public void afterThrowing(Method m,Object[] os,Object
	target,Exception throwable)
	{
		System.out.println("�쳣֪ͨ-������"+throwable.getMessage());
	}

}
