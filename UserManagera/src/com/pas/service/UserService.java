package com.pas.service;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.pas.domain.User;
import com.pas.util.SqlHelper;
import java.lang.reflect.*;

public class UserService {

	
	/**
	 * 添加用户
	 * @param userID
	 * @return
	 */
	public boolean addUser(User user) 
	{
		try {

			String sql = "insert into users(USERNAME,EMAIL,GRADE,PASSWD) values(?,?,?,?)";
			String paras[] = { user.getName(),user.getEmail(),user.getGrade()+"",user.getPwd() };
			return (new SqlHelper().executeUpdate(sql, paras)==1);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} 
	}
	
	
	/**
	 * 更新用户
	 * @param userID
	 * @return
	 */
	public boolean updateUser(User user) 
	{
		try {

			String sql = "update users set username=?,email=?,grade=?,passwd=? where id=?";
			String paras[] = { user.getName(),user.getEmail(),user.getGrade()+"",user.getPwd(),user.getId()+"" };
			return (new SqlHelper().executeUpdate(sql, paras)==1);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} 
	}
	
	/**
	 * 删除用户
	 * @param userID
	 * @return
	 */
	public boolean delUser(String userID) 
	{
		try {

			String sql = "delete from users where id=?";
			String paras[] = { userID + "" };
			return (new SqlHelper().executeUpdate(sql, paras)==1);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} 
	}

	/**
	 * 得到用户对象
	 * @param userid
	 * @return
	 */
	public User getUserModel(String userid)
	{
		User user=new User();
		try {
			
			String sql="select * from users where id=?";
			String paras[]={userid};
			ArrayList<Object> rs= new SqlHelper().executeQuery(sql, paras);

			if (rs.size()==1) {

				user.setId(Integer.parseInt(((Object[])rs.get(0))[0].toString()));
				user.setName(((Object[])rs.get(0))[1].toString());
				user.setEmail(((Object[])rs.get(0))[2].toString());
				user.setGrade(Integer.parseInt(((Object[])rs.get(0))[3].toString()));
				user.setPwd(((Object[])rs.get(0))[4].toString());
				
				return user;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	/**
	 * 检查登录用户合法性
	 * @param user
	 * @return
	 */
	public boolean checkUser(User user)
	{

		try {
			
			String sql="select * from users where id=? and passwd=?";
			String paras[]={user.getId()+"",user.getPwd()};
			for (String string : paras) {
				if("".equals(string)) return false;
			}
			ArrayList<Object> rs= new SqlHelper().executeQuery(sql, paras);
			if (rs.size()==1) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
	}
	

	/**
	 * 得到分页用户列表
	 * @param pageNow
	 * @param pageSize
	 * @return
	 */
	public ArrayList<User> getUsersByPage(int pageNow,int pageSize)
	{
		ArrayList<User> users=new ArrayList<User>();
		try {
			String sql="select * from "
					+ "(select t.*, rownum rn from "
					+ "(select * from users order by id) t" + " where rownum<=?"
					+ ") " + "where rn>=?";
			String[] paras={pageNow * pageSize+"",((pageNow - 1) * pageSize + 1)+""};
			ArrayList<Object> rs = new SqlHelper().executeQuery(sql, paras);

			User user;
			for (Object object : rs) {
				user = new User();
				user.setId(Integer.parseInt(((Object[])object)[0].toString()));
				user.setName(((Object[])object)[1].toString());
				user.setEmail(((Object[])object)[2].toString());
				user.setGrade(Integer.parseInt(((Object[])object)[3].toString()));
				user.setPwd(((Object[])object)[4].toString());
				users.add(user);
			}
				
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return users;
	}
	
	
	/**
	 * 用户列表分页总数
	 * @param pageSize
	 * @return
	 */
	public int getUserPageCount(int pageSize)
	{
		int pageCount=0;
		try {
			String sql = "select count(1) from users";

			ArrayList<Object> rs = new SqlHelper().executeQuery(sql, null);


			int rowcount=Integer.parseInt(((Object[])rs.get(0))[0].toString());
			pageCount=( rowcount- 1) / pageSize + 1;

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return pageCount;
	}
	
}
