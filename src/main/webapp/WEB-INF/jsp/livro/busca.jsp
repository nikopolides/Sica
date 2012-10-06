<%-- 
    Document   : procura
    Created on : 03/10/2012, 03:58:04
    Author     : sica
--%>

<%@page import="com.sica.entity.DependentePedagogia"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
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
        
       
       
        <form action="<c:url value="/livro/listaResultado"/>" method="get">
            <h1>Pesquisar</h1>
            
            Titulo/Autor :<input type="text" name="tituloPesquisado" value="${termoPesquisado}"><br/>
           
            <input type="submit" value="Pesquisar" />
                        
          
        </form>
        
            <c:if test="${action != null}">
            <h2>Resultado da Busca</h2>

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

        </c:if>

 
            
    </body>
</html>
