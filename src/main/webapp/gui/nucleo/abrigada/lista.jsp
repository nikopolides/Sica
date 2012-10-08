<%-- 
    Document   : lista
    Created on : Jun 12, 2012, 3:33:05 PM
    Author     : Leonn Ferreira
--%>

        <table id="tblist" border="1" class="table table-hover">
            <thead>
            <th>Ações</th>
            <th>ID</th>
            <th>Nome</th>
            <th>Cpf</th>
            <th>Telefones</th>
        </thead>
        <tbody>
            <c:forEach items="${abrigadaList}" var="abrigada">
                <tr>
                    <td>
                        <a href="<c:url value='/abrigada/deleta/${abrigada.id}'/>">DELETA</a>
                        <br>
                        <a href="<c:url value='/abrigada/edita/${abrigada.id}'/>">EDITA</a>
                        <br>
                        <a href="<c:url value='/quantidadeAbrigamentos/form/${abrigada.id}?nome=${abrigada.nome}'/>">DESLIGAR ABRIGADA</a>
                        <br>
                        <a href="<c:url value='/quantidadeAbrigamentos/lista/${abrigada.id}?nome=${abrigada.nome}'/>">LISTA DE ABRIGAMENTOS</a>
                        <br>
                        <a href="<c:url value='/abrigadaPsicologia/form/${abrigada.id}?nome=${abrigada.nome}' />">CADASTRAR ABRIGADA PARTE PSICOLOGIA</a>
                        <br>
                        <a href="<c:url value='/dependente/form/${abrigada.id}?nome=${abrigada.nome}' />">CADASTRAR DEPENDENTE</a>
                        <br>
                        <a href="<c:url value='/dependente/lista/${abrigada.id}?nome=${abrigada.nome}' />">VISUALIZA DEPENDENTES</a>
                        <br>
                        <a href="<c:url value='/pertence/form/${abrigada.id}?nome=${abrigada.nome}' />">CADASTRAR PERTENCE</a>
                        <br>
                        <a href="<c:url value='/pertence/lista/${abrigada.id}?nome=${abrigada.nome}' />">VISUALIZA PERTENCE</a>
                        <br>
                        <a href="<c:url value='/agressor/form/${abrigada.id}?nome=${abrigada.nome}' />">CADASTRAR AGRESSOR</a>
                        <br>
                        <a href="<c:url value='/agressor/lista/${abrigada.id}?nome=${abrigada.nome}' />">VISUALIZA AGRESSORES</a>
                        <br>
                        <a href="<c:url value='/relatoriopsicosocial/form/${abrigada.id}?nome=${abrigada.nome}' />">CADASTRAR RELATORIO PSICO-SOCIAL</a>
                        <br>
                        <a href="<c:url value='/relatorioEncaminhamentoNafavd/form/${abrigada.id}?nome=${abrigada.nome}' />">CADASTRAR RELATÓRIO DE ENCAMINHAMENTO AO NAFAVD</a>
                        <br>
                        <a href="<c:url value='/relatorioEncaminhamentoNafavd/lista/${abrigada.id}?nome=${abrigada.nome}' />">VIZUALIZA RELATÓRIOS DE ENCAMINHAMENTO AO NAFAVD</a>
                        <br>
                        <a href="<c:url value='/relatorioEncaminhamentoServicoRede/form/${abrigada.id}?nome=${abrigada.nome}' />">CADASTRAR RELATÓRIO DE ENCAMINHAMENTO A SERVIÇOS DA REDE</a>
                        <br>
                        <a href="<c:url value='/relatorioEncaminhamentoServicoRede/lista/${abrigada.id}?nome=${abrigada.nome}' />">VIZUALIZA RELATÓRIOS DE ENCAMINHAMENTO A SERVIÇOS DA REDE</a>
                        <br>
                        <a href="<c:url value='/acompanhamentoAbrigada/form/${abrigada.id}?nome=${abrigada.nome}'/>">REGISTRAR ACOMPANHAMENTO PÓS ABRIGAMENTO</a>
                        <br>
                        <a href="<c:url value='/acompanhamentoAbrigada/lista/${abrigada.id}?nome=${abrigada.nome}'/>">VISUALIZA ACOMPANHAMENTO ABRIGADA</a>
                        <br>
                    </td>
                    <td>${abrigada.id}</td>
                    <td>${abrigada.nome}</td>
                    <td>${abrigada.cpf}</td> 
                    <td>${abrigada.telefone}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
