<%-- 
    Document   : listaResultado
    Created on : 03/10/2012, 23:22:33
    Author     : RAMAIANE
--%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Lista Dependentes</title>
         <link type="text/css" rel="stylesheet" href="<c:url value="/css/geral.css"/>"/>
    </head>
    <body>
        <h1>Resultado da Busca</h1>
        
        <table>
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
                        <td><a href="">Detalhes</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
