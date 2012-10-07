        <h1>Informações do Registro de Procedimento:</h1>
        <a href="<c:url value='/registroProcedimento/form'/>">Cadastrar</a><br />
        <table>
            <tr>
                <td>Ações</td><td>
                    <a href="<c:url value='/registroProcedimento/deleta/${registroProcedimento.id}'/>">DELETA</a>
                    | <a href="<c:url value='/registroProcedimento/edita/${registroProcedimento.id}'/>">EDITA</a>
                        <a href="<c:url value='/registroProcedimento/visualiza/${registroProcedimento.id}'/>">VISUALIZA</a> 
                </td>
            <tr>
                <td>ID</td><td>${registroProcedimento.id}</td>
            </tr>
            <tr>
                <td>ID Abrigada</td><td>${registroProcedimento.idAbrigada}</td>
            </tr>
            <tr>
                <td>Procedimentos</td><td>${registroProcedimento.procedimentos}</td>
            </tr>
            <tr>
                <td>Observação de Desligamento</td><td>${registroProcedimento.observacaoDesligamento}</td>
            </tr>
            <tr>
                <td>Data</td><td>${registroProcedimento.data}</td>
            </tr> 
            <tr>
                <td>Nome da Assistente Social</td><td>${registroProcedimento.nomeAssistenteSocial}</td>
            </tr>  

        </table>