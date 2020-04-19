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
       <s:form action="selectcolors">
        
       <s:updownselect name="colors" label="Colors" size="5" list="#{'1':'Green', '2':'Red', '3':'Yellow'}" />
               
        <s:submit/>
       </s:form>
</body>
</html>