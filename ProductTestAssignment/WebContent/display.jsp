<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h2>These are the following details of product</h2>
<% out.println(session.getAttribute("productName")); %>
<br/>
<br/>
<a href = "allProducts.jsp">VIEW ALL PRODUCTS</a>
</body>
</html>