<%-- 
    Document   : form_cadastro_abrigada
    Created on : 18/09/2012, 00:24:22
    Author     : TonGarcia
--%>


<c:if test="${errors != null}">
    <div id="erro">
        Erros:<br />
        <c:forEach var="error" items="${errors}">
            ${error.category} ${error.message}<br />
        </c:forEach>
    </div>
</c:if>
<legend>Cadastro - Abrigada</legend>

<c:choose>
    <c:when test="${empty action}" >
        <form method="post" action="<c:url value="/abrigada/adiciona"/>" class="form-horizontal" id="cadastro_abrigada" name="cadastro_abrigada" class="alpha grid_10 omega">
</c:when>
<c:otherwise>
    <form action="<c:url value="/abrigada/atualizar"/>" method="post" id="cadastro_abrigada" name="cadastro_abrigada" class="alpha grid_10 omega">
</c:otherwise>
</c:choose>
<input type="hidden" name="abrigada.id" value="${abrigada.id}" />
<div id="form_esquerda" class="alpha grid_5 omega">
    <label>
        Nome:
        <input id="abrigada_nome" type="text" name="abrigada.nome" placeholder="Nome" value="${abrigada.nome}"/>
    </label>
    <label>
        CPF:
        <input id="abrigada_cpf" type="text" name="abrigada.cpf" placeholder="CPF" value="${abrigada.cpf}"/>
    </label>
    <label>
        RG:
        <input  id="abrigada_rg" type="text" name="abrigada.rg" placeholder="RG" value="${abrigada.rg}"/>
    </label>
    <label>
        Data de entrada:
        <input id="abrigada_data_entrada" type="date" name="abrigada.dataEntrada" placeholder="Data de entrada" value="${abrigada.dataEntrada}"/>
    </label>
    <label>
        Nacionalidade:
        <input id="abrigada_nacionalidade" type="text" name="abrigada.nacionalidade" placeholder="Nacionalidade" value="${abrigada.nacionalidade}"/>
    </label>
    <label>
        Naturalidade:
        <select id="abrigada_naturalidade" name="abrigada.naturalidade" value="${abrigada.naturalidade}">
            <option value="AC"> AC </option>
            <option value="AL"> AL </option>
            <option value="AP"> AP </option>
            <option value="AM"> AM </option>
            <option value="BA"> BA </option>
            <option value="CE"> CE </option>
            <option value="DF"> DF </option>
            <option value="AC"> ES </option>
            <option value="GO"> GO </option>
            <option value="MA"> MA </option>
            <option value="MT"> MT </option>
            <option value="MS"> MS </option>
            <option value="MG"> MG </option>
            <option value="PA"> PA </option>
            <option value="PB"> PB </option>
            <option value="PR"> PR </option>
            <option value="PE"> PE </option>
            <option value="PI"> PI </option>
            <option value="RJ"> RJ </option>
            <option value="RN"> RN </option>
            <option value="RS"> RS </option>
            <option value="RO"> RO </option>
            <option value="RR"> RR </option>
            <option value="SC"> SC </option>
            <option value="SP"> SP </option>
            <option value="SE"> SE </option>
            <option value="TO"> TO </option>
        </select>
    </label>
</div>
<!-- Fim form esquerda -->

<div id="form_direita" class="alpha grid_5 omega">
    <label>
        Endereço:
        <input id="abrigada_endereco" type="text" name="abrigada.endereco" placeholder="Endereço" />
    </label>
    <label>
        CEP:
        <input id="abrigada_cep" type="text" name="abrigada.cep" placeholder="CEP" value="${abrigada.cep}"/>
    </label>
    <label>
        Data de nascimento:
        <input id="abrigada_nascimento" type="date" name="abrigada.dataNascimento" placeholder="Data de nascimento" value="${abrigada.dataNascimento}" />
    </label>
    <label>
        Estado civil:
        <select id="abrigada_estado_civil" name="abrigada.estadoCivil">
            <option value="Solteira">Solteira</option>
            <option value="Casada">Casada</option>
        </select>
    </label>
    <label>
        Profissão:
        <input id="abrigada_profissao" type="text" name="abrigada.profissao" placeholder="Profissão" value="${abrigada.profissao}" />
    </label>
    <label>
        Escolaridade:
        <select id="abrigada_escolaridade" name="abrigada.escolaridade">
            <option value="Sem Escolaridade">Sem Escolaridade</option>
            <option value="Ensino Fundamental Incompleto">Ensino Fundamental Incompleto</option>
            <option valeu="Ensino Fundamental">Ensino Fundamental</option>
            <option value="Ensino Médio Incompleto">Ensino Médio Incompleto</option>
            <option value="Ensino Médio">Ensino Médio</option>
            <option value="Ensino Superior Incompleto">Ensino Superior Incompleto</option>
            <option value="Ensino Superior">Ensino Superior</option>
        </select> 
        <!-- <input data-placement="right" onclick="someBalao('abrigada_escolaridade')" onblur="someBalao('abrigada_escolaridade')" id="abrigada_escolaridade" type="text" name="escolaridade" placeholder="Escolaridade" />  -->
    </label>
    <!--
    <label>
        Celular:
        <input data-placement="left" onclick="someBalao('abrigada_celular')" onblur="someBalao('abrigada_celular')" id="abrigada_celular" type="text" name="abrigada.celular" placeholder="Celular" value="${abrigada.celular}"/>
    </label>
    -->
</div>
<!-- Fim form direita -->
<!-- Parte referente a pergunta se há dependentes -->
<div id="perguntaSeHaDependente" class="grid_11 rbSica">
    <span id="form_abrigada_tel">
        Telefone:
        <!--<input id="abrigada_telefone" type="text" name="abrigada.telefone" placeholder="Telefone" value="${abrigada.telefone}" />-->
        <textarea id="abrigada_telefone" name="abrigada.telefone" value="${abrigada.telefone}"></textarea>
    </span>
    <span id="form_abrigada_dep">
        Possui dependentes? 
        <input id="dependenteSim" type="radio" name="dependente" value="sim">Sim
        <input id="dependenteNao" type="radio" name="dependente" value="nao">Não
    </span>
</div>
<center>
    <button type="button" onclick="submitAbrigada()" id="submit_cadastra_abrigada" class="btn btn-info" value="Cadastrar" onclick="redireciona('relatorioPsicoSocial', 'form')"><i class="icon-ok icon-white"></i> Cadastrar </button>
    <button type="button" onclick="" class="btn btn-danger" id="cancel_btn"><i class="icon-remove icon-white"></i> Cancelar </button>
</center>

</form>
