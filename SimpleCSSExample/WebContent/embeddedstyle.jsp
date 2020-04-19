<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>Embedded Style Sheet Example</title>
  <!-- This begins the style sheet section -->
  <style type="text/css">
    em{
        background-color: #8000ff;
        color: white
    }
    h1{
       font-family: arial,sans-serif
    }
    p{
      font-size: 14pt
    }
    .special{
       color: blue
    }
  </style>
</head>
<body>
    <!-- This class attributes applies the .special style -->
    
    <h1 class="special">Details and Associate</h1>
    
    <p>This text applies the p style attribute to it</p>
        
    <h1>This text is applies the h1 style attribute to it</h1>
    
    <p class="special"> This text applies the special and p attribute to it</p>
</body>
</html>