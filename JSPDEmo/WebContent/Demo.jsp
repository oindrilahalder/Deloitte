<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

<%@ include file="Quote.jsp" %>
<%@ include file="First.jsp" %>
<h1>This is a demo page</h1>
<jsp:include page="Second.jsp"></jsp:include>
<jsp:forward page="Quote.jsp"></jsp:forward>
</body>
</html>