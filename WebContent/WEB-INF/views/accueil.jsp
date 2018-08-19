<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Accueil</title>
	</head>
	<body>
	<!-- recuperation du titre renvoyé par le controller avec la clé titreKey -->
		<h1
			style="background-color: lightgreen; color: darkgreen; text-align: center;">
			${titreKey}</h1>
	
		<!-- recupration du message renvoyé par le controller avec la clé messageKey -->
		<h2 style="color: orange; text-align: center;">${messageKey}</h2>
	
		<!-- recupration de la date renvoyé par le controller avec la clé todayKey -->
		<h2 style="color: blue; text-align: center">
			Nous somme le
			<fmt:formatDate value="${todayKey}" pattern="dd-MM-yyyy" />
			<br /> il est
			<fmt:formatDate value="${todayKey}" type="time" timeStyle="short" />
	
		</h2>
		
		<!-- 
		<a href="/eboutique">Accès sans authentification</a>
		
		<a href="/eboutique/produits">Accès avec authentification</a>
		
		<a href="/eboutique/categories">Accès avec authentification</a>
		-->
	</body>
</html>