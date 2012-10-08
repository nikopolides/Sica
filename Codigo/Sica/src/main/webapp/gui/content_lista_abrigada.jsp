<%-- 
    Document   : content_cadastro.jsp
    Created on : 18/09/2012, 00:47:32
    Author     : TonGarcia
--%>

<div class="tab-pane grid_12 alpha omega" id="tabs1-pane1">
    <h4>Lista de abrigadas</h4>         

    <center> 
            <table id="tblist" border="1" class="table table-hover alpha grid_11 omega ">
                <thead>
                <th class="lista_abriga_nome_coluna">Ações que podem ser exercidas para cada usuário</th>
                <th class="lista_abriga_nome_coluna">ID</th>
                <th class="lista_abriga_nome_coluna">Nome</th>
                <th class="lista_abriga_nome_coluna">Telefone</th>
            </thead>
            <tbody>
                <c:forEach items="${abrigadaList}" var="abrigada">
                    <tr>
                        <td>
                            <i class="icon-remove" title="DELETAR " alt="DELETAR "><a href="<c:url value='/abrigada/deleta/${abrigada.id}'/>"></a></i>

                            <i class="icon-edit" title="EDITA " alt="EDITA "><a href="<c:url value='/abrigada/edita/${abrigada.id}'/>"></a></i>

                            <i class="icon-off" title="DESLIGAR ABRIGADA" alt="DESLIGAR ABRIGADA"><a href="<c:url value='/quantidadeAbrigamentos/form/${abrigada.id}?nome=${abrigada.nome}'/>"></a></i>

                            <i class="icon-th-list" title="LISTA DE ABRIGAMENTOS" alt="LISTA DE ABRIGAMENTOS"><a href="<c:url value='/quantidadeAbrigamentos/lista/${abrigada.id}?nome=${abrigada.nome}'/>"></a></i>

                            <i class="icon-tag" title="CADASTRAR ABRIGADA PARTE PSICOLOGIA" alt="CADASTRAR ABRIGADA PARTE PSICOLOGIA"><a href="<c:url value='/abrigadaPsicologia/form/${abrigada.id}?nome=${abrigada.nome}' />"></a></i>

                            <i class="icon-tags" title="CADASTRAR DEPENDENTE" alt="CADASTRAR DEPENDENTE"><a href="<c:url value='/dependente/form/${abrigada.id}?nome=${abrigada.nome}' />"></a></i>

                            <i class="icon-align-justify" title="VISUALIZAR DEPENDENTE" alt="VISUALIZAR DEPENDENTE"><a href="<c:url value='/dependente/lista/${abrigada.id}?nome=${abrigada.nome}' />"></a></i>

                            <i class="icon-cog" title="CADASTRAR PERTENCE" alt="CADASTRAR PERTENCE"><a href="<c:url value='/pertence/form/${abrigada.id}?nome=${abrigada.nome}' />"></a></i>

                            <i class="icon-th" title="VISUALIZA PERTENCE" alt="VISUALIZA PERTENCE"><a href="<c:url value='/pertence/lista/${abrigada.id}?nome=${abrigada.nome}' />"></a></i>

                            <i class="icon-eye-open" title="CADASTRAR AGRESSOR" alt="CADASTRAR AGRESSOR"><a href="<c:url value='/agressor/form/${abrigada.id}?nome=${abrigada.nome}' />"></a></i>

                            <i class="icon-user" title="VISUALIZAR AGRESSORES" alt="VISUALIZAR AGRESSORES"><a href="<c:url value='/agressor/lista/${abrigada.id}?nome=${abrigada.nome}' />"></a></i>

                            <i class="icon-list-alt" title="CADASTRAR PROCEDIMENTO" alt="CADASTRAR PROCEDIMENTO"><a href="<c:url value='/relatoriopsicosocial/form/${abrigada.id}?nome=${abrigada.nome}' />"></a></i>

                            <i class="icon-arrow-right" title="CADASTRAR RELATORIO DE ENCAMINHAMENTO AO NAFAVD" alt="CADASTRAR RELATORIO DE ENCAMINHAMENTO AO NAFAVD"><a href="<c:url value='/relatorioEncaminhamentoNafavd/form/${abrigada.id}?nome=${abrigada.nome}' />"></a></i>

                            <i class="icon-list" title="VISUALIZA RELATORIOS DE ENCAMINHAMENTO AO NAFAVD" alt="VISUALIZA RELATORIOS DE ENCAMINHAMENTO AO NAFAVD"><a href="<c:url value='/relatorioEncaminhamentoNafavd/lista/${abrigada.id}?nome=${abrigada.nome}' />"></a></i>

                            <i class="icon-share-alt" title="CADASTRAR RELATORIO DE ENCAMINHAMENTO A SERVICOS DE REDE" alt="CADASTRAR RELATORIO DE ENCAMINHAMENTO A SERVICOS DE REDE"><a href="<c:url value='/relatorioEncaminhamentoServicoRede/form/${abrigada.id}?nome=${abrigada.nome}' />"></a></i>

                            <i class="icon-globe" title="VISUALIZAR RELATÓRIOS DE ENCAMINHAMENTOO A SERVICOS DA REDE" alt="VISUALIZAR RELATÓRIOS DE ENCAMINHAMENTOO A SERVICOS DA REDE"><a href="<c:url value='/relatorioEncaminhamentoServicoRede/lista/${abrigada.id}?nome=${abrigada.nome}' />"></a></i>

                            <i class="icon-thumbs-up" title="REGISTRAR ACOMPANHAMENTO APOS ABRIGAMENTO" alt="REGISTRAR ACOMPANHAMENTO APOS ABRIGAMENTO"><a href="<c:url value='/acompanhamentoAbrigada/form/${abrigada.id}?nome=${abrigada.nome}'/>"></a></i>

                            <i class="icon-folder-open" title="VISUALIZA ACOMPANHAMENTO ABRIGADA" alt="VISUALIZA ACOMPANHAMENTO ABRIGADA"><a href="<c:url value='/acompanhamentoAbrigada/lista/${abrigada.id}?nome=${abrigada.nome}'/>"></a></i>

                        </td>
                        <td class="lista_id_inner_abrigada">${abrigada.id}</td>
                        <td class="lista_nome_inner_abrigada">${abrigada.nome}</td>
                        <td class="lista_telefone_inner_abrigada">${abrigada.telefone}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
   </center>
</div>