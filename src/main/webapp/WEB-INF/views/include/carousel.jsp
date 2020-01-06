<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
	<!-- Indicators -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
		<li data-target="#myCarousel" data-slide-to="3"></li>
	</ol>
	<div class="carousel-inner" role="listbox">
		<div class="item active">
			<img class="slide" src="/resources/image/carousel/define01.jpg">
			<div class="container">
				<div class="carousel-caption">
					<h1>개념 정의</h1>
					<p>	언젠가 세상 모든 것을 설명할 수 있게 되기까지, 셀 수 없이 많은 개념 정의의 실패가 필요합니다. </p>
					<p>	<a class="btn btn-lg btn-primary" href="#" role="button">Define X </a></p>
				</div>
			</div>
		</div>
		<div class="item">
			<img class="slide" src="/resources/image/carousel/energy02.jpg">
			<div class="container">
				<div class="carousel-caption">
					<h1>물질 변화</h1>
					<p>	물질은 변해가고 있습니다. 그리고 이동하고 있지요.  </p>
					<p>	<a class="btn btn-lg btn-primary" href="#" role="button">Matter &amp; Energy </a></p>
				</div>
			</div>
		</div>
		<div class="item" onclick="location.href='/record/recordMain';">
			<img class="slide" src="/resources/image/carousel/record01.jpg">
			<div class="container">
				<div class="carousel-caption">
					<h1>기록 보존</h1>
					<p>	아무리 많은 것을 알았다고 한들, 전해지지 않아서야 아무것도 나아지지 않겠죠. </p>
					<p>	<a class="btn btn-lg btn-primary" href="/record/recordMain" role="button">Record Keeping </a></p>
				</div>
			</div>
		</div>
		<div class="item">
			<img class="slide" src="/resources/image/carousel/game01.jpg">
			<div class="container">
				<div class="carousel-caption">
					<h1>게임</h1>
					<p>	모든 것은 게임으로 표현될 겁니다. 게임은 현실에 존재하지 않는 것도 상상할 수 있기 때문입니다. </p>
					<p>	<a class="btn btn-lg btn-primary" href="#" role="button">GAMES</a></p>
				</div>
			</div>
		</div>
	</div>
	<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev"> 
	   	<i class="fas fa-angle-double-left"></i>
	</a> 
	<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next"> 
		<i class="fas fa-angle-double-right"></i>
	</a>
</div>
<!-- /.carousel -->