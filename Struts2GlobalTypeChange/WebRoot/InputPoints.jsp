<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>My JSP 'InputTypeChange.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
</head>

<body>
<h3>使用Struts2.0类型转换 使用,将两个坐标分开</h3>
	<s:form name="convert" action="pointsConvert">
		<s:textfield name="points" label="point1"></s:textfield>
		<s:textfield name="points" label="point2"></s:textfield>
		<s:textfield name="points" label="point3"></s:textfield>
		<s:submit label="提交"></s:submit>
	</s:form>
</body>
</html>
