<%-- 
    Document   : lista
    Created on : Oct 03, 2012, 20:26:27 AM
    Author     : Fernando
--%>


        <h1>Informações Acolhimento Dependente:</h1>
        <a href="<c:url value='/dependenteServicoSocial/form'/>">Cadastrar</a><br />
        <table>
            <tr>
                <td>Ações</td><td>
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
                <td>Não abrigado</td><td>${dependenteServicoSocial.naoAbrigamento}</td>
            </tr>
            <tr>
                <td>Menino Maior de 13 anos</td><td>${dependenteServicoSocial.sexoMascTreze}</td>
            </tr>
            <tr>
                <td>Não corre risco</td><td>${dependenteServicoSocial.naoCorreRisco}</td>
            </tr>
            <tr>
                <td>Documentos</td><td>${dependenteServicoSocial.documentos}</td>
            </tr> 
            <tr>
                <td>Auxílio</td><td>${dependenteServicoSocial.recebeAuxilio}</td>
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
                <td>Vara Infância</td><td>${dependenteServicoSocial.varaInfancia}</td>
            </tr>  
            <tr>
                <td>Outras Instituições</td><td>${dependenteServicoSocial.outraInstituicao}</td>
            </tr>
        </table>
