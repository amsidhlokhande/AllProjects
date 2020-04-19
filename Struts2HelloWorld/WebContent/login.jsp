<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body bgcolor="pink"> 

    <s:form action="hello" >
        <s:textfield name="userName" label="User Name:" value="User Name"/>
        <s:textfield name="password" label="Password:" value="password"/>
        <s:submit value="Login"/>
    </s:form>
</body>
</html>