        <c:if test="${errors != null}">
            <div id="erro">
                Erros:<br />
                <c:forEach var="error" items="${errors}">
                    ${error.category} ${error.message}<br />
                </c:forEach>
            </div>
        </c:if>
        <legend>Cadastro - NAFAVD</legend>
        <c:choose>
            <c:when test="${empty action}" >
                <form id="cadastro_nafavd" action="<c:url value="/nafavd/adiciona"/>" method="post">
                </c:when>
                <c:otherwise>
                    <form action="<c:url value="/nafavd/atualizar"/>" method="post">
                    </c:otherwise>
                </c:choose>
                <input type="hidden" name="nafavd.id" value="${nafavd.id}" />
                Cidade: <input type="text" id="nafavd_cidade" name="nafavd.cidade" value="${nafavd.cidade}" /><br/>
                Estado:
                <select name="nafavd.estado">
                    <option value="AC" <c:if test="${nafavd.estado == 'AC'}"> selected="selected" </c:if>>Acre</option>
                    <option value="AL" <c:if test="${nafavd.estado == 'AL'}"> selected="selected" </c:if>>Alagoas</option>
                    <option value="AM" <c:if test="${nafavd.estado == 'AM'}"> selected="selected" </c:if>>Amazonas</option>
                    <option value="AP" <c:if test="${nafavd.estado == 'AP'}"> selected="selected" </c:if>>Amapá</option>
                    <option value="BA" <c:if test="${nafavd.estado == 'BA'}"> selected="selected" </c:if>>Bahia</option>
                    <option value="CE" <c:if test="${nafavd.estado == 'CE'}"> selected="selected" </c:if>>Ceará</option>
                    <option value="DF" <c:if test="${nafavd.estado == 'DF'}"> selected="selected" </c:if>>Distrito Federal</option>
                    <option value="ES" <c:if test="${nafavd.estado == 'ES'}"> selected="selected" </c:if>>Espirito Santo</option>
                    <option value="GO" <c:if test="${nafavd.estado == 'GO'}"> selected="selected" </c:if>>Goiás</option>
                    <option value="MA" <c:if test="${nafavd.estado == 'MA'}"> selected="selected" </c:if>>Maranhão</option>
                    <option value="MG" <c:if test="${nafavd.estado == 'MG'}"> selected="selected" </c:if>>Minas Gerais</option>
                    <option value="MS" <c:if test="${nafavd.estado == 'MS'}"> selected="selected" </c:if>>Mato Grosso do Sul</option>
                    <option value="MT" <c:if test="${nafavd.estado == 'MT'}"> selected="selected" </c:if>>Mato Grosso</option>
                    <option value="PA" <c:if test="${nafavd.estado == 'PA'}"> selected="selected" </c:if>>Pará</option>
                    <option value="PB" <c:if test="${nafavd.estado == 'PB'}"> selected="selected" </c:if>>Paraíba</option>
                    <option value="PE" <c:if test="${nafavd.estado == 'PE'}"> selected="selected" </c:if>>Pernambuco</option>
                    <option value="PI" <c:if test="${nafavd.estado == 'PI'}"> selected="selected" </c:if>>Piauí</option>
                    <option value="PR" <c:if test="${nafavd.estado == 'PR'}"> selected="selected" </c:if>>Paraná</option>
                    <option value="RJ" <c:if test="${nafavd.estado == 'RJ'}"> selected="selected" </c:if>>Rio de Janeiro</option>
                    <option value="RN" <c:if test="${nafavd.estado == 'RN'}"> selected="selected" </c:if>>Rio Grande do Norte</option>
                    <option value="RO" <c:if test="${nafavd.estado == 'RO'}"> selected="selected" </c:if>>Rondônia</option>
                    <option value="RR" <c:if test="${nafavd.estado == 'RR'}"> selected="selected" </c:if>>Roraima</option>
                    <option value="RS" <c:if test="${nafavd.estado == 'RS'}"> selected="selected" </c:if>>Rio Grande do Sul</option>
                    <option value="SC" <c:if test="${nafavd.estado == 'SC'}"> selected="selected" </c:if>>Santa Catarina</option>
                    <option value="SE" <c:if test="${nafavd.estado == 'SE'}"> selected="selected" </c:if>>Sergipe</option>
                    <option value="SP" <c:if test="${nafavd.estado == 'SP'}"> selected="selected" </c:if>>São Paulo</option>
                    <option value="TO" <c:if test="${nafavd.estado == 'TO'}"> selected="selected" </c:if>>Tocantins</option>
                </select>

                <br><button id="btn-cadastrar" type="submit" class="btn btn-info" value="Cadastrar" ><i class="icon-ok icon-white"></i> Cadastrar </button>
            </form>