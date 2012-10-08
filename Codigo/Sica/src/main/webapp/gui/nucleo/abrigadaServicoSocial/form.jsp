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
                Data Admiss�o: <input type="text" name="abrigadaServicoSocial.dataAdmiss�o" value="${abrigadaServicoSocial.dataAdmiss�o}" /><br/>
                Reincid�ncia: <input type="text" name="abrigadaServicoSocial.dataAdmiss�o" value="${abrigadaServicoSocial.reincidencia}" /><br/>
                Tempo no DF: <input type="text" name="abrigadaServicoSocial.tempoNoDF" value="${abrigadaServicoSocial.tempoNoDF}" /><br/>
                Religi�o: <input type="text" name="abrigadaServicoSocial.religiao" value="${abrigadaServicoSocial.religiao}" /><br/>
                Etnia: <input type="text" name="abrigadaServicoSocial.etnia" value="${abrigadaServicoSocial.etnia}" /><br/>
                Outros cursos: <input type="text" name="abrigadaServicoSocial.outrosCursos" value="${abrigadaServicoSocial.outrosCursos}" /><br/>
                Documentos: <input type="text" name="abrigadaServicoSocial.documentos" value="${abrigadaServicoSocial.documentos}" /><br/>
                Situa��o Socioecon�mica<br/>
                Possui V�nculo empregat�cio: <input type="checkbox" name="abrigadaServicoSocial.empregadaVinculo" value="${abrigadaServicoSocial.empregadaVinculo}" /><br/>
                Sal�rio: <input type="text" name="abrigadaServicoSocial.salario" value="${abrigadaServicoSocial.salario}" /><br/>
                Profiss�o: <input type="text" name="abrigadaServicoSocial.profissao" value="${abrigadaServicoSocial.profissao}" /><br/>
                Desempregada h�: <input type="text" name="abrigadaServicoSocial.desempregadaHa" value="${abrigadaServicoSocial.desempregadaHa}" /><br/>
                Aposentadoria - Valor: <input type="text" name="abrigadaServicoSocial.aposentadoria" value="${abrigadaServicoSocial.aposentadoria}" /><br/>
                Pens�o Aliment�cia - Valor: <input type="text" name="abrigadaServicoSocial.pensaoAlimenticia" value="${abrigadaServicoSocial.pensaoAlimenticia}" /><br/>
                Benefici�ria BPC - Valor: <input type="text" name="abrigadaServicoSocial.beneficiariaBPC" value="${abrigadaServicoSocial.beneficiariaBPC}" /><br/>
                <!--<input type="hidden" name="abrigadaServicoSocial.ativo" value="0" />-->
                <input type="submit" value="Salvar" />
            </form>