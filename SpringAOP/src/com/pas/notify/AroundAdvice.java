package com.pas.notify;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/*
 * ����֪ͨ
 */
public class AroundAdvice implements MethodInterceptor {

	/*
	 * ִ���ں������ڣ��������ݵ���֮ǰ
	 * @see org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept.MethodInvocation)
	 */
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("����֪ͨ-���÷���ǰ");
		Object o=arg0.proceed();
		System.out.println("����֪ͨ-���÷�����");
		return o;
	}
}
