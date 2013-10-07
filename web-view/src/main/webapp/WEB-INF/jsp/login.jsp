<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<fmt:setLocale value="${language}"/>
<fmt:bundle basename="label">
    <!DOCTYPE html>
    <html>
    <head>
        <jsp:include page="template/head-template.jsp"/>
        <link href="/ext/css/signin.css" rel="stylesheet">
    </head>
    <body>
    <jsp:include page="template/nav-bar.jsp"/>
    <div class="container">

        <form class="form-signin" name='f' action='/j_spring_security_check' method="POST">
            <h2 class="form-signin-heading"><fmt:message key="page.login.label.signin"/></h2>
            <input type="text" class="form-control" name='j_username' placeholder=
                <fmt:message key="general.label.login"/> autofocus>
            <input type="password" class="form-control" name='j_password' placeholder=
                <fmt:message key="general.label.password"/>>
            <label class="checkbox">
                <input type="checkbox" value="remember-me"> <fmt:message key="page.login.checkbox.remember"/>
            </label>
            <button class="btn btn-lg btn-primary btn-block" type="submit"><fmt:message
                    key="page.login.submit"/></button>
        </form>

    </div>

    </body>
    </html>
</fmt:bundle>