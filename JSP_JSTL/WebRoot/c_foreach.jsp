<%@ page language="java" import="java.util.*,com.pas.domain.*"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>My JSP 'c_foreach.jsp' starting page</title>
</head>

<body>
	<% 
  		ArrayList<User> al=new ArrayList<User>();
  		User u1=new User();
   		u1.setId(11);
   		u1.setName("ping11");
   		al.add(u1);
   		
   		User u2=new User();
   		u2.setId(12);
   		u2.setName("ping12");
   		al.add(u2);
   		
   		User u3=new User();
   		u3.setId(13);
   		u3.setName("ping13");
   		al.add(u3);
   		
   		request.setAttribute("users", al);
   	
   %>
	<h1>迭代标签</h1>
	<p>foreach用法 1</p>
	<c:forEach items="${users}" var="u">
		<c:out value="${u.id }"></c:out>
		<c:out value="${u.name }"></c:out>
		<br>
	</c:forEach>
	<p>foreach用法 2 循环2次 begin="0" end="2"</p>
		<c:forEach items="${users}" var="u" begin="0" end="2">
		<c:out value="${u.id }"></c:out>
		<c:out value="${u.name }"></c:out>
		<br>
	</c:forEach>
	
		<p>foreach用法 3 循环3次 指定步长2 begin="0" end="2" step="2"</p>
		<c:forEach items="${users}" var="u" begin="0" end="2" step="2">
		<c:out value="${u.id }"></c:out>
		<c:out value="${u.name }"></c:out>
		<br>
	</c:forEach>
</body>
</html>
