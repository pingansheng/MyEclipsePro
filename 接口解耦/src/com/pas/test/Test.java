package com.pas.test;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inter.ChangLetter;
import com.pas.service.UpLetter;
import com.pas.util.ApplicationContextUtil;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ac= new ClassPathXmlApplicationContext("com/pas/service/beans.xml");
		ChangLetter change= (ChangLetter) ac.getBean("changeLetter");
		System.out.println(change.change());
	}
}
