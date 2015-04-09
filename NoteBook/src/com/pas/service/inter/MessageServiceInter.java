package com.pas.service.inter;

import java.util.List;

import com.pas.domain.Message;
import com.pas.domain.User;
public interface MessageServiceInter extends BaseServiceInter{

	/**
	 * 显示用户收到的所有Message
	 */
	public List<Message> getMessage(User user);

}
