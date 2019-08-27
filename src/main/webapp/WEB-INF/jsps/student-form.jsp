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
<form:form action="processForm" modelAttribute="student">
    first name : <form:input path="firstName"></form:input>
    <br><br>
    last name : <form:input path="lastName"></form:input>
    <form:errors path="lastName"></form:errors>
    <input type="submit" value="submit">

</form:form>
</body>
</html>
