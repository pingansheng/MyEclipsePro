package com.pas.view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

import com.pas.domain.Users;
import com.pas.util.MySessionFactory;

public class UserCURD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//updateUser(155);
		//delUser(157);
		addUser();

	}
	
	public static Users getUser(int userid) {
		// �޸��û�
		// ��ȡ�Ự
		Session session = MySessionFactory.getSessionFactory()
				.openSession();

		// �޸��û� 1.��ȡ�޸ĵ��û� 2.�޸��û�
		// ͨ��������ȡ����
		Users olduser = (Users) session.load(Users.class, userid);
		session.close();
		return olduser;

	}
	
	public static void delUser(int userid) {
		// �޸��û�
		// ��ȡ�Ự
		Session session = MySessionFactory.getSessionFactory()
				.openSession();

		Transaction tran = session.beginTransaction();
		// �޸��û� 1.��ȡ�޸ĵ��û� 2.�޸��û�
		// ͨ��������ȡ����
		Users olduser = (Users) session.load(Users.class, userid);
		session.delete(olduser);
		tran.commit();
		session.close();
	}
	
	public static void updateUser(int userid) {
		// �޸��û�
		// ��ȡ�Ự
		Session session = MySessionFactory.getSessionFactory()
				.openSession();

		Transaction tran = session.beginTransaction();
		// �޸��û� 1.��ȡ�޸ĵ��û� 2.�޸��û�
		// ͨ��������ȡ����
		Users olduser = (Users) session.load(Users.class, userid);
		olduser.setUsername("pingansheng");
		tran.commit();
		session.close();
	}

	public static void addUser() {
		Session session = MySessionFactory.getSessionFactory()
				.openSession();

		// 4.����hibernate Ҫ��������ɾ���޸�ʱ ʹ�������ύ
		Transaction tran = session.beginTransaction();
		// ���User

		Users user = new Users();
		user.setEmail("hibernate@qq.com");
		user.setGrade(12);
		user.setPassword("pingansheng");
		user.setUsername("hibernateTEST");

		// �������
		session.save(user);
		tran.commit();
		session.close();
	}

}
