package com.pas.test;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pas.collection.Master;
import com.pas.collection.Dog;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Master m = (Master) ac.getBean("master");
		out(m.getDog().getName());
		Master m1 = (Master) ac.getBean("master1");
		out(m1.getDog().getName());
		Master m2 = (Master) ac.getBean("master2");
		out(m2.getDog().getName());
		/*
		 * defualt 这个需要在<beans defualt-autorwire=“指定” /> 当你在<beans >指定了
		 * default-atuowrite后， 所有的bean的 默认的autowire就是 指定的装配方法; 如果没有在<beans
		 * defualt-autorwire=“指定” /> 没有 defualt-autorwire=“指定” ，则默认是
		 * defualt-autorwire=”no”
		 */
	}

	public static void out(Object s) {
		System.out.println(s);
	}
}
