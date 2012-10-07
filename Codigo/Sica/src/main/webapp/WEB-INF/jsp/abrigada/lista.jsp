<%-- 
    Document   : lista
    Created on : Jun 12, 2012, 3:33:05 PM
    Author     : Leonn Ferreira
--%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        
        <jsp:include page="../../../gui/index.jsp"></jsp:include>
        

<div class="tab-pane grid_12 alpha omega" id="tabs1-pane1">
    <h4>Lista de abrigadas</h4>         

        <table id="tblist">
            <thead>
            <th>Ações</th>
            <th>ID</th>
            <th>Nome</th>
            <th>Cpf</th>
        </thead>
        <tbody>
            <c:forEach items="${abrigadaList}" var="abrigada">
                <tr>
                    <td>
                        <a href="<c:url value='/abrigada/deleta/${abrigada.id}'/>">DELETA</a>
                        <br>
                        <a href="<c:url value='/abrigada/edita/${abrigada.id}'/>">EDITA</a>
                        <br>
                        <a href="<c:url value='/dependente/form/${abrigada.id}?nome=${abrigada.nome}' />">CADASTRAR DEPENDENTE</a>
                        <br>
                        <a href="<c:url value='/dependente/lista/${abrigada.id}?nome=${abrigada.nome}' />">VISUALIZA DEPENDENTES</a>
                        <br>
                        <a href="<c:url value='/pertence/form/${abrigada.id}?nome=${abrigada.nome}' />">CADASTRAR PERTENCE</a>
                        <br>
                        <a href="<c:url value='/pertence/lista/${abrigada.id}?nome=${abrigada.nome}' />">VISUALIZA PERTENCE</a>
                        <br>
                    </td>
                    <td>${abrigada.id}</td>
                    <td>${abrigada.nome}</td>
                    <td>${abrigada.cpf}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</div>
        
