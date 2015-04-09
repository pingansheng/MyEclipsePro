package com.pas.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//一定保证只有一个会话工厂
public final class MySessionFactory {

	private static SessionFactory sessionFactory = null;

	private MySessionFactory() {

	}

	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
