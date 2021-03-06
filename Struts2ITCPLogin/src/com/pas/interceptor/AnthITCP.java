package com.pas.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AnthITCP extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String,Object> session=invocation.getInvocationContext().getSession();
		if(session.get("user")==null)
		{
			return Action.LOGIN;
		}
		else
		{
			return invocation.invoke();
		}
	}

}
