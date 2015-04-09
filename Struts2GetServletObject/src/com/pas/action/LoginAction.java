package com.pas.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{

	private String username;
	private String password;
	private HttpServletRequest request;
	private HttpServletResponse response;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/*
	 * ActionContext
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	public String execute() {
		if ("ping".equals(username)) {
			/*
			 * ActionContext可以获得Servlet对象 但是无法获得response响应对象获得
			 * 获得的request、session、Application 都是Map类型
			 */

			ActionContext.getContext().put("用户名", username);
			ActionContext.getContext().getSession();
			ActionContext.getContext().getApplication();
			Map request=(Map)ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
		} else {
			ActionContext.getContext().put("info", "信息");
		}
		return SUCCESS;
	}
	
	public String execute1() throws IOException {
		if ("ping".equals(username)) {
			response.setContentType("text/html;charset=utf-8");   
			PrintWriter out = response.getWriter();   
			out.print("<script type='text/javascript'>alert('验证码输入错误!')</script>");   
			out.print("<script type='text/javascript'>location.href='/index.jsp'</script>");   
			out.flush();   
			out.close();  
		} else {
			response.setContentType("text/html;charset=utf-8");   
			PrintWriter out = response.getWriter();   
			out.print("<script type='text/javascript'>alert('验证码输入错误!')</script>");   
			out.flush();   
			out.close();  
		}
		System.out.println(username);
		return SUCCESS;
	}
	
	public String execute2() throws IOException {
		if ("ping".equals(username)) { 
			ServletActionContext.getResponse();
			ServletActionContext.getRequest();
			ServletActionContext.getRequest().getSession();
			ServletActionContext.getServletContext();
		} else {
			
		}
		System.out.println(username);
		return SUCCESS;
	}
	
	//需实现方法
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response=response;
		
	}
}
