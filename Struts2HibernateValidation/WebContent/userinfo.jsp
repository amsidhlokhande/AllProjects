<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Information Page</title>
</head>
<body bgcolor="pink">
   <s:form action="saveUserInfo.action">
        <s:hidden name="id"/>
        <s:textfield name="user" label="User Name"/>
        <s:password name="password" label="Password"/>
        <s:radio list="{'M','F'}" name="gender" label="Gender"/>
        <s:select list="{'INDIA','PAKISTAN','SRI LANKA','BAGLADESH'}" headerKey=""
         headerValue="Country" name="country" label="Select a Country"/>
        <s:checkbox name="mailingList" label="Would you like to join mailing list"></s:checkbox>
        <s:submit></s:submit>
   </s:form>
   <s:if test="listUserInfo.size > 0">
     
      <table align="center" cellpadding="2" cellspacing="2" border="2">
           <tr>
                 <th>UserName</th>
                 <th>Gender</th>
                 <th>Country</th>
                 <th>About You</th>
                 <th>Mailing List</th>
           </tr>
           <s:iterator value="listUserInfo" id="listUserInfo">
               <tr>
                  <td><s:property value="listUserInfo.name"/></td>
                  <td><s:property value="listUserInfo.gender"/></td>
                  <td><s:property value="listUserInfo.country"/></td>
                  <td><s:property value="listUserInfo.aboutYou"/></td>
                  <td><s:property value="listUserInfo.mailingList"/></td>
               </tr>
           </s:iterator>
           
      </table>
      
   </s:if>
</body>
</html>