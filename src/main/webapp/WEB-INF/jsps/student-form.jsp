<%--
  Created by IntelliJ IDEA.
  User: ahmughamisi
  Date: 8/27/2019
  Time: 1:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="processForm" modelAttribute="user">
    first name : <form:input path="firstName"></form:input>
    last name : <form:input path="lastName"></form:input>
    number : <form:input path="freePasses"></form:input>
    postalCode : <form:input path="postalCode"></form:input>
    customVald : <form:input path="customVald"></form:input>
    <form:errors path="firstName"></form:errors>
    <form:errors path="lastName"></form:errors>
    <form:errors path="freePasses"></form:errors>
    <form:errors path="postalCode"></form:errors>
    <form:errors path="customVald"></form:errors>
    <input type="submit" value="submit">

</form:form>
</body>
</html>
