package com.pas.actions;
/*
 * Action С�ӳ�
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

	//��Ҫ��дһ������
	//execute�ᱻ�Զ����ã�����servlet doGet����
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		//��formǿתΪuserform
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
