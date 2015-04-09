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
		// ������session�رպ��޷���ȡ���������
		// System.out.println(s.getName()+s.getDept().getName());
		// �����ʽ��
		// 1����ʾ��ʼ���������
		// Hibernate.initialize(s.class);
		// 2����������ӳ��xml���lazy=false
		// 3��ͨ����������web��Ŀ�У�

		// queryOne2Many();
		addcascade();
//		delcascade();
	}

	/**
	 * ���
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
			stu.setName("�ν�");
			Department dept = new Department();
			dept.setName("����");
			stu.setDept(dept);

			Student stu1 = new Student();
			stu1.setName("�ֳ�");
			Department dept1 = new Department();
			dept1.setName("���²�");
			stu1.setDept(dept1);

			Student stu2 = new Student();
			stu2.setName("����");
			Department dept2 = new Department();
			dept2.setName("��Ϣ��");
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
	 * ��ѯ
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

			// ��ѯ3��ѧ��
			s = (Student) session.get(Student.class, 3);
			// Hibernate.initialize(s.getDept());
			// ȡ����Ϊ������
			// System.out.println(s.getName()+"���֣�"+s.getDept().getName());
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
	 * ��ѯ
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

			// ��ѯ2�Ų��Ŷ�Ӧ��ѧ��
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
	 * �������
	 */
	private static Student addcascade() {
		Session session = null;
		Transaction trans = null;
		Student s = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();

			Department de = new Department();
			de.setName("ҵ��");
			
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
	 * ����ɾ��
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
