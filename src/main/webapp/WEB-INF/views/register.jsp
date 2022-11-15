<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration and Login System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" th:fragment="header">
    <div class="container-fluid">
        <a class="navbar-brand" href="@{/}">Registration and Login System</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
    </div>
</nav>
<br />
<br />
<br />
<div class="container">
    <div class="row col-md-8 offset-md-2">
        <div class="card">
            <div> <c:if test="${param.success != null}">
                  <div class="alert alert-info">You've successfully registered to our app!</div>
                  </c:if>
            </div>
        </div>

            <div class="card-header">
                <h2 class="text-center">Registration</h2>
            </div>
            <div class="card-body">
                <form:form method="post" action="/register/save" modelAttribute="user">

                    <div class="form-group mb-3">
                        <label class="form-label">First Name</label>
                       <form:input path="firstName" placeholder="Imię" class="form-control"/>
                       <p form:errors path="firstName" class="text-danger">
                       </div>

                    <div class="form-group mb-3">
                        <label class="form-label">Last Name</label>
                        <form:input path="lastName" placeholder="Nazwisko" class="form-control"/>
                        <p form:errors path="lastName" class="text-danger">
                        </div>

                    <div class="form-group mb-3">
                        <label class="form-label">Email</label>
                        <form:input path="email" placeholder="email" class="form-control"/>
                        <p form:errors path="email" class="text-danger">
                        </div>

                    <div class="form-group mb-3">
                        <label class="form-label">Password</label>
                        <form:input path="password" placeholder="password" class="form-control"/>
                        <p form:errors path="password" class="text-danger">
                    </div>

                    <div class="form-group mb-3">
                        <button class="btn btn-primary" type="submit">Register</button>
                        <span>Already registered? <a href="/" href="/login">Login
                             here</a></span>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>