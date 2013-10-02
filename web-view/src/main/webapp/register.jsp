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
        <link rel="shortcut icon" href="ext/assets/ico/favicon.png">

        <title><fmt:message key="page.login.title"/></title>
        <link href="ext/dist/css/bootstrap.css" rel="stylesheet">
        <link href="ext/css/signin.css" rel="stylesheet">
        <link href="ext/css/register.css" rel="stylesheet">
        <script type="text/javascript" src="ext/assets/js/jquery.js"></script>
        <script src="ext/js/register.js"></script>

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="ext/assets/js/html5shiv.js"></script>
        <script src="ext/assets/js/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>
    <jsp:include page="ext/template/nav-bar.jsp"/>
    <div class="container reg-form">

        <form name='f' action='/services/register' method="POST">
            <table class="form-register">
                <tr>
                    <td>
                        <div class="label label-default reg-item">Введіть ім'я:</div>
                    </td>
                    <td><input name="firstname" class="form-control reg-item" type="text" placeholder="Ім'я">
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <div class="label label-default reg-item">Введіть прізвище:</div>
                    <td><input name="lastname" class="form-control reg-item" type="text" placeholder="Прізвище">
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <div class="label label-default reg-item">Введіть логін:</div>
                    <td><input
                            name="username"
                            class="form-control reg-item"
                            type="text"
                            placeholder="Логін"
                            oninput="fireChanged()"
                            >
                    <td><span id="uNameStatus"
                              class="glyphicon glyphicon-asterisk">
                              </span>
                </td>
                </tr>
                <tr>
                    <td>
                        <div class="label label-default reg-item">Введіть пароль:</div>
                    <td><input
                            name="password1"
                            class="form-control reg-item"
                            type="password"
                            placeholder="Пароль"
                            oninput="fireChanged()"
                        >
                    <td><span
                            id="pass1Status"
                            class="glyphicon glyphicon-asterisk">
                        </span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="label label-default reg-item">Повторіть пароль:</div>
                    <td><input
                            name="password2"
                            class="form-control reg-item"
                            type="password"
                            placeholder="Пароль ще раз"
                            oninput="fireChanged()"
                        >
                    <td><span
                            id="pass2Status"
                            class="glyphicon glyphicon-asterisk">
                        </span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="label label-default reg-item">Оберіть мову:</div>
                    <td><select name="lang" class="form-control reg-item">
                        <option value>Українська</option>
                        <option value>Engtrsh</option>
                    </select>
                    </td>
                    <td></td>
                </tr>
                </br>
                <tr>
                    <td><input
                            id="register"
                            class="btn btn btn-success reg-item"
                            type="submit"
                            value="Зареєструватись"
                            disabled="disabled"
                            />
                    </td>
                    <td><input
                            id="abort"
                            class="btn btn btn-danger reg-item"
                            type="reset"
                            onclick="removeValidation();"
                            value="Відмінити"/>
                    <td></td>
                </tr>
            </table>

        </form>

    </div>

    </body>
    </html>
</fmt:bundle>