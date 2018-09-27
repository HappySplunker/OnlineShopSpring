<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>

<title>List Products</title>

	<link type="text/css" rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/style.css" />
	
	
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Games</h2>
		</div>
	</div>
	
	<div id="container">
	
	<!-- put new button: Add Product -->
	
	<input type="button" value="Add Product" 
			onclick="window.location.href='showFormForAdd'; return false;"
			class="add-button"
	/>
	
		<div id="content">
		
		
			<!-- add our html table -->
				<table>
					<tr>
						<th>Title</th>
						<th>Price</th>
						<th>Description</th>
						<th>Action</th>
					</tr>
			<c:forEach var="tempProduct" items="${products}">
			
				<!-- construct an "update" link with customer id -->
				
				<c:url var="updateLink" value="/product/showFormForUpdate">
						<c:param name="productId" value="${tempProduct.id}" />
				</c:url>
					
				<tr>
					<td> ${tempProduct.title} </td>
					<td> ${tempProduct.price} </td>
					<td> ${tempProduct.description} </td>
					<td> <a href="${updateLink}">Update</a> </td>
				</tr>
			
			</c:forEach>	
				
		
				</table>
			
		
		
		
		
		</div>
	
	</div>

</body>

</html>