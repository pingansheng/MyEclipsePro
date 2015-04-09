package com.pas.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.pas.listener.MyListener;

public class MyMethodITCP extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {

		invocation.addPreResultListener(new MyListener());
		System.out.println("MethodÀ¹½ØÆ÷");

		String res = invocation.invoke();
		System.out.println("MethodÀ¹½ØÆ÷Íê³ÉÁË");
		return res;
	}

}
