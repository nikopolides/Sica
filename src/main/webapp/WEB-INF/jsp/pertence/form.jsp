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
        <link type="text/css" rel="stylesheet" href="../../css/geral.css"/>
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
                <form action="<c:url value="/pertence/adiciona"/>" method="post">
                </c:when>
                <c:otherwise>
                    <form action="<c:url value="/pertence/atualizar"/>" method="post">
                    </c:otherwise>
                </c:choose>
                <input type="hidden" name="pertence.id" value="${pertence.id}" />
                <input type="hidden" name="pertence.idAbrigada" value="${idAbrigada}" />
                Descricao: <input type="text" name="pertence.descricao" value="${pertence.descricao}" /><br/>
                Quantidade: <input type="text" name="pertence.quantidade" value="${pertence.quantidade}" /><br/>
                Categoria: <input type="text" name="pertence.categoria" value="${pertence.categoria}" /><br/>
                <input type="submit" value="Salvar" />
            </form>
    </body>
</html>
