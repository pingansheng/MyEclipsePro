package com.pas.service;

import java.lang.reflect.Type;
import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor2 implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("之前做些事");
		System.out.println("postProcessBeforeInitialization2被调用");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("之后做些事");
		System.out.println("postProcessAfterInitialization2被调用");
		return bean;
	}

}
