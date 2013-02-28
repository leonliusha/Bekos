<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bekos</title>
</head>
<body>
<h2>Contact Manager</h2>
<form:form method="post" action="add.html" commandName="member">
	<table>
		<tr>
			<td><form:label path="firstName"><spring:message code="label.firstname" /></form:label></td>
			<td><form:input path="firstName" /></td>
		</tr>
		<tr>
			<td><form:label path="lastName"><spring:message code="label.lastname" /></form:label></td>
			<td><form:input path="lastName" /></td>
		</tr>
		<tr>
			<td><form:label path="email"><spring:message code="label.email" /></form:label></td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td><form:label path="telephone"><spring:message code="label.telephone" /></form:label></td>
			<td><form:input path="telephone" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="<spring:message code='label.addmember'/>" />
			</td>
		</tr>
	</table>
</form:form>

<h3>Members</h3>
<c:if test="${!empty memberList}">
	<table class="data">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Telephone</th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${memberList}" var="member">
			<tr>
				<td>${member.lastname}, ${member.firstname}</td>
				<td>${member.email}</td>
				<td>${member.telephone}</td>
				<td><a href="delete/${member.id}">delete</a></td> 
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>