<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>

<c:forEach begin="1" end ="5" step="1" var="i">
<h1>${i}</h1>
</c:forEach>

<hr/>
	<%
	for(int i=1;i<=5;i++)
	{
	%>
	<h1><%=i%></h1>
	<%
	}
	%>

</body>
</html>