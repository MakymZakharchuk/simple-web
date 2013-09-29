<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="loginBean" class="ua.bychkovskyy.beans.LoginBean"/>
<fmt:setLocale value="${loginBean.language}"/>
<!DOCTYPE html>
<fmt:bundle basename="label">
    <html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <title>Рейтинг гравців</title>
        <link href="dist/css/bootstrap.css" rel="stylesheet">
        <link href="css/navbar.css" rel="stylesheet">
        <script type="text/javascript" src="assets/js/jquery.js"></script>
        <script type="text/javascript" src="js/common.js"></script>
        <script type="text/javascript" src="js/rating.js"></script>
    </head>
    <body>
    <jsp:include page="template/nav-bar.jsp"/>
    </body>
    </html>
</fmt:bundle>