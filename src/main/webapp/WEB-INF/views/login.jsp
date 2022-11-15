<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <title>Registration and Login System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" th:fragment="header">
    <div class="container-fluid">
        <a class="navbar-brand" a:href="@{/}">Registration and Login System</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
    </div>
</nav>
<br />
<br />
<br />
<div class="container">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <div> <c:if test="${param.error != null}">
                <div class="alert alert-danger">Invalid Email and Password.</div>
                </c:if>
                </div>
            </div>
            <div> <c:if test="${param.logout != null}">
                <div class="alert alert-success">You have been logged out.</div>
                </c:if>
                </div>
            </div>
            <div class="card">
                <div class="card-header">
                    <h3 class="text-center">Login Form</h3>
                </div>
                <div class="card-body">
                    <form:form method="post" action="/login" class="form-horizontal" modelAttribute="user" >
                        <div class="mb-3">
                           <input type="text" name="username" placeholder="UserName" class="control-label"/>
                        </div>

                        <div class="mb-3">
                            <label for="password" class="control-label">Password *</label>
                            <input type="text" name="password" placeholder="UserName" class="control-label"/>
                        </div>

                        <div class="mb-3">
                            <button type="submit" class="btn btn-primary">Login</button>
                            <span> Not registered?
                            <a a:href="/register"> Register/SignUp Here</a>
                        </span>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>