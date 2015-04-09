package com.pas.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 * 加强型SessionFactory
 * 使用此方式无需再hibernate配置文件中
 * 加currentthread配置也可实现getcurrentthread
 * @author pingansheng
 *
 */
//一定保证只有一个会话工厂
public final class MySessionFactory {

	private static SessionFactory sessionFactory = null;

	// 线程局部模式
	private static ThreadLocal<Session> threadlocal = new ThreadLocal<Session>();

	// 私有构造函数
	private MySessionFactory() {
	}

	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public static Session openSession() {
		return sessionFactory.openSession();
	}

	public static Session getCurrentSession() {
		Session session = threadlocal.get();
		// 判断是否得到
		if (session == null) {
			session = sessionFactory.openSession();
			// 绑定session和线程对象
			threadlocal.set(session);
		}
		return session;
	}
}
