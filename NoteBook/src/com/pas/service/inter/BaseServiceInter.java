package com.pas.service.inter;

import java.io.Serializable;

public interface BaseServiceInter {

	/**
	 * ����Service��ͨ�÷���
	 */
	//�����������;���ʵ��Serializable
	public  Object findById(Class<?> clazz,Serializable id);
	
	/**
	 * �������
	 */
	public void saveObject(Object obj);
}
