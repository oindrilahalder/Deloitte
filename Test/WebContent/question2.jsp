<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Answer2">
<tr>
		
		<td>Question 2 :What is the capital of Karnataka?</td><td><br/>
<input type="radio" name="quest2" id="quest2" value="A" />A)NewDelhi<br/>
<input type="radio" name="quest2" id="quest2" value="B" />B)Bangalore<br/>
<input type="radio" name="quest2" id="quest2" value="C" />C)Jaipur<br/>
<input type="radio" name="quest2" id="quest2" value="D" />D)Mumbai<br/>
</td></tr>
<tr>
		<td><input type="submit" value="Next"></td>
	</tr>
</form>
<%
		String quest2 = request.getParameter("quest2");
		session.setAttribute("quest2", quest2);
	%>

</body>
</html>