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
        <title>Lista Dependentes</title>
         <link type="text/css" rel="stylesheet" href="<c:url value="/css/geral.css"/>"/>
    </head>
    <body>
        <h1>Informações da abrigada:</h1>
        <a href="<c:url value='/dependentePedagogia/form'/>">Cadastrar</a><br />
        <table>
            <tr>
                <td>Ações</td><td>
                    <a href="<c:url value='/dependentePedagogia/deleta/${dependentePedagogia.idDependente}'/>">DELETA</a>
                    | <a href="<c:url value='/dependentePedagogia/edita/${dependentePedagogia.idDependente}'/>">EDITA</a>
                       | <a href="<c:url value='/dependentePedagogia/pesquisa/${dependentePedagogia.idDependente}'/>">PESQUISA</a>
                        
                </td>
            <tr>
                <td>ID</td><td>${dependentePedagogia.idDependente}</td>
            </tr>
            <tr>
                <td>Prontuario</td><td>${dependentePedagogia.prontuario}</td>
            </tr>
            <tr>
                <td>Data Admissão</td><td>${dependentePedagogia.dataAdmissao}</td>
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
                <td>Série</td><td>${dependentePedagogia.serie}</td>
            </tr>  
            <tr>
                <td>Matriculado</td><td>${dependentePedagogia.matriculado}</td>
            </tr>  
            <tr>
                <td>Escola matriculado</td><td>${dependentePedagogia.escolaMatriculado}</td>
            </tr>  
            <tr>
                <td>Por que não matriculado?</td><td>${dependentePedagogia.porqueNaoMatriculado}</td>
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
                <td> Histórico de acompanhamento psiquiátrico?</td><td>${dependentePedagogia.historicoAcompanhamentoPsiquiatrico}</td>
            </tr>  
            <tr>
                <td>Usa drogas líciitas/Ilícitas?</td><td>${dependentePedagogia.usaDrogas}</td>
            </tr>  
            <tr>
                <td> Quais?</td><td>${dependentePedagogia.qualDroga}</td>
            </tr>  
            <tr>
                <td>Com que frequência?</td><td>${dependentePedagogia.frequenciaUsoDrogas}</td>
            </tr>  
            <tr>
                <td>Possui alguma doença?</td><td>${dependentePedagogia.possuiDoenca}</td>
            </tr>  
            <tr>
                <td>tipo de doença</td><td>${dependentePedagogia.tipoDoenca}</td>
            </tr>  
            <tr>
                <td>Possui alergias?</td><td>${dependentePedagogia.possuiAlergia}</td>
            </tr>  
            <tr>
                <td>Medicamentos</td><td>${dependentePedagogia.medicamentoAlergico}</td>
            </tr>  
            <tr>
                <td> Faz uso de medicação controlada?</td><td>${dependentePedagogia.medicacaoControlada}</td>
            </tr>  
            <tr>
                <td>Medicamentos</td><td>${dependentePedagogia.medicamentoControlado}</td>
            </tr>  
            <tr>
                <td> Nº do Boletim de ocorrência</td><td>${dependentePedagogia.nBoletimOcorrencia}</td>
            </tr>  
            <tr>
                <td> Orgão de encaminhamento</td><td>${dependentePedagogia.orgaoDeEncaminhamento}</td>
            </tr>  
            <tr>
                <td>Física</td><td>${dependentePedagogia.violenciaFisica}</td>
            </tr>  
            <tr>
                <td>de que forma?</td><td>${dependentePedagogia.qualFormaFisica}</td>
            </tr>  
            <tr>
                <td>Possui lesão aparente?</td><td>${dependentePedagogia.lesaoAparente}</td>
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
                <td> Patrimonial: </td><td>${dependentePedagogia.encaminhadaIMLFisicaviolenciaPatrimonial}</td>
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
                <td> Psicológica:</td><td>${dependentePedagogia.violenciaPsicologica}</td>
            </tr>
             <tr>
                <td>de que forma? </td><td>${dependentePedagogia.qualFormaPsicologica}</td>
            </tr>
               
            <tr>
                <td>Agressor</td><td>${dependentePedagogia.nomeAgressor}</td>
            </tr>  
            <tr>
                <td> Relação/grau de parentesco com a criança/adolescente</td><td>${dependentePedagogia.relacaoDependente}</td>
            </tr>  
            <tr>
                <td>Foi a primeira agressão?</td><td>${dependentePedagogia.primeiraAgressao}</td>
            </tr>  
            <tr>
                <td>Foi a primeira denuncia?</td><td>${dependentePedagogia.primeiraDenuncia}</td>
            </tr>  
            <tr>
                <td>Por que não denunciou antes?</td><td>${dependentePedagogia.pqNaoDenunciouAntes}</td>
            </tr>  
            <tr>
                <td>Quantas vezes?</td><td>${dependentePedagogia.quantasVezes}</td>
            </tr>  
            <tr>
                <td>Há quanto tempo acontecem as agressões?</td><td>${dependentePedagogia.tempoOcorreAgressoes}</td>
            </tr>  
            <tr>
                <td>Pasta especial na VIJ?</td><td>${dependentePedagogia.pastaEspecialVIJ}</td>
            </tr>  
            <tr>
                <td>Caso nao seja vítima de agressões, já presenciou as agressoes contra mãe ou outros familiares?</td><td>${dependentePedagogia.presenciouVilenciaContraParentescos}</td>
            </tr>  
            <tr>
                <td>Necessita de acompanhamento pedagógico após o desligamento?</td><td>${dependentePedagogia.necessitaAcompanhamento}</td>
            </tr>  
           
        </table>
    </body>
</html>
