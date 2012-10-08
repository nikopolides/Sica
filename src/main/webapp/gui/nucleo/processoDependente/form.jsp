<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <form action="<c:url value="/processo/adiciona"/>" method="post" class="form-horizontal span11 row">
        </c:when>
        <c:otherwise>
            <form action="<c:url value="/processo/atualizar"/>" method="post">
            </c:otherwise>
        </c:choose>
            <input type="hidden" name="processo.id" value="${processo.id}" />
            <div id="form_esquerda" class="span5 row"> 
                <label>Nome: ${abrigada.nome}<br/></label><br/>
                <label>Descrição:<br/><textarea name="processo.descricao" rows="10" cols="100" placeholder="Descricao" >${processo.descricao}</textarea></label>
            </div>
            <!--<input type="submit" class="btn btn-info" value="Cadastrar" />-->

            <div class="span12 row">
                <input type="submit" value="Submeter" class="btn btn-primary center" id="btn-cadastrar"/>
            </div>
    </form>
