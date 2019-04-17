<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<spring:url value="/assets/bootstrap/css/bootstrap.min.css" var="bootstrap" />
<spring:url value="/assets/css/styles.css" var="main" />
<link rel="stylesheet" href="${bootstrap}">
<link rel="stylesheet" href="${main}">
</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include>

	<main class="container">
		<div class="col-md-12">
			<div class="row">
				<div class="col-md-4">
				<!--  Mettre en place le formulaire de recherche -->
				Partie Recherche</div>
				<div class="col-md-8">
				<!-- Afficher la liste des mobiles -->
				Liste des mobiles</div>
			</div>
		</div>
	<main>
</body>
</html>