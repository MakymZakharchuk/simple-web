<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="loginBean" class="ua.bychkovskyy.beans.LoginBean"/>
<fmt:setLocale value="${loginBean.language}"/>
<!DOCTYPE html>
<fmt:bundle basename="label">
    <html>

    <head>
        <jsp:include page="template/head-template.jsp"/>
        <script type="text/javascript" src="/ext/js/rating.js"></script>

    </head>
    <body>
    <jsp:include page="template/nav-bar.jsp"/>
    <div class="container reg-form">
        <table class="table table-hover">
            <tr>
                <td>Імя</td>
                <td>Прізвище</td>
                <td>Нікнейм</td>
            </tr>
            <c:forEach var="player" begin="0" items="${players}">
                <tr>
                    <td>${player.firstName}</td>
                    <td>${player.lastName}</td>
                    <td>${player.userName}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    </body>
    </html>
</fmt:bundle>