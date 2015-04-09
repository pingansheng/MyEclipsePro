<%@ page language="java" import="java.util.*,com.pas.domain.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>My JSP 'c_if.jsp' starting page</title>
</head>

<body>
	<h1>c if使用</h1>
	<%
   		request.setAttribute("a", "helloa");
   		request.setAttribute("age", 99);
   		
   		User u=new User();
   		u.setId(12);
   		u.setName("ping");
   		request.setAttribute("user", u);
     %>
	<h1>字符串判断 </h1>
	<c:if test="${a=='hello'}">
     	ok a=='hello'
     </c:if>
	<c:if test="${a!='hello' }">
     	err a!='hello'
     </c:if>
	<h1>判断数值 el自动转换</h1>
	<br>
	<c:if test="${age>99 }">
     	age ok >99
     </c:if>
	<c:if test="${age<=99 }">
     	age ok <=99
     </c:if>
	<br>
	<c:if test="${age>50 and age<199 }">
     	age>50 and age<199
     </c:if>

	<h1>判断对象属性</h1>
	<c:if test="${user.id>3 }">
		id > 3
	</c:if>
</body>
</html>
