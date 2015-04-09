package com.pas.view;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.hibernate.Hibernate;
import org.hibernate.Query;
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
		// updateUser(1);
		// delUser(157);
		// addUser();

//		Session session = MySessionFactory.getCurrentSession();
//
//		// load获取对象，懒加载不执行sql语句，返回代理对象
//		// 实际不一定存在 ，不使用此对象不发送sql语句,使用此对象如果未查询到抛出异常
//		// get 去查询数据，会立即向db发出查询请求，未查询到返回null
//
//		// 查询到语句存入session缓存
//		Users olduser = (Users) session.load(Users.class, 100);
//		System.out.println(olduser.getEmail());
//
//		// 从session缓存中获取，找不到去二级缓存找（如果配置了）
//		Users user = (Users) session.get(Users.class, 100);
//		System.out.println(user.getUsername());
//
//		// 从session缓存中获取，找不到去二级缓存找（如果配置了）
//		Users user1 = (Users) session.get(Users.class, 100);
//		System.out.println(user1.getPassword());
//		query(100);
		addUser();
	}

	/**
	 * 删除用户
	 * @param userid
	 */
	public static void delUser(int userid) {
		Session session = MySessionFactory.getCurrentSession();
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
	 * 更新用户
	 * @param userid
	 */
	public static void updateUser(int userid) {
		// 修改用户
		// 获取会话
		// 标准模板
		Session session = MySessionFactory.getCurrentSession();
		Transaction tran = null;
		try {
			tran = session.beginTransaction();
			// 修改用户 1.获取修改的用户 2.修改用户
			// 通过主键获取对象
			Users olduser = (Users) session.load(Users.class, userid);
			olduser.setUsername("pingansheng");
			tran.commit();
			int i = 9 / 0;// 抛异常 会回滚
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
	 * 添加用户
	 */
	public static void addUser() {
		Session session = MySessionFactory.getCurrentSession();

		// 4.对于hibernate 要求在增加删除修改时 使用事务提交
		Transaction tran = null;
		// 添加User
		try {
			tran = session.beginTransaction();
			Users user = new Users();
			user.setId(100+"");
			user.setEmail("hibernate@qq.com");
			user.setGrade(12);
			user.setPassword("pingansheng");
			user.setUsername("hibernateTEST");
			// 保存对象
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
		Session session = MySessionFactory.getCurrentSession();

		Transaction tran = null;
		try {
			tran = session.beginTransaction();
			
			//获取query引用 
			//Users此处指类名 不是表名
			//id指对象属性名
			Query query=session.createQuery("from Users where id=?");
			query.setInteger(0, userid);
			//通过list方法获取对象,此list会自动封装成对应的domain类型
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
