<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Use Of Bean in JSP</title>
</head>
<body>
   <jsp:useBean id="calBean" class="com.amsidh.beans.CalculatorBean"/>
   <jsp:setProperty property="memory" name="calBean" value="4"/>
   <%
      out.println("2*4 = "+calBean.doubleIt(4));
    %>
   <Br>
   <jsp:getProperty property="memory" name="calBean"/> 
</body>
</html>