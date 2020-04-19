<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EMPLOYEE MANAGEMENT</title>
</head>

<body>
   
    <form:form action="action.do" method="post" commandName="employee">
          <table align="center" border="2" bgcolor="pink">
             <tr>
                <td>Employee ID :</td>
                <td><form:input path="empId" readonly="true" disabled="true"/></td>
             </tr>
             
             <tr>
                <td>Employee Name :</td>
                <td><form:input path="empName"/> </td>
             </tr>
             <tr>
                <td>Company Name :</td>
                <td><form:input path="companyName"/></td>
             </tr>
             <tr>
                <td>Joining Date:</td>
                <td><form:input path="joiningDate"/></td>
             </tr>
             <tr>
                <td>Mobile Number :</td>
                <td><form:input path="mobileNumber"/></td>
             </tr>
             <tr>
                <td>Email ID :</td>
                <td><form:input path="emailId"/></td>
             </tr>
             <tr>
                <td>Address :</td>
                <td><form:input path="address"/></td>
             </tr>
             <tr>
                <td colspan="2" align="center">
                 <input type="submit" name="myAction" value="add"/>
                 <input type="submit" name="myAction" value="update"/>
                 <input type="submit" name="myAction" value="delete"/>
                 <input type="submit" name="myAction" value="search"/>
                </td>
             </tr>
          </table>
   </form:form>
    
   <h3 align="center">List Of Students</h3>
   <c:if test="${!empty employeeList}">
      
      <table align="center" border="2" bgcolor="pink">
          <tr>
             <th>EMPLOYEE ID</th>
             <th>EMPLOYEE NAME</th>
             <th>JOINING DATE</th>
             <th>CONATCT NUMBER</th>
             <th>EMAILID</th>
             <th>ADDRESS</th>
          </tr>
          <c:forEach items="${employeeList}" var="employee">
          <tr>
             <td>${employee.empId}</td>
             <td>${employee.empName}</td>
             <td>${employee.joiningDate}</td>
             <td>${employee.mobileNumber}</td>
             <td>${employee.emailId}</td>
             <td>${employee.address}</td>
          </tr>
          </c:forEach>
      </table>
   </c:if>
</body>
</html>
