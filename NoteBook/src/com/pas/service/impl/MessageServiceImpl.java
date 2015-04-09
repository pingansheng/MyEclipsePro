package com.pas.service.impl;

import java.util.Date;
import java.util.List;

import com.pas.domain.Message;
import com.pas.domain.User;
import com.pas.service.inter.MessageServiceInter;
import com.pas.util.HibernateSessionFactory;

public class MessageServiceImpl extends BaseService implements MessageServiceInter{

	public List<Message> getMessage(User user) {
		String hql="from Message where sender.userid=? or receiver.userid=? or receiver.userid=999";
		Object[] params=new Object[]{user.getUserid(),user.getUserid()};
		List<Message> message=(List<Message>) HibernateSessionFactory.executeQueryOpenInView(hql, params);
		return message;
	}
}
