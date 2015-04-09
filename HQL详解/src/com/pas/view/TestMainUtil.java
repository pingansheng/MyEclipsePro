package com.pas.view;

import java.util.List;

import com.pas.domain.Course;
import com.pas.domain.Student;
import com.pas.util.HibernateSessionFactory;

/**
 * 使用加强工厂的方法进行操作
 * 
 * @author pingansheng
 * 
 */
public class TestMainUtil {
	public static void main(String[] args) {
		// exehql();

		// 分页
		// page();
		// add();
		// update();
//		del();
		queryManyTables();
	}

	public static void exehql() {
		String hql2 = "from Student where sdept=? and sage>?";
		Object[] params = new Object[] { "外语系", 22 };
		List<Student> stus2 = (List<Student>) HibernateSessionFactory
				.executeQuery(hql2, params);
		for (int i = 0; i < stus2.size(); i++) {
			System.out.println(stus2.get(i).getSname());
		}
	}

	public static void page() {
		String hql2 = "from Student";
		List<Student> stus2 = (List<Student>) HibernateSessionFactory
				.executeQueryByPage(hql2, null, 2, 2);
		for (int i = 0; i < stus2.size(); i++) {
			System.out.println(stus2.get(i).getSname());
		}
	}

	private static void add() {
		Course c = new Course("计算机操作系统", 12, null);
		HibernateSessionFactory.executeSave(c);
	}

	private static void update() {
		String hql = "update Course set cname='数据结构' where cname=?";
		Object[] objs = new Object[] { "计算机操作系统" };
		HibernateSessionFactory.executeUpdate(hql, objs);
	}

	private static void del() {
		String hql = "delete Course where cname=?";
		Object[] objs = new Object[] { "数据结构" };
		HibernateSessionFactory.executeUpdate(hql, objs);
	}
	
	private static void queryManyTables()
	{
		String hql="select sc.course.cname,sc.grade from Studcourse as sc where sc.student.sname=?";
		Object[] params = new Object[] { "林青霞"};
		List<Object[]> stus2 = (List<Object[]>) HibernateSessionFactory
				.executeQuery(hql, params);
		for (int i = 0; i < stus2.size(); i++) {
			System.out.println(stus2.get(i)[0].toString()+stus2.get(i)[1].toString());
		}
	}
}
