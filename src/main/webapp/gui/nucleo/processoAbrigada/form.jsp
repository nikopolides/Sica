<%-- 
    Document   : form
    Created on : Jun 10, 2012, 10:30:17 PM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<c:if test="${errors != null}">
    <div id="erro">
        Erros:<br />
        <c:forEach var="error" items="${errors}">
            ${error.category} ${error.message}<br />
        </c:forEach>
    </div>
</c:if>
<c:choose>
    <c:when test="${empty action}" >
        <form action="<c:url value="/processoAbrigada/adiciona"/>" method="post" class="form-horizontal">
        </c:when>
        <c:otherwise>
            <form action="<c:url value="/processoAbrigada/atualizar"/>" method="post">
            </c:otherwise>
        </c:choose>
        <input type="hidden" name="processoAbrigada.id" value="${processoAbrigada.id}" />

        Nome: ${abrigada.nome}<br/><br/>
        N&ordm; do Boletim de Ocorr&ecirc;ncia:<br/><input name="processoAbrigada.numeroBoletimOcorrencia" value="${processoAbrigada.numeroBoletimOcorrencia}"><br/>

        &Oacute;rg&atilde;o de Encaminhamento:<br/><input name="processoAbrigada.orgaoEncaminhamento" value="${processoAbrigada.orgaoEncaminhamento}"><br/>

        Requereu Medidas Protetivas:<br/> 
        <div id="rbRelatorioAtivo" class="rbSica">
            Sim <input type="radio" name="processoAbrigada.medidasProtetivas" value="sim" <c:if test="${processoAbrigada.medidasProtetivas == 'sim'}"> selected="selected" </c:if>> 
            Quais? <input type="text" value="" name="processoAbrigada.medidasProtetivasQuais" value="${processoAbrigada.medidasProtetivasQuais}"><br/> 
            N&atilde;o <input type="radio" name="processoAbrigada.medidasProtetivas" value="nao"  <c:if test="${processoAbrigada.medidasProtetivas == 'nao'}"> selected="selected" </c:if>>
            Por quê? <input type="text" name="processoAbrigada.medidasProtetivasPorque" value="${processoAbrigada.medidasProtetivasPorque}"><br/>
        </div>
        <br/> Tipo de violência: <br/> 
        <div id="rbRelatorioAtivo" class="rbSica">
            Fisica: <br/>
            Sim <input type="radio" name="processoAbrigada.tipoViolenciaFisica" value="sim" <c:if test="${processoAbrigada.tipoViolenciaFisica == 'sim'}"> selected="selected" </c:if>> 
            N&atilde;o <input type="radio" name="processoAbrigada.tipoViolenciaFisica" value="nao"  <c:if test="${processoAbrigada.tipoViolenciaFisica == 'nao'}"> selected="selected" </c:if>><br/>
            De que forma?<br/><input type="text" name="processoAbrigada.tipoViolenciaFisicaForma" value="${processoAbrigada.tipoViolenciaFisicaForma}"><br/>
            Possui les&atilde;o aparente?<br/><input type="text" name="processoAbrigada.tipoViolenciaFisicaLesao" value="${processoAbrigada.tipoViolenciaFisicaLesao}"><br/>
            Encaminhada ao IML?<br/><input type="text" name="processoAbrigada.tipoViolenciaFisicaIML" value="${processoAbrigada.tipoviolenciaFisicaIML}"><br/>
        </div>
        <div id="rbRelatorioAtivo" class="rbSica">
            Sexual: <br/>
            Sim <input type="radio" name="processoAbrigada.tipoViolenciaSexual" value="sim" <c:if test="${processoAbrigada.tipoViolenciaSexual == 'sim'}"> selected="selected" </c:if>> 
            N&atilde;o <input type="radio" name="processoAbrigada.tipoViolenciaSexual" value="nao" <c:if test="${processoAbrigada.tipoViolenciaSexual == 'nao'}"> selected="selected" </c:if>><br/>
            De que forma?<br/><input type="text" name="processoAbrigada.tipoViolenciaSexualForma" value="${processoAbrigada.tipoViolenciaSexualForma}"><br/>            
            Encaminhada ao IML?<br/><input type="text" name="processoAbrigada.tipoViolenciaSexualIML" value="${processoAbrigada.tipoViolenciaSexualIML}"><br/>
        </div>
        <div id="rbRelatorioAtivo" class="rbSica">
            Patrimonial: <br/>
            Sim <input type="radio" name="processoAbrigada.tipoViolenciaPatrimonial" value="sim" <c:if test="${processoAbrigada.tipoViolenciaPatrimonial == 'sim'}"> selected="selected" </c:if>> 
            N&atilde;o <input type="radio" name="processoAbrigada.tipoViolenciaPatrimonial" value="nao" <c:if test="${processoAbrigada.tipoViolencia == 'nao'}"> selected="selected" </c:if>><br/>
            De que forma?<br/><input type="text" name="processoAbrigada.tipoViolenciaPatrimonialForma" value="${processoAbrigada.tipoViolenciaFisicaForma}"><br/>            
        </div>
        <div id="rbRelatorioAtivo" class="rbSica">
            Moral <br/>
            Sim <input type="radio" name="processoAbrigada.tipoViolenciaMoral" value="sim" <c:if test="${processoAbrigada.tipoViolenciaMoral == 'sim'}"> selected="selected" </c:if>> 
            N&atilde;o <input type="radio" name="processoAbrigada.tipoViolenciaFisica" value="nao" <c:if test="${processoAbrigada.tipoViolenciaFisica == 'nao'}"> selected="selected" </c:if>><br/>
            De que forma?<br/><input type="text" name="processoAbrigada.tipoViolenciaMoralForma" value="${processoAbrigada.tipoViolenciaMoralForma}"><br/>            
        </div>
        <div id="rbRelatorioAtivo" class="rbSica">
            Psicologica: <br/>
            Sim <input type="radio" name="processoAbrigada.tipoViolenciaPsicologica" value="sim" <c:if test="${processoAbrigada.tipoViolenciaPsicologica == 'sim'}"> selected="selected" </c:if>> 
            N&atilde;o <input type="radio" name="processoAbrigada.tipoViolenciaFisica" value="nao" <c:if test="${processoAbrigada.tipoViolenciaFisica == 'nao'}"> selected="selected" </c:if>><br/>
            De que forma?<br/><input type="text" name="processoAbrigada.tipoViolenciaPsicologicaForma" value="${processoAbrigada.tipoViolenciaPsicologicaForma}"><br/>            
        </div>
        <br/>
        <div id="rbRelatorioAtivo" class="rbSica">
            Foi a primeira agress&atilde;o?<br/>
            Sim <input type="radio" name="processoAbrigada.primeiraAgressao" value="sim" <c:if test="${processoAbrigada.primeiraAgressao == 'sim'}"> selected="selected" </c:if>> 
            N&atilde;o <input type="radio" name="processoAbrigada.primeiraAgressao" value="nao" <c:if test="${processoAbrigada.primeiraAgressao == 'nao'}"> selected="selected" </c:if>><br/>
        </div>
        <div id="rbRelatorioAtivo" class="rbSica">
            Foi a primeira ocorrência? <br/> N&atilde;o <input type="radio" name="processoAbrigada.primeiraOcorrencia" value="nao" <c:if test="${processoAbrigada.primeiraOcorrencia == 'nao'}"> selected="selected" </c:if>>
            Quantas vezes? <input type="text" name="processoAbrigada.primeiraOcorrenciaQuantas" value="${processoAbrigada.primeiraOcorrenciaQuantas}"><br/> 
            Sim <input type="radio" name="processoAbrigada.primeiraOcorrencia" value="sim" <c:if test="${processoAbrigada.primeiraOcorrencia == 'sim'}"> selected="selected" </c:if>> 
            Por que n&atilde;o registrou ocorr&ecirc;ncia antes? <input type="text" name="processoAbrigada.primeiraOcorrenciaPorque" value="${processoAbrigada.primeiraOcorrenciaPorque}"><br/>
        </div>
        Há quanto tempo acontecem as agressões? <input type="text" name="processoAbrigada.tempoAgressao" value="${processoAbrigada.tempoAgressao}"><br/> 
        <div id="rbRelatorioAtivo" class="rbSica">
            <!-- Campos proprios da abrigada -->
            Existem outros processos jurídicos da abrigada contra o autor?<br/>
            N&atilde;o <input type="radio" name="processoAbrigada.processosJudiciais" value="nao" <c:if test="${processoAbrigada.processosJudiciais == 'nao'}"> selected="selected" </c:if>>
            Sim <input type="radio" name="processoAbrigada.processosJudiciais" value="sim" <c:if test="${processoAbrigada.processosJudiciais == 'sim'}"> selected="selected" </c:if>> 
            Quais? <input type="text" name="processoAbrigada.processosJudiciaisQuais" value="${processoAbrigada.processosJudiciaisQuais}"><br/>             
        </div>
        Ação de: <input type="text" name="processoAbrigada.acao" value="${processoAbrigada.acao}"><br/> 
        Nº do processo: <input type="text" name="processoAbrigada.numeroProcesso" value="${processoAbrigada.numeroProcesso}"><br/>  
        Juizo competente: <input type="text" name="processoAbrigada.juizo" value="${processoAbrigada.juizo}"><br/> 
        Data da Audiência: <input type="text" name="processoAbrigada.dataAudiencia" value="${processoAbrigada.dataAudiencia}"><br/>  

        <!-- Paramos aki -->
        <h1>Dados do Autor</h1>
        Nome: <input type="text" name="processoAbrigada.autorNome" value="${processoAbrigada.autorNome}"><br/> 
        <div id="rbRelatorioAtivo" class="rbSica">
            Sexo: <br/>
            M <input type="radio" name="processoAbrigada.autorSexo" value="Masculino" <c:if test="${processoAbrigada.autorSexo == 'Masculino'}"> selected="selected" </c:if>>
            F <input type="radio" name="processoAbrigada.autorSexo" value="Feminino" <c:if test="${processoAbrigada.autorSexo == 'Feminino'}"> selected="selected" </c:if>><br/>
        </div>        
        Parentesco com a vitima: <input type="text" name="processoAbrigada.autorParentesco" value="${processoAbrigada.autorParentesco}"><br/> 
        Idade: <input type="text" name="processoAbrigada.autorIdade" value="${processoAbrigada.autorIdade}"><br/> 

        Endereço: <br/>
        <div id="rbRelatorioAtivo" class="rbSica">
            O mesmo da vítima <input type="radio" name="processoAbrigada.autorEndereco" value="mesmo vitima" <c:if test="${processoAbrigada.autorEndereco == 'mesmo vitima'}"> selected="selected" </c:if>> <input type="radio" name="processoAbrigada.endereco" value="" <c:if test="${processoAbrigada.endereco == 'sim'}"> selected="selected" </c:if>> 
            Outro <input type="radio" name="processoAbrigada.autorEndereco" value="outro" <c:if test="${processoAbrigada.autorEndereco == 'outro'}"> selected="selected" </c:if>>
        </div>
        Qual? <input type="text" name="processoAbrigada.autorEnderecoQual" value="${processoAbrigada.autorEnderecoQual}"><br/> 

        Possui antecedentes criminais? 
        <div id="rbRelatorioAtivo" class="rbSica">
            Sim <input type="radio" name="processoAbrigada.autorAntecedentesCriminais" value="sim" <c:if test="${processoAbrigada.autorAntecedentesCriminais == 'sim'}"> selected="selected" </c:if>>
            N&atilde;o <input type="radio" name="processoAbrigada.autorAntecedentesCriminais" value="nao" <c:if test="${processoAbrigada.autorAntecedentesCriminais == 'nao'}"> selected="selected" </c:if>><br/>
            Qual? <input type="text" name="processoAbrigada.autorAntecedentesCriminaisQuais" value="${processoAbrigada.autorAntecedentesCriminaisQuais}"><br/> 
        </div>
        <h1>Dados Processuais</h1>

        <h1>Medidas Protetivas de Urgência</h1>
        Nº das Medidas <input type="text" name="processoAbrigada.numeroMedidas" value="${processoAbrigada.numeroMedidas}"><br/> 
        Juizado <input type="text" name="processoAbrigada.juizado" value="${processoAbrigada.juizado}"><br/> 
        Data da Audiência <input type="text" name="processoAbrigada.dataAudienciaProtetiva" value="${processoAbrigada.dataAudienciaProtetiva}"><br/> 

        Agressor intimado?<br/>
        Sim <input type="radio" name="processoAbrigada.intimacaoAgressor" value="sim" <c:if test="${processoAbrigada.intimacaoAgressor == 'sim'}"> selected="selected" </c:if>>
        N&atilde;o <input type="radio" name="processoAbrigada.intimacaoAgressor" value="nao" <c:if test="${processoAbrigada.intimacaoAgressor == 'nao'}"> selected="selected" </c:if>><br/>
        Quais medidas foram deferidas? <input type="text" name="processoAbrigada.medidasDeferidas" value="${processoAbrigada.medidasDeferidas}"><br/> 

        <h1>Ações Cíveis</h1>
        Abrigada encaminhada à Defensoria Pública
        <div id="rbRelatorioAtivo" class="rbSica">
            Sim <input type="radio" name="processoAbrigada.encaminhamentoDefensoria" value="sim" <c:if test="${processoAbrigada.encaminhamentoDefensoria == 'sim'}"> selected="selected" </c:if>>
            N&atilde;o <input type="radio" name="processoAbrigada.encaminhamentoDefensoria" value="nao" <c:if test="${processoAbrigada.encaminhamentoDefensoria == 'nao'}"> selected="selected" </c:if>><br/>
            Porque <input type="text" name="processoAbrigada.encaminhamentoDefensoriaPorque" value="${processoAbrigada.encaminhamentoDefensoriaPorque}"><br/> 
        </div><br/>
        Ações que ingressou durante o abrigamento:<br/>
        1. Ação de  <input type="text" name="processoAbrigada.acaoAbrigamento1" value="${processoAbrigada.acaoAbrigamento1}"><br/> 
        nº do processo  <input type="text" name="processoAbrigada.numeroProcessoAbrigamento1" value="${processoAbrigada.numeroProcessoAbrigamento1}"><br/> 
        Juízo competente  <input type="text" name="processoAbrigada.juizoAbrigamento1" value="${processoAbrigada.juizoAbrigamento1}"><br/> 
        Data de Audiência  <input type="text" name="processoAbrigada.dataAudienciaAbrigamento1" value="${processoAbrigada.dataAudienciaAbrigamento1}"><br/> 
        <br/>
        2. Ação de  <input type="text" name="processoAbrigada.acaoAbrigamento2" value="${processoAbrigada.acaoAbrigamento2}"><br/> 
        nº do processo  <input type="text" name="processoAbrigada.numeroProcessoAbrigamento2" value="${processoAbrigada.numeroProcessoAbrigamento2}"><br/> 
        Juízo competente  <input type="text" name="processoAbrigada.juizoAbrigamento2" value="${processoAbrigada.juizoAbrigamento2}"><br/> 
        Data de Audiência  <input type="text" name="processoAbrigada.dataAudienciaAbrigamento2" value="${processoAbrigada.dataAudienciaAbrigamento2}"><br/> 
        <br/>
        3. Ação de  <input type="text" name="processoAbrigada.acaoAbrigamento3" value="${processoAbrigada.acaoAbrigamento3}"><br/> 
        nº do processo  <input type="text" name="processoAbrigada.numeroProcessoAbrigamento3" value="${processoAbrigada.numeroProcessoAbrigamento3}"><br/> 
        Juízo competente  <input type="text" name="processoAbrigada.juizoAbrigamento3" value="${processoAbrigada.juizoAbrigamento3}"><br/> 
        Data de Audiência  <input type="text" name="processoAbrigada.dataAudienciaAbrigamento3" value="${processoAbrigada.dataAudienciaAbrigamento3}"><br/> 
        <br/>
        <button class="btn"> Salvar </button>
        <!--<input type="submit" class="btn btn-info" value="Cadastrar" />-->

    </form>
