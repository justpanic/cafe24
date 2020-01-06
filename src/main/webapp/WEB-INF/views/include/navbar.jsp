<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<nav class="navbar navbar-inverse navbar-fixed-top">
<div class="container">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle collapsed"
		data-toggle="collapse" data-target="#navbar"
		aria-expanded="false" aria-controls="navbar">
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="/"> WDSystem  </a>
	</div>
	
	<div id="navbar" class="navbar-collapse collapse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="/">홈</a></li>
			<li class="dropdown">
				<a class="dropdown-toggle" data-target="#" role="button"
				data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"
				id="dropdownMenu">
				테마 <span class="caret"></span></a>
				<ul class="dropdown-menu" aria-labelledby="dropdownMenu">
                    <li><a href="#">개념 정의</a></li>
                    <li><a href="#">물질 변화</a></li>
                    <li><a href="#">기록 보존</a></li>
                    <li role="separator" class="divider"></li>
                    <li class="dropdown-header">GAME</li>
                    <li><a href="#">PD48X</a></li>
                    <li><a href="#">XCARD</a></li>
                 </ul>
			</li>
		</ul>
		
		<c:choose>
		<c:when test="${empty email }">
			<form class="navbar-form navbar-right" id="loginfrm" action="/member/login" method="post">
            <div class="form-group">
              <input type="text" placeholder="Email" class="form-control" name="email">
            </div>
            <div class="form-group">
              <input type="password" placeholder="Password" class="form-control" name="passwd">
            </div>
            <button type="submit" class="btn btn-success">로그인</button>
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#joinModal">회원가입</button>
         </form>
		</c:when>
		<c:otherwise>
			<form class="navbar-form navbar-right">
				<div class="form-group" style="color:white;"> ${name} 님, 반갑습니다. &nbsp; </div>
				<button type="button" class="btn btn-danger" onclick="location.href='/member/logout';">로그아웃</button>
			</form>
		</c:otherwise>
		</c:choose>
		
		 
			
			
	</div>
		
</div>
</nav>