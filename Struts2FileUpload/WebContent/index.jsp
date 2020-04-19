<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Upload</title>
</head>
<body>
  <s:form action="fileUpload" method="post" enctype="multipart/form-data">
  <center> <h1><u>File Upload Example</u></h1> </center>
  <s:file name="userImage" label="Upload File" />
  <s:submit/>
  </s:form>
</body>
</html>