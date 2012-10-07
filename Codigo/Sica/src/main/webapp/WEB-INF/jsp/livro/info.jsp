<%-- 
    Document   : lista
    Created on : Jun 12, 2012, 3:33:05 PM
    Author     : Leonn Ferreira
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
        <h1>Informações do livro:</h1>
        <a href="<c:url value='/livro/form'/>">Cadastrar</a><br />
        <table>
            <tr>
                <td>Ações</td><td>
                    <a href="<c:url value='/livro/deleta/${livro.id}'/>">DELETA</a>
                    | <a href="<c:url value='/livro/edita/${livro.id}'/>">EDITA</a>
                </td>
            <tr>
                <td>ID</td><td>${livro.id}</td>
            </tr>
            <tr>
                <td>Título</td><td>${livro.titulo}</td>
            </tr>
            <tr>
                <td>Editora</td><td>${livro.editora}</td>
            </tr>
            <tr>
                <td>Autor</td><td>${livro.autor}</td>
            </tr>             
            <tr>
                <td>Ano de Publicação</td><td>${livro.publicacao}</td>
            </tr>
            <tr>
                <td>Edição</td><td>${livro.edicao}</td>
            </tr>
            
        </table>
    </body>
</html>
