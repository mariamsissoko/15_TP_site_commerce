<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire de modification de mise a jour</title>
</head>
<body>
	<form:form modelAttribute="produitUpCommand"
		action="${pageContext.request.contextPath}/produits/update"
		method="post">

		<table width="50%">

			<tr>
				<td></td>
				<td><form:hidden path="idProduit" /></td>
			</tr>
			
			<tr>
				<td><form:label path="designation">Designation : </form:label></td>
				<td><form:input path="designation" /></td>
			</tr>

			<tr>
				<td><form:label path="description">Description : </form:label></td>
				<td><form:input path="description" /></td>
			</tr>

			<tr>
				<td><form:label path="prix">Prix : </form:label></td>
				<td><form:input path="prix" /></td>
			</tr>

			<tr>
				<td><form:label path="quantite">Quantite : </form:label></td>
				<td><form:input path="quantite" /></td>
			</tr>

			<tr>
				<td><form:label path="selectionne">Selectionne : </form:label></td>
				<td><form:input path="selectionne" /></td>
			</tr>
					
			<tr>
				<td><form:label path="selectionne">Selectionne : </form:label></td>
				<td><form:input path="selectionne" /></td>
			</tr>
					
			<tr>
				<td><form:label path="photo">Photo : </form:label></td>
				<td><form:input path="photo" /></td>
			</tr>
					
			<tr>
				<td><form:label path="categorieId">CategorieId : </form:label></td>
				<td><form:input path="categorieId" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="modifier">
				</td>
			</tr>

		</table>

	</form:form>
</body>
</html>