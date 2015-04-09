package com.pas.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import com.opensymphony.xwork2.ActionSupport;
import com.pas.domain.Person;

public class XmlAction extends ActionSupport {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

		Person p3 = new Person();
		p3.setId(3);
		p3.setName("王五");
		p3.setAge(54);
		p3.setAddress("上海");

		Document xmldoc = DocumentHelper.createDocument();
		Element rootElement = xmldoc.addElement("users");
		Element userElement = rootElement.addElement("user");
		Element idElement = userElement.addElement("id");
		Element nameElement = userElement.addElement("name");
		Element ageElement = userElement.addElement("age");
		Element addressElement = userElement.addElement("address");

		if ("zhangsan".equals(name)) {
			idElement.setText(p1.getId() + "");
			nameElement.setText(p1.getName());
			ageElement.setText(p1.getAge() + "");
			addressElement.setText(p1.getAddress());
		} else {
			idElement.setText(p2.getId() + "");
			nameElement.setText(p2.getName());
			ageElement.setText(p2.getAge() + "");
			addressElement.setText(p2.getAddress());
		}

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/xml; charset=utf-8");
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();

		OutputFormat format = OutputFormat.createPrettyPrint();

		format.setEncoding("utf-8");
		XMLWriter writer = new XMLWriter(out, format);
		writer.write(xmldoc);

		out.flush();
		out.close();
		return null;
	}
}
