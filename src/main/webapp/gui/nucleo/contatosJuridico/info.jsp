<%-- 
    Document   : lista
    Created on : Set 28, 2012, 3:33:05 PM
    Author     : Vinicius Franco
--%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link type="text/css" rel="stylesheet" href="../css/geral.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Informação dos Contatos:</h1>
        <a href="<c:url value='/abrigada/form'/>">Cadastrar</a><br />
        <table>
            <tr>
                <td>Ações</td><td>
                    <a href="<c:url value='/abrigada/deleta/${abrigada.id}'/>">DELETA</a>
                    | <a href="<c:url value='/abrigada/edita/${abrigada.id}'/>">EDITA</a>
                </td>
            <tr>
                <td>ID</td><td>${contato.id}</td>
            </tr>
            <tr>
                <td>Nome do Local</td><td>${contato.nomeLocal}</td>
            </tr>
            <tr>
                <td>Nome do Contato</td><td>${contato.nomeContato}</td>
            </tr>
            <tr>
                <td>Telefone</td><td>${contato.telefone}</td>
            </tr>
            <tr>
                <td>Email</td><td>${contato.email}</td>
            </tr>             

        </table>
    </body>
</html>
