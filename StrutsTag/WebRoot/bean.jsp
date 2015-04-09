<%@page import="com.pas.struts.form.UserForm"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 引入Struts标签库 -->
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>  
    <title>My JSP 'bean.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0"> 
  </head>
  
  <body>
    <h1>ubean标签</h1>
    
    <%
    	UserForm user=new UserForm();
    	user.setName("pingansheng");
    	user.setAge(12);
    	//模拟代码
    	request.setAttribute("abc", "HelloWorld");
    	request.setAttribute("user", user);
     %>
     <bean:write name="abc" />
     <h1>输出对象</h1>
     <bean:write name="user" property="name"/>
     <bean:write name="user" property="age"/>
     <h1>message标签</h1>
     <bean:message key="key1" arg0="ping"/>
     <bean:message key="err1" />
  </body>
</html>
