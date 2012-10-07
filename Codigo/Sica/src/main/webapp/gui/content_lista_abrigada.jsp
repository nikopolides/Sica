<%-- 
    Document   : content_cadastro.jsp
    Created on : 18/09/2012, 00:47:32
    Author     : TonGarcia
--%>

<div class="tab-pane grid_12 alpha omega" id="tabs1-pane1">
    <h4>Lista de abrigadas</h4>         

        <table id="tblist">
            <thead>
            <th>A��es</th>
            <th>ID</th>
            <th>Nome</th>
            <th>Cpf</th>
        </thead>
        <tbody>
            <c:forEach items="${abrigadaList}" var="abrigada">
                <tr>
                    <td>
                        <a href="<c:url value='/abrigada/deleta/${abrigada.id}'/>">DELETA</a>
                        <br>
                        <a href="<c:url value='/abrigada/edita/${abrigada.id}'/>">EDITA</a>
                        <br>
                        <a href="<c:url value='/dependente/form/${abrigada.id}?nome=${abrigada.nome}' />">CADASTRAR DEPENDENTE</a>
                        <br>
                        <a href="<c:url value='/dependente/lista/${abrigada.id}?nome=${abrigada.nome}' />">VISUALIZA DEPENDENTES</a>
                        <br>
                        <a href="<c:url value='/pertence/form/${abrigada.id}?nome=${abrigada.nome}' />">CADASTRAR PERTENCE</a>
                        <br>
                        <a href="<c:url value='/pertence/lista/${abrigada.id}?nome=${abrigada.nome}' />">VISUALIZA PERTENCE</a>
                        <br>
                    </td>
                    <td>${abrigada.id}</td>
                    <td>${abrigada.nome}</td>
                    <td>${abrigada.cpf}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</div>