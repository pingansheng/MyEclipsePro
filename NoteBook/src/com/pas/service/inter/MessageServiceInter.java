package com.pas.service.inter;

import java.util.List;

import com.pas.domain.Message;
import com.pas.domain.User;
public interface MessageServiceInter extends BaseServiceInter{

	/**
	 * ��ʾ�û��յ�������Message
	 */
	public List<Message> getMessage(User user);

}
