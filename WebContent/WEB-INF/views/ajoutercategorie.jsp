<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- taglib form de spring mvc -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>formulaire d'ajout</title>
</head>
<body>
	<div align="center">
		<h1>Ajout d'un nouveau fonctionnaire</h1>

		<div align="center">
			<table>
				<form:form modelAttribute="categorieCommand"
					action="${pageContext.request.contextPath}/categories/add"
					method="post">
					
					<tr>
						<td><form:label path="idCategorie">idCategorie : </form:label></td>
						<td><form:input path="idCategorie" /></td>
					</tr>
					
					<tr>
						<td><form:label path="nomCatagorie">nomCategorie : </form:label></td>
						<td><form:input path="nomCategorie" /></td>
					</tr>

					<tr>
						<td><form:label path="photo">Photo: </form:label></td>
						<td><form:input path="photo" /></td>
					</tr>
					
					<tr>
						<td><form:label path="description">Description: </form:label></td>
						<td><form:input path="description" /></td>
					</tr>

					<tr>
						<td colspan="2"><input type="submit" value="ajouter" /></td>
					</tr>
				</form:form>
			</table>
		</div>
	</div>
</body>
</html>