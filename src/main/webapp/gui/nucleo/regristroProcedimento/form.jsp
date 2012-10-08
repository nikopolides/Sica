
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
                <form id="form_registro_procedimento" action="<c:url value="/registroProcedimento/adiciona"/>" method="post" class="alpha grid_11 omega">
                </c:when>
                <c:otherwise>
                    <form id="form_registro_procedimento" action="<c:url value="/registroProcedimento/atualizar"/>" method="post" class="alpha grid_11 omega">
                    </c:otherwise>
                </c:choose>
                
                <div id="form_procedimento_esquerda" class="grid_4">
                    <input type="hidden" name="registroProcedimento.id" value="${registroProcedimento.id}" /></label>
                    <input type="hidden" name="registroProcedimento.idAbrigada" value="${idAbrigada}" /></label>
                    <label>Data do procedimento: <br> <input type="date" name="registroProcedimento.data" value="${registroProcedimento.data}" /><br/></label>
                    <label>Procedimentos: <br> <textarea name="registroProcedimento.procedimentos" value="${registroProcedimento.procedimentos}"></textarea><br/></label>
                </div>
                
                <div id="form_procedimento_direita" class="push_2 grid_4">
                    <label>Nome da Assistente Social: <input type="text" name="registroProcedimento.nomeAssistenteSocial" value="${registroProcedimento.nomeAssistenteSocial}" /><br/></label>
                    <label>Observação de Desligamento: <textarea name="registroProcedimento.observacaoDesligamento" value="${registroProcedimento.observacaoDesligamento}"></textarea><br/></label>
                    
                    <input type="hidden" name="registroProcedimento.ativo" value="0" />
                </div>
                </form>    
                
                <center>
                    <button onclick="submitForm('form_registro_procedimento')" class="btn btn-info">Salvar</button>
                </center>
                
            
