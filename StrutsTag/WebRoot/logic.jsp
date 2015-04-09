<%@page import="com.pas.struts.form.UserForm"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 引入Struts标签库 -->
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>  
    <title>My JSP 'logic.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0"> 
  </head>
  
  <body>
    <h1>logic标签使用</h1>
     <%
    	UserForm user1=new UserForm();
    	user1.setName("pingansheng1");
    	user1.setAge(12);
    	UserForm user2=new UserForm();
    	user2.setName("pingansheng2");
    	user2.setAge(13);
    	UserForm user3=new UserForm();
    	user3.setName("pingansheng3");
    	user3.setAge(14);
    	
    	ArrayList<UserForm> users=new ArrayList<UserForm>();
    	users.add(user1);
    	users.add(user2);
    	users.add(user3);
    	//模拟代码
    	request.setAttribute("abc", "HelloWorld");
    	request.setAttribute("users", users);
     %>
     <logic:iterate id="user" name="users" >
     	<%-- <bean:write name="user" property="name" />
     	<bean:write name="user" property="age" />--%>
     	${user.age }${user.name } 
     </logic:iterate>
     <br>
     <logic:empty name="ee">logic:empty name="ee"ee为空</logic:empty>
     
     <br>
     <logic:iterate id="user" name="users" >
 		<logic:greaterEqual name="user" value="12" property="age">${user.name }大于12</logic:greaterEqual>
     </logic:iterate>
    
  </body>
</html>
