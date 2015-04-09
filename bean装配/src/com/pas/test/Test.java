package com.pas.test;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pas.collection.Department;
import com.pas.collection.Employee;
import com.pas.inherit.Graduate;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Department de=(Department) ac.getBean("dept");
		out("######Êý×é######");
		for (String string : de.getEmpname()) {
			System.out.println(string);
		}
		out("######List######");
		for (Employee e : de.getEmps()) {
			System.out.println(e.getName());
		}
		out("######Set######");
		for (Employee e : de.getEmpsSet()) {
			System.out.println(e.getName());
		}
		out("######Map######");
		for (Entry<String, Employee> key : de.getEmpMaps().entrySet()) {
			System.out.println(key.getKey()+" "+((Employee)key.getValue()).getName());
		}
		out("######¼Ì³Ð²âÊÔ######");
		Graduate g=(Graduate) ac.getBean("graduate");
		out(g.getName()+g.getAge()+g.getDegree());
	}

	public static void out(Object s) {
		System.out.println(s);
	}
}
