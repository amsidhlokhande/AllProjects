<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error</title>
</head>
<body>
    <h1>HTTP Status 403 - Access is denied</h1>

	<c:choose>
		<c:when test="${empty pageContext.request.userPrincipal.name}">
			<h2>You do not have permission to access this page!</h2>
		</c:when>
		<c:otherwise>
			<h2>Username : ${pageContext.request.userPrincipal.name} <br/>You do not have permission to access this page!</h2>
		</c:otherwise>
	</c:choose>
    
</body>
</html>