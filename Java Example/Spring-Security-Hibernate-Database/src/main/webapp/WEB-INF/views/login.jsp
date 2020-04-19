<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>

	<form action="<c:url value='/j_spring_security_check' />" method="post" name="loginForm">
		<table>
		    <tr>
				<td colspan="2" class="error">${message}</td>
			</tr>
			<tr>
				<td>User Name :</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
			  <td colspan="2" align="right"><input type="submit" value="Login"/> <input type="submit" value="Register" onclick="/register"></td>
			</tr>
		</table>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
</body>
</html>