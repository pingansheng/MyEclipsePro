package com.pas.test;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pas.inter.TestServiceInter;
import com.pas.inter.TestServiceInter2;
import com.pas.service.TestService1;
import com.pas.service.TestService2;
import com.pas.util.ApplicationContextUtil;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ac = ApplicationContextUtil.getApplicationContext();
		//取代理对象的id
		TestServiceInter2 t=(TestServiceInter2) ac.getBean("myproxy");
//		((TestServiceInter)t).sayHello();
//		((TestServiceInter)t).sayHi();
		t.sayBye();
	}
}
