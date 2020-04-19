<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Patient Information Page</title>
</head>
<body bgcolor="pink">
    <h1 align="center"><u> Patient Application Form </u></h1>
	<form:form action="/operation" method="POST" commandName="patient">
		<table align="center">
			<tr>
				<td><form:label path="patId">Patient ID :</form:label></td>
				<td><form:input path="patId" /></td>
			</tr>
			<tr>
				<td><form:label path="patName">Patient Name :</form:label></td>
				<td><form:input path="patName" /></td>
			</tr>
			<tr>
				<td><form:label path="patAddress">Address :</form:label></td>
				<td><form:input path="patAddress" /></td>
			</tr>
			<tr>
				<td><form:label path="patMobileNumber">Contact Number :</form:label>
				</td>
				<td><form:input path="patMobileNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="doctorName">Doctor Name :</form:label></td>
				<td><form:input path="doctorName" /></td>
			</tr>
			<tr>
				<td><form:label path="problemDescription">Problem Description :</form:label>
				</td>
				<td><form:input path="problemDescription" /></td>
			</tr>
			<tr>
				<td><form:label path="dateOfAdmit">Date Of Admit(ex.18/05/1983)</form:label>
				</td>
				<td><form:input path="dateOfAdmit" /></td>
			</tr>
			<tr>
				<td><form:label path="dateOfDischarge">Date Of Discharge(ex.18/05/1983)</form:label>
				</td>
				<td><form:input path="dateOfDischarge" /></td>
			</tr>
			<tr>
			   <td align="center" colspan="2">
			      <input type="submit" value="Add" />
			   </td>
			</tr>
		</table>
	</form:form>
	<hr color="RED"/>
	<c:if test="${!empty listOfPatient}">
	    <table align="center" bgcolor="skyblue" border="3">
	       <tr align="center" bgcolor="yellow">
	          <th>Patient ID</th>
	          <th>Name</th>
	          <th>Address</th>
	          <th>Contact Number</th>
	          <th>Doctor Name</th>
	          <th>Problem Description</th>
	          <th>Date Of Admit</th>
	          <th>Date Of Discharge</th>
	       </tr>
	       <c:forEach var="p" items="${listOfPatient}">
	          <tr align="left">
	            <td>${p.patId}</td>
	            <td>${p.patName}</td>
	            <td>${p.patAddress}</td>
	            <td>${p.patMobileNumber}</td>
	            <td>${p.doctorName}</td>
	            <td>${p.problemDescription}</td>
	            <td>${p.dateOfAdmit}</td>
	            <td>${p.dateOfDischarge}</td>
	          </tr>
	       </c:forEach>
	       
	    </table>
	</c:if>
</body>
</html>