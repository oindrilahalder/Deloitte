<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.deloitte.dao.impl.ProductDAOImpl" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% ProductDAOImpl productdao= new ProductDAOImpl(); 
out.println(productdao.listProduct()); %>

</body>
</html>