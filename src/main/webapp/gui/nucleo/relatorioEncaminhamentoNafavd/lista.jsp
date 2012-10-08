<%-- 
    Document   : lista
    Created on : Set 28, 2012, 6:51:05 AM
    Author     : Matheus Fonseca
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="../../css/geral.css"/>
    </head>
    <body>
        <h1>Lista de relatórios de encaminhamento ao NAFAVD:</h1>
        <a href="<c:url value='/relatorioEncaminhamentoNafavd/form/${abrigada.id}'/>">Cadastrar</a><br/><br/>
        <table id="tblist" cellspacing='0' cellpaddind="2" border="1">
            <thead>
            <th>Ações</th>
            <th>ID</th>
            <th>Abrigada - ID</th>
            <th>Abrigada - Nome</th>
            <th>Abrigada - Telefone</th>
            <th>Abrigada - Endereço</th>
            <th>Abrigada - Data de nascimento</th>
            <th>Abrigada - Tempo de abrigamento</th>
            <th>NAFAVD</th>
            <th>Agressor - Nome</th>
            <th>Agressor - Telefone</th>
            <th>Agressor - Endereço</th>
            <th>Agressor - Data de nascimento</th>
            <th>Dependentes - Nomes</th>
            <th>Observações</th>
            <th>Data de emissão</th>
            <th>Psicóloga - CRP</th>
        </thead>
        <tbody>
            <c:forEach items="${relatorioEncaminhamentoNafavdList}" var="relatorioEncaminhamentoNafavd" varStatus="status">
                <tr>
                    <td>
                        <a href="<c:url value='/relatorioEncaminhamentoNafavd/deleta/${relatorioEncaminhamentoNafavd.idAbrigada}/${relatorioEncaminhamentoNafavd.id}'/>">DELETA</a>
                        <br>
                        <a href="<c:url value='/relatorioEncaminhamentoNafavd/edita/${relatorioEncaminhamentoNafavd.id}'/>">EDITA</a>
                        <br>
                        <a href="<c:url value='/relatorioEncaminhamentoNafavd/info/${relatorioEncaminhamentoNafavd.id}'/>">VISUALIZA</a>
                    </td>
                    <td>${relatorioEncaminhamentoNafavd.id}</td>
                    <td>${abrigada.id}</td>
                    <td>${abrigada.nome}</td>
                    <td>${abrigada.telefone}</td>
                    <td>${abrigada.endereco}</td>
                    <td>${abrigada.dataNascimento}</td>
                    <td>${relatorioEncaminhamentoNafavd.tempoAbrigamento} dias</td>
                    <td>${nafavdList[status.index].cidade} - ${nafavdList[status.index].estado}</td>
                    <td>${agressor.nome}</td>
                    <td>${agressor.telefone}</td>
                    <td>${agressor.endereco}</td>
                    <td>${agressor.dataNascimento}</td>
                    <td><c:forEach items="${dependenteList}" var="dependente">
                        ${dependente.nome}</br>
                    </c:forEach></td>
                    <td>${relatorioEncaminhamentoNafavd.observacoes}</td>
                    <td>${relatorioEncaminhamentoNafavd.dataEmissao}</td>
                    <td>${relatorioEncaminhamentoNafavd.crp}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
