package com.pas.notify;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

/*
 * ǰ��֪ͨ��
 */
public class BeforeAdvice implements MethodBeforeAdvice {

	/*
	 * method:�����õķ���
	 * args:method���յ��Ĳ���
	 * target:Ŀ�����
	 */
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("ǰ��֪ͨ-д����־");
	}

}
