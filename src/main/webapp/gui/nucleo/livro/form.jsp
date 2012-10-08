<%-- 
    Document   : form
    Created on : Jun 10, 2012, 10:30:17 PM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/css/geral.css"/>"/>
    </head>
    <body>
        <div class="principal">
            <c:if test="${errors != null}">
                <div id="erro">
                    Erros:<br />
                    <c:forEach var="error" items="${errors}">
                        ${error.category} ${error.message}<br />
                    </c:forEach>
                </div>
            </c:if>


            <c:choose>
                <c:when test="${empty action}" >
                    <h2>Cadastro de Livro</h2><br/><br/>
                    <form action="<c:url value="/livro/adiciona"/>" method="post" class="form-horizontal">
                    </c:when>
                    <c:otherwise>
                        <h2>Cadastro de Livro</h2><br/><br/>
                        <form action="<c:url value="/livro/atualizar"/>" method="post" class="form-horizontal">
                        </c:otherwise>
                    </c:choose>

                    <input type="hidden" name="livro.id" value="${livro.id}" />
                    <input type="hidden" name="livro.id" value="${Id}" />
                    <div class="control-group">
                        <label class="control-label" for="inputTitulo">Título</label>
                        <div class="controls"><input id="inputTitulo" type="text" name="livro.titulo" value="${livro.titulo}"/></div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="inputAutor">Autor</label>
                        <div class="controls"><input id="inputAutor" type="text" name="livro.autor" value="${livro.autor}"/></div>
                    </div>

                    <div class="control-group">
                        <label class="control-label" for="inputEditora">Editora</label>
                        <div class="controls"><input id="inputEditora" type="text" name="livro.editora" value="${livro.editora}"/></div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="inputEdicao">Edição</label>
                        <div class="controls"><input id="inputEdicao" type="text" name="livro.edicao" value="${livro.edicao}"/></div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="inputPublicacao">Ano de Publicação</label>
                        <div class="controls"><input id="inputPublicacao" type="text" name="livro.publicacao" value="${livro.publicacao}"/></div>
                    </div>

                    <div class="form-actions">
                        <input type="submit" value="Salvar" class="btn btn-primary"/>
                    </div>
                </form>
        </div>
    </body>
</html>
