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
        <link type="text/css" rel="stylesheet" href="<c:url value="/css/geral.css"/>"/>
    </head>
    <body>
        <div class="principal">

            <h2>Lista de dependentes</h2>
            
            <br/><br/>
            
            <table id="tblist" class="table table-striped">
                <thead>
                    <th>Nome</th>
                    <th>Idade</th>
                    <th>Sexo</th>
                    <th>Abrigada</th>
                    <th></th>                    
                </thead>
                <tbody>
                    <c:forEach items="${dependentePedagogiaList}" var="dependentePedagogia">
                        <tr>
                            <td>${dependentePedagogia.nome}</td>
                            <td>${dependentePedagogia.idade}</td>
                            <td>${dependentePedagogia.sexo}</td>
                            <td>${dependentePedagogia.nomeAbrigada}</td>
                            <td>
                                <a href="<c:url value='/dependentePedagogia/info/${dependentePedagogia.idDependente}'/>" class="btn btn-mini btn-primary">Info</a>                                
                                <a href="<c:url value='/dependentePedagogia/edita/${dependentePedagogia.idDependente}'/>" class="btn btn-mini">Editar</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            
            <div class="actions">
                <a href="<c:url value='/dependentePedagogia/form'/>" class="btn btn-primary">Cadastrar</a>
            </div>
        </div>
    </body>
</html>
