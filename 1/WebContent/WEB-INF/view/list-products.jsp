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
	
		<div id="content">
		
		
			<!-- add our html table -->
				<table>
					<tr>
						<th>Title</th>
						<th>Price</th>
						<th>Description</th>
					</tr>
			<c:forEach var="tempProduct" items="${products}">
			
				<tr>
					<td> ${tempProduct.title} </td>
					<td> ${tempProduct.price} </td>
					<td> ${tempProduct.description} </td>
				</tr>
			
			</c:forEach>	
				
		
				</table>
			
		
		
		
		
		</div>
	
	</div>

</body>

</html>