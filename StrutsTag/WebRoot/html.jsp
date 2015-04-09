<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 引入Struts标签库 -->
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>  
    <title>My JSP 'html.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0"> 
  </head>
  
  <body>
    <html:button property="button1" value="提交"></html:button>
    <!-- checkbox 应放入表单 否则报错 -->
    <html:image src="imgs/hello.jpg" style="width:20px;height:10px"></html:image><br>
    <html:img src="imgs/hello.jpg" style="width:20px;height:10px"/>
    <html:link href="http://www.baidu.com">baidu</html:link>
    
    <!-- 表单 -->
    <!-- 涉及到输入信息 Struts认为输入框内容要与表单类对应，且应放入表单标签内 -->
    <!-- 此表单不带项目名称 -->
    <h1>表单</h1>
    <html:form action="/login.do" method="post">
    <!-- 以下内容必须有Bean中对应属性接收 -->
        <html:text property="name"></html:text>
       	<html:checkbox property="fruit" value="apple">apple</html:checkbox>
    </html:form>

  </body>
</html>
