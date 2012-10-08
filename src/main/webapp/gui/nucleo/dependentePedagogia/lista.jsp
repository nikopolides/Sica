
        <div class="principal">

            <h2>Lista de dependentes</h2>
            
            <br/><br/>
            
            <table id="tblist" class="table table-striped">
                <thead>
                    <th>Nome</th>
                    <th>Idade</th>
                    <th>Sexo</th>
                    <th>Abrigada</th>
                    <th></th>                    
                </thead>
                <tbody>
                    <c:forEach items="${dependentePedagogiaList}" var="dependentePedagogia">
                        <tr>
                            <td>${dependentePedagogia.nome}</td>
                            <td>${dependentePedagogia.idade}</td>
                            <td>${dependentePedagogia.sexo}</td>
                            <td>${dependentePedagogia.nomeAbrigada}</td>
                            <td>
                                <a href="<c:url value='/dependentePedagogia/info/${dependentePedagogia.idDependente}'/>" class="btn btn-mini btn-primary">Info</a>                                
                                <a href="<c:url value='/dependentePedagogia/edita/${dependentePedagogia.idDependente}'/>" class="btn btn-mini">Editar</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            
            <div class="actions">
                <a href="<c:url value='/dependentePedagogia/form'/>" class="btn btn-primary">Cadastrar</a>
            </div>
        </div>
