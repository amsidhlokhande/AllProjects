<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/WEB-INF/displaytag.tld" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Info Page</title>
<title>ATD Table</title>
        <style type="text/css" >
          
         table.mytable 
         { 
         border-collapse: collapse; 
         border: 5px solid #839E99;   
         background-color:pink;
         font: 15, "Times New Roman", Times, serif; 
         color: black; 
         
         }  
         .mytable caption 
         { 
         font-size: 1.3em; 
         font-weight: bold; 
         text-align: left; 
         padding: 1em 4px; 
         }  
         .mytable td, th 
         { 
         padding: 1px 1px .25em 1px; 
         line-height: 1em; 
         border: 3px solid #839E99; 
         border-color: black;
         font: bold;
         
         }  
         .mytable th 
         { 
         
         color:gray; font-weight: bold; 
         text-align: left; 
         padding-right: .5em; 
         vertical-align: top; 
         }  
         .mytable thead th 
         { 
         
         text-align: center; 
         padding-left:1.0cm;
         padding-right: 1.0cm;
        }  
         
        </style>
</head>
<body>
  <center><h1>Employee Inofrmation Page</h1></center>

  <div align="center">
    <form action="saveEmp" method="post">
      <table align="center">
        <tr>
          <td align="left">User Name:</td>
          <td><input type="text" name="userName"> </td>
        </tr>
        <tr>
          <td align="left">Password:</td>
          <td><input type="password" name="password"/></td>
        </tr>
        <tr>
          <td align="left">Employee Code:</td>
          <td><input type="text" name="empcode"></td>
        </tr>
        <tr>
          <td align="left">Employee Full Name:</td>
          <td><input type="text" name="empfullname"></td>
        </tr>
        <tr>
          <td align="left">Department:</td>
          <td><input type="text" name="empdepartment"></td>
        </tr>
        <tr>
          <td align="left">Email:</td>
          <td><input type="text" name="empemailid"></td>
        </tr>
        <tr>
          <td align="left">Mobile Number:</td>
          <td><input type="text" name="empmobilenumber"></td>
        </tr>
        <tr>
          <td align="center" colspan="2"><input type="Submit" Value="Sumbit"><input type="reset" value="Reset"/></td>
          
        </tr>
      </table>
    </form>
   <!-- 
   <s:form action="saveEmp">
    <s:textfield name="username" label="User Name" size="50" />
    <s:password name="password" label="Password"/>
    <s:textfield name="empcode" label="Employee Code" size="50" />
	<s:textfield name="empfullname" label="Employee Full Name" size="50" />
	<s:textfield name="empdepartment" label="Department" size="20" />
	<s:textfield name="empemailid" label="Email" size="50" />
	<s:textfield name="empmobilenumber" label="Mobile Number" size="13" />
	<s:submit/>
   </s:form>
  </div>
   -->
<!-- 
 <s:if test="listEmp.size() > 0">
	<div class="content">
	<table class="myTable" cellpadding="5px" class="mytable">
		<tr class="even">
			<th>UserName</th>
			<th>Employee Code</th>
			<th>Employee Name</th>
			<th>Department</th>
			<th>Email</th>
			<th>MobileNumber</th>
		</tr>
		<s:iterator value="listEmp" status="listStatus">
			<tr
				class="<s:if test="#listStatus.odd == true ">odd</s:if><s:else>even</s:else>">
				<td><s:property value="username" /></td>
				<td><s:property value="empcode" /></td>
				<td><s:property value="empfullname" /></td>
				<td><s:property value="empdepartment" /></td>
				<td><s:property value="empemailid" /></td>
				<td><s:property value="empmobilenumber" /></td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:if>
 -->
<s:if test="listEmp.size() > 0">
<display:table id="data" name="listEmp" requestURI="/listEmp.action" pagesize="500" export="true"  class="mytable" sort="list">
            <display:column property="username" title="UserName" /> 
            <display:column property="empcode" title="Code"/>
            <display:column property="empfullname" title="Name" />
			<display:column property="empdepartment" title="Department" />
			<display:column property="empemailid" title="Email" />
			<display:column property="empmobilenumber" title="MobileNumber" />
			
           <!-- <display:setProperty name="export.excel.include_header" value="true"/>  -->
            <display:setProperty name="export.excel.filename" value="empInfo.xls"/>
            <display:setProperty name="export.csv" value="true"/>
            <display:setProperty name="export.pdf" value="true"/>
            <display:setProperty name="export.xml" value="true"/>
            <display:setProperty name="paging.banner.placement" value="bottom" />
           <!-- <display:setProperty name="basic.show.header">true</display:setProperty>  --> 
            <!--<display:setProperty name="basic.empty.showtable">true</display:setProperty> -->
           <!-- <display:setProperty name="basic.msg.empty_list">NO RECORD FOUND</display:setProperty>  -->
            <!--<display:setProperty name="sort.amount">list</display:setProperty> -->
       </display:table>
</s:if>
</body>
</html>