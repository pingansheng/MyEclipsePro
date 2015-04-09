package com.pas.cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BuyBookCTL extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gb2312");

		// 接收
		HttpSession ss = request.getSession();

		@SuppressWarnings("unchecked")
		HashMap<String, Book> books = (LinkedHashMap<String, Book>) ss
				.getAttribute("books");

		String bookname = request.getParameter("name");
		String id = request.getParameter("id");

		if (null == books) {
			books = new LinkedHashMap<String, Book>();
			ss.setAttribute("books", books);

			// 置入cookie关闭后也可访问
			Cookie ck = new Cookie("JSESSIONID", ss.getId());
			ck.setMaxAge(3600);
			response.addCookie(ck);
		}

		if (null != bookname && null != id) {
			Book bk;
			if (books.containsKey(id)) {
				bk = books.get(id);
				bk.setNum(bk.getNum()+1);
				bk.setPrice((bk.getPrice()/(bk.getNum()-1))*bk.getNum());
			} else {
				bk = new Book();
				bk.setId(id);
				bk.setName(bookname);
				bk.setNum(1);
				bk.setPrice(23.87f);
				books.put(id, bk);
			}
		}

		request.getRequestDispatcher("/CartList").forward(request, response);
	}

}
