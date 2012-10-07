<%-- 
    Document   : form
    Created on : Jun 10, 2012, 10:30:17 PM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/css/geral.css"/>"/>
    </head>
    <body>

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
                            <form action="<c:url value="/dependentePedagogia/adiciona"/>" method="post" class="dependentePedagogia-form">
                            </c:when>

                            <c:otherwise>
                                <form action="<c:url value="/dependentePedagogia/atualizar"/>" method="post" class="dependentePedagogia-form">
                                </c:otherwise>
                            </c:choose>
                            <h2>Cadastro Setor de Recursos Pedagógicos</h2>

                            <input type="hidden" name="dependentePedagogia.idDependente" value="${dependentePedagogia.idDependente}" />
                            <input type="hidden" name="dependentePedagogia.idAbrigada" value="${dependentePedagogia.idAbrigada}" />

                            <div id="form-top">
                                Prontuario: <input type="text" name="dependentePedagogia.prontuario" value="${dependentePedagogia.prontuario}" /><br/>
                                Data Admissão: <input type="text" name="dependentePedagogia.dataAdmissao" value="${dependentePedagogia.dataAdmissao}" /><br/>
                                Abrigada: <input type="text" name="dependentePedagogia.nomeAbrigada" value="${dependentePedagogia.nomeAbrigada}" /> <br/>
                                ID: <input type="text" name="dependentePedagogia.idAbrigada" value="${dependentePedagogia.idAbrigada}" /><br/>
                                Admissão: <input type="radio" name="dependentePedagogia.desligamento" value="false" checked="checked"/>
                                Desligamento: <input type="radio" name="dependentePedagogia.desligamento" value="true"/><br/>
                                Necessita de acompanhamento psicologico:<input type="checkbox" name="dependentePedagogia.necessitaAcompanhamentoPsicologico" value="${dependentePedagogia.necessitaAcompanhamentoPsicologico}"/><br/>
                            </div>

                            <p>
                            <h3>Dados do dependente</h3>
                            </p>
                            <br/>

                            Nome: <input type="text" name="dependentePedagogia.nome" value="${dependentePedagogia.nome}" /><br/>
                            Idade: <input type="text" name="dependentePedagogia.idade" value="${dependentePedagogia.idade}" /><br/>
                            Sexo: <input type="text" name="dependentePedagogia.sexo" value="${dependentePedagogia.sexo}" /><br/>
                            Data de nascimento: <input type="text" name="dependentePedagogia.dataNascimento" value="${dependentePedagogia.dataNascimento}" /><br/>
                            
                            <h4> Situação escolar </h4> <br/>
                            
                            Série: <input type="text" name="dependentePedagogia.serie" value="${dependentePedagogia.serie}" /><br/>
                            Encontra-se matriculado?<br/>
                            Sim <input type="radio" name="dependentePedagogia.matriculado" value="true" checked="checked">                            
                            Escola:<input type="text" name="dependentePedagogia.escolaMatriculado" value="${dependentePedagogia.escolaMatriculado}" /><br/>
                            Não <input type="radio" name="dependentePedagogia.matriculado" value="false">
                            Motivo:<input type="text" name="dependentePedagogia.porqueNaoMatriculado" value="${dependentePedagogia.porqueNaoMatriculado}" /><br/>
                            
                            Apresenta defasagem escolar?<br/>
                            Sim <input type="radio" name="dependentePedagogia.apresentaDefasagemEscolar" value="true" />
                            Não <input type="radio" name="dependentePedagogia.apresentaDefasagemEscolar" value="false" checked="checked"/> <br/>
            
                            Apresenta dificuldade de aprendizagem?<br/>
                            Sim <input type="radio" name="dependentePedagogia.apresentaDeficuldadeAprendizagem" value="true"/>
                            Não <input type="radio" name="dependentePedagogia.apresentaDeficuldadeAprendizagem" value="false" checked="checked"/><br/>
                            
                            
                            <!--
                            <h1>Situação de saude</h1>
                            Portador de necesidades especiais?<br/>
                            Não <input type="radio" name="dependentePedagogia.portadorNecessidadeEspeciais" value="nao" checked <c:if test="${dependentePedagogia.portadorNecessidadeEspeciais == 'nao'}"> checked="checked"</c:if>><br/>
                            Sim <input type="radio" name="dependentePedagogia.portadorNecessidadeEspeciais" value="sim" <c:if test="${dependentePedagogia.portadorNecessidadeEspeciais == 'sim'}"> checked="checked" </c:if>>
                            Visual<input type="checkbox" name="dependentePedagogia.portadorNecessidadeEspeciaisSim" value="visual" <c:if test="${dependentePedagogia.portadorNecessidadeEspeciaisSim == 'visual'}"> checked="checked" </c:if>>
                            Auditiva/de fala <input type="checkbox" name="dependentePedagogia.portadorNecessidadeEspeciaisSim" value="auditivaDeFala" <c:if test="${dependentePedagogia.portadorNecessidadeEspeciaisSim == 'auditivaDeFala'}"> checked="checked" </c:if>>   
                            Física <input type="checkbox" name="dependentePedagogia.portadorNecessidadeEspeciaisSim" value="fisica" <c:if test="${dependentePedagogia.portadorNecessidadeEspeciaisSim == 'fisica'}"> checked="checked" </c:if>>
                            Mental <input type="checkbox" name="dependentePedagogia.portadorNecessidadeEspeciaisSim" value="mental" <c:if test="${dependentePedagogia.portadorNecessidadeEspeciaisSim == 'mental'}"> checked="checked" </c:if>/><br/>
            
                            Histórico de acompanhamento psiquiátrico? <input type="text" name="dependentePedagogia.historicoAcompanhamentoPsiquiatrico" value="${dependentePedagogia.historicoAcompanhamentoPsiquiatrico}" /><br/>
            
                            Usa drogas líciitas/Ilícitas?<br/>
                            Não <input type="radio" name="dependentePedagogia.usaDrogas" value="nao"checked <c:if test="${dependentePedagogia.usaDrogas == 'nao'}"> checked="checked"</c:if>><br/>
                            Sim <input type="radio" name="dependentePedagogia.usaDrogas" value="sim" <c:if test="${dependentePedagogia.usaDrogas == 'sim'}"> checked="checked" </c:if>>
                            Quais? <input type="text" name="dependentePedagogia.qualDroga" value="${dependentePedagogia.qualDroga}" /><br/>
                            Com que frequência? <input type="text" name="dependentePedagogia.frequenciaUsoDrogas" value="${dependentePedagogia.frequenciaUsoDrogas}" /><br/>
            
                            Possui alguma doença?<br/>
                            Não <input type="radio" name="dependentePedagogia.possuiDoenca" value="nao" checked <c:if test="${dependentePedagogia.possuiDoenca == 'nao'}"> checked="checked"</c:if>><br/>
                            Sim <input type="radio" name="dependentePedagogia.possuiDoenca" value="sim" <c:if test="${dependentePedagogia.possuiDoenca == 'sim'}"> checked="checked" </c:if>>
                            tipo de doença:<input type="text" name="dependentePedagogia.tipoDoenca" value="${dependentePedagogia.tipoDoenca}"/><br/>
            
                            Possui alergias?<br/>
                            Não <input type="radio" name="dependentePedagogia.possuiAlergia" value="nao" checked<c:if test="${dependentePedagogia.possuiAlergia == 'nao'}"> checked="checked"</c:if>><br/>
                            Sim <input type="radio" name="dependentePedagogia.possuiAlergia" value="sim" <c:if test="${dependentePedagogia.possuiAlergia == 'sim'}"> checked="checked" </c:if>>
                            Medicamentos:<input type="text" name="dependentePedagogia.medicamentoAlergico" value="${dependentePedagogia.medicamentoAlergico}"/><br/>
            
                            Faz uso de medicação controlada?<br/>
                            Não <input type="radio" name="dependentePedagogia.medicacaoControlada" value="nao" checked<c:if test="${dependentePedagogia.medicacaoControlada == 'nao'}"> checked="checked"</c:if>><br/>
                            Sim <input type="radio" name="dependentePedagogia.medicacaoControlada" value="sim" <c:if test="${dependentePedagogia.medicacaoControlada == 'sim'}"> checked="checked" </c:if>>
                            Medicamentos:<input type="text" name="dependentePedagogia.medicamentoControlado" value="${dependentePedagogia.medicamentoControlado}"/><br/>
            
            
                            <h1>Situação de violência com os dependentes</h1>
                            Nº do Boletim de ocorrência:<input type="text" name="dependentePedagogia.nBoletimOcorrencia" value="${dependentePedagogia.nBoletimOcorrencia}"/><br/>
                            Orgão de encaminhamento:<input type="text" name="dependentePedagogia.orgaoDeEncaminhamento" value="${dependentePedagogia.orgaoDeEncaminhamento}"/><br/>
            
                            Tipos de violenca ja sofrida:<br/>
                            Física <input type="checkbox" name="dependentePedagogia.violenciaFisica" value="fisica"  <c:if test="${dependentePedagogia.violenciaFisica == 'fisica'}">checked ="checked"</c:if>>
                            de que forma? <input type="text" name="dependentePedagogia.qualFormaFisica" value="${dependentePedagogia.qualFormaFisica}"/><br/>
                            Possui lesão aparente? <input type="text" name="dependentePedagogia.lesaoAparente" value="${dependentePedagogia.lesaoAparente}"/><br/>
                            Encaminhada ao IML? <input type="text" name="dependentePedagogia.encaminhadaIMLFisica" value="${dependentePedagogia.encaminhadaIMLFisica}"/><br/>
                            Sexual <input type="checkbox" name="dependentePedagogia.violenciaSexual" value="sexual" <c:if test="${dependentePedagogia.violenciaSexual == 'sexual'}">checked ="checked"</c:if>>
                            de que forma? <input type="text" name="dependentePedagogia.qualFormaSexual" value="${dependentePedagogia.qualFormaSexual}"/><br/>
                            Encaminhada ao IML? <input type="text" name="dependentePedagogia.encaminhadaIMLSexual" value="${dependentePedagogia.encaminhadaIMLSexual}"/><br/>
                            Patrimonial: <input type="checkbox" name="dependentePedagogia.violenciaPatrimonial" value="patrimonial" <c:if test="${dependentePedagogia.violenciaPatrimonial == 'patrimonial'}">checked ="checked"</c:if>>
                            de que forma? <input type="text" name="dependentePedagogia.qualFormaPatrimonial" value="${dependentePedagogia.qualFormaPatrimonial}"/><br/>
                            Moral: <input type="checkbox" name="dependentePedagogia.violenciaMoral" value="moral" <c:if test="${dependentePedagogia.violenciaMoral == 'moral'}">checked ="checked"</c:if>>
                            de que forma? <input type="text" name="dependentePedagogia.qualFormaMoral" value="${dependentePedagogia.qualFormaMoral}"/><br/>
                            Psicológica: <input type="checkbox" name="dependentePedagogia.violenciaPsicologica" value="psicologica" <c:if test="${dependentePedagogia.violenciaPsicologica == 'psicologica'}">checked ="checked"</c:if>>
                            de que forma? <input type="text" name="dependentePedagogia.qualFormaPsicologica" value="${dependentePedagogia.qualFormaPsicologica}"/><br/>
            
                            Agressor:<input type="text" name="dependentePedagogia.nomeAgressor" value="${dependentePedagogia.nomeAgressor}"/><br/>
                            Relação/grau de parentesco com a criança/adolescente:<input type="text" name="dependentePedagogia.relacaoDependente" value="${dependentePedagogia.relacaoDependente}"/><br/>
                            Foi a primeira agressão?<br/>
                            Sim <input type="radio" name="dependentePedagogia.primeiraAgressao" value="sim" checked <c:if test="${dependentePedagogia.primeiraAgressao == 'sim'}">checked="checked"</c:if>>
                            Não <input type="radio" name="dependentePedagogia.primeiraAgressao" value="nao" <c:if test="${dependentePedagogia.primeiraAgressao == 'nao'}">checked="checked"</c:if>/><br/>
            
                            Foi a primeira denuncia?<br/>
                            Sim <input type="radio" name="dependentePedagogia.primeiraDenuncia" value="sim" checked <c:if test="${dependentePedagogia.primeiraDenuncia == 'sim'}">checked="checked"</c:if>>
                            Por que não denunciou antes?<input type="text" name="dependentePedagogia.pqNaoDenunciouAntes" value="${dependentePedagogia.pqNaoDenunciouAntes}"/><br/>      
                            Não <input type="radio" name="dependentePedagogia.primeiraDenuncia" value="nao" <c:if test="${dependentePedagogia.primeiraDenuncia == 'nao'}">checked="checked"</c:if>>
                            Quantas vezes? <input type="text" name="dependentePedagogia.quantasVezes" value="${dependentePedagogia.quantasVezes}"/><br/>
            
                            Há quanto tempo acontecem as agressões?<input type="text" name="dependentePedagogia.tempoOcorreAgressoes" value="${dependentePedagogia.tempoOcorreAgressoes}"><br/>
            
                            Pasta especial na VIJ?<br/>
                            Sim <input type="radio" name="dependentePedagogia.pastaEspecialVIJ" value="sim" checked <c:if test="${dependentePedagogia.pastaEspecialVIJ == 'sim'}">checked="checked"</c:if>>
                            Não <input type="radio" name="dependentePedagogia.pastaEspecialVIJ" value="nao" <c:if test="${dependentePedagogia.pastaEspecialVIJ == 'nao'}">checked="checked"</c:if>>
                            Solicitar <input type="radio" name="dependentePedagogia.pastaEspecialVIJ" value="solicitar" <c:if test="${dependentePedagogia.pastaEspecialVIJ == 'solicitar'}">checked="checked"</c:if>/><br/>
            
                            Caso nao seja vítima de agressões, já presenciou as agressoes contra mãe ou outros familiares?<br/> 
                            Sim <input type="radio" name="dependentePedagogia.presenciouVilenciaContraParentescos" value="sim" checked <c:if test="${dependentePedagogia.presenciouVilenciaContraParentescos == 'sim'}">checked="checked"</c:if>>
                            Não <input type="radio" name="dependentePedagogia.presenciouVilenciaContraParentescos" value="nao" <c:if test="${dependentePedagogia.presenciouVilenciaContraParentescos == 'nao'}">checked="checked"</c:if>/><br/>
            
                            Necessita de acompanhamento pedagógico após o desligamento?
                            Sim <input type="radio" name="dependentePedagogia.necessitaAcompanhamento" value="sim" checked <c:if test="${dependentePedagogia.necessitaAcompanhamento == 'sim'}">checked="checked"</c:if>>
                            Não <input type="radio" name="dependentePedagogia.necessitaAcompanhamento" value="nao" <c:if test="${dependentePedagogia.necessitaAcompanhamento == 'nao'}">checked="checked"</c:if>/><br/>
                            Observações:<br/><textarea name="dependentePedagogia.observacaoPosDesligamento" cols="50" rows="10"> ${dependentePedagogia.observacaoPosDesligamento}</textarea><br/>
                            -->


                            <input type="submit" value="Salvar" class="btn btn-primary" />
                        </form>
 
    </body>
</html>
