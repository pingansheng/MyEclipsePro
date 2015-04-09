package com.pas.service;

import java.lang.reflect.Type;
import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("֮ǰ��Щ��");
		System.out.println("postProcessBeforeInitialization������");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("֮����Щ��");
		System.out.println("postProcessAfterInitialization������");
		return bean;
	}

}
