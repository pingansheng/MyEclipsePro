package com.pas.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pas.domain.Employee;
import com.pas.service.interfaces.EmployeeServiceInter;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userid;
	private String password;
	@Resource
	private EmployeeServiceInter employeeServiceInter;
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return
	 */
	public String execute() {

		// 如果action没有交给spring管理时，我们通过下面语句获取spring容器实例
		Employee e = new Employee();
		try {
			e.setId(Integer.parseInt(getUserid()));
			e.setPwd(getPassword());
			
			e = employeeServiceInter.checkEmployee(e);
			if (e != null) {
				ActionContext.getContext().getSession().put("employee", e);
				return SUCCESS;
			}
			return ERROR;
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return ERROR;
	}
}