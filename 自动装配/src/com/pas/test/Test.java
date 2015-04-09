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
		 * defualt �����Ҫ��<beans defualt-autorwire=��ָ���� /> ������<beans >ָ����
		 * default-atuowrite�� ���е�bean�� Ĭ�ϵ�autowire���� ָ����װ�䷽��; ���û����<beans
		 * defualt-autorwire=��ָ���� /> û�� defualt-autorwire=��ָ���� ����Ĭ����
		 * defualt-autorwire=��no��
		 */
	}

	public static void out(Object s) {
		System.out.println(s);
	}
}
