<%-- 
    Document   : lista
    Created on : Oct 03, 2012, 20:26:26 AM
    Author     : Fernando
--%>


        <h1>Lista de Abrigadas Acolhidas:</h1>
        <table id="tblist">
            <thead>
            <th>id</th>
            <th>idAbrigada</th>
            <th>Não Abrigado</th>
            <th>Menino maior de 13 anos</th>
            <th>Não corre risco</th>
        </thead>
        <tbody>
            <c:forEach items="${dependenteServicoSocialList}" var="dependenteServicoSocial">
                <tr>
                    <td>
                        <a href="<c:url value='/dependenteServicoSocial/info/${dependenteServicoSocial.id}'/>">Info</a>
                    </td>
                    <td>${dependenteServicoSocial.id}</td>
                    <td>${dependenteServicoSocial.idAbrigada}</td>
                    <td>${dependenteServicoSocial.naoAbrigamento}</td>
                    <td>${dependenteServicoSocial.sexoMascTreza}</td>
                    <td>${dependenteServicoSocial.naoCorreRisco}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
