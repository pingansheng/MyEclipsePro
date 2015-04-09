package com.pas.util;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Configures and provides access to Hibernate sessions, tied to the current
 * thread of execution. Follows the Thread Local Session pattern, see
 * {@link http://hibernate.org/42.html }.
 */
public class HibernateSessionFactory {

	/**
	 * Location of hibernate.cfg.xml file. Location should be on the classpath
	 * as Hibernate uses #resourceAsStream style lookup for its configuration
	 * file. The default classpath location of the hibernate config file is in
	 * the default package. Use #setConfigFile() to update the location of the
	 * configuration file for the current session.
	 */
	private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	private static Configuration configuration = new Configuration();
	private static org.hibernate.SessionFactory sessionFactory;
	private static String configFile = CONFIG_FILE_LOCATION;

	static {
		try {
			configuration.configure(configFile);
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			System.err.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
	}

	private HibernateSessionFactory() {
	}

	/**
	 * Returns the new Session instance.
	 * 
	 * @return
	 */
	public static Session openSession() {
		return sessionFactory.openSession();
	}

	/**
	 * Returns the ThreadLocal Session instance. Lazy initialize the
	 * <code>SessionFactory</code> if needed.
	 * 
	 * @return Session
	 * @throws HibernateException
	 */
	public static Session getSession() throws HibernateException {
		Session session = (Session) threadLocal.get();

		if (session == null || !session.isOpen()) {
			if (sessionFactory == null) {
				rebuildSessionFactory();
			}
			session = (sessionFactory != null) ? sessionFactory.openSession()
					: null;
			threadLocal.set(session);
		}

		return session;
	}

	/**
	 * Rebuild hibernate session factory
	 * 
	 */
	public static void rebuildSessionFactory() {
		try {
			configuration.configure(configFile);
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			System.err.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
	}

	/**
	 * Close the single hibernate session instance.
	 * 
	 * @throws HibernateException
	 */
	public static void closeSession() throws HibernateException {
		Session session = (Session) threadLocal.get();
		threadLocal.set(null);

		if (session != null && session.isOpen()) {
			session.close();
			System.out.println("关闭 session");
		}
	}

	/**
	 * return session factory
	 * 
	 */
	public static org.hibernate.SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * return session factory
	 * 
	 * session factory will be rebuilded in the next call
	 */
	public static void setConfigFile(String configFile) {
		HibernateSessionFactory.configFile = configFile;
		sessionFactory = null;
	}

	/**
	 * return hibernate configuration
	 * 
	 */
	public static Configuration getConfiguration() {
		return configuration;
	}

	/***
	 * 统一查询方式
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	public static List<?> executeQuery(String hql, Object[] params) {

		Session session = null;
		Transaction trans = null;
		try {
			session = openSession();
			trans = session.beginTransaction();
			Query q = session.createQuery(hql);
			if (params != null && params.length > 0) {
				for (int i = 0; i < params.length; i++) {
					q.setParameter(i, params[i]);
				}
			}
			List<?> res = q.list();
			trans.commit();
			return res;
		} catch (Exception e) {
			e.printStackTrace();
			if (trans != null) {
				trans.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	/***
	 * 统一查询方式(分页)
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	public static List<?> executeQueryByPage(String hql, Object[] params,
			int pageSize, int pageNow) {

		Session session = null;
		Transaction trans = null;
		try {
			session = openSession();
			trans = session.beginTransaction();
			Query q = session.createQuery(hql);
			if (params != null && params.length > 0) {
				for (int i = 0; i < params.length; i++) {
					q.setParameter(i, params[i]);
				}
			}
			q.setFirstResult((pageNow - 1) * pageSize).setMaxResults(pageSize);
			List<?> res = q.list();
			trans.commit();
			return res;
		} catch (Exception e) {
			e.printStackTrace();
			if (trans != null) {
				trans.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	/**
	 * 统一添加方式
	 * 
	 * @param obj
	 */
	public static void executeSave(Object obj) {

		Session session = null;
		Transaction trans = null;
		try {
			session = openSession();
			trans = session.beginTransaction();
			session.save(obj);

			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trans != null) {
				trans.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	/**
	 * 统一删除.更新方式
	 * 
	 * @param obj
	 */
	public static void executeUpdate(String hql, Object[] params) {

		Session session = null;
		Transaction trans = null;
		try {
			session = openSession();
			trans = session.beginTransaction();
			Query q = session.createQuery(hql);
			if (params != null && params.length > 0) {
				for (int i = 0; i < params.length; i++) {
					q.setParameter(i, params[i]);
				}
			}
			q.executeUpdate();
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trans != null) {
				trans.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	/**
	 * 根据ID返回对象
	 * 
	 * @param obj
	 */
	public static Object findById(Class clazz, Serializable id) {

		Session session = null;
		Transaction trans = null;
		Object obj = null;
		try {
			session = openSession();
			trans = session.beginTransaction();
			obj = session.get(clazz, id);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trans != null) {
				trans.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return obj;
	}

	/***
	 * 统一查询方式 
	 * OpenSessionInview
	 * @param hql
	 * @param params
	 * @return
	 */
	public static List<?> executeQueryOpenInView(String hql, Object[] params) {

		Session session = null;
		session = getSession();
		Query q = session.createQuery(hql);
		if (params != null && params.length > 0) {
			for (int i = 0; i < params.length; i++) {
				q.setParameter(i, params[i]);
			}
		}
		List<?> res = q.list();
		return res;
	}

	/***
	 * 统一查询方式(分页) OpenInView
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	public static List<?> executeQueryByPageOpenInView(String hql,
			Object[] params, int pageSize, int pageNow) {

		Session session = null;
		session = getSession();
		Query q = session.createQuery(hql);
		if (params != null && params.length > 0) {
			for (int i = 0; i < params.length; i++) {
				q.setParameter(i, params[i]);
			}
		}
		q.setFirstResult((pageNow - 1) * pageSize).setMaxResults(pageSize);
		List<?> res = q.list();
		return res;
	}

	/**
	 * 统一添加方式 OpenInView
	 * 
	 * @param obj
	 */
	public static void executeSaveOpenInView(Object obj) {
		Session session = null;
		session = getSession();
		session.save(obj);
	}

	/**
	 * 统一删除.更新方式 OpenInView
	 * 
	 * @param obj
	 */
	public static void executeUpdateOpenInView(String hql, Object[] params) {

		Session session = null;
		session = getSession();
		Query q = session.createQuery(hql);
		if (params != null && params.length > 0) {
			for (int i = 0; i < params.length; i++) {
				q.setParameter(i, params[i]);
			}
		}
		q.executeUpdate();
	}

	/**
	 * 根据ID返回对象 OpenInView
	 * 
	 * @param obj
	 */
	public static Object findByIdOpenInView(Class clazz, Serializable id) {

		Session session = null;
		Object obj = null;
		session = getSession();
		obj = session.get(clazz, id);
		return obj;
	}
}