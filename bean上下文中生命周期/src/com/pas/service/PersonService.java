package com.pas.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PersonService implements BeanNameAware, BeanFactoryAware,
		ApplicationContextAware, InitializingBean, DisposableBean {

	private String name;

	public PersonService() {
		System.out.println("Person" + this.hashCode() + "实例化！");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("set方法被调用");
	}

	public void sayHi() {
		System.out.println("hi：" + this.name);
	}

	//注解配置指定的init-method
	@PostConstruct
	public void myinit() {
		System.out.println("myinit被调用");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName被调用:" + name);
	}

	/*
	 * 传递bean工厂
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory被调用");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out.println("setApplicationContext被调用");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet被调用");
	}

	@PreDestroy
	public void mydes() throws Exception {
		System.out.println("mydes被调用，释放各种资源");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy被调用，释放各种资源");
	}
}
