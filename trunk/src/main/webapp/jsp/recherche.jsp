<html>

<%@include file="head.jsp" %>

<body>

<div class="row">
	<div class="col-md-3" ></div>
	<div class="col-md-6">
		<img src="../img/Trombizz.png"></img>
	</div>
	<div class="col-md-3" ></div>
</div>

<form action='jsp/detailRecherche.jsp'>
	<div class="row">
	<div class="col-md-3" ></div>
	  <div class="col-md-6">
	    <div class="input-group">
	      <input type="text" class="form-control" name='recherche'>
	      <span class="input-group-btn">
	        <button class="btn btn-primary" type='submit'><span class="glyphicon glyphicon-search"></span>&nbsp;</button>
	      </span>
	    </div><!-- /input-group -->
	  </div><!-- /.col-lg-6 -->
	</div><!-- /.row -->
	<div class="col-md-3" ></div>
</form>

</body>

</html>