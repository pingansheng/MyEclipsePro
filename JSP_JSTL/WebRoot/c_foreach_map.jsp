<%@page import="com.pas.domain.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>My JSP 'c_foreach_map.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
</head>

<body>
	<%
   Map map=new HashMap();
   Set set=new HashSet();
   //map.put("a", "1");
   //map.put("b", "2");
   //map.put("c", "3");
   User u=new User();
   u.setId(12);
   u.setName("哈哈哈");
   map.put("u1", u);
      User u1=new User();
   u1.setId(12);
   u1.setName("哈哈哈");
   map.put("u2", u);
   
   set.add(u);
   set.add(u1);
   request.setAttribute("map", map);
   request.setAttribute("set", set);
    %>
	<c:forEach items="${map }" var="p">
    	${p.key }　${p.value.name  }<br>
	</c:forEach>
	<c:forEach items="${set }" var="s">
    	${s.name }　${s.id  }<br>
	</c:forEach>
	
	判空<br>
	<c:if test="${empty aa}">
		是空
	</c:if>
</body>
</html>
