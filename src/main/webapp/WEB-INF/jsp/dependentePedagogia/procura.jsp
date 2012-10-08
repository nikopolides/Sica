<%-- 
    Document   : procura
    Created on : 03/10/2012, 03:58:04
    Author     : sica
--%>

        <c:if test="${errors != null}">
            <div id="erro">
                Erros:<br />
                <c:forEach var="error" items="${errors}">
                    ${error.category} ${error.message}<br />
                </c:forEach>
            </div>
        </c:if>
        
       
       
        <form action="<c:url value="/dependentePedagogia/listaResultado"/>" method="get">
            <h1>Pesquisar</h1>
            
            Nome :<input type="text" name="nomePesquisado" value="${nomePesquisado}"><br/>
            <input type="submit" value="Pesquisar" />
                        
        </form>
        
            <c:if test="${action != null}">
            <h2>Resultado da Busca</h2>
            <c:choose>
                <c:when test="${empty dependentePedagogiaList}">
                    <div id="busca_vazia">
                       <p>A busca não retornou nenhum resultado.</p>
                   </div>    
                </c:when>
                
                <c:otherwise>
                <table>
                    <thead>
                    <tr>  
                        <th>
                            Dependente
                        </th>
                        <th>

                        </th>
                    </tr>
                    </thead>

                    <tbody>
                        <c:forEach items="${dependentePedagogiaList}" var="dependentePedagogia">
                            <tr>
                                <td>${dependentePedagogia.nome}</td>
                                <td><a href="">Detalhes</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                </c:otherwise>
            </c:choose>
        </c:if>

                                