<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'res.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<s:debug></s:debug>
	应用路劲：${pageContext.request.contextPath }
	<h1>EL表达式</h1>
	username:${requestScope.username }
	<br> password:${requestScope.password }
	<br>

	<h1>Struts2标签</h1>

	<li>直接引用值栈里面的数据</li>
	<br> username:
	<s:property value="username" />
	<br> password:
	<s:property value="password" />
	<br>

	<li>访问Action中对象的属性user.username</li>
	<br> User:
	<br> username:
	<s:property value="user.username" />
	<br> password:
	<s:property value="user.password" />
	<br>

	<li>访问Action中普通对象的普通方法: <s:property value="user.getNameLength()" />
	</li>
	<br>

	<li>访问Action中的普通方法:<s:property value="check()" /></li>
	<br>
	<textarea rows="5" cols="80" style="color: red">
		在我们访问静态方法的时候，需要使用@符号，跟上完整的类名，然后在跟@符号，加上具体的静态方法或者属性
		在OGNL中使用@@符号可以直接使用Math类的方法，使用方法是@@+对应的Math方法 若要使用静态方法调用需要打开 
		<constant name="struts.ognl.allowStaticMethodAccess" value="true"></constant>
		</textarea>
	<br>
	<li>访问静态方法：<s:property value="@com.pas.action.OGNLAction@s()" />
	</li>
	<li>访问静态属性：<s:property value="@com.pas.action.OGNLAction@SVAR" />
	</li>
	<li>访问Math类的静态方法：<s:property value="@@floor(44.56)" />
	</li>
	<hr />
	<li>访问普通类的构造方法：<s:property value="new com.pas.action.User(8)" />
	</li>
	<hr />
	<li>访问List:<s:property value="users" />
	</li>
	<li>访问List中某个元素:<s:property value="users[1]" />
	</li>
	<li>访问List中元素某个属性的集合:<s:property value="users.{age}" />
	</li>
	<li>访问List中元素某个属性的集合中的特定值:<s:property value="users.{age}[0]" /> |
		<s:property value="users[0].age" />
	</li>
	<li>访问Set:<s:property value="dogs" />
	</li>
	<li>访问Set中某个元素<font color="red">由于set中无序所以不可用下标访问,可使用dogs.toArray()[0]</font>:<s:property
			value="dogs.toArray()[0]" />
	</li>
	<li>访问Map:<s:property value="cats" />
	</li>
	<li>访问Map中某个元素:<s:property value="cats.cat1" /> | <s:property
			value="cats['cat1']" /> | <s:property value="cats[\"cat1\"]" />
	</li>
	<li>访问Map中所有的key:<s:property value="cats.keys" />
	</li>
	<li>访问Map中所有的value:<s:property value="cats.values" />
	</li>
	<li>访问容器的大小：<s:property value="cats.size()" /> | <s:property
			value="users.size" /></li>
	<hr />
	<!-- ？表示选择某一个，这个表示选择user.age=1的所有的user中的第一个 -->
	<li>投影(过滤)：<s:property value="users.{?#this.age==1}[0]" />
	</li>
	<!-- ^表示第一个，这个表示选择user.age>1的第一个user的age属性 -->
	<li>投影：<s:property value="users.{^#this.age>1}.{age}" />
	</li>
	<!-- $表示最后一个，这个表示选择user.age>1的最后一个user的age属性 -->
	<li>投影：<s:property value="users.{$#this.age>1}.{age}" />
	</li>
	<li>投影：<s:property value="users.{$#this.age>1}.{age} == null" />
	</li>
	<hr />
	<li>[0]表示访问值栈中的ACtion对象，下标代表顺序 自上向下，当前访问的Action永远在栈顶:<s:property value="[0].username" />
	</li>

</body>
</html>
