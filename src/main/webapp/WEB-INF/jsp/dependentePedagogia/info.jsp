<%-- 
    Document   : lista
    Created on : Jun 12, 2012, 3:33:05 PM
    Author     : Leonn Ferreira
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
            
            <h2>Informa��es do Dependente</h2>
            
            <br/><br/>
                        
            <table cellspacing='0' cellpaddind="02">
                <tr>
                    <td>A��es</td>
                    <td>
                        <a href="<c:url value='/dependentePedagogia/pesquisa/${dependentePedagogia.idDependente}'/>" class="btn btn-mini btn-primary">Pesquisar</a>
                        <a href="<c:url value='/dependentePedagogia/edita/${dependentePedagogia.idDependente}'/>" class="btn btn-mini">Editar</a>
                    </td>
                <tr>
                    <td>ID</td><td>${dependentePedagogia.idDependente}</td>
                </tr>
                <tr>
                    <td>Prontuario</td><td>${dependentePedagogia.prontuario}</td>
                </tr>
                <tr>
                    <td>Data Admiss�o</td><td>${dependentePedagogia.dataAdmissao}</td>
                </tr>
                <tr>
                    <td>Desligamento</td><td>${dependentePedagogia.desligamento}</td>
                </tr>     
                <tr>
                    <td>Necessita de acompanhamento psicologico</td><td>${dependentePedagogia.necessitaAcompanhamentoPsicologico}</td>
                </tr>  
                <tr>
                    <td>Nome</td><td>${dependentePedagogia.nome}</td>
                </tr>  
                <tr>
                    <td>Idade</td><td>${dependentePedagogia.idade}</td>
                </tr>  
                <tr>
                    <td>Sexo</td><td>${dependentePedagogia.sexo}</td>
                </tr>  
                <tr>
                    <td>Data de nascimento</td><td>${dependentePedagogia.dataNascimento}</td>
                </tr>  
                <tr>
                    <td>S�rie</td><td>${dependentePedagogia.serie}</td>
                </tr>  
                <tr>
                    <td>Matriculado</td><td>${dependentePedagogia.matriculado}</td>
                </tr>  
                <tr>
                    <td>Escola matriculado</td><td>${dependentePedagogia.escolaMatriculado}</td>
                </tr>  
                <tr>
                    <td>Por que n�o matriculado?</td><td>${dependentePedagogia.porqueNaoMatriculado}</td>
                </tr>  
                <tr>
                    <td>Apresenta defasagem escolar?</td><td>${dependentePedagogia.apresentaDefasagemEscolar}</td>
                </tr>  
                <tr>
                    <td>Apresenta dificuldade de aprendizagem?</td><td>${dependentePedagogia.apresentaDeficuldadeAprendizagem}</td>
                </tr>  
                <tr>
                    <td>Portador de necesidades especiais?</td><td>${dependentePedagogia.portadorNecessidadeEspeciais}</td>
                </tr> 
                <tr>
                    <td> Portador de necessidades especiais</td><td>${dependentePedagogia.portadorNecessidadeEspeciaisSim}</td>
                </tr>
                <tr>
                    <td> Hist�rico de acompanhamento psiqui�trico?</td><td>${dependentePedagogia.historicoAcompanhamentoPsiquiatrico}</td>
                </tr>  
                <tr>
                    <td>Usa drogas l�ciitas/Il�citas?</td><td>${dependentePedagogia.usaDrogas}</td>
                </tr>  
                <tr>
                    <td> Quais?</td><td>${dependentePedagogia.qualDroga}</td>
                </tr>  
                <tr>
                    <td>Com que frequ�ncia?</td><td>${dependentePedagogia.frequenciaUsoDrogas}</td>
                </tr>  
                <tr>
                    <td>Possui alguma doen�a?</td><td>${dependentePedagogia.possuiDoenca}</td>
                </tr>  
                <tr>
                    <td>tipo de doen�a</td><td>${dependentePedagogia.tipoDoenca}</td>
                </tr>  
                <tr>
                    <td>Possui alergias?</td><td>${dependentePedagogia.possuiAlergia}</td>
                </tr>  
                <tr>
                    <td>Medicamentos</td><td>${dependentePedagogia.medicamentoAlergico}</td>
                </tr>  
                <tr>
                    <td> Faz uso de medica��o controlada?</td><td>${dependentePedagogia.medicacaoControlada}</td>
                </tr>  
                <tr>
                    <td>Medicamentos</td><td>${dependentePedagogia.medicamentoControlado}</td>
                </tr>  
                <tr>
                    <td> N� do Boletim de ocorr�ncia</td><td>${dependentePedagogia.nBoletimOcorrencia}</td>
                </tr>  
                <tr>
                    <td> Org�o de encaminhamento</td><td>${dependentePedagogia.orgaoDeEncaminhamento}</td>
                </tr>  
                <tr>
                    <td>F�sica</td><td>${dependentePedagogia.violenciaFisica}</td>
                </tr>  
                <tr>
                    <td>de que forma?</td><td>${dependentePedagogia.qualFormaFisica}</td>
                </tr>  
                <tr>
                    <td>Possui les�o aparente?</td><td>${dependentePedagogia.lesaoAparente}</td>
                </tr>  
                <tr>
                    <td>Encaminhada ao IML? </td><td>${dependentePedagogia.encaminhadaIMLFisica}</td>
                </tr>  
                <tr>
                    <td>Sexual </td><td>${dependentePedagogia.violenciaSexual}</td>
                </tr>
                <tr>
                    <td>de que forma? </td><td>${dependentePedagogia.qualFormaSexual}</td>
                </tr>
                <tr>
                    <td> Encaminhada ao IML?</td><td>${dependentePedagogia.encaminhadaIMLSexual}</td>
                </tr>
                <tr>
                    <td> Patrimonial: </td><td>${dependentePedagogia.violenciaPatrimonial}</td>
                </tr>
                <tr>
                    <td>de que forma? </td><td>${dependentePedagogia.qualFormaPatrimonial}</td>
                </tr>
                <tr>
                    <td> Moral: </td><td>${dependentePedagogia.violenciaMoral}</td>
                </tr>
                <tr>
                    <td>de que forma? </td><td>${dependentePedagogia.qualFormaMoral}</td>
                </tr>
                <tr>
                    <td> Psicol�gica:</td><td>${dependentePedagogia.violenciaPsicologica}</td>
                </tr>
                <tr>
                    <td>de que forma? </td><td>${dependentePedagogia.qualFormaPsicologica}</td>
                </tr>

                <tr>
                    <td>Agressor</td><td>${dependentePedagogia.nomeAgressor}</td>
                </tr>  
                <tr>
                    <td> Rela��o/grau de parentesco com a crian�a/adolescente</td><td>${dependentePedagogia.relacaoDependente}</td>
                </tr>  
                <tr>
                    <td>Foi a primeira agress�o?</td><td>${dependentePedagogia.primeiraAgressao}</td>
                </tr>  
                <tr>
                    <td>Foi a primeira denuncia?</td><td>${dependentePedagogia.primeiraDenuncia}</td>
                </tr>  
                <tr>
                    <td>Por que n�o denunciou antes?</td><td>${dependentePedagogia.pqNaoDenunciouAntes}</td>
                </tr>  
                <tr>
                    <td>Quantas vezes?</td><td>${dependentePedagogia.quantasVezes}</td>
                </tr>  
                <tr>
                    <td>H� quanto tempo acontecem as agress�es?</td><td>${dependentePedagogia.tempoOcorreAgressoes}</td>
                </tr>  
                <tr>
                    <td>Pasta especial na VIJ?</td><td>${dependentePedagogia.pastaEspecialVIJ}</td>
                </tr>  
                <tr>
                    <td>Caso nao seja v�tima de agress�es, j� presenciou as agressoes contra m�e ou outros familiares?</td><td>${dependentePedagogia.presenciouVilenciaContraParentescos}</td>
                </tr>  
                <tr>
                    <td>Necessita de acompanhamento pedag�gico ap�s o desligamento?</td><td>${dependentePedagogia.necessitaAcompanhamento}</td>
                </tr>  

            </table>
            
                <div class="actions">
                    <a href="<c:url value='/dependentePedagogia/form'/>" class="btn btn-primary">Cadastrar</a>
                    <a href="<c:url value='/dependentePedagogia/lista'/>">Voltar para lista</a>                   
                </div>
        </div>
    </body>
</html>
