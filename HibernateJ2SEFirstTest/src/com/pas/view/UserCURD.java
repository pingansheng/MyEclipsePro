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
		// 修改用户
		// 获取会话
		Session session = MySessionFactory.getSessionFactory()
				.openSession();

		// 修改用户 1.获取修改的用户 2.修改用户
		// 通过主键获取对象
		Users olduser = (Users) session.load(Users.class, userid);
		session.close();
		return olduser;

	}
	
	public static void delUser(int userid) {
		// 修改用户
		// 获取会话
		Session session = MySessionFactory.getSessionFactory()
				.openSession();

		Transaction tran = session.beginTransaction();
		// 修改用户 1.获取修改的用户 2.修改用户
		// 通过主键获取对象
		Users olduser = (Users) session.load(Users.class, userid);
		session.delete(olduser);
		tran.commit();
		session.close();
	}
	
	public static void updateUser(int userid) {
		// 修改用户
		// 获取会话
		Session session = MySessionFactory.getSessionFactory()
				.openSession();

		Transaction tran = session.beginTransaction();
		// 修改用户 1.获取修改的用户 2.修改用户
		// 通过主键获取对象
		Users olduser = (Users) session.load(Users.class, userid);
		olduser.setUsername("pingansheng");
		tran.commit();
		session.close();
	}

	public static void addUser() {
		Session session = MySessionFactory.getSessionFactory()
				.openSession();

		// 4.对于hibernate 要求在增加删除修改时 使用事务提交
		Transaction tran = session.beginTransaction();
		// 添加User

		Users user = new Users();
		user.setEmail("hibernate@qq.com");
		user.setGrade(12);
		user.setPassword("pingansheng");
		user.setUsername("hibernateTEST");

		// 保存对象
		session.save(user);
		tran.commit();
		session.close();
	}

}
