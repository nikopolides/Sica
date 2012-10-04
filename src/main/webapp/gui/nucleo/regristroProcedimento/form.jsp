
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
                <form action="<c:url value="/registroProcedimento/adiciona"/>" method="post">
                </c:when>
                <c:otherwise>
                    <form action="<c:url value="/registroProcedimento/atualizar"/>" method="post">
                    </c:otherwise>
                </c:choose>
                <input type="hidden" name="registroProcedimento.id" value="${registroProcedimento.id}" />
                <input type="hidden" name="registroProcedimento.idAbrigada" value="${idAbrigada}" />
                Data: <input type="text" name="registroProcedimento.data" value="${registroProcedimento.data}" /><br/>
                Procedimentos: <input type="text" name="registroProcedimento.procedimentos" value="${registroProcedimento.procedimentos}" /><br/>
                Observação de Desligamento: <input type="text" name="registroProcedimento.observacaoDesligamento" value="${registroProcedimento.observacaoDesligamento}" /><br/>
                Nome da Assistente Social: <input type="text" name="registroProcedimento.nomeAssistenteSocial" value="${registroProcedimento.nomeAssistenteSocial}" /><br/>
                <input type="hidden" name="registroProcedimento.ativo" value="0" />
                <input type="submit" value="Salvar" />
            </form>
