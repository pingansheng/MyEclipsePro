package com.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

	private Object object;
	private Interceptor interceptor=new Interceptor();
	public void setObject(Object o)
	{

		this.object=o;
	}
	
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {

		Object res=null;
		interceptor.before();
		
		System.out.println("ÐÂµÄ´úÂë");
		//res=arg1.invoke(object, arg2);
		
		interceptor.after();
		
		return res;
	}

}
