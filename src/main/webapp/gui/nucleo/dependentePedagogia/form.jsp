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

        <div class="principal">
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
                        Admissão: <input type="radio" name="dependentePedagogia.desligamento" value="false" checked="checked"/>
                        Desligamento: <input type="radio" name="dependentePedagogia.desligamento" value="true"/><br/>
                        Necessita de acompanhamento psicologico:<input type="checkbox" name="dependentePedagogia.necessitaAcompanhamentoPsicologico" value="true"<c:if test="${dependentePedagogia.necessitaAcompanhamentoPsicologico == true}">checked="checked"</c:if>/><br/>
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
                    Sim <input type="radio" name="dependentePedagogia.matriculado" value="true" <c:if test="${dependentePedagogia.matriculado == true}">checked="checked"</c:if>>                            
                    Escola:<input type="text" name="dependentePedagogia.escolaMatriculado" value="${dependentePedagogia.escolaMatriculado}" /><br/>
                    Não <input type="radio" name="dependentePedagogia.matriculado" value="false" <c:if test="${dependentePedagogia.matriculado == false}">checked="checked"</c:if>>
                    Motivo:<input type="text" name="dependentePedagogia.porqueNaoMatriculado" value="${dependentePedagogia.porqueNaoMatriculado}" /><br/>

                    Apresenta defasagem escolar?<br/>
                    Sim <input type="radio" name="dependentePedagogia.apresentaDefasagemEscolar" value="true" <c:if test="${dependentePedagogia.apresentaDefasagemEscolar == true}">checked="checked"</c:if>/>
                    Não <input type="radio" name="dependentePedagogia.apresentaDefasagemEscolar" value="false" <c:if test="${dependentePedagogia.apresentaDefasagemEscolar == false}">checked="checked"</c:if>/> <br/>

                    Apresenta dificuldade de aprendizagem?<br/>
                    Sim <input type="radio" name="dependentePedagogia.apresentaDeficuldadeAprendizagem" value="true" <c:if test="${dependentePedagogia.apresentaDeficuldadeAprendizagem == true}">checked="checked"</c:if>/>
                    Não <input type="radio" name="dependentePedagogia.apresentaDeficuldadeAprendizagem" value="false" <c:if test="${dependentePedagogia.apresentaDeficuldadeAprendizagem == false}">checked="checked"</c:if>/><br/>

                    <br/><br/>

                    <h4>Situação de saude</h4> <br/>

                    Portador de necesidades especiais?<br/>
                    Não <input type="radio" name="dependentePedagogia.portadorNecessidadeEspeciais" value="false" <c:if test="${dependentePedagogia.portadorNecessidadeEspeciais == false}"> checked="checked"</c:if>/>
                    Sim <input type="radio" name="dependentePedagogia.portadorNecessidadeEspeciais" value="true" <c:if test="${dependentePedagogia.portadorNecessidadeEspeciais == true}"> checked="checked"</c:if>/><br/>                    
                    Qual tipo: <input type="text" name="dependentePedagogia.portadorNecessidadeEspeciaisSim" value="${dependentePedagogia.portadorNecessidadeEspeciaisSim}"/><br/>
                    
                    <br/>
                    Histórico de acompanhamento psiquiátrico: <input type="text" name="dependentePedagogia.historicoAcompanhamentoPsiquiatrico" value="${dependentePedagogia.historicoAcompanhamentoPsiquiatrico}" /><br/></br>

                    Usa drogas lícitas/ilícitas?<br/>
                    Sim <input type="radio" name="dependentePedagogia.usaDrogas" value="true" <c:if test="${dependentePedagogia.usaDrogas == true}"> checked="checked"</c:if>/>
                    Não <input type="radio" name="dependentePedagogia.usaDrogas" value="false" <c:if test="${dependentePedagogia.usaDrogas == false}"> checked="checked"</c:if> /><br/>
                    Quais: <input type="text" name="dependentePedagogia.qualDroga" value="${dependentePedagogia.qualDroga}" /><br/>
                    Frequência: <input type="text" name="dependentePedagogia.frequenciaUsoDrogas" value="${dependentePedagogia.frequenciaUsoDrogas}" /><br/>


                    Possui alguma doença?<br/>                
                    Sim <input type="radio" name="dependentePedagogia.possuiDoenca" value="sim" <c:if test="${dependentePedagogia.possuiDoenca == 'sim'}"> checked="checked"</c:if>/>
                    Não <input type="radio" name="dependentePedagogia.possuiDoenca" value="nao" <c:if test="${dependentePedagogia.possuiDoenca == 'nao'}"> checked="checked"</c:if>/><br/>
                    tipo de doença:<input type="text" name="dependentePedagogia.tipoDoenca" value="${dependentePedagogia.tipoDoenca}"/><br/>


                    Possui alergias?<br/>
                    Sim <input type="radio" name="dependentePedagogia.possuiAlergia" value="sim" <c:if test="${dependentePedagogia.possuiAlergia == 'sim'}"> checked="checked" </c:if>>
                    Não <input type="radio" name="dependentePedagogia.possuiAlergia" value="nao" <c:if test="${dependentePedagogia.possuiAlergia == 'nao'}"> checked="checked"</c:if>><br/>
                    Medicamentos:<input type="text" name="dependentePedagogia.medicamentoAlergico" value="${dependentePedagogia.medicamentoAlergico}"/><br/>


                    Faz uso de medicação controlada?<br/>
                    Sim <input type="radio" name="dependentePedagogia.medicacaoControlada" value="sim" <c:if test="${dependentePedagogia.medicacaoControlada == 'sim'}"> checked="checked" </c:if>>
                    Não <input type="radio" name="dependentePedagogia.medicacaoControlada" value="nao" <c:if test="${dependentePedagogia.medicacaoControlada == 'nao'}"> checked="checked"</c:if>><br/>
                    Medicamentos:<input type="text" name="dependentePedagogia.medicamentoControlado" value="${dependentePedagogia.medicamentoControlado}"/><br/>

                    <br/><br/>

                    <h4>Situação de violência com os dependentes</h4><br/>

                    Nº do Boletim de ocorrência:<input type="text" name="dependentePedagogia.nBoletimOcorrencia" value="${dependentePedagogia.nBoletimOcorrencia}"/><br/>
                    Orgão de encaminhamento:<input type="text" name="dependentePedagogia.orgaoDeEncaminhamento" value="${dependentePedagogia.orgaoDeEncaminhamento}"/><br/>

                    <br/>

                    Tipos de violenca ja sofrida:<br/>
                    Física <input type="checkbox" name="dependentePedagogia.violenciaFisica" value="true" <c:if test="${dependentePedagogia.violenciaFisica == true}"> checked="checked"</c:if> /><br/>
                    Qual forma: <input type="text" name="dependentePedagogia.qualFormaFisica" value="${dependentePedagogia.qualFormaFisica}"/><br/>
                    Possui lesão aparente: <input type="text" name="dependentePedagogia.lesaoAparente" value="${dependentePedagogia.lesaoAparente}"/><br/>              
                    Encaminhada ao IML: <input type="text" name="dependentePedagogia.encaminhadaIMLFisica" value="${dependentePedagogia.encaminhadaIMLFisica}"/><br/>

                    Sexual <input type="checkbox" name="dependentePedagogia.violenciaSexual" value="true" <c:if test="${dependentePedagogia.violenciaSexual == true}"> checked="checked"</c:if>/><br/>
                    Qual forma: <input type="text" name="dependentePedagogia.qualFormaSexual" value="${dependentePedagogia.qualFormaSexual}"/><br/>
                    Encaminhada ao IML: <input type="text" name="dependentePedagogia.encaminhadaIMLSexual" value="${dependentePedagogia.encaminhadaIMLSexual}"/><br/>

                    Patrimonial: <input type="checkbox" name="dependentePedagogia.violenciaPatrimonial" value="true" <c:if test="${dependentePedagogia.violenciaPatrimonial == true}"> checked="checked"</c:if>/><br/>
                    Qual forma: <input type="text" name="dependentePedagogia.qualFormaPatrimonial" value="${dependentePedagogia.qualFormaPatrimonial}"/><br/>

                    Moral: <input type="checkbox" name="dependentePedagogia.violenciaMoral" value="true" <c:if test="${dependentePedagogia.violenciaMoral == true}"> checked="checked"</c:if>/><br/>
                    Qual forma: <input type="text" name="dependentePedagogia.qualFormaMoral" value="${dependentePedagogia.qualFormaMoral}"/><br/>

                    Psicológica: <input type="checkbox" name="dependentePedagogia.violenciaPsicologica" value="true" <c:if test="${dependentePedagogia.violenciaPsicologica == true}"> checked="checked"</c:if>/><br/>
                    Qual forma: <input type="text" name="dependentePedagogia.qualFormaPsicologica" value="${dependentePedagogia.qualFormaPsicologica}"/><br/>

                    Agressor:<input type="text" name="dependentePedagogia.nomeAgressor" value="${dependentePedagogia.nomeAgressor}"/><br/>
                    Relação/grau de parentesco:<input type="text" name="dependentePedagogia.relacaoDependente" value="${dependentePedagogia.relacaoDependente}"/><br/>
                    Foi a primeira agressão:<br/>
                    Sim <input type="radio" name="dependentePedagogia.primeiraAgressao" value="true" <c:if test="${dependentePedagogia.primeiraAgressao == true}">checked="checked"</c:if>>
                    Não <input type="radio" name="dependentePedagogia.primeiraAgressao" value="false" <c:if test="${dependentePedagogia.primeiraAgressao == false}">checked="checked"</c:if>/><br/>


                    Foi a primeira denuncia?<br/>
                    Sim <input type="radio" name="dependentePedagogia.primeiraDenuncia" value="true" <c:if test="${dependentePedagogia.primeiraDenuncia == true}">checked="checked"</c:if>>
                    Por que não denunciou antes:<input type="text" name="dependentePedagogia.pqNaoDenunciouAntes" value="${dependentePedagogia.pqNaoDenunciouAntes}"/><br/>      
                    Não <input type="radio" name="dependentePedagogia.primeiraDenuncia" value="false" <c:if test="${dependentePedagogia.primeiraDenuncia == false   }">checked="checked"</c:if>>
                    Quantas vezes:<input type="text" name="dependentePedagogia.quantasVezes" value="${dependentePedagogia.quantasVezes}"/><br/>


                    Há quanto tempo acontecem as agressões: <input type="text" name="dependentePedagogia.tempoOcorreAgressoes" value="${dependentePedagogia.tempoOcorreAgressoes}"><br/>

                    Pasta especial na VIJ?<br/>
                    Sim <input type="radio" name="dependentePedagogia.pastaEspecialVIJ" value="sim" <c:if test="${dependentePedagogia.pastaEspecialVIJ == 'sim'}">checked="checked"</c:if>>
                    Não <input type="radio" name="dependentePedagogia.pastaEspecialVIJ" value="nao" <c:if test="${dependentePedagogia.pastaEspecialVIJ == 'nao'}">checked="checked"</c:if>>
                    Solicitar <input type="radio" name="dependentePedagogia.pastaEspecialVIJ" value="solicitar" <c:if test="${dependentePedagogia.pastaEspecialVIJ == 'solicitar'}">checked="checked"</c:if>/><br/>

                    Já presenciou as agressoes contra mãe ou outros familiares?<br/> 
                    Sim <input type="radio" name="dependentePedagogia.presenciouVilenciaContraParentescos" value="true" <c:if test="${dependentePedagogia.presenciouVilenciaContraParentescos == true}">checked="checked"</c:if>>
                    Não <input type="radio" name="dependentePedagogia.presenciouVilenciaContraParentescos" value="false" <c:if test="${dependentePedagogia.presenciouVilenciaContraParentescos == false}">checked="checked"</c:if>/><br/>

                    <br/><br/>  

                    <h4>Necessita de acompanhamento pedagógico após o desligamento?</h4>
                    Sim <input type="radio" name="dependentePedagogia.necessitaAcompanhamento" value="true" <c:if test="${dependentePedagogia.necessitaAcompanhamento == true}">checked="checked"</c:if>>
                    Não <input type="radio" name="dependentePedagogia.necessitaAcompanhamento" value="false" <c:if test="${dependentePedagogia.necessitaAcompanhamento == false}">checked="checked"</c:if>/><br/>

                    <br/><br/>

                    <h4>Observações:</h4>
                    <textarea name="dependentePedagogia.observacaoPosDesligamento" cols="50" rows="10"> ${dependentePedagogia.observacaoPosDesligamento}</textarea><br/>


                    <div class="actions">
                        <input type="submit" value="Salvar" class="btn btn-primary" />
                    </div>

                </form>
        </div>

    </body>
</html>
