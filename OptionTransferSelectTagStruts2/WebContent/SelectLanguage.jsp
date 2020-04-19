<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OptionTransferSelect Tag Example</title>
 <style type="text/css">@import url(css/main.css);</style>
 <s:head/>
</head>
<body>
   <div id="global" style="width:450px">
       <s:form action="selectlanguage">
          <s:optiontransferselect 
            label="Select Language"
            name="language"
            leftTitle="All Language"
            rightTitle="Selected Languages"
            list="{'Marathi','Hindi','Kannada','Gujarathi','Tamil','Telagu'}"
            multiple="true"
            headerKey="headerKey"
            headerValue="--- Please Select ---"
            size="12"
            emptyOption="true"
            
            doubleList="{'English' }" 
            doubleName="selectedLanguage"
            doubleHeaderKey="doubleHeaderKey"
            doubleMultiple="true"
            doubleSize="5"
          
          />
        <s:submit/>
       </s:form>
</body>
</html>