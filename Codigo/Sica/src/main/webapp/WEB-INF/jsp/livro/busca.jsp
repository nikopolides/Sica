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
        
       
       
        <form action="<c:url value="/livro/listaResultado"/>" method="post">
            <h1>Pesquisar</h1>
            
            Titulo :<input type="text" name="tituloPesquisado" value="${tituloPesquisado}"><br/>
                                  
                    
            Autor :<input type="text" name="autorPesquisado" value="${autorPesquisado}"><br/>
            
            <input type="submit" value="Pesquisar" />
                        
          
        </form>
        
            <c:if test="${action != null}">
            <h2>Resultado da Busca</h2>
            <c:choose>
                <c:when test="${empty livroList}">
                    <div id="busca_vazia">
                       <p>A busca não retornou nenhum resultado.</p>
                   </div>    
                </c:when>
                
                <c:otherwise>
                <table id="tblist">
                        <thead>
                        <th>Ações</th>
                        <th>ID</th>
                        <th>Titulo</th>
                        <th>Editora</th>
                        <th>Autor</th>
                        <th>Ano de Publicação</th>
                        <th>Edição</th>
                    </thead>
                    <tbody>
                        <c:forEach items="${livroList}" var="livro">
                            <tr>
                                <td>
                                    <a href="<c:url value='/livro/deleta/${livro.id}'/>">DELETA</a>
                                    <br>
                                    <a href="<c:url value='/livro/edita/${livro.id}'/>">EDITA</a>
                                    <br>
                                    <a href="<c:url value='/livro/info/${livro.id}'/>">INFO</a>
                                    <br>
                                </td>
                                <td>${livro.id}</td>
                                <td>${livro.titulo}</td>
                                <td>${livro.editora}</td>
                                <td>${livro.autor}</td>
                                <td>${livro.publicacao}</td>
                                <td>${livro.edicao}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                </c:otherwise>
            </c:choose>
        </c:if>

 
