package com.pas.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pas.service.PersonService;

public class Test {
	public static void main(String[] args) {
		/*
		 * 上下文ApplicationContext中的生命周期：（此处为单例scope）
		 * 1、实例化（默认使用无参数的构造函数）
		 * 	    可以重载一个无参数的构造方法
		 *    如果需要使用有参的构造函数实例化，需要指定factory-method等参数
		 * 2、设置属性（注入属性）
		 * 		调用set方法设置属性
		 * 3、如果实现bean名字关注BeanNameAware，调用BeanNameAware的setBeanName方法
		 * 4、如果实现bean工厂关注BeanFactoryAware，调用其setBeanFactory可得到factory
		 * 5、如果你实现了 ApplicationContextAware接口，则调用方法 setApplicationContext
		 * 		该方法传递ApplicationContext
		 * 6、如果bean 和 一个后置处理器关联,则会自动去调用 
		 * 		postProcessBeforeInitialization方法
		 * 		（面向所有对象编程，切面编程）
		 * 7、如果实现InitializingBean接口，则调用afterPropertiesSet
		 * 8、如果配置了自定义的初始化方法，（init-method="myinit"）则执行其与7之后，postProcessAfterInitialization方法
		 * 9、如果bean 和 一个后置处理器关联,
		 * 		则会自动去调用 postProcessAfterInitialization方法
		 * 10、使用我们的bean
		 * 11、容器关闭
		 * 12、可以通过实现DisposableBean 接口来调用方法 destory
		 * 13、可以在<bean destory-method="mydes"/> 调用定制的销毁方法
		 * 
		 * 		实际开发中常见为：1->2->6->10->9->11 
		 * 		实例化->set方法->后置处理器before->使用->后置处理器before->容器关闭
		 */
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		out("xml加载完毕");
		try {
//			PersonService ps=(PersonService) ac.getBean("personService2");
//			ps.sayHi();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void out(Object s)
	{
		System.out.println(s);
	}
}
