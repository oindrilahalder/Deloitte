<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i=1;i<=5;i++){
		out.println("<h1> my name is oindrila");
	}
%>
<h1>hello</h1>
<%out.println(new java.util.Date()); %>
<h2>bye thanks</h2>
<%out.println("hello"+(90+90)); %>
</body>
</html>