<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html>
    <head>
        <title>
            Login Page        
        </title>
    </head>
    <body bgcolor="pink">
        <html:errors/>
        <html:form action="/login" >
            <table align="center">
                <tr>
                    <td>Login Name:</td>
                    <td>
                        <html:text name="loginBean" property="userName" />
                    </td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td>
                        <html:password name="loginBean" property="password" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <html:submit value="Login"/><html:reset/>
                    </td>
                </tr>
            </table>
        </html:form>  
    </body>
</html>