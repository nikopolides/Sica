<%-- 
    Document   : lista
    Created on : 01/10/2012, 21:50:23
    Author     : Winstein
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
        <h1>Lista de abrigamentos:</h1>
        <table id="tblist" cellspacing='0' cellpaddind="2">
            <thead>
            <th>Ações</th>
            <th>ID</th>
            <th>Data de Entrada</th>
            <th>Data de Saída</th>
            <th>Observações</th>
            <th>ID Abrigada</th>
        </thead>
        <tbody>
            <c:forEach items="${quantidadeAbrigamentosList}" var="quantidade">
                <tr>
                    <td>
                        <a href="<c:url value='/quantidadeAbrigamentos/edita/${quantidade.id}'/>">EDITA</a>
                    </td>
                    <td>${quantidade.id}</td>
                    <td>${quantidade.dataEntrada}</td>
                    <td>${quantidade.dataSaida}</td>
                    <td>${quantidade.observacoes}</td>
                    <td>${quantidade.idAbrigada}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
        </br>
        <h2>Quantidade de abrigamentos: ${quantidade}</h2>   
    </body>
</html>
