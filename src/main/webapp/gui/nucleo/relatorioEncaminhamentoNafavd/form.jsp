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
                <form action="<c:url value="/relatorioEncaminhamentoNafavd/adiciona"/>" method="post">
                </c:when>
                <c:otherwise>
                    <form action="<c:url value="/relatorioEncaminhamentoNafavd/atualizar"/>" method="post">
                    </c:otherwise>
                </c:choose>
                <input type="hidden" name="relatorioEncaminhamentoNafavd.id" value="${relatorioEncaminhamentoNafavd.id}" />
                <input type="hidden" name="relatorioEncaminhamentoNafavd.idAbrigada" value="${abrigada.id}" />
                <input type="hidden" name="relatorioEncaminhamentoNafavd.idAgressor" value="${agressor.id}" />
                Abrigada:<br/>
                <p style="margin-left: 5%"> 
                    ID: ${abrigada.id}<br/>
                    Nome: ${abrigada.nome}<br/>
                    Telefone: ${abrigada.telefone}<br/>
                    Endereço: ${abrigada.endereco}<br/>
                    Data de nascimento: ${abrigada.dataNascimento}<br/>
                </p>
                NAFAVD:
                <c:choose>
                    <c:when test="${empty relatorioEncaminhamentoNafavd.idNafavd}" >
                        <select  name="relatorioEncaminhamentoNafavd.idNafavd">
                            <c:forEach items="${nafavdList}" var="nafavd">
                                <option value="${nafavd.id}">${nafavd.cidade} - ${nafavd.estado}</option>
                            </c:forEach>
                        </select><br/>
                    </c:when>
                    <c:otherwise>
                            <select  name="relatorioEncaminhamentoNafavd.idNafavd">
                                <c:forEach items="${nafavdList}" var="nafavd">
                                    <c:choose>
                                        <c:when test="${nafavd.id == relatorioEncaminhamentoNafavd.idNafavd}">  
                                            <option value="${nafavd.id}" selected>${nafavd.cidade} - ${nafavd.estado}</option>
                                        </c:when>
                                        <c:otherwise>
                                            <option value="${nafavd.id}">${nafavd.cidade} - ${nafavd.estado}</option>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </select><br/>
                    </c:otherwise>
                </c:choose>
                
                Agressor:<br/>
                <p style="margin-left: 5%"> 
                    Nome: ${agressor.nome}<br/>
                    Telefone: ${agressor.telefone}<br/>
                    Endereço: ${agressor.endereco}<br/>
                    Data de nascimento: ${agressor.dataNascimento}<br/>
                </p>
                Dependentes:<br/>
                <p style="margin-left: 5%"> 
                    <c:forEach items="${dependenteList}" var="dependente">
                            ID(${dependente.id}) - Nome: ${dependente.nome}</br>
                    </c:forEach>
                </p>
                Observações: <br/><textarea name="relatorioEncaminhamentoNafavd.observacoes" cols="50" rows="10">${relatorioEncaminhamentoNafavd.observacoes}</textarea><br/>
                Data de emissão: <input id="relnafavd_data" type="text" name="relatorioEncaminhamentoNafavd.dataEmissao" value="${relatorioEncaminhamentoNafavd.dataEmissao}" /><br/>
                CRP - Psicóloga: <input id="relnafavd_crp" type="text" name="relatorioEncaminhamentoNafavd.crp" value="${relatorioEncaminhamentoNafavd.crp}" /><br/>
                <button id="btn-cadastrar" type="submit"  class="btn btn-info" value="Cadastrar" ><i class="icon-ok icon-white"></i> Cadastrar </button>
            </form>
