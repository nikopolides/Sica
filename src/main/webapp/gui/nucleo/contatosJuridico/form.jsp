<%-- 
    Document   : lista
    Created on : Set 25, 2012, 3:33:05 PM
    Author     : Vinicius Franco e João Guilherme
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

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
        <form action="<c:url value="/contatosJuridico/adiciona"/>" method="post"class="form-horizontal">
        </c:when>
        <c:otherwise>
            <form action="<c:url value="/contatosJuridico/atualizar"/>" method="post">
            </c:otherwise>
        </c:choose>
        <input type="hidden" name="contatosJuridico.id" value="${contatosJuridico.id}" />
        Nome do Local: <input type="text" name="contatosJuridico.nomeLocal" value="${contatosJuridico.nomeLocal}" /><br/>
        Nome do Contato: <input type="text" name="contatosJuridico.nomeContato" value="${contatosJuridico.nomeContato}" /><br/>
        Email: <input type="text" name="contatosJuridico.email" value="${contatosJuridico.email}" /><br/>
        Telefone: <input type="text" name="contatosJuridico.telefone" value="${contatosJuridico.telefone}" /><br/>
        <button class="btn"> Salvar </button>
    </form>
