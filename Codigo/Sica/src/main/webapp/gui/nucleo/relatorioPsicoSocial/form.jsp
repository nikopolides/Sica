<%-- 
    Document   : form
    Created on : 21/09/2012, 23:03:28
    Author     : TonGarcia
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
                    <form action="<c:url value="/relatorioPsicoSocial/adiciona"/>" method="post">
                    </c:when>
                    <c:otherwise>
                        <form action="<c:url value="/relatorioPsicoSocial/atualizar"/>" method="post">
                        </c:otherwise>
                    </c:choose>
                    <input type="hidden" name="relatorioPsicoSocial.id" value="${relatorioPsicoSocial.id}" />
                    
                    <input type="hidden" name="relatorioPsicoSocial.idAbrigada" value="${idAbrigada}" />
                    <label>Descricao: <textarea row="100" cols="20" name="relatorioPsicoSocial.descricao" value="${relatorioPsicoSocial.descricao}"></textarea></label>
                    <div id="rbRelatorioAtivo" class="rbSica">
                        Ativo? 
                        <input type="radio" name="relatorioPsicoSocial.ativo" value="1"> Sim
                        <input type="radio" name="relatorioPsicoSocial.ativo" value="0"> Não
                    </div>
                    <button class="btn"> Salvar </button>
                </form>

