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
                <li id="homeRef"><a href="/app/home">Домашня</a></li>
                <li id="ratingRef"><a href="/app/rating">Рейтинг гравців</a></li>
                <li id="aboutRef"><a href="/app/about">Про сайт</a></li>
            </ul>
            <jsp:include page="/app/jsp/welcome-bar.jsp"/>
        </div>
    </div>
</div>