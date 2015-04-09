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
			 * ActionContext���Ի��Servlet���� �����޷����response��Ӧ������
			 * ��õ�request��session��Application ����Map����
			 */

			ActionContext.getContext().put("�û���", username);
			ActionContext.getContext().getSession();
			ActionContext.getContext().getApplication();
			Map request=(Map)ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
		} else {
			ActionContext.getContext().put("info", "��Ϣ");
		}
		return SUCCESS;
	}
	
	public String execute1() throws IOException {
		if ("ping".equals(username)) {
			response.setContentType("text/html;charset=utf-8");   
			PrintWriter out = response.getWriter();   
			out.print("<script type='text/javascript'>alert('��֤���������!')</script>");   
			out.print("<script type='text/javascript'>location.href='/index.jsp'</script>");   
			out.flush();   
			out.close();  
		} else {
			response.setContentType("text/html;charset=utf-8");   
			PrintWriter out = response.getWriter();   
			out.print("<script type='text/javascript'>alert('��֤���������!')</script>");   
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
	
	//��ʵ�ַ���
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response=response;
		
	}
}
