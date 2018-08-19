<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<div align="center">

			<h1 style="background-color: lightgreen; color: darkgreen">Liste des produits</h1>
	
			<table cellspacing="0" cellpadding="6" border="1" width="50%">
				<tr>
					<td colspan="8" align="right"><a
						href="${pageContext.request.contextPath}/addproduitform">Ajouter</a></td>
				</tr>
	
				<tr bgcolor="grey" style="color: white;">
					<th>Identifiant</th>
					<th>Designation</th>
					<th>Description</th>
					<th>Prix</th>
					<th>Quantite</th>
					<th>Selectionne</th>
					<th>Photo</th>
				</tr>
				
				<c:forEach var="prod" items="${listeProd}">
					<tr bgcolor="lightyellow">
						<td>${prod.idProduit}</td>
						<td>${prod.designation}</td>
						<td>${prod.prix}</td>
						<td>${prod.quantité}</td>
						<td>${prod.selectionne}</td>
						<td>${prod.photo}</td>
	
						<td><a
							href="${pageContext.request.contextPath}/delete/${prod.idProduit}">supprimer</a>
						</td>
	
						<td><a
							href="${pageContext.request.contextPath}/updateproduitform?id=${prod.idProduit}">update</a>
						</td>
	
					</tr>
				</c:forEach>
	
			</table>
		</div>
	</body>
</html>