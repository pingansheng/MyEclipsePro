package com.pas.view;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pas.domain.Studcourse;
import com.pas.domain.Student;
import com.pas.util.HibernateSessionFactory;

public class TestMian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// getall();
		// getpart();
		// getStu();
		// getdistinct();
		// getrange();
		// getavg();
		// getSdeptNum();
		// getGirlNum();
		// getGradeByCourseID();
//		getBadInfo();
		getBadCountInfo();
	}

	/**
	 * �������ȫ������
	 */
	private static void getall() {
		// 1����������ѧ����Ϣ
		List<Student> stus = hql("from Student");
		// forѭ��ȡ����Ϣ
		System.out.println("forѭ��ȡ��list:");
		for (Student student : stus) {
			System.out.println(student.getSid() + " " + student.getSname());
		}
		// ������ȡ
		System.out.println("������ȡ��list:");
		Iterator<Student> iterator = stus.iterator();
		while (iterator.hasNext()) {
			Student s = iterator.next();
			System.out.println(s.getSid() + " " + s.getSname());
		}
	}

	/**
	 * ������Ĳ�������
	 */
	private static void getpart() {
		// Hibernate���鲻�ܲ�ʲô����ȫ��ȡ��
		// �˴���Ϊʾ����β���
		// �����ѯ����һ������ �򷵻�object�б�����Ƕ�������
		List stus = hql("select sname,sdept from Student");
		// ���ؽ��Ϊ��������list�����ַ�ʽ������Ϊ�鷳���޷����й�����ѯ
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * ȥ�� distinct
	 */
	private static void getdistinct() {
		// Hibernate���鲻�ܲ�ʲô����ȫ��ȡ��
		// �˴���Ϊʾ����β���
		List stus = hql("select distinct sage,ssex from Student");
		// ���ؽ��Ϊ��������list�����ַ�ʽ������Ϊ�鷳���޷����й�����ѯ
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * �����ѯ between and
	 */
	private static void getrange() {
		// Hibernate���鲻�ܲ�ʲô����ȫ��ȡ��
		// �˴���Ϊʾ����β���
		List stus = hql("select sname,sage,ssex from Student where sage between 20 and 22");
		// ���ؽ��Ϊ��������list�����ַ�ʽ������Ϊ�鷳���޷����й�����ѯ
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * ƽ��ֵ��ѯ group by
	 */
	private static void getavg() {
		// Hibernate���鲻�ܲ�ʲô����ȫ��ȡ��
		// �˴���Ϊʾ����β���
		List stus = hql("select avg(sage),sdept from Student group by sdept");
		// ���ؽ��Ϊ��������list�����ַ�ʽ������Ϊ�鷳���޷����й�����ѯ
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * ��������3 having
	 */
	private static void getSdeptNum() {
		// Hibernate���鲻�ܲ�ʲô����ȫ��ȡ��
		// �˴���Ϊʾ����β���
		List stus = hql("select count(*) as c1,sdept from Student group by sdept having count(*)>3");
		// ���ؽ��Ϊ��������list�����ַ�ʽ������Ϊ�鷳���޷����й�����ѯ
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * Ů������С��200 having
	 */
	private static void getGirlNum() {
		// Hibernate���鲻�ܲ�ʲô����ȫ��ȡ��
		// �˴���Ϊʾ����β���
		List stus = hql("select count(*),sdept from Student where ssex='F' group by sdept");
		// ���ؽ��Ϊ��������list�����ַ�ʽ������Ϊ�鷳���޷����й�����ѯ
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * ��ѯ�����ϵ������ϵ��ѧ��
	 */
	private static void getsome() {
		List<Student> stus = hql("from Student where sdept in('�����ϵ','����ϵ')");
		for (Student student : stus) {
			System.out.println(student.getSid() + " " + student.getSname());
		}
	}

	/**
	 * ��ѯѡ��11�ſγ���߷ֺ���ͷ�
	 */
	private static void getGradeByCourseID() {
		// Hibernate���鲻�ܲ�ʲô����ȫ��ȡ��
		// �˴���Ϊʾ����β���
		List stus = hql("select max(grade),min(grade) from Studcourse where course.id=11");
		// ���ؽ��Ϊ��������list�����ַ�ʽ������Ϊ�鷳���޷����й�����ѯ
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * ��ʾ���ƿ��Բ�����ѧ������ ��Ŀ ����
	 * 
	 * @param id
	 */
	private static void getBadInfo() {
		List<Object[]> stu = hql("select student.sname,course.cname,grade from Studcourse where grade<60");
		for (Object[] objects : stu) {
			System.out.println(objects[0].toString() + objects[1] + objects[2]);
		}
	}

	/**
	 * ��ʾ���Ʋ�����ѧ������
	 * 
	 * @param id
	 */
	private static void getBadCountInfo() {
		List<Object[]> stu = hql("select count(*),course.cname from Studcourse where grade<60 group by course.cname");
		for (Object[] objects : stu) {
			System.out.println(objects[0].toString() + objects[1]);
		}
	}
	/**
	 * ��ѯ��������
	 * 
	 * @param id
	 */
	private static void getStu() {
		Session session = null;
		Transaction trans = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();
			// ȷ�����ֻ��һ������
			Student stu = (Student) session.createQuery(
					"from Student where id='20040001'").uniqueResult();
			trans.commit();
			System.out.println(stu.getSname());
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
	 * ִ��Hql���
	 * 
	 * @param hql
	 * @return
	 */
	private static List hql(String hql) {
		Session session = null;
		Transaction trans = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();
			List stus = session.createQuery(hql).list();
			trans.commit();
			return stus;
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
}
