<%-- 
    Document   : form
    Created on : 03/10/2012, 14:33:20
    Author     : Winstein
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
                <form name="form_acompanhamentoAbrigada" action="<c:url value="/acompanhamentoAbrigada/adiciona"/>" method="post">
                </c:when>
                <c:otherwise>
                    <form action="<c:url value="/acompanhamentoAbrigada/atualizar"/>" method="post">
                    </c:otherwise>
                </c:choose>
                    <input type="hidden" name="acompanhamentoAbrigada.id" value="${acompanhamentoAbrigada.id}" />
                    <input type="hidden" name="acompanhamentoAbrigada.idAbrigada" value="${idAbrigada}" />
                    
                    <label>
                        Data do Registro:  
                        <input data-placement="left" onclick="someBalao('acompanhamentoAbrigada_dataRegistro')" onblur="someBalao('acompanhamentoAbrigada_dataRegistro')" id="acompanhamentoAbrigada_dataRegistro" type="text" name="acompanhamentoAbrigada.dataRegistro" value="${acompanhamentoAbrigada.dataRegistro}" /><br/>
                    </label>
                    <label>
                        Relato:
                        <textarea data-placement="left" onclick="someBalao('acompanhamentoAbrigada_relato')" onblur="someBalao('acompanhamentoAbrigada_relato')" id="acompanhamentoAbrigada_relato" name="acompanhamentoAbrigada.relato" cols="50" rows="10">${acompanhamentoAbrigada.relato}</textarea><br/>
                    </label>
                    
                    <center>
                        <button id="btn-cadastrar" type="button" onclick="document.form_acompanhamentoAbrigada.submit()" class="btn btn-info" value="Cadastrar" ><i class="icon-ok icon-white"></i> Cadastrar </button>
                    </center>
                </form>