package com.pas.test.framework;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pas.domain.Department;
import com.pas.domain.Employee;
import com.pas.service.impl.EmployeeServiceImpl;
import com.pas.service.interfaces.DepartmentServiceInter;
import com.pas.service.interfaces.EmployeeServiceInter;

public class TestHibernate {

	@Test
	public void test() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeServiceInter employeeServiceInter =(EmployeeServiceInter) ac.getBean("employeeService");
		DepartmentServiceInter departmentServiceInter=(DepartmentServiceInter) ac.getBean("departmentService");
		
		Set<Employee> set=new HashSet<Employee>();
		Employee e = new Employee();
		e.setPwd("123");
		e.setGrade(1);
		e.setEmail("123@123.com");
		e.setHiredate(new Date());
		e.setName("张三");
		e.setSalary(1231);
		e.setDepartment(null);
		
		Employee e1 = new Employee();
		e1.setPwd("123");
		e1.setGrade(1);
		e1.setEmail("123@123.com");
		e1.setHiredate(new Date());
		e1.setName("李四");
		e1.setSalary(1231);
		e1.setDepartment(null);
		
		Employee e2 = new Employee();
		e2.setPwd("123");
		e2.setGrade(1);
		e2.setEmail("123@123.com");
		e2.setHiredate(new Date());
		e2.setName("王五");
		e2.setSalary(1231);
		e2.setDepartment(null);
		
		set.add(e);
		set.add(e1);
		set.add(e2);
		
		Department d=new Department();
		d.setEmployeelist(set);
		d.setName("财务部");
		
		int id=(Integer)departmentServiceInter.saveObject(d);
		assertTrue(id>0);
	}
	
	@Test
	public void test1() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeServiceInter employeeServiceInter =(EmployeeServiceInter) ac.getBean("employeeService");
		System.out.println(employeeServiceInter.getPageCount(2));
	}
}
