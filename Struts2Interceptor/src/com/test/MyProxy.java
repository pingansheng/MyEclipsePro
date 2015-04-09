package com.test;

import java.lang.reflect.Proxy;

public class MyProxy {
	
	public Object getProxy(Object object)
	{
		MyHandler myh= new MyHandler();
		myh.setObject(object);
		
		/*
		 * 动态代理类（以下简称为代理类）是一个实现在创建类时在运行时指定的接口列表的类，
		 * 该类具有下面描述的行为。 代理接口 是代理类实现的一个接口。 代理实例 是代理类的一个实例。 
		 * 每个代理实例都有一个关联的调用处理程序 对象，它可以实现接口 InvocationHandler。
		 * 通过其中一个代理接口的代理实例上的方法调用将被指派到实例的调用处理程序的 Invoke 方法，
		 * 并传递代理实例、识别调用方法的 java.lang.reflect.Method 对象以及包含参数的 Object 类型的数组。
		 * 调用处理程序以适当的方式处理编码的方法调用，并且它返回的结果将作为代理实例上方法调用的结果返回。 
		 * */
		return Proxy.newProxyInstance
				(TargetInterface.class.getClassLoader(), object.getClass().getInterfaces(), myh);
	}
}
