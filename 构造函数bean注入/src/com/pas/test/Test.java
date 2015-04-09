package com.pas.test;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pas.collection.Department;
import com.pas.collection.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Employee de=(Employee) ac.getBean("emp");
		out(de.getName());
	}

	public static void out(Object s) {
		System.out.println(s);
	}
}
