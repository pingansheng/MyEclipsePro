package com.pas.view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pas.domain.Department;
import com.pas.domain.Student;
import com.pas.util.HibernateSessionFactory;

public class TestMain {

	public static void main(String[] args) {
//		 add();
		query();
//		addAndquery();
	}

	/**
	 * 添加
	 * 
	 * @param hql
	 * @return
	 */
	private static void add() {
		Session session = null;
		Transaction trans = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();
			Student stu = new Student();
			stu.setName("宋江");
			Department dept = new Department();
			dept.setName("财务部");
			stu.setDept(dept);

			Student stu1 = new Student();
			stu1.setName("林冲");
			Department dept1 = new Department();
			dept1.setName("人事部");
			stu1.setDept(dept1);

			Student stu2 = new Student();
			stu2.setName("李逵");
			Department dept2 = new Department();
			dept2.setName("信息部");
			stu2.setDept(dept2);

			session.save(dept);
			session.save(dept1);
			session.save(dept2);
			session.save(stu);
			session.save(stu1);
			session.save(stu2);
			trans.commit();
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
	 * 查询
	 * 
	 * @param hql
	 * @return
	 */
	private static Student query() {
		Session session = null;
		Transaction trans = null;
		Student s = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();

			s = (Student) session.get(Student.class, 3);
			System.out.println(s.getName());
			session.evict(s);//清除session缓存清除一个对象
			session.clear();//清除所有对象
			System.out.println("********华丽分割线********");
			s = (Student) session.get(Student.class, 3);
			System.out.println(s.getName());
			trans.commit();
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
		return s;
	}
	
	/**
	 * 添加后马上查询
	 * 
	 * @param hql
	 * @return
	 */
	private static Student addAndquery() {
		Session session = null;
		Transaction trans = null;
		Student s = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();
			Student stu = new Student();
			stu.setName("小李");
			session.save(stu);
			//此处首先放入一级缓存 在提交时候才发出sql语句
			System.out.println("********华丽分割线********");

			//get取不到会立即向数据库发请求 load返回代理对象，使用时才发出sql
			s = (Student) session.get(Student.class, stu.getId());
			System.out.println(s.getName());
			trans.commit();
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
		return s;
	}

}
