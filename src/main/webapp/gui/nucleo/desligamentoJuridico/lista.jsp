<%-- 
    Document   : lista
    Created on : Set 27, 2012, 17:05:05 PM
    Author     : Ana Paula
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
        <h1>Lista de Formul&aacute;rio de Desligamentos:</h1>
        <table id="tblist" cellspacing='0' cellpaddind="2">
            <thead>
            <th>Ações</th>
            <th>ID</th>
            <th>Descri&&ccedil;&atilde;o</th>
            <th>ID Abrigada</th>
        </thead>
        <tbody>
            <c:forEach items="${desligamentoJuridicoList}" var="desligamentoJuridico">
                <tr>
                    <td>
                        <a href="<c:url value='/desligamentoJuridico/deleta/${desligamentoJuridico.idAbrigada}/${desligamentoJuridico.id}'/>">DELETA</a>
                        <br>
                        <a href="<c:url value='/desligamentoJuridico/edita/${desligamentoJuridico.id}'/>">EDITA</a>
                    </td>
                    <td>${desligamentoJuridico.id}</td>
                    <td>${desligamentoJuridico.descricaoDesligamento}</td>
                    <td>${desligamentoJuridico.idAbrigada}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
