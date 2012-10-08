        <div class="principal">
        <c:if test="${errors != null}">
            <div id="erro">
                Erros:<br />
                <c:forEach var="error" items="${errors}">
                    ${error.category} ${error.message}<br />
                </c:forEach>
            </div>
        </c:if>
        
        
        <h2>Pesquisar</h2><br/><br/>
       
        <form action="<c:url value="/livro/listaResultado"/>" method="get" class="form-search">
            
            
            Titulo/Autor :<input type="text" name="termoPesquisado" value="${termoPesquisado}" class="search-query">
           
            <input type="submit" value="Pesquisar" class="btn btn-primary"/>
                        
          
        </form>
            
            <br/>
            <c:if test="${action != null}">
            <h3>Resultado da Busca</h3>

                <c:choose>
                    <c:when test="${empty livroList}">
                        <div id="busca_vazia">
                        <p>A busca não retornou nenhum resultado.</p>
                    </div>    
                    </c:when>

                    <c:otherwise>
                    <table id="tblist" class="table table-striped">
                            <thead>
                            <th>Titulo</th>
                            <th>Editora</th>
                            <th>Autor</th>
                            <th>Ano de Publicação</th>
                            <th>Edição</th>
                            <th></th>
                        </thead>
                        <tbody>
                            <c:forEach items="${livroList}" var="livro">
                                <tr>
                                    <td>${livro.titulo}</td>
                                    <td>${livro.editora}</td>
                                    <td>${livro.autor}</td>
                                    <td>${livro.publicacao}</td>
                                    <td>${livro.edicao}</td>
                                    <td>
                                        <a href="<c:url value='/livro/info/${livro.id}'/>" class="btn btn-mini btn-primary">Info</a>
                                        <a href="<c:url value='/livro/edita/${livro.id}'/>" class="btn btn-mini">Editar</a>
                                        <a href="<c:url value='/livro/deleta/${livro.id}'/>" class="btn btn-mini btn-danger">Excluir</a>                                      
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                </c:choose>
            </c:if>

         <div class="actions">
            <p>
                <a href="<c:url value='/livro/form'/>" class="btn btn-primary">Cadastrar</a>       
            </p>
        </div>
        </div>    
    </body>
</html>
