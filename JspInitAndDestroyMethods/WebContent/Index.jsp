<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Page</title>
</head>
<body>
  Hi This is the page .Below are init and destroy methods of jsp are written.<br>
  <%!
    public void jspInit()
    {
       System.out.println("This is jspInit() method");
    }
    public void jspDestroy()
    {
      System.out.println("This is jspDestroy() method");
    }
   %>
   
   <%
     out.println("Jsp is very Simple..");
    %>
   
</body>
</html>