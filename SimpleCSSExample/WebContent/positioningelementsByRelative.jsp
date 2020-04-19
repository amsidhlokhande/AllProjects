<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Positioning Elements By Relative</title>
  <style type="text/css">
     p{
       font-size: 1.3em;
       font-family: verdana, arial, sans-serif
     }
     span{
       color: red;
       font-size: 0.6em;
       height: 1em
     }
     .super{
       position: relative;
       top: -1ex
     }
     .sub{
       position: relative;
       bottom: -1ex
     }
     .shiftleft{
       position: relative;
       left: -1ex
     }
     .shiftright{
      position: relative;
      right: -1ex
     } 
  </style>
</head>
<body>
  <p>The text at the end of this sentence
  <span class="super">is in superscript</span>
  </p>
  
  <p>The text at the end of this sentence
  <span class="sub">is in subscript</span>
  </p>
  
  <p>The text at the end of this sentence
  <span class="shiftleft">is shifted left</span>
  </p>
  
  <p>The text at the end of this sentence
  <span class="shiftright">is shifted right</span>
  </p>
  
</body>
</html>