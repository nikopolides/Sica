<%-- 
    Document   : form
    Created on : 03/10/2012, 15:41:45
    Author     : Levino
--%>

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
                <form action="<c:url value="/diarioAcompanhamento/adiciona"/>" method="post">
                </c:when>
                <c:otherwise>
                    <form action="<c:url value="/diarioAcompanhamento/atualizar"/>" method="post">
                    </c:otherwise>
                </c:choose>
                <input type="hidden" name="diarioAcompanhamento.id" value="${diarioAcompanhamento.id}" />
                Relatorio: <br/><textarea name="diarioAcompanhamento.relatorio" cols="50" rows="10">${diarioAcompanhamento.relatorio}</textarea><br/>
                Data: <input type="text" name="diarioAcompanhamento.data" value="${diarioAcompanhamento.data}" /><br/>
                Abrigada: <input type="text" name="diarioAcompanhamento.abrigada" value="${diarioAcompanhamento.abrigada}" /><br/>
                Psicologa: <input type="text" name="diarioAcompanhamento.psicologa" value="${diarioAcompanhamento.psicologa}" /><br/>
                <input type="submit" value="Salvar" />
            </form>