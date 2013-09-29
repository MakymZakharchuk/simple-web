<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="navbar navbar-default navbar-static-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Шахи онлайн</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/home.jsp">Домашня</a></li>
                <li><a href="/rating.jsp">Рейтинг гравців</a></li>
                <li><a href="/about.jsp">Про сайт</a></li>

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/profile.jsp">Hello, User</a></li>
                <li class="active"><a href="/configuration.jsp">Налаштування аккаунту</a></li>
                <li><a href="/j_spring_security_logout">Вихід</a></li>
            </ul>
        </div>
    </div>
</div>