<%-- 
    Document   : lista
    Created on : Oct 03, 2012, 20:26:27 AM
    Author     : Fernando
--%>


        <h1>Informa��es Acolhimento Dependente:</h1>
        <a href="<c:url value='/dependenteServicoSocial/form'/>">Cadastrar</a><br />
        <table>
            <tr>
                <td>A��es</td><td>
                    <a href="<c:url value='/dependenteServicoSocial/deleta/${dependenteServicoSocial.id}'/>">Deletar</a>
                    | <a href="<c:url value='/dependenteServicoSocial/edita/${dependenteServicoSocial.id}'/>">Editar</a>
                        <a href="<c:url value='/dependenteServicoSocial/info/${dependenteServicoSocial.id}'/>">Info</a> 
                </td>
            <tr>
                <td>ID</td><td>${dependenteServicoSocial.id}</td>
            </tr>
            <tr>
                <td>ID Abrigada</td><td>${dependenteServicoSocial.idAbrigada}</td>
            </tr>
            <tr>
                <td>N�o abrigado</td><td>${dependenteServicoSocial.naoAbrigamento}</td>
            </tr>
            <tr>
                <td>Menino Maior de 13 anos</td><td>${dependenteServicoSocial.sexoMascTreze}</td>
            </tr>
            <tr>
                <td>N�o corre risco</td><td>${dependenteServicoSocial.naoCorreRisco}</td>
            </tr>
            <tr>
                <td>Documentos</td><td>${dependenteServicoSocial.documentos}</td>
            </tr> 
            <tr>
                <td>Aux�lio</td><td>${dependenteServicoSocial.recebeAuxilio}</td>
            </tr>  
            <tr>
                <td>Qual / motivo</td><td>${dependenteServicoSocial.qualPorqueNao}</td>
            </tr>  
            <tr>
                <td>CRAS</td><td>${dependenteServicoSocial.cras}</td>
            </tr>  
            <tr>
                <td>CREAS</td><td>${dependenteServicoSocial.creas}</td>
            </tr>  
            <tr>
                <td>Conselho Tutelar</td><td>${dependenteServicoSocial.conselhoTutelar}</td>
            </tr>  
            <tr>
                <td>Vara Inf�ncia</td><td>${dependenteServicoSocial.varaInfancia}</td>
            </tr>  
            <tr>
                <td>Outras Institui��es</td><td>${dependenteServicoSocial.outraInstituicao}</td>
            </tr>
        </table>
