<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<portlet:actionURL var="submitone" name="submit">
</portlet:actionURL>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Hello portlet</h3>
<form:form action="${submitone}" htmlEscape="false" id="userBeanForm"
	modelAttribute="userBean">
Name : <form:input path="name"></form:input>
	<form:label path="name" ></form:label>
	<input type="submit" value="submit"/>
</form:form>
</body>
</html>