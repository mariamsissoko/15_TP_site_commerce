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
						href="${pageContext.request.contextPath}/addcategorieform">Ajouter</a></td>
				</tr>
	
				<tr bgcolor="grey" style="color: white;">
					<th>Identifiant</th>
					<th>Nom</th>
					<th>Photo</th>
					<th>Description</th>
				</tr>
				
				<c:forEach var="cat" items="${listeCat}">
					<tr bgcolor="lightyellow">
						<td>${cat.idCategorie}</td>
						<td>${cat.nomCategorie}</td>
						<td>${cat.photo}</td>
						<td>${cat.description}</td>
	
						<td><a
							href="${pageContext.request.contextPath}/delete/${fonct.id}">supprimer</a>
						</td>
	
						<td><a
							href="${pageContext.request.contextPath}/updatecategorieform?id=${listeProd.id}">update</a>
						</td>
	
					</tr>
				</c:forEach>
	
			</table>
		</div>
	</body>
</html>