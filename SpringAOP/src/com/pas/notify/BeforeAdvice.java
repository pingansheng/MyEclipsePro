package com.pas.notify;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

/*
 * 前置通知类
 */
public class BeforeAdvice implements MethodBeforeAdvice {

	/*
	 * method:被调用的方法
	 * args:method接收到的参数
	 * target:目标对象
	 */
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("前置通知-写入日志");
	}

}
