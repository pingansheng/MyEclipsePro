package com.pas.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 * ��ǿ��SessionFactory
 * ʹ�ô˷�ʽ������hibernate�����ļ���
 * ��currentthread����Ҳ��ʵ��getcurrentthread
 * @author pingansheng
 *
 */
//һ����ֻ֤��һ���Ự����
public final class MySessionFactory {

	private static SessionFactory sessionFactory = null;

	// �ֲ߳̾�ģʽ
	private static ThreadLocal<Session> threadlocal = new ThreadLocal<Session>();

	// ˽�й��캯��
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
		// �ж��Ƿ�õ�
		if (session == null) {
			session = sessionFactory.openSession();
			// ��session���̶߳���
			threadlocal.set(session);
		}
		return session;
	}
}
