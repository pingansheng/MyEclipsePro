package com.pas.service.inter;

import java.io.Serializable;

public interface BaseServiceInter {

	/**
	 * 声明Service层通用方法
	 */
	//常用数据类型均已实现Serializable
	public  Object findById(Class<?> clazz,Serializable id);
	
	/**
	 * 保存对象
	 */
	public void saveObject(Object obj);
}
