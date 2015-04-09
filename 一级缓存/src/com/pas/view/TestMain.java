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

			s = (Student) session.get(Student.class, 3);
			System.out.println(s.getName());
			session.evict(s);//���session�������һ������
			session.clear();//������ж���
			System.out.println("********�����ָ���********");
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
	 * ��Ӻ����ϲ�ѯ
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
			stu.setName("С��");
			session.save(stu);
			//�˴����ȷ���һ������ ���ύʱ��ŷ���sql���
			System.out.println("********�����ָ���********");

			//getȡ���������������ݿⷢ���� load���ش������ʹ��ʱ�ŷ���sql
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
