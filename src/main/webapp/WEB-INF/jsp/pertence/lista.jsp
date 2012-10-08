<%-- 
    Document   : lista
    Created on : Jun 12, 2012, 3:33:05 PM
    Author     : Leonn Ferreira
--%>

        <h1>Lista de pertences:</h1>
        <table id="tblist" cellspacing='0' cellpaddind="2">
            <thead>
            <th>A��es</th>
            <th>ID</th>
            <th>Descricao</th>
            <th>Quantidade</th>
            <th>Categoria</th>
            <th>ID Abrigada</th>
        </thead>
        <tbody>
            <c:forEach items="${pertenceList}" var="pertence">
                <tr>
                    <td>
                        <a href="<c:url value='/pertence/deleta/${pertence.idAbrigada}/${pertence.id}'/>">DELETA</a>
                        <br>
                        <a href="<c:url value='/pertence/edita/${pertence.id}'/>">EDITA</a>
                    </td>
                    <td>${pertence.id}</td>
                    <td>${pertence.descricao}</td>
                    <td>${pertence.quantidade}</td>
                    <td>${pertence.categoria}</td>
                    <td>${pertence.idAbrigada}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

                