<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product form</title>
</head>
<body>
<center>Product Details</center>
	<table border=2 align="center" cellspacing="10">
		<th>Product ID</th>
		<th>Product Name</th>
		<th>Price</th>
		<th>QOH</th>
		<th>Edit</th>
		<th>Delete</th>
			<c:forEach items = "${allProducts}" var ="product">
			<tr>
				<td><c:out value="${product.productId}"></c:out></td>
				<td><c:out value="${product.productName}"></c:out></td>
				<td><c:out value="${product.price}"></c:out></td>
				<td><c:out value="${product.qoh}"></c:out></td>
				<td><a href="<c:url value='/editProduct/${product.productId}'/>">Edit</a></td>
				<td><a href="<c:url value='/deleteProduct/${product.productId}'/>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/><br/>
<f:form modelAttribute="product">
	<form >
		<table cellspacing="10" cellpadding="10" border="0" align="center">
			<caption>Product Form</caption>
			<tr>
				<td>Product ID :</td>
				<td><f:input path="productId" name="productId" id="productId" placeholder="Enter ID"/></td>
				<td><span id="errorProductId"></span></td>
				
				
			</tr>
			<tr>
				<td>Product Name :</td>
				<td><f:input path="productName" placeholder="Enter Name" name="productName" id="productName" /></td>
				<td><span id="errorProductName"></span></td>
			</tr>
			<tr>
				<td>Price :</td>
				<td><f:input path="price" name="price"
					id="price" placeholder="Enter Price"/></td>
				<td><span id="errorPrice"></span></td>
			</tr>
			<tr>
				<td>Quantity :</td>
				<td><f:input path="qoh" name="qoh" id="qoh" placeholder="Enter Quantity"/></td>
				<td><span id="errorQoh"></span></td>
			</tr>
			<tr>
				<td align="center" colspan=2>
					<c:if test="${!empty product.productName}">
						<input type="submit" formaction="add/update" 
						value="<spring:message text ="Edit Product"/>"/>
					</c:if>
					<c:if test="${empty product.productName}">
						<input type="submit" formaction="saveProduct" value="<spring:message text ="Add Product"/>"/>
					</c:if>
				</td>
			</tr>	
		</table>
		<div id=display align="center"></div>
	</form>
	</f:form>
</body>
</html>

