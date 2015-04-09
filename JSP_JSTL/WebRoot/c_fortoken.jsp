<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'c_fortoken.jsp' starting page</title>
  </head>
  
  <body>
    <h1>c_fortoken  c:forTokens items="1,2,3,4,5" begin="0" end="4" step="2" delims="," var="item"</h1>
	<c:forTokens items="1,2,3,4,5" begin="0" end="4" step="2" delims="," var="item">
	${item}
	</c:forTokens>
  </body>
</html>
