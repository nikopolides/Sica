<%-- 
    Document   : form
    Created on : Jun 10, 2012, 10:30:17 PM
    Author     : 
--%>
        <c:if test="${errors != null}">
            <div id="erro">
                Erros:<br />
                <c:forEach var="error" items="${errors}">
                    ${error.category} ${error.message}<br />
                </c:forEach>
            </div>
        </c:if>
        <legend>Cadastro - Agressor</legend>
        <c:choose>
            <c:when test="${empty action}" >
                <form name="form_agressor" action="<c:url value="/agressor/adiciona"/>" method="post">
                </c:when>
                <c:otherwise>
                    <form action="<c:url value="/agressor/atualizar"/>" method="post">
                    </c:otherwise>
                </c:choose>
                <div id="form_esquerda" class="alpha grid_5 omega">          
                    <input type="hidden" name="agressor.id" value="${agressor.id}" />
                    <input type="hidden" name="agressor.idAbrigada" value="${idAbrigada}" />
                    Nome: <input type="text" name="agressor.nome" value="${agressor.nome}" /><br/>
                    Telefone: <input type="text" onclick="someBalao('agressor_telefone')" onblur="someBalao('agressor_telefone')" id="agressor_telefone" name="agressor.telefone" value="${agressor.telefone}" /><br/>
                    Sexo: &nbsp;&nbsp;
                        Maculino <input type="radio" name="agressor.sexo" value="Masculino" <c:if test="${agressor.sexo == 'Masculino'}"> checked="checked" </c:if>> 
                        Feminimo <input type="radio" name="agressor.sexo" value="Feminino" <c:if test="${agressor.sexo == 'Feminino'}"> checked="checked" </c:if>> <br/>
                    Parentesco: <input type="text" name="agressor.parentesco" value="${agressor.parentesco}" /><br/>
                    Idade: <input type="text" name="agressor.idade" value="${agressor.idade}" /><br/>
                    Escolaridade: <input type="text" name="agressor.escolaridade" value="${agressor.escolaridade}" /><br/>
                    Endereço: <input type="text" name="agressor.endereco" value="${agressor.endereco}" /><br/>
                    Estado Civil: &nbsp;&nbsp;
                    <select  name="agressor.estadoCivil">    
                            <option value="Casado" <c:if test="${agressor.estadoCivil == 'Casado'}"> selected="selected" </c:if>>Casado</option> 
                            <option value="União estável" <c:if test="${agressor.estadoCivil == 'União estável'}"> selected="selected" </c:if>>União estável</option>
                            <option value="Solteiro" <c:if test="${agressor.estadoCivil == 'Solteiro'}"> selected="selected" </c:if>>Solteiro </option>
                            <option value="Divorciado" <c:if test="${agressor.estadoCivil == 'Divorciado'}"> selected="selected" </c:if>>Divorciado</option>
                            <option value="Viúvo" <c:if test="${agressor.estadoCivil == 'Viúvo'}"> selected="selected" </c:if>>Viúvo</option>
                            <option value="Convivente" <c:if test="${agressor.estadoCivil == 'Convivente'}"> selected="selected" </c:if>>Convivente</option>
                    </select><br/>
                    Situação econômica: <input type="text" name="agressor.situacaoSocioeconomica" value="${agressor.situacaoSocioeconomica}" /><br/>
                    Salário:<input type="text" name="agressor.salario" value="${agressor.salario}" /><br/>
                    Profissão: <input type="text" name="agressor.profissao" value="${agressor.profissao}" /><br/>
                </div>
                <div id="form_direita" class="alpha grid_5 omega">
                    Desempregado: <input type="text" name="agressor.desempregado" value="${agressor.desempregado}" /><br/>
                    Antecendentes: <input type="text" name="agressor.antecedentes" value="${agressor.antecedentes}" /><br/>
                    Faz uso de substância psicoativas: <input type="text" name="agressor.substanciasPsicoativas" value="${agressor.substanciasPsicoativas}" /><br/>
                    É agressivo com: <input type="text" name="agressor.agressivo" value="${agressor.agressivo}" /><br/>
                    Está sendo acompanhado em núcleo? <input type="text" name="agressor.acompanhadoNucleo" value="${agressor.acompanhadoNucleo}" /><br/>
                    Tem conhecimento de histórico psiquiátrico? &nbsp;&nbsp;
                        Sim <input type="radio" name="agressor.historicoPsiquiatrico" value="Sim" <c:if test="${agressor.historicoPsiquiatrico == 'Sim'}"> checked="checked" </c:if>> 
                        Não <input type="radio" name="agressor.historicoPsiquiatrico" value="Não" <c:if test="${agressor.historicoPsiquiatrico == 'Não'}"> checked="checked" </c:if>> <br/>
                    Faz uso de medicamento controlado? &nbsp;&nbsp;
                        Sim <input type="radio" name="agressor.medicamentoControlado" value="Sim" <c:if test="${agressor.medicamentoControlado == 'Sim'}"> checked="checked" </c:if>> 
                        Não <input type="radio" name="agressor.medicamentoControlado" value="Não" <c:if test="${agressor.medicamentoControlado == 'Não'}"> checked="checked" </c:if>> <br/>
                    Religião: <input type="text" name="agressor.religiao" value="${agressor.religiao}" /><br/>
                    Data de nascimento: <input type="text" onclick="someBalao('agressor_nascimento')" onblur="someBalao('agressor_nascimento')" id="agressor_nascimento" name="agressor.dataNascimento" value="${agressor.dataNascimento}" /><br/>
                    Naturalidade: <input type="text" name="agressor.naturalidade" value="${agressor.naturalidade}" /><br/>
                    Encaminhamentos/Observações: <input type="text" name="agressor.observacoes" value="${agressor.observacoes}" /><br/>
                </div>
                <button id="btn-cadastrar" type="button" onclick="document.form_agressor.submit()" class="btn btn-info" value="Cadastrar" ><i class="icon-ok icon-white"></i> Cadastrar </button>
            </form>