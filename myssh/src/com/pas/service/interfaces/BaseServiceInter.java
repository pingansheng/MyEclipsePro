package com.pas.service.interfaces;

import java.io.Serializable;
import java.util.List;

public interface BaseServiceInter {

	public  Object findById(Class<?> clazz,Serializable id);
	
	public Serializable saveObject(Object obj);
	
	public List<?> executeQuery(String hql,Object[] params);
	
	public List<?> executeQueryByPage(String hql,Object[] params,int pageNow,int pageSize);
	
	public int executeUpdate(String hql,Object[] params);
	
	public Object getUniqueObject(String hql,Object[] params);
	
	public int getPageCount(String hql,Object[] params,int pageSize);
	
	public void delObject(Class<?> clazz,Serializable id);
	
	public void updateObject(Object obj);
}
