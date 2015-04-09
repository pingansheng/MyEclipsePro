package com.pas.notify;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/*
 * 环绕通知
 */
public class AroundAdvice implements MethodInterceptor {

	/*
	 * 执行在函数体内，具体内容调用之前
	 * @see org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept.MethodInvocation)
	 */
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("环绕通知-调用方法前");
		Object o=arg0.proceed();
		System.out.println("环绕通知-调用方法后");
		return o;
	}
}
