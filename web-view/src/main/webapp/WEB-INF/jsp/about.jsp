<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="loginBean" class="ua.bychkovskyy.beans.LoginBean"/>
<fmt:setLocale value="${loginBean.language}"/>
<!DOCTYPE html>
<fmt:bundle basename="label">
    <html>
    <head>
        <jsp:include page="template/head-template.jsp"/>
        <script type="text/javascript" src="/ext/js/about.js"></script>

    </head>
    <body>
    <jsp:include page="template/nav-bar.jsp"/>
    <div style="text-align: center">
        made by Vyacheslav Bychkovskyy
        </br>
        2013
    </div>
    </body>
    </html>
</fmt:bundle>