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
                <form id="form_abrigadaPsicologia" action="<c:url value="/abrigadaPsicologia/adiciona"/>" method="post">
                </c:when>
                <c:otherwise>
                    <form action="<c:url value="/abrigadaPsicologia/atualizar"/>" method="post">
                    </c:otherwise>
                </c:choose>
                <input type="hidden" name="abrigadaPsicologia.id" value="${abrigadaPsicologia.id}" />
                <input type="hidden" name="abrigadaPsicologia.idAbrigada" value="${idAbrigada}" />
                Em caso de nao abrigamento: <input type="text" name="abrigadaPsicologia.emCasoDeNaoAbrigamento" value="${abrigadaPsicologia.emCasoDeNaoAbrigamento}" /><br/>
                Nome do parente: <input type="text" name="abrigadaPsicologia.parenteNome" value="${abrigadaPsicologia.parenteNome}" /><br/>
                Endereco do parente: <input type="text" name="abrigadaPsicologia.parenteEndereco" value="${abrigadaPsicologia.parenteEndereco}" /><br/>
                Telefone do parente: <input type="text" name="abrigadaPsicologia.parenteTelefone" value="${abrigadaPsicologia.parenteTelefone}" /><br/>
                Sexo masculino acima de 13 anos: <input type="text" name="abrigadaPsicologia.sexoMasculinoAcima" value="${abrigadaPsicologia.sexoMasculinoAcima}" /><br/>
                Não corre risco: <input type="text" name="abrigadaPsicologia.naoCorreRisco" value="${abrigadaPsicologia.naoCorreRisco}" /><br/>
                Outros: <input type="text" name="abrigadaPsicologia.outrosAbrigamento" value="${abrigadaPsicologia.outrosAbrigamento}" /><br/>
                Demais membros da Familia:<input type="text" name="abrigadaPsicologia.demaisMembrosDaFamilia" value="${abrigadaPsicologia.demaisMembrosDaFamilia}" /><br/>
                Laqueadura Tubaria: <input type="text" name="abrigadaPsicologia.laqueaduraTubaria" value="${abrigadaPsicologia.laqueaduraTubaria}" /><br/>
                Gestante: <input type="text" name="abrigadaPsicologia.gestante" value="${abrigadaPsicologia.gestante}" /><br/>
                Em caso de sim. Onde?: <input type="type" name="abrigadaPsicologia.simOnde" value="${abrigadaPsicologia.simOnde}" /><br/> 
                Em caso de nao. Por quê?: <input type="text" name="abrigadaPsicologia.naoPorque" value="${abrigadaPsicologia.naoPorque}" /><br/>
                Contracepcao Oral/Injetavel: <input type="text" name="abrigadaPsicologia.contracepcaoOralInjetavel" value="${abrigadaPsicologia.contracepcaoOralInjetavel}" /><br/>
                Usa DIU: <input type="text" name="abrigadaPsicologia.diu" value="${abrigadaPsicologia.diu}" /><br/>
                Não faz uso de contracepcao: <input type="text" name="abrigadaPsicologia.naoFazUsoDeContracepcao" value="${abrigadaPsicologia.naoFazUsoDeContracepcao}" /><br/>
                Visual: <input type="text" name="abrigadaPsicologia.visual" value="${abrigadaPsicologia.visual}" /><br/>
                Auditiva /de Fala: <input type="text" name="abrigadaPsicologia.auditivaFala" value="${abrigadaPsicologia.auditivaFala}" /><br/>
                Fisica: <input type="text" name="abrigadaPsicologia.fisica" value="${abrigadaPsicologia.fisica}" /><br/>
                Mental: <input type="text" name="abrigadaPsicologia.mental" value="${abrigadaPsicologia.mental}" /><br/>
                Historico de acompanhamento psiquiatrico?: <input type="text" name="abrigadaPsicologia.historicoAcompanhamentoMental" value="${abrigadaPsicologia.historicoAcompanhamentoMental}" /><br/>
                Outra: <input type="text" name="abrigadaPsicologia.outra" value="${abrigadaPsicologia.outra}" /><br/>
                Uso de drogas Licitas e Ilicitas: <input type="text" name="abrigadaPsicologia.drogasLicitasIlicitas" value="${abrigadaPsicologia.drogasLicitasIlicitas}" /><br/>
                Em caso de sim. Quais?: <input type="text" name="abrigadaPsicologia.simQuais" value="${abrigadaPsicologia.simQuais}" /><br/>
                Com que frequencia?: <input type="text" name="abrigadaPsicologia.comQueFrequencia" value="${abrigadaPsicologia.comQueFrequencia}" /><br/>
                Possui alguma doença?: <input type="text" name="abrigadaPsicologia.possuiAlgumaDoenca" value="${abrigadaPsicologia.possuiAlgumaDoenca}" /><br/>
                Cronica: <input type="text" name="abrigadaPsicologia.cronica" value="${abrigadaPsicologia.cronica}" /><br/>
                Outras. Quais?: <input type="text" name="abrigadaPsicologia.outrasQuais" value="${abrigadaPsicologia.outrasQuais}" /><br/>
                Possui alergias?: <input type="text" name="abrigadaPsicologia.possuiAlergias" value="${abrigadaPsicologia.possuiAlergias}" /><br/>
                Medicamentos: <input type="text" name="abrigadaPsicologia.medicamentos" value="${abrigadaPsicologia.medicamentos}" /><br/>
                Outros: <input type="text" name="abrigadaPsicologia.outrosAlergia" value="${abrigadaPsicologia.outrosAlergia}" /><br/>
                Faz uso de medicações controladas?: <input type="text" name="abrigadaPsicologia.medicacoesControladas" value="${abrigadaPsicologia.medicacoesControladas}" /><br/>
                Em caso de sim. Quais medicações?: <input type="text" name="abrigadaPsicologia.simQuaisMedicacoes" value="${abrigadaPsicologia.simQuaisMedicacoes}" /><br/>
                Usuario de substancias psicoativas: <input type="text" name="abrigadaPsicologia.substanciasPsicoativas" value="${abrigadaPsicologia.substanciasPsicoativas}" /><br/>
                Em caso de sim. Quais substancias psicoativas?: <input type="text" name="abrigadaPsicologia.simQuaisPsicoativas" value="${abrigadaPsicologia.simQuaisPsicoativas}" /><br/>
                É agressivo com os filhos?: <input type="text" name="abrigadaPsicologia.agressivoFilhos" value="${abrigadaPsicologia.agressivoFilhos}" /><br/>
                É agressivo com os familiares?: <input type="text" name="abrigadaPsicologia.agressivoFamiliares" value="${abrigadaPsicologia.agressivoFamiliares}" /><br/>
                É agressivo com outras pessoas?: <input type="text" name="abrigadaPsicologia.agressivoOutros" value="${abrigadaPsicologia.agressivoOutros}" /><br/>
                Está sendo acompanhado em Núcleo, CRAM/ outro?: <input type="text" name="abrigadaPsicologia.estaSendoAcompanhadoEmNucleoCramOutro" value="${abrigadaPsicologia.estaSendoAcompanhadoEmNucleoCramOutro}" /><br/>
                Tem conhecimento historico psiquiatrico ou uso de medicamentos controlado?: <input type="text" name="abrigadaPsicologia.temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado" value="${abrigadaPsicologia.temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado}" /><br/>
                Em caso de sim. Especificar: <input type="text" name="abrigadaPsicologia.simEspecificar" value="${abrigadaPsicologia.simEspecificar}" /><br/>
                Encaminhamentos/ Observações: <input type="text" name="abrigadaPsicologia.encaminhamentosObservacoes" value="${abrigadaPsicologia.encaminhamentosObservacoes}" /><br/>
                
                <button id="btn-cadastrar" type="submit"  class="btn btn-info" value="Cadastrar" ><i class="icon-ok icon-white"></i> Cadastrar </button>
            </form>