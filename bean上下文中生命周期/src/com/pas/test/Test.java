package com.pas.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pas.service.PersonService;

public class Test {
	public static void main(String[] args) {
		/*
		 * ������ApplicationContext�е��������ڣ����˴�Ϊ����scope��
		 * 1��ʵ������Ĭ��ʹ���޲����Ĺ��캯����
		 * 	    ��������һ���޲����Ĺ��췽��
		 *    �����Ҫʹ���вεĹ��캯��ʵ��������Ҫָ��factory-method�Ȳ���
		 * 2���������ԣ�ע�����ԣ�
		 * 		����set������������
		 * 3�����ʵ��bean���ֹ�עBeanNameAware������BeanNameAware��setBeanName����
		 * 4�����ʵ��bean������עBeanFactoryAware��������setBeanFactory�ɵõ�factory
		 * 5�������ʵ���� ApplicationContextAware�ӿڣ�����÷��� setApplicationContext
		 * 		�÷�������ApplicationContext
		 * 6�����bean �� һ�����ô���������,����Զ�ȥ���� 
		 * 		postProcessBeforeInitialization����
		 * 		���������ж����̣������̣�
		 * 7�����ʵ��InitializingBean�ӿڣ������afterPropertiesSet
		 * 8������������Զ���ĳ�ʼ����������init-method="myinit"����ִ������7֮��postProcessAfterInitialization����
		 * 9�����bean �� һ�����ô���������,
		 * 		����Զ�ȥ���� postProcessAfterInitialization����
		 * 10��ʹ�����ǵ�bean
		 * 11�������ر�
		 * 12������ͨ��ʵ��DisposableBean �ӿ������÷��� destory
		 * 13��������<bean destory-method="mydes"/> ���ö��Ƶ����ٷ���
		 * 
		 * 		ʵ�ʿ����г���Ϊ��1->2->6->10->9->11 
		 * 		ʵ����->set����->���ô�����before->ʹ��->���ô�����before->�����ر�
		 */
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		out("xml�������");
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
