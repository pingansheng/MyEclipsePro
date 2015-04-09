package com.pas.test.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Domain d=(Domain) ac.getBean("domain");
		System.out.println(d.getName());
	}

}
