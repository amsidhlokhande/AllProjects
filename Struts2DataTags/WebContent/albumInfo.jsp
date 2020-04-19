<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
 <head>
   <s:head />
     <style type="text/css">
      @import url(style.css);
     </style>
    <title>Album Details</title>
</head>
<body bgcolor="pink">
  <%-- <div class="content">
     <b>Album Title :</b>
        <s:property value="title" /> <br>
     <b>Artist Name :</b>
        <s:property value="artist.name" />
   <br>
     <b>Artist Bio :</b>
        <s:property value="artist.bioData" />
   <br>
  </div> --%>
  <%-- 
  <s:set name="artistName" value="artist.name" scope="application"/>
  <s:set name="artistbioData" value="artist.bioData" scope="application"/>
  <div class="content">
     <b>Album Title :</b>
        <s:property value="title" /> <br>
     <b>Artist Name :</b>
        <s:property value="#application.artistName" />
   <br>
     <b>Artist Bio :</b>
        <s:property value="#application.artistbioData" />
   <br>
  </div> 
   --%>
   
   <%-- 
  <s:set name="artistName" value="artist.name" scope="session"/>
  <s:set name="artistbioData" value="artist.bioData" scope="session"/>
  <div class="content">
     <b>Album Title :</b>
        <s:property value="title" /> <br>
     <b>Artist Name :</b>
        <s:property value="#session.artistName" />
   <br>
     <b>Artist Bio :</b>
        <s:property value="#session.artistbioData" />
   <br>
  </div> 
   --%>
   
   
   
  <%-- <s:set name="artistName" value="artist.name" scope="request"/>
  <s:set name="artistbioData" value="artist.bioData" scope="request"/>
  <div class="content">
     <b>Album Title :</b>
        <s:property value="title" /> <br>
     <b>Artist Name :</b>
        <s:property value="#request.artistName" />
   <br>
     <b>Artist Bio :</b>
        <s:property value="#request.artistbioData" />
   <br>
  </div> 
   --%>
    
  <div class="content">
     <b>Album Title :</b>
        <s:property value="title" /> <br>
     <s:push value="artist"> 
           <b>Artist Name :</b>
             <s:property value="name" />
           <br>
           <b>Artist Bio :</b>
           <s:property value="bioData" />
           <br>
      </s:push>
  </div> 
   
   
</body>
</html>