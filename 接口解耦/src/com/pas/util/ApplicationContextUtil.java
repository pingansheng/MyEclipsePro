package com.pas.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil {

	private static ApplicationContext ac = null;

	private ApplicationContextUtil() {
	};

	static {
		ac = new ClassPathXmlApplicationContext("");
	}

	public static ApplicationContext getApplicationContext() {
		return ac;
	}
}
