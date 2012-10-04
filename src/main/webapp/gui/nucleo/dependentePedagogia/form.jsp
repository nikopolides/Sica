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
        <link type="text/css" rel="stylesheet" href="../../css/geral.css"/>
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
                <form action="<c:url value="/dependentePedagogia/adiciona"/>" method="post">
                </c:when>
                <c:otherwise>
                    <form action="<c:url value="/dependentePedagogia/atualizar"/>" method="post">
                    </c:otherwise>
                </c:choose>
                <input type="hidden" name="dependentePedagogia.id" value="${dependentePedagogia.id}" />
                <input type="hidden" name="dependentePedagogia.idAbrigada" value="${idAbrigada}" />
                Prontuario: <input type="text" name="dependentePedagogia.prontuario" value="${dependentePedagogia.prontuario}" /><br/>
                Data Admiss�o: <input type="text" name="dependentePedagogia.dataAdmissao" value="${dependentePedagogia.dataAdmissao}" /><br/>
                Abrigada: <input type="text" name="dependentePedagogia.nomeAbrigada" value="${dependentePedagogia.nomeAbrigada}" /><br/>
                Desligamento: <input type="checkbox" name="dependentePedagogia.desligamento" value="${dependentePedagogia.desligamento}" /><br/>
                Necessita de acompanhamento psicologico:<input type="checkbox" name="dependentePedagogia.necessitaAcompanhamentoPsicologico" value="${dependentePedagogia.necessitaAcompanhamentoPsicologic}"/><br/>
                
                
                <h1>Dados do dependente</h1>
                Nome: <input type="text" name="dependentePedagogia.nome" value="${dependentePedagogia.nome}" /><br/>
                Idade: <input type="text" name="dependentePedagogia.idade" value="${dependentePedagogia.idade}" /><br/>
                Sexo: <input type="text" name="dependentePedagogia.sexo" value="${dependentePedagogia.sexo}" /><br/>
                Data de nascimento: <input type="text" name="dependentePedagogia.dataNascimento" value="${dependentePedagogia.dataNascimento}" /><br/>
                
                <h1> Situa��o escolar </h1> 
                S�rie: <input type="text" name="dependentePedagogia.serie" value="${dependentePedagogia.serie}" /><br/>
                Matriculado?<br/>
                Sim <input type="radio" name="dependentePedagogia.matriculado" value="sim" checked <c:if test="${dependentePedagogia.matriculado == 'sim'}"> checked="checked" </c:if>>
                
                Escola matriculado:<input type="text" name="dependentePedagogia.escolaMatriculado" value="${dependentePedagogia.escolaMatriculado}" /><br/>
                N�o <input type="radio" name="dependentePedagogia.matriculado" value="nao" <c:if test="${dependentePedagogia.matriculado == 'nao'}">checked="checked"</c:if>>
                Por que n�o matriculado?:<input type="text" name="dependentePedagogia.porqueNaoMatriculado" value="${dependentePedagogia.porqueNaoMatriculado}" /><br/>
                
                Apresenta defasagem escolar?<br/>
                Sim <input type="radio" name="dependentePedagogia.apresentaDefasagemEscolar" value="sim" checked<c:if test="${dependentePedagogia.apresentaDefasagemEscolar == 'sim'}"> checked="checked" </c:if>>
                N�o <input type="radio" name="dependentePedagogia.apresentaDefasagemEscolar" value="nao" <c:if test="${dependentePedagogia.apresentaDefasagemEscolar == 'nao'}"> checked="checked"</c:if>/><br/>
                
                Apresenta dificuldade de aprendizagem?<br/>
                Sim <input type="radio" name="dependentePedagogia.apresentaDeficuldadeAprendizagem" value="sim" checked <c:if test="${dependentePedagogia.apresentaDeficuldadeAprendizagem == 'sim'}"> checked="checked" </c:if>>
                N�o <input type="radio" name="dependentePedagogia.apresentaDeficuldadeAprendizagem" value="nao" <c:if test="${dependentePedagogia.apresentaDeficuldadeAprendizagem == 'nao'}"> checked="checked"</c:if>/><br/>
                
                <h1>Situa��o de saude</h1>
                Portador de necesidades especiais?<br/>
                N�o <input type="radio" name="dependentePedagogia.portadorNecessidadeEspeciais" value="nao" checked <c:if test="${dependentePedagogia.portadorNecessidadeEspeciais == 'nao'}"> checked="checked"</c:if>><br/>
                Sim <input type="radio" name="dependentePedagogia.portadorNecessidadeEspeciais" value="sim" <c:if test="${dependentePedagogia.portadorNecessidadeEspeciais == 'sim'}"> checked="checked" </c:if>>
                Visual<input type="checkbox" name="dependentePedagogia.portadorNecessidadeEspeciaisSim" value="visual" <c:if test="${dependentePedagogia.portadorNecessidadeEspeciaisSim == 'visual'}"> checked="checked" </c:if>>
                Auditiva/de fala <input type="checkbox" name="dependentePedagogia.portadorNecessidadeEspeciaisSim" value="auditivaDeFala" <c:if test="${dependentePedagogia.portadorNecessidadeEspeciaisSim == 'auditivaDeFala'}"> checked="checked" </c:if>>   
                F�sica <input type="checkbox" name="dependentePedagogia.portadorNecessidadeEspeciaisSim" value="fisica" <c:if test="${dependentePedagogia.portadorNecessidadeEspeciaisSim == 'fisica'}"> checked="checked" </c:if>>
                Mental <input type="checkbox" name="dependentePedagogia.portadorNecessidadeEspeciaisSim" value="mental" <c:if test="${dependentePedagogia.portadorNecessidadeEspeciaisSim == 'mental'}"> checked="checked" </c:if>/><br/>
               
                Hist�rico de acompanhamento psiqui�trico? <input type="text" name="dependentePedagogia.historicoAcompanhamentoPsiquiatrico" value="${dependentePedagogia.historicoAcompanhamentoPsiquiatrico}" /><br/>
                
                Usa drogas l�ciitas/Il�citas?<br/>
                N�o <input type="radio" name="dependentePedagogia.usaDrogas" value="nao"checked <c:if test="${dependentePedagogia.usaDrogas == 'nao'}"> checked="checked"</c:if>><br/>
                Sim <input type="radio" name="dependentePedagogia.usaDrogas" value="sim" <c:if test="${dependentePedagogia.usaDrogas == 'sim'}"> checked="checked" </c:if>>
                Quais? <input type="text" name="dependentePedagogia.qualDroga" value="${dependentePedagogia.qualDroga}" /><br/>
                Com que frequ�ncia? <input type="text" name="dependentePedagogia.frequenciaUsoDrogas" value="${dependentePedagogia.frequenciaUsoDrogas}" /><br/>
                
                Possui alguma doen�a?<br/>
                N�o <input type="radio" name="dependentePedagogia.possuiDoenca" value="nao" checked <c:if test="${dependentePedagogia.possuiDoenca == 'nao'}"> checked="checked"</c:if>><br/>
                Sim <input type="radio" name="dependentePedagogia.possuiDoenca" value="sim" <c:if test="${dependentePedagogia.possuiDoenca == 'sim'}"> checked="checked" </c:if>>
                tipo de doen�a:<input type="text" name="dependentePedagogia.tipoDoenca" value="${dependentePedagogia.tipoDoenca}"/><br/>
                
                Possui alergias?<br/>
                N�o <input type="radio" name="dependentePedagogia.possuiAlergia" value="nao" checked<c:if test="${dependentePedagogia.possuiAlergia == 'nao'}"> checked="checked"</c:if>><br/>
                Sim <input type="radio" name="dependentePedagogia.possuiAlergia" value="sim" <c:if test="${dependentePedagogia.possuiAlergia == 'sim'}"> checked="checked" </c:if>>
                Medicamentos:<input type="text" name="dependentePedagogia.medicamentoAlergico" value="${dependentePedagogia.medicamentoAlergico}"/><br/>
               
                Faz uso de medica��o controlada?<br/>
                N�o <input type="radio" name="dependentePedagogia.medicacaoControlada" value="nao" checked<c:if test="${dependentePedagogia.medicacaoControlada == 'nao'}"> checked="checked"</c:if>><br/>
                Sim <input type="radio" name="dependentePedagogia.medicacaoControlada" value="sim" <c:if test="${dependentePedagogia.medicacaoControlada == 'sim'}"> checked="checked" </c:if>>
                Medicamentos:<input type="text" name="dependentePedagogia.medicamentoControlado" value="${dependentePedagogia.medicamentoControlado}"/><br/>
      
                
                <h1>Situa��o de viol�ncia com os dependentes</h1>
                N� do Boletim de ocorr�ncia:<input type="text" name="dependentePedagogia.nBoletimOcorrencia" value="${dependentePedagogia.nBoletimOcorrencia}"/><br/>
                Org�o de encaminhamento:<input type="text" name="dependentePedagogia.orgaoDeEncaminhamento" value="${dependentePedagogia.orgaoDeEncaminhamento}"/><br/>
                
                Tipos de violenca ja sofrida:<br/>
                F�sica <input type="checkbox" name="dependentePedagogia.violenciaFisica" value="fisica"  <c:if test="${dependentePedagogia.violenciaFisica == 'fisica'}">checked ="checked"</c:if>>
                        de que forma? <input type="text" name="dependentePedagogia.qualFormaFisica" value="${dependentePedagogia.qualFormaFisica}"/><br/>
                        Possui les�o aparente? <input type="text" name="dependentePedagogia.lesaoAparente" value="${dependentePedagogia.lesaoAparente}"/><br/>
                        Encaminhada ao IML? <input type="text" name="dependentePedagogia.encaminhadaIMLFisica" value="${dependentePedagogia.encaminhadaIMLFisica}"/><br/>
                Sexual <input type="checkbox" name="dependentePedagogia.violenciaSexual" value="sexual" <c:if test="${dependentePedagogia.violenciaSexual == 'sexual'}">checked ="checked"</c:if>>
                        de que forma? <input type="text" name="dependentePedagogia.qualFormaSexual" value="${dependentePedagogia.qualFormaSexual}"/><br/>
                        Encaminhada ao IML? <input type="text" name="dependentePedagogia.encaminhadaIMLSexual" value="${dependentePedagogia.encaminhadaIMLSexual}"/><br/>
                Patrimonial: <input type="checkbox" name="dependentePedagogia.violenciaPatrimonial" value="patrimonial" <c:if test="${dependentePedagogia.violenciaPatrimonial == 'patrimonial'}">checked ="checked"</c:if>>
                        de que forma? <input type="text" name="dependentePedagogia.qualFormaPatrimonial" value="${dependentePedagogia.qualFormaPatrimonial}"/><br/>
                Moral: <input type="checkbox" name="dependentePedagogia.violenciaMoral" value="moral" <c:if test="${dependentePedagogia.violenciaMoral == 'moral'}">checked ="checked"</c:if>>
                        de que forma? <input type="text" name="dependentePedagogia.qualFormaMoral" value="${dependentePedagogia.qualFormaMoral}"/><br/>
                Psicol�gica: <input type="checkbox" name="dependentePedagogia.violenciaPsicologica" value="psicologica" <c:if test="${dependentePedagogia.violenciaPsicologica == 'psicologica'}">checked ="checked"</c:if>>
                        de que forma? <input type="text" name="dependentePedagogia.qualFormaPsicologica" value="${dependentePedagogia.qualFormaPsicologica}"/><br/>
               
                Agressor:<input type="text" name="dependentePedagogia.nomeAgressor" value="${dependentePedagogia.nomeAgressor}"/><br/>
                Rela��o/grau de parentesco com a crian�a/adolescente:<input type="text" name="dependentePedagogia.relacaoDependente" value="${dependentePedagogia.relacaoDependente}"/><br/>
                Foi a primeira agress�o?<br/>
                Sim <input type="radio" name="dependentePedagogia.primeiraAgressao" value="sim" checked <c:if test="${dependentePedagogia.primeiraAgressao == 'sim'}">checked="checked"</c:if>>
                N�o <input type="radio" name="dependentePedagogia.primeiraAgressao" value="nao" <c:if test="${dependentePedagogia.primeiraAgressao == 'nao'}">checked="checked"</c:if>/><br/>
                
                Foi a primeira denuncia?<br/>
                Sim <input type="radio" name="dependentePedagogia.primeiraDenuncia" value="sim" checked <c:if test="${dependentePedagogia.primeiraDenuncia == 'sim'}">checked="checked"</c:if>>
                Por que n�o denunciou antes?<input type="text" name="dependentePedagogia.pqNaoDenunciouAntes" value="${dependentePedagogia.pqNaoDenunciouAntes}"/><br/>      
                N�o <input type="radio" name="dependentePedagogia.primeiraDenuncia" value="nao" <c:if test="${dependentePedagogia.primeiraDenuncia == 'nao'}">checked="checked"</c:if>>
                Quantas vezes? <input type="text" name="dependentePedagogia.quantasVezes" value="${dependentePedagogia.quantasVezes}"/><br/>
               
                H� quanto tempo acontecem as agress�es?<input type="text" name="dependentePedagogia.tempoOcorreAgressoes" value="${dependentePedagogia.tempoOcorreAgressoes}"><br/>
               
                Pasta especial na VIJ?<br/>
                Sim <input type="radio" name="dependentePedagogia.pastaEspecialVIJ" value="sim" checked <c:if test="${dependentePedagogia.pastaEspecialVIJ == 'sim'}">checked="checked"</c:if>>
                N�o <input type="radio" name="dependentePedagogia.pastaEspecialVIJ" value="nao" <c:if test="${dependentePedagogia.pastaEspecialVIJ == 'nao'}">checked="checked"</c:if>>
                Solicitar <input type="radio" name="dependentePedagogia.pastaEspecialVIJ" value="solicitar" <c:if test="${dependentePedagogia.pastaEspecialVIJ == 'solicitar'}">checked="checked"</c:if>/><br/>
                
                Caso nao seja v�tima de agress�es, j� presenciou as agressoes contra m�e ou outros familiares?<br/> 
                Sim <input type="radio" name="dependentePedagogia.presenciouVilenciaContraParentescos" value="sim" checked <c:if test="${dependentePedagogia.presenciouVilenciaContraParentescos == 'sim'}">checked="checked"</c:if>>
                N�o <input type="radio" name="dependentePedagogia.presenciouVilenciaContraParentescos" value="nao" <c:if test="${dependentePedagogia.presenciouVilenciaContraParentescos == 'nao'}">checked="checked"</c:if>/><br/>
                
                Necessita de acompanhamento pedag�gico ap�s o desligamento?
                Sim <input type="radio" name="dependentePedagogia.necessitaAcompanhamento" value="sim" checked <c:if test="${dependentePedagogia.necessitaAcompanhamento == 'sim'}">checked="checked"</c:if>>
                N�o <input type="radio" name="dependentePedagogia.necessitaAcompanhamento" value="nao" <c:if test="${dependentePedagogia.necessitaAcompanhamento == 'nao'}">checked="checked"</c:if>/><br/>
                Observa��es:<br/><textarea name="dependentePedagogia.observacaoPosDesligamento" cols="50" rows="10"> ${dependentePedagogia.observacaoPosDesligamento}</textarea><br/>
               
                
              
                <input type="submit" value="Salvar" />
            </form>
    </body>
</html>
