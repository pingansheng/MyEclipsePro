package com.pas.listener;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class MyListener implements PreResultListener {

	//actionִ����Ͻ���ִ�� 
	public void beforeResult(ActionInvocation invocation, String resultCode) {
		System.out.println("res="+resultCode);
	}

}
