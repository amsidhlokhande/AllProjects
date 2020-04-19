<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Page</title>
</head>
<body bgcolor="yellow">
  <center>
   <s:form action="User" >
      <s:submit/><br>
      <s:submit action="addUser" value="Add" /><br>
      <s:submit action="updateUser" value="Update"/><br>
      <s:submit action="deleteUser" value="Delete"/>
   </s:form>
  </center>
</body>
</html>