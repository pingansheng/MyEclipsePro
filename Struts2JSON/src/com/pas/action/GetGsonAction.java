package com.pas.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.pas.domain.Address;
import com.pas.domain.People;

public class GetGsonAction extends ActionSupport
{
	@Override
	public String execute() throws Exception
	{
		List<People> list = new ArrayList<People>();
		
		// Info of first user
		People people1 = new People();

		Address address1 = new Address();
		address1.setHomeAddress("beijing");
		address1.setCompanyAddress("shanghai");
		
		people1.setId(1);
		people1.setName("zhangsan");
		people1.setAddress(address1);
		
		People people11 = new People();
		people11.setId(5);
		people11.setName("zhangsan's friend1");
		
		People people12 = new People();
		people12.setId(6);
		people12.setName("zhangsan's friend2");
		
		List<People> list1 = new ArrayList<People>();
		list1.add(people11);
		list1.add(people12);
		
		people1.setFriends(list1);
		
		//Info of second user
		People people2 = new People();
		
		Address address2 = new Address();
		address2.setHomeAddress("liaoning");
		address2.setCompanyAddress("fujian");
		
		people2.setId(2);
		people2.setName("lisi");
		people2.setAddress(address2);
		
		People people21 = new People();
		people21.setId(10);
		people21.setName("lisi's friend1");
		
		People people22 = new People();
		people22.setId(11);
		people22.setName("lisi's friend2");
		
		List<People> list2 = new ArrayList<People>();
		list2.add(people21);
		list2.add(people22);
		
		people2.setFriends(list2);
		
		// put all the users into result list
		list.add(people1);
		list.add(people2);
		
		Gson gson = new Gson();
		
		String result = gson.toJson(list);
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json; charset=utf-8");
		response.setHeader("Cache-Control", "no-cache"); 
		
		PrintWriter out = response.getWriter();
		out.print(result);
		
		out.flush();
		out.close();
		
		return null;
	}
}
