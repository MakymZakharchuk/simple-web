<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="loginBean" class="ua.bychkovskyy.beans.LoginBean"/>
<fmt:setLocale value="${loginBean.language}"/>
<!DOCTYPE html>
<fmt:bundle basename="label">
<html>
<head>
    <title><fmt:message key="page.home.title"/></title>
</head>
<body>
    Home
</body>
</html>
</fmt:bundle>