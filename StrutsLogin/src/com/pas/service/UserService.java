package com.pas.service;

import java.util.ArrayList;

import com.pas.domain.UserDomain;
import com.pas.util.SqlHelper;

public class UserService {

	public boolean checkUser(UserDomain user)
	{
		String sql="select * from users where id=? and pwd=?";
		SqlHelper sqlhelper=new SqlHelper();
		String[] paras={user.getId()+"",user.getPwd()};
		ArrayList<Object> al=sqlhelper.executeQuery(sql, paras);
		if(al.size()==1)
		{
			return true;
		}
		return false;
	}
}
