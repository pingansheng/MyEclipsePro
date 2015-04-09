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
	 * 检索类的全部属性
	 */
	private static void getall() {
		// 1、检索所有学生信息
		List<Student> stus = hql("from Student");
		// for循环取出信息
		System.out.println("for循环取出list:");
		for (Student student : stus) {
			System.out.println(student.getSid() + " " + student.getSname());
		}
		// 迭代器取
		System.out.println("迭代器取出list:");
		Iterator<Student> iterator = stus.iterator();
		while (iterator.hasNext()) {
			Student s = iterator.next();
			System.out.println(s.getSid() + " " + s.getSname());
		}
	}

	/**
	 * 检索类的部分属性
	 */
	private static void getpart() {
		// Hibernate建议不管查什么属性全部取出
		// 此处仅为示例如何操作
		// 如果查询的是一列数据 则返回object列表而不是对象数组
		List stus = hql("select sname,sdept from Student");
		// 返回结果为对象数组list，此种方式操作较为麻烦且无法进行关联查询
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * 去重 distinct
	 */
	private static void getdistinct() {
		// Hibernate建议不管查什么属性全部取出
		// 此处仅为示例如何操作
		List stus = hql("select distinct sage,ssex from Student");
		// 返回结果为对象数组list，此种方式操作较为麻烦且无法进行关联查询
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * 区间查询 between and
	 */
	private static void getrange() {
		// Hibernate建议不管查什么属性全部取出
		// 此处仅为示例如何操作
		List stus = hql("select sname,sage,ssex from Student where sage between 20 and 22");
		// 返回结果为对象数组list，此种方式操作较为麻烦且无法进行关联查询
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * 平均值查询 group by
	 */
	private static void getavg() {
		// Hibernate建议不管查什么属性全部取出
		// 此处仅为示例如何操作
		List stus = hql("select avg(sage),sdept from Student group by sdept");
		// 返回结果为对象数组list，此种方式操作较为麻烦且无法进行关联查询
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * 人数大于3 having
	 */
	private static void getSdeptNum() {
		// Hibernate建议不管查什么属性全部取出
		// 此处仅为示例如何操作
		List stus = hql("select count(*) as c1,sdept from Student group by sdept having count(*)>3");
		// 返回结果为对象数组list，此种方式操作较为麻烦且无法进行关联查询
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * 女生人数小于200 having
	 */
	private static void getGirlNum() {
		// Hibernate建议不管查什么属性全部取出
		// 此处仅为示例如何操作
		List stus = hql("select count(*),sdept from Student where ssex='F' group by sdept");
		// 返回结果为对象数组list，此种方式操作较为麻烦且无法进行关联查询
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * 查询计算机系和外语系的学生
	 */
	private static void getsome() {
		List<Student> stus = hql("from Student where sdept in('计算机系','外语系')");
		for (Student student : stus) {
			System.out.println(student.getSid() + " " + student.getSname());
		}
	}

	/**
	 * 查询选修11号课程最高分和最低分
	 */
	private static void getGradeByCourseID() {
		// Hibernate建议不管查什么属性全部取出
		// 此处仅为示例如何操作
		List stus = hql("select max(grade),min(grade) from Studcourse where course.id=11");
		// 返回结果为对象数组list，此种方式操作较为麻烦且无法进行关联查询
		for (int i = 0; i < stus.size(); i++) {
			Object[] objs = (Object[]) stus.get(i);
			System.out.println(objs[0] + " " + objs[1]);
		}
	}

	/**
	 * 显示各科考试不及格学生名字 科目 分数
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
	 * 显示各科不及格学生人数
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
	 * 查询单个对象
	 * 
	 * @param id
	 */
	private static void getStu() {
		Session session = null;
		Transaction trans = null;
		try {
			session = HibernateSessionFactory.getSession();
			trans = session.beginTransaction();
			// 确认最多只有一条才用
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
	 * 执行Hql语句
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
