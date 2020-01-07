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
out.println("Welcome "+session.getAttribute("name"));
%>
<form action="Answer1">
<tr>
		
		<td>Question 1 :What is the capital of India?</td><td>
<input type="radio" name="quest1" id="quest1" value="A" />A)NewDelhi<br/>
<input type="radio" name="quest1" id="quest1" value="B" />B)Kolkata<br/>
<input type="radio" name="quest1" id="quest1" value="C" />C)Jaipur<br/>
<input type="radio" name="quest1" id="quest1" value="D" />D)Mumbai<br/>
</td></tr>
<tr>
		<td><input type="submit" value="Next"></td>
	</tr>
</form>
<%
		String quest1 = request.getParameter("quest1");
		session.setAttribute("quest1", quest1);
	%>
</body>
</html>