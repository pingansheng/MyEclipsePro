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
		System.out.println("Person" + this.hashCode() + "ʵ������");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("set����������");
	}

	public void sayHi() {
		System.out.println("hi��" + this.name);
	}

	//ע������ָ����init-method
	@PostConstruct
	public void myinit() {
		System.out.println("myinit������");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName������:" + name);
	}

	/*
	 * ����bean����
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory������");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out.println("setApplicationContext������");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet������");
	}

	@PreDestroy
	public void mydes() throws Exception {
		System.out.println("mydes�����ã��ͷŸ�����Դ");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy�����ã��ͷŸ�����Դ");
	}
}
