<%-- 
    Document   : lista
    Created on : Oct 03, 2012, 20:26:28 AM
    Author     : Fernando
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
                <form action="<c:url value="/dependenteServicoSocial/adiciona"/>" method="post">
                </c:when>
                <c:otherwise>
                    <form action="<c:url value="/dependenteServicoSocial/atualizar"/>" method="post">
                    </c:otherwise>
                </c:choose>
                <input type="hidden" name="dependenteServicoSocial.id" value="${dependenteServicoSocial.id}" />
                <input type="hidden" name="dependenteServicoSocial.idAbrigada" value="${idAbrigada}" />
                Em caso de não abrigamento informar endereço, nome, telefone, grau de parentesco e outros.
                <input type="text" name="abrigadaServicoSocial.documentos" value="${dependenteServicoSocial.naoAbrigamento}" /><br/>
                É do sexo masculino e maior de 13 anos: <input type="checkbox" name="dependenteServicoSocial.documentos" value="${dependenteServicoSocial.sexoMascTreze}" /><br/>
                Não corre risco: <input type="checkbox" name="dependenteServicoSocial.documentos" value="${dependenteServicoSocial.naoCorreRisco}" /><br/>
                Documentos: <input type="text" name="dependenteServicoSocial.documentos" value="${dependenteServicoSocial.documentos}" /><br/>
                Recebe auxílio: <input type="checkbox" name="dependenteServicoSocial.documentos" value="${dependenteServicoSocial.recebeAuxilio}" /><br/>
                Qual? Se não, porque? <input type="text" name="dependenteServicoSocial.documentos" value="${dependenteServicoSocial.qualPorqueNao}" /><br/>
                CRAS. Qual e por qual motivo? <input type="text" name="dependenteServicoSocial.documentos" value="${dependenteServicoSocial.cras}" /><br/>
                CREAS. Qual e por qual motivo? <input type="text" name="dependenteServicoSocial.documentos" value="${dependenteServicoSocial.creas}" /><br/>
                Conselho Tutelar. Qual e por qual motivo? <input type="text" name="dependenteServicoSocial.documentos" value="${dependenteServicoSocial.conselhoTutelar}" /><br/>
                Vara de Infância. Qual e por qual motivo? <input type="text" name="dependenteServicoSocial.documentos" value="${dependenteServicoSocial.varaInfancia}" /><br/>
                Outra Instituição. Qual e por qual motivo? <input type="text" name="dependenteServicoSocial.documentos" value="${dependenteServicoSocial.outraInstituicao}" /><br/>
                <!--<input type="hidden" name="abrigadaServicoSocial.ativo" value="0" />-->
                <input type="submit" value="Salvar" />
            </form>