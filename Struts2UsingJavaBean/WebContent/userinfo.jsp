<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <s:head/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Info Page</title>
</head>
<body bgcolor="pink">
  <table>
      <tr class="header">
         <th>Name</th>
         <th>Age</th>
         <th>Sex</th>
         <th>Hobbies</th>
         <th>Country</th>
      </tr>
      <tr>
         <td><s:property value="user.name"/></td>
         <td><s:property value="user.age" /> </td>
         <td><s:property value="user.sex" /> </td>
         <td><s:property  value="user.hobbies"/></td>
         <td><s:property value="user.country" /></td>
      </tr>
  </table>
</body>
</html>