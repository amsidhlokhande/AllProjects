<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<h2>Add User Data</h2>
	<form:form method="POST" modelAttribute="user" action="/register">
		<table>
			<tr>
				<td><input type="hidden" value="${user.userId}" id="userId" />
				<td><form:hidden path="userId" id="userId" /></td>
			</tr>

			<tr>
				<td><form:label path="username">User Name</form:label></td>
				<td><form:input path="username" value="${user.username}" /></td>
			</tr>

			<tr>
				<td><form:label path="enabled">User Enabled</form:label></td>
				<td><form:input path="enabled" value="${user.enabled}" /></td>
			</tr>

			<tr>
				<td><input type="hidden" value="${user.userRoles.roleId}"
					id="roleId" />
				<td><form:hidden path="roleId" id="roleId" /></td>
			</tr>
			<tr>
				<td><form:label path="role">User Role</form:label></td>
				<td><form:input path="role" value="${user.userRoles.role}" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

	<c:if test="${! empty users}">
		<table align="left" border="1">
			<tr bgcolor="pink">
				<th align="center">USER ID</th>
				<th align="center">USER NAME</th>
				<th align="center">USER ENABLED</th>
				<th align="center">USER ROLE</th>

			</tr>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.userId}</td>
					<td>${user.username}</td>
					<td>${user.enabled}</td>
					<td>${user.userRoles.role}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>