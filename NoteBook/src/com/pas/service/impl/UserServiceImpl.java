package com.pas.service.impl;

import java.io.Serializable;
import java.util.List;

import com.pas.domain.User;
import com.pas.service.inter.UserServiceInter;
import com.pas.util.HibernateSessionFactory;
import com.pas.util.MyTools;

/**
 * ҵ���UserService
 * @author pingansheng
 *
 */
public class UserServiceImpl extends BaseService implements UserServiceInter{

	/**
	 * ��֤�û��Ƿ�Ϸ�
	 * @param user
	 * @return ��֤�ɹ��󷵻ظ�User���򷵻�null
	 */
	public User checkUser(User user)
	{
		String hql="from User where userid=? and password=?";
		Object[] objs=new Object[]{user.getUserid(),MyTools.MD5(user.getPassword())};
		List<User> users=(List<User>) HibernateSessionFactory.executeQueryOpenInView(hql, objs);
		if(users.size()==0)
		{
			return null;
		}
		return users.get(0);
	}
	
}
