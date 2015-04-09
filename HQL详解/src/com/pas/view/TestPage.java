package com.pas.view;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pas.domain.Student;
import com.pas.util.HibernateSessionFactory;

public class TestPage {
	public static void main(String[] args) {
		int pageNow = 1;
		int pageSize = 2;
		int count = 0;
		do {
			List<Student> stu = (List<Student>) hqlByPage("Student", pageSize,
					pageNow);
			count = stu.size();
			if (count > 0) {
				System.out.println("#####µÚ" + pageNow + "Ò³#####");
				for (Student student : stu) {
					System.out.println(student.getSname());
				}
				pageNow++;
			}

		} while (count == pageSize);

	}

	/**
	 * ·ÖÒ³²éÑ¯
	 * 
	 * @param hql
	 * @return
	 */
	private static List<?> hqlByPage(String classname, int pagesize, int pageNow) {

		Session session = null;
		Transaction trans = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();
			List<?> res = session.createQuery("from " + classname)
					.setFirstResult((pageNow - 1) * pagesize)
					.setMaxResults(pagesize).list();
			trans.commit();
			return res;
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
