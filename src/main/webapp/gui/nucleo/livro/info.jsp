
        <div class="principal">

            <h2>Informa��es do livro</h2>

            <table>
                <tr>
                    <td>ID</td><td>${livro.id}</td>
                </tr>
                <tr>
                    <td>T�tulo</td><td>${livro.titulo}</td>
                </tr>
                <tr>
                    <td>Editora</td><td>${livro.editora}</td>
                </tr>
                <tr>
                    <td>Autor</td><td>${livro.autor}</td>
                </tr>             
                <tr>
                    <td>Ano de Publica��o</td><td>${livro.publicacao}</td>
                </tr>
                <tr>
                    <td>Edi��o</td><td>${livro.edicao}</td>
                </tr>
                <tr>
                    <td>A��es</td>
                    <td>
                        <a href="<c:url value='/livro/edita/${livro.id}'/>" class="btn btn-mini">Editar</a>
                        <a href="<c:url value='/livro/deleta/${livro.id}'/>" class="btn btn-danger btn-mini">Excluir</a>                    
                    </td>
                </tr>

            </table>


            <div class="actions">
                <p>
                    <a href="<c:url value='/livro/form'/>" class="btn btn-primary">Cadastrar</a>  
                    <a href="<c:url value='/livro/busca'/>" class="btn">Buscar</a>      
                </p>
            </div>
        </div>
    </body>
</html>
