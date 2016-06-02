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
<link href="css/bootstrap-table.css" rel="stylesheet">
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
				<li class="active">创建投票</li>
			</ol>
		</div>
		<!--/.row-->

		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">创建投票</h1>
			</div>
		</div>
		<!--/.row-->

		<div class="row">
			<div class="col-md-8">
				<div class="panel panel-default">
					<div class="panel-heading">
						<span class="glyphicon glyphicon-envelope"></span> 创建投票
					</div>
					<div class="panel-body">
						<form:form id="createVote" class="form-horizontal" action="/votesystem-web/createvote.html"
							method="post">
							<fieldset>
								<!-- Name input-->
								<div class="form-group">
									<label class="col-md-3 control-label" for="name">名称</label>
									<div class="col-md-9">
										<input id="title" name="title" type="text" placeholder="投票名称"
											class="form-control"/>
									</div>
								</div>

								<!-- Message body -->
								<div class="form-group">
									<label class="col-md-3 control-label" for="message">描述</label>
									<div class="col-md-9">
										<textarea class="form-control" id="memo" name="memo"
											placeholder="投票说明" rows="5"></textarea>
									</div>
								</div>

								<!-- Form actions -->
								<div class="form-group">
									<div class="col-md-12 widget-right">
										<button type="submit"
											class="btn btn-primary btn-md pull-right" id="btnCreate">创建投票</button>
									</div>
								</div>
							</fieldset>
						</form:form>
					</div>
				</div>

			</div>
			<!--/.col-->
		</div>
		<!--/.row-->


	</div>
	<!--/.main-->


	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/jquery.form.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/bootstrap-table.js"></script>
	<script>
	$(document).ready(  
		    function() {   
		      $("#btnCreate").click(function() {  
		        var jsoninfo = $.toJSON($('#createVote').serializeObject());  
		        alert(jsonuserinfo);  
		        $.ajax( {  
		          type : 'POST',  
		          contentType : 'application/json',  
		          url : 'votesystem-web/vote/create',  
		          data : jsoninfo,  
		          dataType : 'json',  
		          success : function(data) {  
		            alert("新增成功！");  
		          },  
		          error : function(data) {  
		            alert("error")  
		          }  
		        });  
		      });  
		    }); 

		
/* 		!function($) {
			$(document)
					.on(
							"click",
							"ul.nav li.parent > a > span.icon",
							function() {
								$(this).find('em:first').toggleClass(
										"glyphicon-minus");
							});
			$(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		}(window.jQuery);

		$(window).on('resize', function() {
			if ($(window).width() > 768)
				$('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function() {
			if ($(window).width() <= 767)
				$('#sidebar-collapse').collapse('hide')
		}) */
	</script>
</body>

</html>
