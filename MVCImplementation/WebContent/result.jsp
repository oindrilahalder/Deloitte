<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.cms.deloitte.controller.CustomerController" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> These are the following details of customer:</h2>

<% out.println(session.getAttribute("custDetails")); %>


</body>
</html>