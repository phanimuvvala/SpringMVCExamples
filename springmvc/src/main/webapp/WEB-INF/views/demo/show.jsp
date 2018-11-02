<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="/WEB-INF/views/common/common-libs.jsp" />
<head>
<title>Spring MVC4 Demo</title>
</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">Spring MVC4 Demo</a>
	</div>
  </div>
</nav>

<div class="jumbotron">
  <div class="container">
	<h1>${demo.title}</h1>
	<p>
		<c:if test="${not empty demo.name}">
			Hello <font color='red'>${demo.name}</font>
		</c:if>

		<c:if test="${empty demo.name}">
			Welcome Welcome!
		</c:if>
    </p>
    <p>
	<a class="btn btn-primary btn-lg" href="./demo/show" role="button">Home</a>
    </p>
  </div>
</div>

<div class="container">

  <div class="row">
	<div class="col-md-4">
		<h2>Heading</h2>
		<p>Heading1</p>
		<p>
		<a class="btn btn-default" href="./demo/show/Heading1" role="button">View details</a>
		</p>
	</div>
	<div class="col-md-4">
		<h2>Heading</h2>
		<p>Heading 2</p>
		<p>
		<a class="btn btn-default" href="./demo/show/Heading2" role="button">View details</a>
		</p>
	</div>
	<div class="col-md-4">
		<h2>Heading</h2>
		<p>Heading 3</p>
		<p>
		<a class="btn btn-default" href="./demo/show/Heading 3" role="button">View details</a>
		</p>
	</div>
  </div>

  <hr>
  <footer>
	<p>© Phani - Nov- 2018</p>
  </footer>
</div>
</body>
</html>