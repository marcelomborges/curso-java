<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livro de Java, Android, Iphone, Ruby, PHP e muito mais - Casa do Código</title>

<c:url value="/resources/css" var="cssPath"/>
<link rel="stylesheet" href="${cssPath}/bootstrap.min.css">
<link rel="stylesheet" href="${cssPath}/bootstrap-theme.min.css">

</head>
<body>
	<form:form action="${s:mvcUrl('PC#gravar').build()}" method="POST" commandName="produto" enctype="multipart/form-data">
		<div>
			<label>Título: </label>
			<form:input path="titulo"/>
			<p><form:errors path="titulo"/></p>
		</div>
		<div>
			<label>Descrição: </label>
			<form:textarea rows="10" cols="20" path="descricao"/>
			<p><form:errors path="descricao"/></p>
		</div>
		<div>
			<label>Páginas: </label>
			<form:input path="paginas"/>
			<p><form:errors path="paginas"/></p>
		</div>
		<div>
			<label>Data de Lançamento: </label>
			<form:input path="dataLancamento"/>
			<p><form:errors path="dataLancamento"/></p>
		</div>
		<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
			<div>
				<label>${tipoPreco}: </label>
				<form:input path="precos[${status.index}].valor"/>
				<form:hidden path="precos[${status.index}].tipo" value="${tipoPreco}"/>
			</div>
		</c:forEach>
		<div>
			<label>Sumário: </label>
			<input type="file" name="sumario">
		</div>
		
		<button type="submit">Cadastrar</button>
	</form:form>

</body>
</html>