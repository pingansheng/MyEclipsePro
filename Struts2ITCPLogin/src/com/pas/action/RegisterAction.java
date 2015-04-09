package com.pas.action;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	
	private String username;
	private String password;
	private String repass;
	private int age;
	private Date date;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	
	public String getRepass() {
		return repass;
	}
	public void setRepass(String repass) {
		this.repass = repass;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public String test() throws Exception {
		return SUCCESS;
	}
	
	@Override
	public void validate() {
		//一般使用xml校验 除非复杂的校验
		
//		
//		if(null==username||username.length()<20)
//		{
//			//验证顺序 先验证xml校验
//			this.addFieldError("username", "username是否会冲突");
//		}
//		if(null==password||password.length()<5)
//		{
//			this.addFieldError("password", "密码长度不对5");
//		}else if(null==repass||!password.equals(repass))
//		{
//			this.addFieldError("repass", "密码两次输入不符合");
//		}
//		
//		if(age<10||age>100)
//		{
//			this.addFieldError("age", "年龄错误");
//		}
//		
//		if(null!=date)
//		{
//			Calendar c1=Calendar.getInstance();
//			c1.setTime(date);
//			Calendar c2=Calendar.getInstance();
//			c2.setTime(new Date());
//			
//			if(!c1.before(c2))
//			{
//				this.addFieldError("date", "日期不对");
//			}
//		}
//		
//		else
//		{
//			this.addFieldError("date", "日期为空");
//		}
	}
}
