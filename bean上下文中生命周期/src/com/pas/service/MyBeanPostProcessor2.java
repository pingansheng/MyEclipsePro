package com.pas.service;

import java.lang.reflect.Type;
import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor2 implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("֮ǰ��Щ��");
		System.out.println("postProcessBeforeInitialization2������");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("֮����Щ��");
		System.out.println("postProcessAfterInitialization2������");
		return bean;
	}

}
