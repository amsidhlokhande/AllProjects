<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Page</title>
</head>
<body bgcolor="red">
    Registration failed.Due to following problem
    <hr color="pink">
    <br>
    ${exception}<br>
    <a href="http://localhost:8080/Struts2UITags/populateRegister.action">Back</a>
          
</body>
</html>