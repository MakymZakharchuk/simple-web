<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="navbar navbar-default navbar-static-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <div class="navbar-brand" href="#">Шахи онлайн</div>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li id="homeRef"><a href="/home.jsp">Домашня</a></li>
                <li id="ratingRef"><a href="/rating.jsp">Рейтинг гравців</a></li>
                <li id="aboutRef"><a href="/about.jsp">Про сайт</a></li>

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li id="profileRef"><a href="/pages/profile.jsp">Hello, User</a></li>
                <li id="configRef"><a href="/configuration.jsp">Налаштування аккаунту</a></li>
                <li id="logoutRef"><a href="/j_spring_security_logout">Вихід</a></li>
            </ul>
        </div>
    </div>
</div>