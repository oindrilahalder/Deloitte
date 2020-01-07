<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int num1=200; %>
<%
String name="Oindrila";
int num2=100;
%>
<h1> Deloitte welcomes you</h1>
Printed via scriplet:<%out.println("welcome "+name); %> <br/>
Printed via expressions: <%= "Welcome "+name %><br/>

Sum of num1 + num2: <%= num1+num2 %>
<%! int p; %>


</body>
</html>