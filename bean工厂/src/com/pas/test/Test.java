package com.pas.test;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pas.service.ByeService;
import com.pas.service.UserService;

public class Test {
	
	
	public static void main(String[] args) {
		final Log loger=LogFactory.getLog(new Test().getClass());
		
		// ApplicationContext重量级需要单态
		// 使用ApplicationContext加载就实例化 默认beanscope是单例模式
		//加载迅速 耗内存
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		System.out.println("######AC获取Bean#####");
		UserService us=(UserService) ac.getBean("userService");
		us.sayHello();
		//同一实例
		
		loger.info("测试默认scope模式：同一个对象");
		System.out.println(ac.getBean("userService").hashCode()+" "+ac.getBean("userService").hashCode());
		//不同实例
		loger.info("测试原型scope模式：不同对象");
		System.out.println(ac.getBean("byeService").hashCode()+" "+ac.getBean("byeService").hashCode());
		
		
		
		
		/*
		 * xmlbeanfactory替代方式
		 */
		Resource resource = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(resource);
		
		loger.info("使用xmlbeanfactory取bean获取才实例化，不会被马上实例化");
		beanFactory.getBean("userService");
		//一般无特殊要求使用上下文获取，
	}
}
