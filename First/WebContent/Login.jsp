<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html">
<html>
<head>
<meta  charset="utf-8">
<title>ma page de login</title>
<link rel='stylesheet' href='style.css'>
</head>
<body>
<h1>Please connect you</h1>
<h2><%=new Date() %></h2>
<% for(int i=1;i<=6;i++) { %>
<h<%=i %>>titre de niveau <%=i %></h<%=i %>>
<%} %>
</body>
</html>