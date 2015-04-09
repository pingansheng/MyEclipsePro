package com.pas.view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.stat.Statistics;

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
	private static void query() {
		Session session = null;
		Transaction trans = null;
		Student s = null;
		try {
			session = HibernateSessionFactory.openSession();
			trans = session.beginTransaction();

			s = (Student) session.get(Student.class, 3);
			System.out.println(s.getDept().getName());
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trans != null) {
				trans.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		
		System.out.println("********华丽分割线********");
		
		/**
		 * 此处如果department 不使用懒加载，如果不指定Department映射文件的<cache>则缓存Student时候并不会缓存其关联的Department对象实例，
		 * 在从二次缓存中获取实例时候，由于懒加载未应用，所以会发出sql语句补全未缓存的Department对象
		 */
		try {
			session = HibernateSessionFactory.openSession();
			trans = session.beginTransaction();
			Student ss = (Student) session.get(Student.class, 3);
			System.out.println(ss.getDept().getName());
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (trans != null) {
				trans.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		
		Statistics statistics=HibernateSessionFactory.getFactory().getStatistics();
		System.out.println(statistics.getSecondLevelCachePutCount());
		System.out.println(statistics.getSecondLevelCacheHitCount());
		System.out.println(statistics.getSecondLevelCacheMissCount());
	}
}
