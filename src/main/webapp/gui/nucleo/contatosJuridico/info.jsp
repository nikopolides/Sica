
        <h1>Informação dos Contatos:</h1>
        <a href="<c:url value='/abrigada/form'/>">Cadastrar</a><br />
        <table>
            <tr>
                <td>Ações</td><td>
                    <a href="<c:url value='/abrigada/deleta/${abrigada.id}'/>">DELETA</a>
                    | <a href="<c:url value='/abrigada/edita/${abrigada.id}'/>">EDITA</a>
                </td>
            <tr>
                <td>ID</td><td>${contato.id}</td>
            </tr>
            <tr>
                <td>Nome do Local</td><td>${contato.nomeLocal}</td>
            </tr>
            <tr>
                <td>Nome do Contato</td><td>${contato.nomeContato}</td>
            </tr>
            <tr>
                <td>Telefone</td><td>${contato.telefone}</td>
            </tr>
            <tr>
                <td>Email</td><td>${contato.email}</td>
            </tr>             

        </table>
