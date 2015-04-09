package com.pas.service;

import java.lang.reflect.Type;
import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("����BeanPostProcessorʵ���๹������");
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("bean��ʼ��֮ǰ��postProcessBeforeInitialization������");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("bean��ʼ��֮��postProcessAfterInitialization������");
		return bean;
	}

}
