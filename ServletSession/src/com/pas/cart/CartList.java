package com.pas.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CartList extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		@SuppressWarnings("unchecked")
		HashMap<String, Book> books = (HashMap<String, Book>) request
				.getSession().getAttribute("books");
		String url=response.encodeURL("/Session/ShowBooks");
		out.println("���򵽵���Ʒ��<a href='"+url+"'>�������</a>" + "</br>");
		if (null == books) {
			out.println("����Ʒ");
			return;
		}
		float totalprice=0.0f;
		for (String string : books.keySet()) {
			Book bk=books.get(string);
			out.println("������"+bk.getName()+" ������"+bk.getNum()+" �ܼۣ�"+String.format("%.2f", bk.getPrice()) + "</br>");
			totalprice+=bk.getPrice();
		}
		out.println("���򵽵���Ʒ�ܼ�Ϊ ��"+String.format("%.2f",totalprice) + "</br>");
		
		out.flush();
		out.close();
	}

}
