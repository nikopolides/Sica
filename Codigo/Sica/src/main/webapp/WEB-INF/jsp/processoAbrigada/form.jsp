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
        <form action="<c:url value="/processoAbrigada/adiciona"/>" method="post" class="form-horizontal span11 row">
        </c:when>
        <c:otherwise>
            <form action="<c:url value="/processoAbrigada/atualizar"/>" method="post">
            </c:otherwise>
        </c:choose>
            <input type="hidden" name="processoAbrigada.id" value="${processoAbrigada.id}" />
            <div id="form_esquerda" class="span5 row"> 
                Nome: ${abrigada.nome}<br/><br/>
                N&ordm; do Boletim de Ocorr&ecirc;ncia:<br/><input name="processoAbrigada.numeroBoletimOcorrencia" value="${processoAbrigada.numeroBoletimOcorrencia}">
                &Oacute;rg&atilde;o de Encaminhamento:<br/><input name="processoAbrigada.orgaoEncaminhamento" value="${processoAbrigada.orgaoEncaminhamento}">   
                Requereu Medidas Protetivas:<br/> Sim <input type="radio" value="sim" name="medidasProtetivas"> Nao <input type="radio" value="sim"  name="medidasProtetivas">
            </div>
            <!--<input type="submit" class="btn btn-info" value="Cadastrar" />-->

            <div class="span12 row">
                <input type="submit" value="Submeter" class="btn btn-primary center" id="btn-cadastrar"/>
            </div>
    </form>
