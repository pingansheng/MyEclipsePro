<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  	<script type="text/javascript" src="jquery/jquery-1.10.2.js"></script>
	<script type="text/javascript">
		function getInfo() {
			$.post("getxmlinfo.action", 
			{
					name:$("#name").val()
			},function(returnedData,status)
			{
				if("success"==status)
				{
					var id=$(returnedData).find("id").text();
					var name=$(returnedData).find("name").text();
					var age=$(returnedData).find("age").text();
					var address=$(returnedData).find("address").text();
					var html="<table width='60%' border='1'><tr><th>编号</th><th>姓名</th><th>年龄</th><th>地址</th></tr><tr><td>"+id+"</td><td>"+name+"</td><td>"+age+"</td><td>"+address+"</td></tr></table>";
					
					$("#body1 table").remove();
					$("#body1").append(html);
					
				}
			}
			);
		}
		
	</script>
	
	</head>
  
  <body id="body1">

	<select id="name">
		<option value="zhangsan">张三</option>
		<option value="lisi">李四</option>
		<option value="wangwu">王五</option>
	</select>
	<input type="button" value="获取信息" onclick="getInfo();">
	
  </body>
</html>
