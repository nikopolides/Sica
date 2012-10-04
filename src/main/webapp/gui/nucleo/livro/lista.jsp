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
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="../css/geral.css"/>
    </head>
    <body>
        <div id="livro_mensagem">
            <i style="color: greenyellow"> ${mensagem} </i>
        </div>
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
            <th>Edição</th>
        </thead>
        <tbody>
            <c:forEach items="${livroList}" var="livro">
                <tr>
                    <td>
                        <a href="<c:url value='/livro/deleta/${livro.id}'/>">DELETA</a>
                        <br>
                        <a href="<c:url value='/livro/edita/${livro.id}'/>">EDITA</a>
                        <br>
                        <a href="<c:url value='/livro/info/${livro.id}'/>">INFO</a>
                        <br>
                    </td>
                    <td>${livro.id}</td>
                    <td>${livro.titulo}</td>
                    <td>${livro.editora}</td>
                    <td>${livro.autor}</td>
                    <td>${livro.publicacao}</td>
                    <td>${livro.edicao}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>