<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.alura.gerenciador.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Java Standard Taglib</title>
	</head>
	<body>
		
		<p>Usuario Logado: ${usuarioLogado.login}</p>
		
		<c:import url="logout-parcial.jsp" />
		
		<c:if test="${not empty empresa}">
			<p>Empresa ${empresa} Cadastrada com sucesso!</p>
		</c:if>
	
		<p>Lista de Empresas:</p>
		
		<ul>
			<c:forEach items="${empresas}" var="empresa">
				<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" var="data"/>
				<li>
					${empresa.nome} - ${data} - 
					<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">edita</a> - 
					<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">remove</a>
				</li>
				
			</c:forEach>
		</ul>
	</body>
</html>