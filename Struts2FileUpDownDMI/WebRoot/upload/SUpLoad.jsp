<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'SUpLoad.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function AddMore()
		{
			var form=document.getElementById("form1");
			var br=document.createElement("br");
			var input=document.createElement("input");
			var button=document.createElement("input");
			
			input.type="file";
			input.name="file";
			button.type="button";
			button.value="Remove";
			
			button.onclick=function()
			{
				form.removeChild(br);
				form.removeChild(input);
				form.removeChild(button);
			}
			
			form.appendChild(br);
			form.appendChild(input);
			form.appendChild(button);
		}
		
	</script>
  </head>
  
  <body>
<h1>Struts2上传文件</h1>
<s:fielderror></s:fielderror>
<s:form id="form1" action="Upload" theme="simple" method="post" enctype="multipart/form-data">
	用户名：<s:textfield name="username"></s:textfield><br>
	文件1：<s:file name="file"></s:file><br>
	文件2：<s:file name="file"></s:file><br>
	<input  type="button" value="Add More" onclick="AddMore()"/>
	<s:submit value="提交"></s:submit>
</s:form>
  </body>
</html>
