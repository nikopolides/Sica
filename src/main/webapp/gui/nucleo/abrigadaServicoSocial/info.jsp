<%-- 
    Document   : lista
    Created on : Sep 20, 2012, 19:40:53 AM
    Author     : Fernando
--%>


        <h1>Informa��es do Registro de Procedimento:</h1>
        <a href="<c:url value='/abrigadaServicoSocial/form'/>">Cadastrar</a><br />
        <table>
            <tr>
                <td>A��es</td><td>
                    <a href="<c:url value='/abrigadaServicoSocial/deleta/${abrigadaServicoSocial.id}'/>">Deletar</a>
                    | <a href="<c:url value='/abrigadaServicoSocial/edita/${abrigadaServicoSocial.id}'/>">Editar</a>
                        <a href="<c:url value='/abrigadaServicoSocial/info/${abrigadaServicoSocial.id}'/>">Info</a> 
                </td>
            <tr>
                <td>ID</td><td>${abrigadaServicoSocial.id}</td>
            </tr>
            <tr>
                <td>ID Abrigada</td><td>${abrigadaServicoSocial.idAbrigada}</td>
            </tr>
            <tr>
                <td>Data Admiss�o</td><td>${abrigadaServicoSocial.dataAdmissao}</td>
            </tr>
            <tr>
                <td>Reincid�ncia</td><td>${abrigadaServicoSocial.reincidencia}</td>
            </tr>
            <tr>
                <td>Tempo no DF</td><td>${abrigadaServicoSocial.tempoNoDF}</td>
            </tr>
            <tr>
                <td>Religi�o</td><td>${abrigadaServicoSocial.religiao}</td>
            </tr> 
            <tr>
                <td>Etnia</td><td>${abrigadaServicoSocial.etnia}</td>
            </tr>  
            <tr>
                <td>Outros Cursos</td><td>${abrigadaServicoSocial.outrosCursos}</td>
            </tr>  
            <tr>
                <td>Documentos</td><td>${abrigadaServicoSocial.documentos}</td>
            </tr>  
            <tr>
                <td>V�nculo</td><td>${abrigadaServicoSocial.empregadaVinculo}</td>
            </tr>  
            <tr>
                <td>Sal�rio</td><td>${abrigadaServicoSocial.salario}</td>
            </tr>  
            <tr>
                <td>Profiss�o</td><td>${abrigadaServicoSocial.profissao}</td>
            </tr>  
            <tr>
                <td>Desempregada h�</td><td>${abrigadaServicoSocial.desempregadaHa}</td>
            </tr>
            <tr>
                <td>Aposentadoria</td><td>${abrigadaServicoSocial.aposentadoria}</td>
            </tr>
            <tr>
                <td>Pens�o Aliment�cia</td><td>${abrigadaServicoSocial.prensaoAlimenticia}</td>
            </tr>
            <tr>
                <td>Benefini�ria BPC</td><td>${abrigadaServicoSocial.beneficiariaBPC}</td>
            </tr>
        </table>
