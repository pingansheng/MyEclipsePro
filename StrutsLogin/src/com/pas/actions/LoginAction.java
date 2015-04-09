package com.pas.actions;
/*
 * Action 小队长
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.pas.domain.UserDomain;
import com.pas.forms.UserForm;
import com.pas.service.UserService;

public class LoginAction extends Action {

	//需要重写一个方法
	//execute会被自动调用，类似servlet doGet方法
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		//将form强转为userform
		UserForm userform=(UserForm)form;
		UserDomain user=new UserDomain();
		user.setId(userform.getUserid());
		user.setPwd(userform.getPassword());
		
		if(new UserService().checkUser(user))
		{
			return mapping.findForward("ok");
		}
		else
		{
			return mapping.findForward("err");
		}
	}
}
