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
		// add();
		// Student s=query();
		// 懒加载session关闭后无法获取其关联对象
		// System.out.println(s.getName()+s.getDept().getName());
		// 解决方式：
		// 1、显示初始化代理对象
		// Hibernate.initialize(s.class);
		// 2、代理对象的映射xml添加lazy=false
		// 3、通过过滤器（web项目中）

		// queryOne2Many();
		addcascade();
//		delcascade();
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

			// 查询3号学生
			s = (Student) session.get(Student.class, 3);
			// Hibernate.initialize(s.getDept());
			// 取部门为懒加载
			// System.out.println(s.getName()+"部分："+s.getDept().getName());
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
	 * 查询
	 * 
	 * @param hql
	 * @return
	 */
	private static Student queryOne2Many() {
		Session session = null;
		Transaction trans = null;
		Student s = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();

			// 查询2号部门对应的学生
			Department dept = (Department) session.get(Department.class, 2);
			Set<Student> set = dept.getStus();
			for (Student student : set) {
				System.out.println(student.getName());
			}
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

	/*
	 * 级联添加
	 */
	private static Student addcascade() {
		Session session = null;
		Transaction trans = null;
		Student s = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();

			Department de = new Department();
			de.setName("业务部");
			
			Student s1 = new Student();
			s1.setName("111");
			Student s2 = new Student();
			s2.setName("222");
			
			Set<Student> set = new HashSet<Student>();
			set.add(s1);
			set.add(s2);
			
			de.setStus(set);
			
			session.save(de);
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
	
	/*
	 * 级联删除
	 */
	private static Student delcascade() {
		Session session = null;
		Transaction trans = null;
		Student s = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();

			Department de =(Department) session.get(Department.class, 1);
			session.delete(de);
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
