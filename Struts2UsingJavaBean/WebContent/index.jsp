<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <s:head/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User input Details</title> 
</head>
<body bgcolor="yellow">
    <s:form action="userInfo">
      <s:textfield name="user.name" label="User Name"/>
      <s:textfield name="user.age" label="Age"/>
      <s:radio list="{'M','F'}"  name="user.sex" label="Sex"/>
      <s:checkboxlist name="user.hobbies" label="Hobbies" list="{'Music','Arts','Dance'}" />
      <s:select name="user.country" label="Select Contry" list="{'Select','India','Pakistan','USA','Sri Lanka','BanglaDesh'}" />
     
     <s:submit value="Sbumit"/><s:reset/>  
    </s:form>
</body>
</html>