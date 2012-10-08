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
        <link type="text/css" rel="stylesheet" href="../css/geral.css"/>
    </head>
    <body>
        <h1>Lista de abrigadas psicologia:</h1>
        <a href="<c:url value='/abrigadaPsicologia/form'/>">Cadastrar</a><br />
        <table id="tblist" border="1">
            <thead>
            <th> Ações </th>
            <th>Em caso de nao abrigamento</th>
            <th>Nome do parente</th>
            <th>Endereco do parente</th>
            <th>Telefone do parente</th>
            <th>Sexo masculino acima de 13 anos</th>
            <th>Não corre risco</th>
            <th>Outros</th>
            <th>Demais membros da Familia</th>
            <th>Laqueadura Tubaria</th>
            <th>Gestante</th>
            <th>Em caso de sim. Onde?</th>
            <th>Em caso de nao. Por quê?</th>
            <th>Contracepcao Oral/Injetavel</th>
            <th>Usa DIU</th>
            <th>Não faz uso de contracepcao</th>
            <th>Visual</th>
            <th>Auditiva /de Fala</th>
            <th>Fisica</th>
            <th>Mental</th>
            <th>Historico de acompanhamento psiquiatrico?</th>
            <th>Outra</th>
            <th>Uso de drogas Licitas e Ilicitas</th>
            <th>Em caso de sim. Quais?</th>
            <th>Com que frequencia?</th>
            <th>Possui alguma doença?</th>
            <th>Cronica</th>
            <th>Outras. Quais?</th>
            <th>Possui alergias?</th>
            <th>Medicamentos</th>
            <th>Outros</th>
            <th>Faz uso de medicações controladas?</th>
            <th>Em caso de sim. Quais medicações?</th>
            <th>Usuario de substancias psicoativas</th>
            <th>Em caso de sim. Quais substancias psicoativas?</th>
            <th>É agressivo com os filhos?</th>
            <th>É agressivo com os familiares?</th>
            <th>É agressivo com outras pessoas?</th>
            <th>Está sendo acompanhado em Núcleo, CRAM/ outro?</th>
            <th>Tem conhecimento historico psiquiatrico ou uso de medicamentos controlado?</th>
            <th>Em caso de sim. Especificar</th>
            <th>Encaminhamentos/ Observações</th>            
        </thead>
        <tbody>
            <c:forEach items="${abrigadaPsicologiaList}" var="abrigadaPsicologia">
                <tr>
                    <td>
                        <a href="<c:url value='/abrigadaPsicologia/deleta/${abrigadaPsicologia.idAbrigada}/${abrigadaPsicologia.id}'/>">DELETA</a>
                        <br>
                        <a href="<c:url value='/abrigadaPsicologia/edita/${abrigadaPsicologia.id}'/>">EDITA</a>
                        <br>
                    </td>
                    <td>${abrigadaPsicologia.emCasoDeNaoAbrigamento}</td>
                    <td>${abrigadaPsicologia.parenteNome}</td>
                    <td>${abrigadaPsicologia.parenteEndereco}</td>
                    <td>${abrigadaPsicologia.parenteTelefone}</td>
                    <td>${abrigadaPsicologia.sexoMasculinoAcima}</td>
                    <td>${abrigadaPsicologia.naoCorreRisco}</td>
                    <td>${abrigadaPsicologia.outrosAbrigamento}</td>
                    <td>${abrigadaPsicologia.demaisMembrosDaFamilia}</td>
                    <td>${abrigadaPsicologia.laqueaduraTubaria}</td>
                    <td>${abrigadaPsicologia.gestante}</td>
                    <td>${abrigadaPsicologia.simOnde}</td>
                    <td>${abrigadaPsicologia.naoPorque}</td>
                    <td>${abrigadaPsicologia.contracepcaoOralInjetavel}</td>
                    <td>${abrigadaPsicologia.diu}</td>
                    <td>${abrigadaPsicologia.naoFazUsoDeContracepcao}</td>
                    <td>${abrigadaPsicologia.visual}</td>
                    <td>${abrigadaPsicologia.auditivaFala}</td>
                    <td>${abrigadaPsicologia.fisica}</td>
                    <td>${abrigadaPsicologia.mental}</td>
                    <td>${abrigadaPsicologia.historicoAcompanhamentoMental}</td>
                    <td>${abrigadaPsicologia.outra}</td>
                    <td>${abrigadaPsicologia.drogasLicitasIlicitas}</td>
                    <td>${abrigadaPsicologia.simQuais}</td>
                    <td>${abrigadaPsicologia.comQueFrequencia}</td>
                    <td>${abrigadaPsicologia.possuiAlgumaDoenca}</td>
                    <td>${abrigadaPsicologia.cronica}</td>
                    <td>${abrigadaPsicologia.outrasQuais}</td>
                    <td>${abrigadaPsicologia.possuiAlergias}</td>
                    <td>${abrigadaPsicologia.medicamentos}</td>
                    <td>${abrigadaPsicologia.outrosAlergia}</td>
                    <td>${abrigadaPsicologia.medicacoesControladas}</td>
                    <td>${abrigadaPsicologia.simQuaisMedicacoes}</td>
                    <td>${abrigadaPsicologia.substanciasPsicoativas}</td>
                    <td>${abrigadaPsicologia.simQuaisPsicoativas}</td>
                    <td>${abrigadaPsicologia.agressivoFilhos}</td>
                    <td>${abrigadaPsicologia.agressivoFamiliares}</td>
                    <td>${abrigadaPsicologia.agressivoOutros}</td>
                    <td>${abrigadaPsicologia.estaSendoAcompanhadoEmNucleoCramOutro}</td>
                    <td>${abrigadaPsicologia.temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado}</td>
                    <td>${abrigadaPsicologia.simEspecificar}</td>
                    <td>${abrigadaPsicologia.encaminhamentosObservacoes}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
