package com.pas.action;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {

	public String execute() throws Exception {
		return SUCCESS;
	}

	public String abc() throws Exception {
		System.out.println("abc调用了");
		return null;

	}

	public String xxx() throws Exception {
		System.out.println("xxx调用了");
		return null;

	}

	public void validateAbc() {
		System.out.println("验证ABC");
	}

	public void validateXxx() {
		System.out.println("验证XXX");
	}

	// 如果有validate则一定执行 不管其他
	// 这样不合理 ：
	// 解决方法，1.不写validate方法
	// 2.如果有execute方法 则实现validateExecute进行验证
	@Override
	public void validate() {
		System.out.println("公有validate");
	}
}
