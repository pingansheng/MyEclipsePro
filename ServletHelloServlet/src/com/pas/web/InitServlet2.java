package com.pas.web;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class InitServlet2 extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		System.out.println("*************************init2µ÷ÓÃ**********************");
	}

}
