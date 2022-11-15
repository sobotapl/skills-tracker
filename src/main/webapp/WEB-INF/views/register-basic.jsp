<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<form:form method="post" action="/register/save" modelAttribute="user">
    <form:hidden path="id"/>

    Name: <form:input path="firstName"/><br>
    <form:errors path="firstName" cssClass="error"/><br>

    Lastname: <form:input path="lastName"/><br>
    <form:errors path="lastName" cssClass="error"/><br>

    Email: <form:input path="email"/><br>
    <form:errors path="email" cssClass="error"/><br>

    Password: <form:input path="password"/><br>
    <form:errors path="password" cssClass="error"/><br>


    <input type="submit" value="Dodaj">
</form:form>

</body>
</html>