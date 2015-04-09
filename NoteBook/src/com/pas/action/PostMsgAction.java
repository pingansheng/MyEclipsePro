package com.pas.action;

import java.util.Date;

import javax.jws.soap.SOAPBinding.Use;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pas.domain.Message;
import com.pas.domain.User;
import com.pas.service.impl.MessageServiceImpl;
import com.pas.service.impl.UserServiceImpl;
import com.pas.service.inter.UserServiceInter;

public class PostMsgAction extends ActionSupport {

	private String receiver;
	private String content;

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return
	 */
	public String execute() {

		User u = (User) ActionContext.getContext().getSession().get("userinfo");
		User touser = (User) new UserServiceImpl().findById(User.class,
				Integer.parseInt(getReceiver()));
		Message msg = new Message();
		msg.setSender(u);
		msg.setReceiver(touser);
		msg.setMsgtime(new Date());
		msg.setMsgbody(getContent());
		try {
			new MessageServiceImpl().saveObject(msg);
			return SUCCESS;
		} catch (Exception e) {
			return INPUT;
		}
	}
}