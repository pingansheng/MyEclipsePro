package com.pas.test.framework;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	/*
	 * ����spring��ܵĻ�������
	 */
	@Test
	public void test() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Domain d=(Domain) ac.getBean("domain");
		assertEquals(d.getName(), "pingansheng");
	}

}
