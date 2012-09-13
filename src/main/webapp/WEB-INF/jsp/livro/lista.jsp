<%-- 
    Document   : lista
    Created on : Jun 12, 2012, 3:33:05 PM
    Author     : Leonn Ferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="../css/geral.css"/>
    </head>
    <body>
        <h1>Lista de livros:</h1>
        <a href="<c:url value='/livro/form'/>">Cadastrar</a><br />
        <table id="tblist">
            <thead>
            <th>Ações</th>
            <th>ID</th>
            <th>Titulo</th>
            <th>Editora</th>
            <th>Autor</th>
            <th>Ano de Publicação</th>
        </thead>
        <tbody>
            <c:forEach items="${livroList}" var="livro">
                <tr>
                    <td>
                        <a href="<c:url value='/livro/deleta/${livro.id}'/>">DELETA</a>
                        <br>
                        <a href="<c:url value='/livro/edita/${livro.id}'/>">EDITA</a>
                        <br>
                    </td>
                    <td>${livro.id}</td>
                    <td>${livro.titulo}</td>
                    <td>${livro.editora}</td>
                    <td>${livro.autor}</td>
                    <td>${livro.publicacao}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
