package com.test;

import java.lang.reflect.Proxy;

public class MyProxy {
	
	public Object getProxy(Object object)
	{
		MyHandler myh= new MyHandler();
		myh.setObject(object);
		
		/*
		 * ��̬�����ࣨ���¼��Ϊ�����ࣩ��һ��ʵ���ڴ�����ʱ������ʱָ���Ľӿ��б���࣬
		 * �������������������Ϊ�� ����ӿ� �Ǵ�����ʵ�ֵ�һ���ӿڡ� ����ʵ�� �Ǵ������һ��ʵ���� 
		 * ÿ������ʵ������һ�������ĵ��ô������ ����������ʵ�ֽӿ� InvocationHandler��
		 * ͨ������һ������ӿڵĴ���ʵ���ϵķ������ý���ָ�ɵ�ʵ���ĵ��ô������� Invoke ������
		 * �����ݴ���ʵ����ʶ����÷����� java.lang.reflect.Method �����Լ����������� Object ���͵����顣
		 * ���ô���������ʵ��ķ�ʽ�������ķ������ã����������صĽ������Ϊ����ʵ���Ϸ������õĽ�����ء� 
		 * */
		return Proxy.newProxyInstance
				(TargetInterface.class.getClassLoader(), object.getClass().getInterfaces(), myh);
	}
}
