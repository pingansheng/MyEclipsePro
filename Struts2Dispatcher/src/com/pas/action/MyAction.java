package com.pas.action;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {

	public String execute() throws Exception {
		return SUCCESS;
	}

	public String abc() throws Exception {
		System.out.println("abc������");
		return null;

	}

	public String xxx() throws Exception {
		System.out.println("xxx������");
		return null;

	}

	public void validateAbc() {
		System.out.println("��֤ABC");
	}

	public void validateXxx() {
		System.out.println("��֤XXX");
	}

	// �����validate��һ��ִ�� ��������
	// ���������� ��
	// ���������1.��дvalidate����
	// 2.�����execute���� ��ʵ��validateExecute������֤
	@Override
	public void validate() {
		System.out.println("����validate");
	}
}
