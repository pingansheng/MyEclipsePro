<%@ page language="java" import="java.util.*,java.text.DateFormat,java.text.SimpleDateFormat" pageEncoding="UTF-8"%>

  <%

  	out.println("时间，"+new SimpleDateFormat("yyyy年MM月dd日，HH时mm分ss秒").format(new Date()));

   %>
