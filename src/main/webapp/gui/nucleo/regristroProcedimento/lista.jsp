<%-- 
    Document   : lista
    Created on : Sep 20, 2012, 10:26:26 AM
    Author     : Fernando
--%>


<h1>Registros Procedimento:</h1>
<table id="tblist">
            <thead>
            <th>ID</th>
            <th>ID Abrigada</th>
            <th>Descrição</th>
        </thead>
    <tbody>
        <c:forEach items="${registroProcedimentoList}" var="registroProcedimento">
            <tr>
                <td>
                    <a href="<c:url value='/registroProcedimento/info/${registroProcedimento.id}'/>">VISUALIZAR</a>
                </td>
                <td>${registroProcedimento.id}</td>
                <td>${registroProcedimento.idAbrigada}</td>
                <td>${registroProcedimento.procedimentos}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
