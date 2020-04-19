<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>............UserInfo...........</title>
</head>
<body>
<form:form action="addUser" modelAttribute="user">
	<table>
		<tr>
			<td>User ID :</td>
			<td><form:input path="userId"></form:input></td>
		</tr>
		<tr>
			<td>User Name :</td>
			<td><form:input path="userName"></form:input></td>
		</tr>
		<tr>
			<td>Mobile Number:</td>
			<td><form:input path="mobileNumber"></form:input></td>
		</tr>
		<tr>
			<td>User DateOfBirth</td>
			<td><form:input path="userDob"></form:input></td>
		</tr>
		<tr>
			<td>Email ID</td>
			<td><form:input path="emailId"></form:input></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="Submit" /></td>
		</tr>
	</table>
</form:form>

<c:if test="${not empty userList}">
	<table>
		<tr>
			<th>User Id</th>
			<th>User Name</th>
			<th>Mobile Number</th>
			<th>Date Of Birth</th>
			<th>Email Id</th>
		</tr>
		<c:forEach items="${userList}" var="u">
			<tr>
				<td><c:out value="${u.userId}" /></td>
				<td><c:out value="${u.userName}" /></td>
				<td><c:out value="${u.mobileNumber}" /></td>
				<td><c:out value="${u.userDob}" /></td>
				<td><c:out value="${u.emailId}" /></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>