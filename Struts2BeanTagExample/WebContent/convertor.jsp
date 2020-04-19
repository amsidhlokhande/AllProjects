<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Currency Converter Page</title>
</head>
<body>
      <%-- <s:bean name="Beans.CurrencyConvertorBean" >
          <s:param name="dollers" value="100"/>
          Values conversion from Doller to Ruppies
         100 Dollers= <s:property value="ruppies"/> Ruppies.
      </s:bean> --%>
      <s:bean name="Beans.CurrencyConvertorBean"  var="convert">
          <s:param name="dollers" value="100"/>
      </s:bean>
      100 Dolllers=<s:property value="#convert.ruppies"/>
</body>
</html>