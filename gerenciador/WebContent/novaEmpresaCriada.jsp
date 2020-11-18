<!-- JSP = Java Server Page -->
<!--
<%
	String nomeEmpresa = (String) request.getAttribute("empresa");
	System.out.println(nomeEmpresa);
%>
-->

<html>
	<body>
		<!-- Empresa <% out.println(nomeEmpresa); %> Cadastrada com sucesso! -->
		<!-- Empresa <%= nomeEmpresa %> Cadastrada com sucesso! -->
		Empresa ${empresa} Cadastrada com sucesso!
	</body>
</html>
		