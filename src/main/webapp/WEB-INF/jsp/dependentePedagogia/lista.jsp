<%-- 
    Document   : lista
    Created on : Jun 12, 2012, 3:33:05 PM
    Author     : Leonn Ferreira
--%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Lista Dependentes</title>
         <link type="text/css" rel="stylesheet" href="<c:url value="/css/geral.css"/>"/>
    </head>
    <body>
        <h1>Lista de dependentes:</h1>
        <a href="<c:url value='/dependentePedagogia/form'/>">Cadastrar</a><br />
        <table id="tblist" cellspacing='0' cellpaddind="2">
            <thead>
            <th>A��es</th>
            <th>ID</th>
            <th>Nome</th>
            <th>Idade</th>
            <th>Sexo</th>
            <th>ID Abrigada</th>
        </thead>
        <tbody>
            <c:forEach items="${dependentePedagogiaList}" var="dependentePedagogia">
                <tr>
                    <td>
                        <a href="<c:url value='/dependentePedagogia/deleta/${dependentePedagogia.idAbrigada}/${dependentePedagogia.idDependente}'/>">DELETA</a>
                        <br>
                        <a href="<c:url value='/dependentePedagogia/edita/${dependentePedagogia.idDependente}'/>">EDITA</a>
                        <br/>
                        <a href="<c:url value='/dependentePedagogia/pesquisa/${dependentePedagogia.idDependente}'/>">PESQUISA</a>
                        
                    </td>
                    <td>${dependentePedagogia.idDependente}</td>
                    <td>${dependentePedagogia.nome}</td>
                    <td>${dependentePedagogia.idade}</td>
                    <td>${dependentePedagogia.sexo}</td>
                    <td>${dependentePedagogia.idAbrigada}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
