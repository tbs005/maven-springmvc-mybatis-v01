<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>T服务平台投票系统</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>

<body>

	<%@ include file="header.jsp"%>

	<%@ include file="sidebar.jsp"%>

	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
				<li class="active">投票</li>
			</ol>
		</div>
		<!--/.row-->

		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">投票</h1>
			</div>
		</div>
		<!--/.row-->

		<div class="row">
			<c:forEach var="user" items="${users}">
				<div class="col-xs-12 col-md-6 col-lg-3">
					<div class="panel panel-blue panel-widget ">
						<div class="row no-padding">
							<a href="#" name ="vote">
								<div class="col-sm-3 col-lg-5 widget-left">
									<em class="glyphicon glyphicon-user glyphicon-l"></em>
									<input type="hidden" name="userId" value="${user.id}">
								</div>
							</a>
							<div class="col-sm-9 col-lg-7 widget-right">
								<div class="large">${user.voteNum}</div>
								<div class="text-muted" id="1">${user.name}</div>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<!--/.main-->

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script>
		$('#calendar').datepicker({});

		!function($) {
			$(document)
					.on(
							"click",
							"ul.nav li.parent > a > span.icon",
							function() {
								$(this).find('em:first').toggleClass(
										"glyphicon-minus");
							});
			$(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");

			$("nav menu li").each(function() {
				$(this).click(function() {
					alert("li");
				});
			});

			$("a[name='vote']").bind("click", function() {
				var id = $(this).find($("input[name='userId']")).val();
				$.ajax({  
				     type:'post',  
				     url:'vote.html',  
				     data:'userId='+id,  
				     cache:false,  
				     dataType:'json',  
				     success:function(data){  
				          if( data.msg =="false" ) //服务器返回false  
				          {  
				             alert("成功！");
				           }  
				      },  
				      error:function(){
				    	  alert("成功！");
				      }  
				});
			});

		}(window.jQuery);

		$(window).on('resize', function() {
			if ($(window).width() > 768)
				$('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function() {
			if ($(window).width() <= 767)
				$('#sidebar-collapse').collapse('hide')
		})
	</script>
</body>

</html>
