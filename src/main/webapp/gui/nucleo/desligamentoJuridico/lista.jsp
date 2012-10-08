<%-- 
    Document   : lista
    Created on : Set 27, 2012, 17:05:05 PM
    Author     : Ana Paula
--%>

        <h1>Lista de Formul&aacute;rio de Desligamentos:</h1>
        <table id="tblist" cellspacing='0' cellpaddind="2">
            <thead>
            <th>Ações</th>
            <th>ID</th>
            <th>Descri&&ccedil;&atilde;o</th>
            <th>ID Abrigada</th>
        </thead>
        <tbody>
            <c:forEach items="${desligamentoJuridicoList}" var="desligamentoJuridico">
                <tr>
                    <td>
                        <a href="<c:url value='/desligamentoJuridico/deleta/${desligamentoJuridico.idAbrigada}/${desligamentoJuridico.id}'/>">DELETA</a>
                        <br>
                        <a href="<c:url value='/desligamentoJuridico/edita/${desligamentoJuridico.id}'/>">EDITA</a>
                    </td>
                    <td>${desligamentoJuridico.id}</td>
                    <td>${desligamentoJuridico.descricaoDesligamento}</td>
                    <td>${desligamentoJuridico.idAbrigada}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

                