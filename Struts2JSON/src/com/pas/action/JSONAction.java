package com.pas.action;

import java.util.Date;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.pas.domain.Person;

public class JSONAction extends ActionSupport {

	//json序列化的是Action的成员变量
	private String name;
	
	private int id;
	
	private int age;
	
	private String address;
	
	private Date date;
	
	private Person person=new Person();
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@JSON(name="add")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@JSON(format="yyyy-MM-dd HH:mm:ss",serialize=false)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String execute() throws Exception {
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("张三");
		p1.setAge(30);
		p1.setAddress("北京");

		Person p2 = new Person();
		p2.setId(2);
		p2.setName("李四");
		p2.setAge(32);
		p2.setAddress("天津");
		
		if("zhangsan".equals(this.name))
		{
			this.id=p1.getId();
			this.age=p1.getAge();
			this.address=p1.getAddress();
			this.date=new Date();
		}
		else
		{
			this.id=p2.getId();
			this.age=p2.getAge();
			this.address=p2.getAddress();
			this.date=new Date();
		}
		
		return SUCCESS;
	}
}
