package com.pas.test;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pas.service.ByeService;
import com.pas.service.UserService;
import com.pas.util.ApplicationContextUtil;

public class Test {
	public static void main(String[] args) {

		// 传统方式
		// UserService us = new UserService();
		// us.setName("ping");
		// us.sayHello();

		// 使用Spring
		// 1、得到容器框架applicationContext
		//ApplicationContext重量级需要单态
//		ApplicationContext ac = ApplicationContextUtil.getApplicationContext();
//		UserService us = (UserService) ac.getBean("userService");
//		us.getByeService().sayBye();

		// 反射
		 try {
		 Class<?> demo = Class.forName("com.pas.service.UserService");
		 Method m1 = demo.getMethod("setName", String.class);
		 Object demoins = demo.newInstance();
		 m1.invoke(demoins, "pinganshneg");
		 Method m2 = demo.getMethod("sayHello");
		 m2.invoke(demoins);
		 } catch (Exception e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
	}
}
