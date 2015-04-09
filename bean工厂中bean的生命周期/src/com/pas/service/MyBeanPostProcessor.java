package com.pas.service;

import java.lang.reflect.Type;
import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("调用BeanPostProcessor实现类构造器！");
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("bean初始化之前，postProcessBeforeInitialization被调用");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("bean初始化之后，postProcessAfterInitialization被调用");
		return bean;
	}

}
