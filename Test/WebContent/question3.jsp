<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Answer3">
<tr>
		
		<td>Question 3 :What is the capital of Rajasthan?</td><td>
<input type="radio" name="quest3" id="quest3" value="A" />A)NewDelhi<br/>
<input type="radio" name="quest3" id="quest3" value="B" />B)Jaipur<br/>
<input type="radio" name="quest3" id="quest3" value="C" />C)Pune<br/>
<input type="radio" name="quest3" id="quest3" value="D" />D)Mumbai<br/>
</td></tr>
<tr>
		<td><input type="submit" value="Next"></td>
	</tr>
</form>
<%
		String quest3 = request.getParameter("quest3");
		session.setAttribute("quest3", quest3);
	%>
</body>
</html>