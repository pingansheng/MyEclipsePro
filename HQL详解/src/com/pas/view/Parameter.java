package com.pas.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pas.domain.Student;
import com.pas.util.HibernateSessionFactory;

public class Parameter {
	public static void main(String[] args) {
		String hql1="from Student where sdept=:sdept";
		Map<String, Object> params1=new HashMap<String, Object>();
		params1.put("sdept", "计算机系");
		List<Student> stus1=(List<Student>) hql(hql1, params1);
		for (int i = 0; i < stus1.size(); i++) {
			System.out.println(stus1.get(i).getSname());
		}
		
		String hql2="from Student where sdept=? and sage>?";
		Object[] params2=new Object[]{"外语系",22};
		List<Student> stus2=(List<Student>) hql(hql2, params2);
		for (int i = 0; i < stus2.size(); i++) {
			System.out.println(stus2.get(i).getSname());
		}
	}

	/**
	 * 参数
	 * 
	 * @param hql
	 * @return
	 */
	private static List<?> hql(String hql,Map<String, Object> params) {

		Session session = null;
		Transaction trans = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();
			Query q = session.createQuery(hql);
			
			if(params!=null && !params.isEmpty())
			{
				for (String key : params.keySet()) {
					q.setParameter(key, params.get(key));
				}
			}
			List<?> res=q.list();
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
				HibernateSessionFactory.closeSession();
			}
		}
	}
	
	/**
	 * 参数2
	 * 
	 * @param hql
	 * @return
	 */
	private static List<?> hql(String hql,Object[] params) {

		Session session = null;
		Transaction trans = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();
			Query q = session.createQuery(hql);
			
			if(params!=null && params.length>0)
			{
				for (int i = 0; i < params.length; i++) {
					q.setParameter(i, params[i]);
				}
			}
			List<?> res=q.list();
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
				HibernateSessionFactory.closeSession();
			}
		}
	}
}
