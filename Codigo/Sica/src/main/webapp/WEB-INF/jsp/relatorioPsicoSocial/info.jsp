
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">       
        <title>Visualizar Relatório PsicoSocial</title>
        <link type="text/css" rel="stylesheet" href="../css/geral.css"/>
    </head>
    <body>
        <h1>Informações do Relatório PsicoSocial:</h1>
        <a href="<c:url value='/relatorioPsicoSocial/form'/>">Cadastrar</a><br />
        <table>
            <tr>
                <td>Ações</td><td>
                    <a href="<c:url value='/relatorioPsicoSocial/deleta/${relatorioPsicoSocial.id}'/>">DELETA</a>
                    | <a href="<c:url value='/relatorioPsicoSocial/edita/${relatorioPsicoSocial.id}'/>">EDITA</a>
                </td>
            <tr>
                <td>ID</td><td>${relatorioPsicoSocial.id}</td>
            </tr>
            <tr>
                <td>ID Abrigada</td><td>${relatorioPsicoSocial.idAbrigada}</td>
            </tr>
            <tr>
                <td>Descrição</td><td>${relatorioPsicoSocial.descrição}</td>
            </tr>            

        </table>
    </body>
</html>
