<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Conflicting Style Example</title>
  <style type="text/css">
       a.nodec{
         text-decoration: none
       }
       a:hover{
         text-decoration: underline;
         color: red;
         background-color: #ccffcc
       }
       li em{
         color: red;
         font-weight: bold
       }
       ul{
         margin-left: 75px
       }
       
       ul ul{
         text-decoration: underline;
         margin-left: 15px;
         color: pink
       }
       
  </style>
</head>

<body>
    <h1>Shopping list for <em>Monday</em> :</h1>
    <ul>
       <li>Milk</li>
       <li>Bread
          <ul>
             <li>White Bread</li>
             <li>Rey Bread</li>
             <li>Whole White Bread</li>
          </ul>
       </li>
       <li>Rice</li>
       <li>Potatoes</li>
       <li>Pizza <em>with mushrooms</em></li>
    </ul>
    <p><a class="nodec" href="http://www.google.com">Go to google.com</a></p>
</body>
</html>