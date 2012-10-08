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

            <h2>Pesquisar</h2><br/><br/>

            <form action="<c:url value="/dependentePedagogia/listaResultado"/>" method="get" class="form-search">


                Nome :<input type="text" name="nomePesquisado" value="${nomePesquisado}" class="search-query">
                
                <input type="submit" value="Pesquisar" class="btn btn-primary"/>

            </form>

            <br/><br/>
            
            <c:if test="${action != null}">
                <h3>Resultado da Busca</h3>
                <c:choose>
                    <c:when test="${empty dependentePedagogiaList}">
                        <div id="busca_vazia">
                            <p>A busca não retornou nenhum resultado.</p>
                        </div>    
                    </c:when>

                    <c:otherwise>
                        <table class="table table-striped">
                            <thead>
                                <tr>  
                                    <th>
                                        Dependente
                                    </th>
                                    <th>

                                    </th>
                                </tr>
                            </thead>

                            <tbody>
                                <c:forEach items="${dependentePedagogiaList}" var="dependentePedagogia">
                                    <tr>
                                        <td>${dependentePedagogia.nome}</td>
                                        <td><a href="<c:url value='/dependentePedagogia/info/${dependentePedagogia.idDependente}'/>" class="btn btn-mini btn-primary">Info</a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </c:otherwise>
                </c:choose>
            </c:if>
         <div class="actions">
            <p>
                <a href="<c:url value='/dependentePedagogia/form'/>" class="btn btn-primary">Cadastrar</a>       
            </p>
        </div>
        </div>

    </body>
</html>
