package com.pas.service.impl;

import java.io.Serializable;
import java.util.List;

import com.pas.domain.User;
import com.pas.service.inter.UserServiceInter;
import com.pas.util.HibernateSessionFactory;
import com.pas.util.MyTools;

/**
 * 业务层UserService
 * @author pingansheng
 *
 */
public class UserServiceImpl extends BaseService implements UserServiceInter{

	/**
	 * 验证用户是否合法
	 * @param user
	 * @return 验证成功后返回该User否则返回null
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
