package com.pas.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.pas.dispatch.DBUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		BeanFactory fc = new XmlBeanFactory(new ClassPathResource(
//				"com/pas/dispatch/beans.xml"));
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/pas/dispatch/beans.xml");
		DBUtil db = (DBUtil) ac.getBean("dbutil");
		System.out.println(db.getDrivername());
		System.out.println(db.getUsername());
	}

}
