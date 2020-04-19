<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Background Image</title>
  <style type="text/css">
  body{
   background-image: url("1.JPG");
   background-position: bottom right;
   background-repeat: no-repeat;
   background-attachment: fixed;
  }
  
  p{
    font-size: 18ft;
    color: red;
    text-indent: 1em;
    font-family: arial,sans-serif
  }
  
  .dark{
  font-weight: bold
  }
  </style>
</head>
<body>
   <p>
      This example uses the background-image,background-position and background-attachement styles to place the <span class="dark">
      &amp; Associates,Inc.</span> 
      logo in the bottom,right corner of the page.Notice how the logo stays in the proper position  
      when you resize the browser windows.
   </p>
</body>
</html>