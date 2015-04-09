package com.pas.notify;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/*
 * 后置通知
 */
public class AfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("后置通知-事务提交");
	}
}
