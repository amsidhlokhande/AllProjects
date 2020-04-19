<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Radio Button Tag Example</title>
 <style type="text/css">@import url(css/main.css);</style>
 <s:head/>
</head>
<body>
   <div id="global" style="width:450px">
       <s:form action="selectInterest">
            <s:checkboxlist name ="interest" list="interests" listKey="id" listValue="description" label="Select You Interest Cities"/>
           <s:submit/>
       </s:form>
</body>
</html>