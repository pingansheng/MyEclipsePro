package com.pas.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInter2 extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("������2����");
		String res=invocation.invoke();
		System.out.println("������2����------�̳���AbstractInterceptor���������");
		return res;
	}

}
