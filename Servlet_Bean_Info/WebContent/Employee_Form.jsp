<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Form</title>
</head>
<body bgcolor="pink">
<center><h1>Employee Input Page</h1></center>
     <form action="login" method="post">
         <table border="2" align="center">
          <tr>
             <td>Employee Code:</td>
             <td><input type="text" name="empCode"></td>
          </tr>
          <tr>
             <td>Employee Name:</td>
             <td><input type="text" name="empName"></td>
          </tr>
          <tr>
             <td>Department:</td>
             <td><input type="text" name="department"></td>
          </tr>
          <tr>
             <td>Joining Date</td>
             <td><input type="text" name="joiningDate"></td>
          </tr>
          <tr>
             <td colspan="2" align="center"><input type="submit" value="Submit"></td>
          </tr>
          
          
          
          
          </table>
     </form>
</body>
</html>