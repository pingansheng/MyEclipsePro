package com.pas.service.impl;

import java.io.Serializable;

import com.pas.service.inter.BaseServiceInter;
import com.pas.util.HibernateSessionFactory;

public abstract class BaseService implements BaseServiceInter {

	public Object findById(Class<?> clazz, Serializable id) {
		return HibernateSessionFactory.findByIdOpenInView(clazz, id);
	}

	public void saveObject(Object obj) {
		try {
			HibernateSessionFactory.executeSaveOpenInView(obj);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

	}
}
