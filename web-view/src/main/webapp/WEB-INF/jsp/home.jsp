<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<fmt:setLocale value="uk"/>
<!DOCTYPE html>
<fmt:bundle basename="label">
    <html>
    <head>
        <jsp:include page="template/head-template.jsp"/>
        <script type="text/javascript" src="/ext/js/home.js"></script>
        <script type="text/javascript" src="/ext/js/chessboard.js"></script>
        <link href="/ext/css/chessboard.css" rel="stylesheet">

    </head>
    <body>
    <jsp:include page="template/nav-bar.jsp"/>
    <jsp:include page="template/chessboard.jsp"/>
    </body>
    </html>
</fmt:bundle>