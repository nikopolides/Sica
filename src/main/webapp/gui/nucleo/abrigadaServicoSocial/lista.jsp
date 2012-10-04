<%-- 
    Document   : lista
    Created on : Sep 20, 2012, 19:40:52 AM
    Author     : Fernando
--%>

        <h1>Lista de Abrigadas Acolhidas:</h1>
        <table id="tblist">
            <thead>
            <th>id</th>
            <th>idAbrigada</th>
            <th>dataAdmissao</th>
        </thead>
        <tbody>
            <c:forEach items="${abrigadaServicoSocialList}" var="abrigadaServicoSocial">
                <tr>
                    <td>
                        <a href="<c:url value='/abrigadaServicoSocial/info/${abrigadaServicoSocial.id}'/>">Info</a>
                    </td>
                    <td>${abrigadaServicoSocial.id}</td>
                    <td>${abrigadaServicoSocial.idAbrigada}</td>
                    <td>${abrigadaServicoSocial.dataAdmissao}</td>
                    <td>${abrigadaServicoSocial.desempregadaHa}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
