<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring Pagination using Display Tag</title>
    <link rel="stylesheet" type="text/css" href="css/alternative.css">
    <link rel="stylesheet" type="text/css" href="css/displaytag.css">
    <link rel="stylesheet" type="text/css" href="css/maven-base.css">
    <link rel="stylesheet" type="text/css" href="css/maven-theme.css">
    <link rel="stylesheet" type="text/css" href="css/print.css">
    <link rel="stylesheet" type="text/css" href="css/screen.css">
    <link rel="stylesheet" type="text/css" href="css/site.css">
    <link rel="stylesheet" type="text/css" href="css/teststyles.css">
	
</head>
<body>
<form:form commandName="person" action="" method="post"> 
<h2>Spring Pagination using Display Tag</h2>
	<!-- To change column style please form this classes ISIS OR ITS OR Mars OR Simple OR Report OR Mark Column 
	We have chosen style class="its"-->
    <display:table export="true"  name="person.personList" requestURI="/paginationDisplayTag.web" pagesize="15" class="its" >
        <display:column property="name" title="Name" sortable="true"   />
        <display:column property="position" title="Position" sortable="true"  />
        <display:column property="salary" title="Salary" sortable="true"  />
        <display:column property="location" title="Location" sortable="true"  />
        <display:column property="phone" title="Phone" sortable="true"  />
    </display:table>

</form:form>
</body>
</html>