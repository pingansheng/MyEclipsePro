<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function logincheck()
		{
			var userid=document.getElementById("userid").value.trim();
			var passwd=document.getElementById("passwd").value.trim();
			if (userid.length==0||passwd.length==0) {
				alert("no");
				return false;
			}
		}
	
	</script>
</head>

<body>
	<!-- struts2标签不需要.action -->
	<s:form action="login" method="post" theme="simple" onsubmit="return logincheck();">
		用户名：<s:textfield name="userid" label="用户ID" id="userid"></s:textfield><br>
		密　码：<s:password name="password" label="密　码" id="passwd"></s:password><br>
		<s:submit label="提交"></s:submit>
	</s:form>
</body>
</html>