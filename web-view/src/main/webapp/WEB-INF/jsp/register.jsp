<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="loginBean" class="ua.bychkovskyy.beans.LoginBean" scope="application"/>

<fmt:setLocale value="${loginBean.language}"/>
<fmt:bundle basename="label">
    <!DOCTYPE html>
    <html>
    <head>
        <jsp:include page="template/head-template.jsp"/>
        <link href="/ext/css/register.css" rel="stylesheet">
        <script src="/ext/js/register.js"></script>
    </head>

    <body>
    <jsp:include page="template/nav-bar.jsp"/>
    <div class="container reg-form">

        <form name='f' action='actionRegister' method="POST">
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