<%-- 
    Document   : form
    Created on : Jun 10, 2012, 10:30:17 PM
    Author     : Ana Paula
--%>

        <h1> Formul&aacute;rio Desligamento </h1>
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
                <form action="<c:url value="/desligamentoJuridico/adiciona"/>" method="post">
            </c:when>
            <c:otherwise>
                <form action="<c:url value="/desligamentoJuridico/atualizar"/>" method="post">
            </c:otherwise>
        </c:choose>
                    <textarea name="desligamentoJuridico.descricaoDesligamento" cols="100" rows="10"> ${desligamentoJuridico.descricaoJuridico} </textarea> <br/>
                    <input type="submit" value="Salvar" />
                </form>
