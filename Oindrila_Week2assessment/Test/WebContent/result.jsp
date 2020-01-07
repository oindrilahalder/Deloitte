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
		String name = (String) session.getAttribute("name");
		String quest1 = (String) session.getAttribute("quest1");
		String quest2 = (String) session.getAttribute("quest2");
		String quest3 = (String) session.getAttribute("quest3");

		int sum=0;
	%>

	<%= name + " , below is your scores " %>
	<table border="2">
		<th>Your Answer</th>
		<th>Correct Answer</th>
		<th>Score</th>
		<tr>
			<td><%= quest1 %></td>
			<td>A</td>
			<td>
			<% 
				if(quest1.equals("A")) 
				{
					sum += 10;
					out.println("10");
				}
				else
				{
					out.println("0");
				}
				%>
			</td>
		</tr>
		<tr>
			<td><%= quest2 %></td>
			<td>B</td>
			<td>
			<% 
				if(quest2.equals("B")) 
				{
					sum += 10;
					out.println("10");
				}
				else
				{
					out.println("0");
				}
				%>
			</td>
		</tr>
		<tr>
			<td><%= quest3 %></td>
			<td>B</td>
			<td>
			<% 
				if(quest3.equals("B")) 
				{
					sum += 10;
					out.println("10");
				}
				else
				{
					out.println("0");
				}
				%>
			</td>
		</tr>
	</table>
	
	<h1>Your total score is : <%= sum %></h1>
</body>
</html>