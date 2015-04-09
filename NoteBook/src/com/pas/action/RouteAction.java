package com.pas.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pas.domain.Message;
import com.pas.domain.User;
import com.pas.service.impl.MessageServiceImpl;
import com.pas.service.inter.MessageServiceInter;

public class RouteAction extends ActionSupport {

	private String toAction;

	public void setToAction(String actionname) {
		toAction = actionname;
	}

	public String getToAction() {
		return toAction;
	}

	/**
	 * @return
	 */
	public String execute() {
		String target = getToAction();
		if ("msglist".equals(target)) {
			MessageServiceInter messageServiceInter=new MessageServiceImpl();
			User user=(User) ActionContext.getContext().getSession().get("userinfo");
			List<Message> list=messageServiceInter.getMessage(user);
			Map request = (Map)ActionContext.getContext().get("request");
			request.put("messagelist", list);
			
			return "toMsgList";
		}
		if("postMsg".equals(target))
		{
			return "postMsg";
		}
		if ("quit".equals(target)) {
			ActionContext.getContext().getSession().clear();
			return LOGIN;
		}
		return NONE;
	}
}