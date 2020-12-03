<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livro de Java, Android, Iphone, Ruby, PHP e muito mais -
	Casa do Código</title>

<c:url value="/resources/css" var="cssPath" />
<link rel="stylesheet" href="${cssPath}/bootstrap.min.css">
<link rel="stylesheet" href="${cssPath}/bootstrap-theme.min.css">

<style type="text/css">
	body {
		padding-bottom: 60px;
	}
</style>
</head>
<body>
	
	<div class="container">
	
		<h1>Login da Casa do Código</h1>
		
		<form:form servletRelativeAction="/login" method="POST"
			commandName="produto" enctype="multipart/form-data">
			<div class="form-group">
				<label>Email: </label>
				<input name="username" type="text" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Senha: </label>
				<input type="password" name="password" class="form-control"/>
			</div>
			<button type="submit" class="btn btn-primary">Login</button>
		</form:form>
	</div>
</body>
</html>