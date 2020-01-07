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
		String name = request.getParameter("username");
		session.setAttribute("name", name);
	%>

<form action="question1.jsp">
<h1>TEST INSTRUCTION are given below:</h1>
<h2> 1. The total number of questions in the test is 3.</h2>
<h2> 2. Each question carries 10 marks.</h2>
<h2> 3. There are 4 options given for each question.</h2>
<br/>
	<td><input type="submit" value="start test"></td>
	</form>

</body>
</html>