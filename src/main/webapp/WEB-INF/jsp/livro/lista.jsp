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

        <h2>Lista de livros:</h2>

        <c:choose>
            <c:when test="${empty livroList}">
                <p>Nenhum livro registrado.</p>
            </c:when>

            <c:otherwise>
                <table id="livro_lista" class="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Titulo</th>
                            <th>Editora</th>
                            <th>Autor</th>
                            <th>Ano de Publicação</th>
                            <th>Edição</th>
                            <th></th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach items="${livroList}" var="livro">
                            <tr>
                                <td>${livro.id}</td>
                                <td>${livro.titulo}</td>
                                <td>${livro.editora}</td>
                                <td>${livro.autor}</td>
                                <td>${livro.publicacao}</td>
                                <td>${livro.edicao}</td>
                                <td>
                                    <a href="<c:url value='/livro/info/${livro.id}'/>" class="btn btn-mini btn-primary">Info</a>
                                </td>
                                <td>
                                    <a href="<c:url value='/livro/edita/${livro.id}'/>" class="btn btn-mini">Editar</a>
                                </td>
                                <td>
                                    <a href="<c:url value='/livro/deleta/${livro.id}'/>" class="btn btn-mini btn-danger">Excluir</a>                                                
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:otherwise>
        </c:choose>
                
        <div class="actions">
            <p>
                <a href="<c:url value='/livro/form'/>" class="btn btn-primary">Cadastrar</a> 
                <a href="<c:url value='/livro/busca'/>" class="btn">Buscar</a><br />        
            </p>
        </div>
            
    </body>
</html>