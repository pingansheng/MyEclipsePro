package com.pas.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.pas.service.interfaces.BaseServiceInter;

@Transactional
public class BaseServiceImpl implements BaseServiceInter {

	@Resource
	private SessionFactory sessionFactory;

	public Object findById(Class<?> clazz, Serializable id) {
		return sessionFactory.getCurrentSession().load(clazz, id);
	}

	public Serializable saveObject(Object obj) {
		return sessionFactory.getCurrentSession().save(obj);
	}

	public List<?> executeQuery(String hql, Object[] params) {
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		if (params != null && params.length > 0) {
			for (int i = 0; i < params.length; i++) {
				q.setParameter(i, params[i]);
			}
		}
		return q.list();
	}

	public List<?> executeQueryByPage(String hql, Object[] params, int pageNow,
			int pageSize) {
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		if (params != null && params.length > 0) {
			for (int i = 0; i < params.length; i++) {
				q.setParameter(i, params[i]);
			}
		}
		q.setFirstResult((pageNow - 1) * pageSize).setMaxResults(pageSize);
		return q.list();
	}

	public int executeUpdate(String hql, Object[] params) {
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		if (params != null && params.length > 0) {
			for (int i = 0; i < params.length; i++) {
				q.setParameter(i, params[i]);
			}
		}
		return q.executeUpdate();
	}

	public Object getUniqueObject(String hql, Object[] params) {
		
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		if (params != null && params.length > 0) {
			for (int i = 0; i < params.length; i++) {
				q.setParameter(i, params[i]);
			}
		}
		return q.uniqueResult();
	}

	public int getPageCount(String hql, Object[] params, int pageSize) {
		Object count= this.getUniqueObject(hql, null);
		return (Integer.parseInt(count.toString())-1)/pageSize+1;
	}

	public void delObject(Class<?> clazz, Serializable id) {
		this.sessionFactory.getCurrentSession().delete(this.findById(clazz, id));
	}

	public void updateObject(Object obj) {
		this.sessionFactory.getCurrentSession().update(obj);
	}

}
