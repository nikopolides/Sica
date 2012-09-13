<%-- 
    Document   : form
    Created on : Jun 10, 2012, 10:30:17 PM
    Author     : 
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
                <form action="<c:url value="/livro/adiciona"/>" method="post">
                </c:when>
                <c:otherwise>
                    <form action="<c:url value="/livro/atualizar"/>" method="post">
                    </c:otherwise>
                </c:choose>
                <input type="hidden" name="livro.id" value="${livro.id}" />
                Titulo: <input type="text" name="livro.titulo" value="${livro.titulo}" /><br/>
                Editora: <input type="text" name="livro.editora" value="${livro.editora}" /><br/>
                Autor: <input type="text" name="livro.autor" value="${livro.autor}" /><br/>
                Ano de Publicação: <input type="text" name="livro.publicacao" value="${livro.publicacao}" /><br/>
                <input type="submit" value="Salvar" />
            </form>
    </body>
</html>
