<%-- 
    Document   : lista
    Created on : Sep 20, 2012, 19:40:54 AM
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
                <form action="<c:url value="/abrigadaServicoSocial/adiciona"/>" method="post">
                </c:when>
                <c:otherwise>
                    <form action="<c:url value="/abrigadaServicoSocial/atualizar"/>" method="post">
                    </c:otherwise>
                </c:choose>
                <input type="hidden" name="abrigadaServicoSocial.id" value="${abrigadaServicoSocial.id}" />
                <input type="hidden" name="abrigadaServicoSocial.idAbrigada" value="${idAbrigada}" />
                Data Admissão: <input type="text" name="abrigadaServicoSocial.dataAdmissão" value="${abrigadaServicoSocial.dataAdmissão}" /><br/>
                Reincidência: <input type="text" name="abrigadaServicoSocial.dataAdmissão" value="${abrigadaServicoSocial.reincidencia}" /><br/>
                Tempo no DF: <input type="text" name="abrigadaServicoSocial.tempoNoDF" value="${abrigadaServicoSocial.tempoNoDF}" /><br/>
                Religião: <input type="text" name="abrigadaServicoSocial.religiao" value="${abrigadaServicoSocial.religiao}" /><br/>
                Etnia: <input type="text" name="abrigadaServicoSocial.etnia" value="${abrigadaServicoSocial.etnia}" /><br/>
                Outros cursos: <input type="text" name="abrigadaServicoSocial.outrosCursos" value="${abrigadaServicoSocial.outrosCursos}" /><br/>
                Documentos: <input type="text" name="abrigadaServicoSocial.documentos" value="${abrigadaServicoSocial.documentos}" /><br/>
                Situação Socioeconômica<br/>
                Possui Vínculo empregatício: <input type="checkbox" name="abrigadaServicoSocial.empregadaVinculo" value="${abrigadaServicoSocial.empregadaVinculo}" /><br/>
                Salário: <input type="text" name="abrigadaServicoSocial.salario" value="${abrigadaServicoSocial.salario}" /><br/>
                Profissão: <input type="text" name="abrigadaServicoSocial.profissao" value="${abrigadaServicoSocial.profissao}" /><br/>
                Desempregada há: <input type="text" name="abrigadaServicoSocial.desempregadaHa" value="${abrigadaServicoSocial.desempregadaHa}" /><br/>
                Aposentadoria - Valor: <input type="text" name="abrigadaServicoSocial.aposentadoria" value="${abrigadaServicoSocial.aposentadoria}" /><br/>
                Pensão Alimentícia - Valor: <input type="text" name="abrigadaServicoSocial.pensaoAlimenticia" value="${abrigadaServicoSocial.pensaoAlimenticia}" /><br/>
                Beneficiária BPC - Valor: <input type="text" name="abrigadaServicoSocial.beneficiariaBPC" value="${abrigadaServicoSocial.beneficiariaBPC}" /><br/>
                <!--<input type="hidden" name="abrigadaServicoSocial.ativo" value="0" />-->
                <input type="submit" value="Salvar" />
            </form>