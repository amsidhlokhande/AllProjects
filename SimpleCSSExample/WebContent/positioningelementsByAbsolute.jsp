<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Position Elements in Jsp by CSS</title>
</head>
<body>
  <p>
    <img src="1.JPG" style="position: absolute; top: 0px; left: 0px; z-index: 1" alt="First positioned Image"/>
   
  </p>
  <p style="position: absolute; top: 50px; left: 200px; z-index: 3; font-size: 20pt">Positioned Text</p>
  <p>
     <img src="2.jpg" style="position: absolute; top: 50px; left: 250px; z-index: 2" alt="Second positioned Image"/>
  </p>
</body>
</html>