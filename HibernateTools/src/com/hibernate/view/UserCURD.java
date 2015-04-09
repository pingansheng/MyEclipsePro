package com.hibernate.view;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

import com.hibernate.domain.Users;
import com.hibernate.utils.MySessionFactory;


public class UserCURD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Session session = MySessionFactory.getCurrentSession();
//
//		// load��ȡ���������ز�ִ��sql��䣬���ش������
//		// ʵ�ʲ�һ������ ����ʹ�ô˶��󲻷���sql���,ʹ�ô˶������δ��ѯ���׳��쳣
//		// get ȥ��ѯ���ݣ���������db������ѯ����δ��ѯ������null
//
//		// ��ѯ��������session����
//		Users olduser = (Users) session.load(Users.class, 100);
//		System.out.println(olduser.getEmail());
//
//		// ��session�����л�ȡ���Ҳ���ȥ���������ң���������ˣ�
//		Users user = (Users) session.get(Users.class, 100);
//		System.out.println(user.getUsername());
//
//		// ��session�����л�ȡ���Ҳ���ȥ���������ң���������ˣ�
//		Users user1 = (Users) session.get(Users.class, 100);
//		System.out.println(user1.getPassword());
		query(100);
		addUser();
		updateUser(123);
		delUser(121);
	}

	/**
	 * ��ȡ�û�����
	 * @param userid
	 */
	public static Users getUser(int userid) {
		Session session = MySessionFactory.getSession();
		Transaction tran = null;
		try {
			tran = session.beginTransaction();
			Users user = (Users) session.get(Users.class, userid);
			tran.commit();
			return user;
		} catch (Exception e) {
			if (tran != null) {
				tran.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	
	/**
	 * ɾ���û�
	 * @param userid
	 */
	public static void delUser(int userid) {
		Session session = MySessionFactory.getSession();
		Transaction tran = null;
		try {
			tran = session.beginTransaction();
			Users olduser = (Users) session.load(Users.class, userid);
			session.delete(olduser);
			tran.commit();
		} catch (Exception e) {
			if (tran != null) {
				tran.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	/**
	 * �����û�
	 * @param userid
	 */
	public static void updateUser(int userid) {
		// �޸��û�
		// ��ȡ�Ự
		// ��׼ģ��
		Session session = MySessionFactory.getSession();
		Transaction tran = null;
		try {
			tran = session.beginTransaction();
			// �޸��û� 1.��ȡ�޸ĵ��û� 2.�޸��û�
			// ͨ��������ȡ����
			Users olduser = (Users) session.load(Users.class, userid);
			olduser.setUsername("pingansheng");
			tran.commit();
//			int i = 9 / 0;// ���쳣 ��ع�
		} catch (Exception e) {
			if (tran != null) {
				tran.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	/**
	 * ����û�
	 */
	public static void addUser() {
		Session session = MySessionFactory.getSession();

		// 4.����hibernate Ҫ��������ɾ���޸�ʱ ʹ�������ύ
		Transaction tran = null;
		// ���User
		try {
			tran = session.beginTransaction();
			Users user = new Users();
			user.setEmail("hibernate@qq.com");
			user.setGrade(12);
			user.setPasswd("pingansheng");
			user.setUsername("hibernateTEST");
			// �������
			session.save(user);
			tran.commit();
		} catch (Exception e) {
			if (tran != null) {
				tran.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	public static void query(int userid)
	{
		Session session = MySessionFactory.getSession();

		Transaction tran = null;
		try {
			tran = session.beginTransaction();
			
			//��ȡquery���� 
			//Users�˴�ָ���� ���Ǳ���
			//idָ����������
			Query query=session.createQuery("from Users where id=?");
			query.setInteger(0, userid);
			//ͨ��list������ȡ����,��list���Զ���װ�ɶ�Ӧ��domain����
			List<Users> users=query.list();
			for (Users user : users) {
				System.out.println(user.getUsername());
			}
			tran.commit();
		} catch (Exception e) {
			if (tran != null) {
				tran.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

}
