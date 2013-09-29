<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="loginBean" class="ua.bychkovskyy.beans.LoginBean" scope="application"/>

<fmt:setLocale value="${loginBean.language}"/>
<fmt:bundle basename="label">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="assets/ico/favicon.png">

    <title><fmt:message key="page.login.title"/> </title>
    <link href="dist/css/bootstrap.css" rel="stylesheet">
    <link href="css/signin.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="assets/js/html5shiv.js"></script>
    <script src="assets/js/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="container">

    <form class="form-signin">
        <h2 class="form-signin-heading"><fmt:message key="page.login.label.signin"/> </h2>
        <input type="text" class="form-control" placeholder=<fmt:message key="general.label.login" /> autofocus>
        <input type="password" class="form-control" placeholder=<fmt:message key="general.label.password"/> >
        <label class="checkbox">
            <input type="checkbox" value="remember-me"> <fmt:message key="page.login.checkbox.remember"/>
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit"><fmt:message key="page.login.submit"/></button>
    </form>

</div>

</body>
</html>
</fmt:bundle>