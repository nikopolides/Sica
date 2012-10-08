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
                <form action="<c:url value="/quantidadeAbrigamentos/adiciona"/>" method="post">
                </c:when>
                <c:otherwise>
                    <form action="<c:url value="/quantidadeAbrigamentos/atualizar"/>" method="post">
                    </c:otherwise>
                </c:choose>
                <input type="hidden" name="quantidadeAbrigamentos.id" value="${quantidadeAbrigamentos.id}" />
                <input type="hidden" name="quantidadeAbrigamentos.idAbrigada" value="${idAbrigada}" />
                Data de entrada: <input id="quant_entrada"type="text" name="quantidadeAbrigamentos.dataEntrada" value="${quantidadeAbrigamentos.dataEntrada}" /><br/>
                Data de saída: <input id="quant_saida" type="text" name="quantidadeAbrigamentos.dataSaida" value="${quantidadeAbrigamentos.dataSaida}" /><br/>
                Observações: <br/><textarea name="quantidadeAbrigamentos.observacoes" cols="50" rows="10">${quantidadeAbrigamentos.observacoes}</textarea><br/>
                <button id="btn-cadastrar" type="submit"  class="btn btn-info" value="Cadastrar" ><i class="icon-ok icon-white"></i> Cadastrar </button>
            </form>
                