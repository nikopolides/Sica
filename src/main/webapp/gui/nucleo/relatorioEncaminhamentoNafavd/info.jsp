<%-- 
    Document   : info
    Created on : 
    Author     : Matheus Fonseca
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link type="text/css" rel="stylesheet" href="../../css/geral.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Informações do relatório de encaminhamento ao NAFAVD:</h1>
        
        <table border="1">
            <tr>
                <td>Ações</td><td>
                    <a href="<c:url value='/relatorioEncaminhamentoNafavd/deleta/${relatorioEncaminhamentoNafavd.idAbrigada}/${relatorioEncaminhamentoNafavd.id}'/>">DELETA</a>
                    | <a href="<c:url value='/relatorioEncaminhamentoNafavd/edita/${relatorioEncaminhamentoNafavd.id}'/>">EDITA</a>
                </td>
            </tr>
            <tr>
                 <td>ID</td><td>${relatorioEncaminhamentoNafavd.id}</td> 
            </tr>
            <tr>
                <td>Abrigada - ID</td><td>${abrigada.id}</td>
            </tr>
            <tr>
                <td>Abrigada - Nome</td><td>${abrigada.nome}</td>
            </tr>
            <tr>
                <td>Abrigada - Telefone</td><td>${abrigada.telefone}</td>
            </tr>
            <tr>
                <td>Abrigada - Endereço</td><td>${abrigada.endereco}</td>
            </tr>
            <tr>
                <td>Abrigada - Data de nascimento</td><td>${abrigada.dataNascimento}</td>
            </tr>
            <tr>
                <td>Abrigada - Tempo de abrigamento</td><td>${relatorioEncaminhamentoNafavd.tempoAbrigamento} dias</td>
            </tr>
            <tr>
                <td>NAFAVD</td><td>${nafavd.cidade} - ${nafavd.estado}</td>
            </tr>
            <tr>
                <td>Agressor - Nome</td><td>${agressor.nome}</td>
            </tr>
            <tr>
                <td>Agressor - Telefone</td><td>${agressor.telefone}</td>
            </tr>
            <tr>
               <td>Agressor - Endereço</td> <td>${agressor.endereco}</td>
            </tr>
            <tr>
                <td>Agressor - Data de nascimento</td><td>${agressor.dataNascimento}</td>
            </tr>
            <c:forEach items="${dependenteList}" var="dependente">
                <tr>
                    <td>Dependente - Nome</td><td>${dependente.nome}</td>
                </tr>
            </c:forEach>
            <tr>
                <td>Observações</td><td>${relatorioEncaminhamentoNafavd.observacoes}</td>
            </tr>
            <tr>
                <td>Data de emissão</td><td>${relatorioEncaminhamentoNafavd.dataEmissao}</td>
            </tr>
            <tr>
               <td>Psicóloga - CRP</td> <td>${relatorioEncaminhamentoNafavd.crp}</td>
            </tr>
        </table>
        <br/>
        <input type="button" name="imprimir" value="Imprimir" onclick="window.print();"><br/>
    </body>
</html>
