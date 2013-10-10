<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <div>
        <div style="max-width: 400px; text-align: center;">
            Активні ігри
            <table class="table">
                <thead>
                <tr>
                    <td>Гравець 1</td>
                    <td>Гравець 2</td>
                    <td></td>
                </tr>
                </thead>
                <tbody>
                <%--@elvariable id="games" type="java.util.List"--%>
                <%--@elvariable id="game" type="ua.bychkovskyy.model.Game"--%>
                <c:forEach var="game" begin="0" items="${games}">
                    <tr>
                        <td>${game.whitePlayer.userName}</td>
                        <td>${game.blackPlayer.userName}</td>
                        <td><input type="button" class="btn btn-default" style="padding: 0 12px" value="Дивитись" onclick="window.location = 'watch?id=${game.id}'" ></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    </body>
    </html>
</fmt:bundle>