<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>

	


	<link type="text/css" rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/style.css" />
			
	<link type="text/css" rel="stylesheet"
			href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />

</head>
	
<body>
		
		<title>Save Product</title>
		
	<div id="wrapper">
		<div id="header">
			<h2>Product List</h2>			
			
		</div>
	</div>

	<div id="container">
		<h3>Add Product</h3>
		
			<form:form action="saveProduct" modelAttribute="product" method="POST">
			
			<!-- need to assosiate this data with product id -->
			<form:hidden path="id" />
			
				<table>
					<tbody>
						<tr>
							<td><label>Title</label></td>
							<td><form:input path="title" /></td>
						</tr>				
					
						<tr>
							<td><label>Price</label></td>
							<td><form:input path="price" /></td>
						</tr>
												
						<tr>
							<td><label>Description</label></td>
							<td><form:input path="description" /></td>
						</tr>
						
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Save" class="save" /></td>
						</tr>
					
					</tbody>
								
				</table>
				
			</form:form>
			
			<div style="clear; both;"></div>
			
			<p>
				<a href="${pageContext.request.contextPath}/product/list ">Back to List</a>
			</p>
			
	</div>




</body>


</html>