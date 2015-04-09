package com.pas.view;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pas.domain.Course;
import com.pas.domain.Studcourse;
import com.pas.domain.Student;
import com.pas.util.HibernateSessionFactory;

public class TestMain {

	public static void main(String[] args) {
		add();
	}

	/**
	 * Ìí¼Ó
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
			
			Student s=new Student();
			s.setSname("ÕÅÈý");
			
			Course c=new Course();
			c.setCname("C++");
			
			Studcourse sc=new Studcourse();
			sc.setCourse(c);
			sc.setStudent(s);
			
			session.save(s);
			session.save(c);
			session.save(sc);
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

}
