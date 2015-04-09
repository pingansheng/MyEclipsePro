package com.pas.forms;
/*
 * 一个用户表单 用于填充数据
 * 需要继承org.apache.struts.action.ActionForm
 */
import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {

	//定义属性 （规范 属性名字和jsp页面控件名称一样）
	//需要保证set get方法和属性名关联即可：set属性名（首字母需要大写!!）
	private int userid;
	private String password;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int username) {
		this.userid = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
