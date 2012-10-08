<%-- 
    Document   : lista
    Created on : Jun 12, 2012, 3:33:05 PM
    Author     : Paulo and Victor Carvalho
--%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link type="text/css" rel="stylesheet" href="../css/geral.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Informações da abrigada:</h1>
        <a href="<c:url value='/abrigadaPsicologia/form'/>">Cadastrar</a><br />
        <table>
            <tr>
                <td>Ações</td><td>
                    <a href="<c:url value='/abrigadaPsicologia/deleta/${abrigadaPsicologia.id}'/>">DELETA</a>
                    | <a href="<c:url value='/abrigadaPsicologia/edita/${abrigadaPsicologia.id}'/>">EDITA</a>
                </td>
            <tr>
                <td>ID Abrigada Psicologia</td><td>${abrigadaPsicologia.id}</td>
            </tr>
            <tr>
                <td>Em caso de nao abrigamento</td><td>${abrigadaPsicologia.emCasoDeNaoAbrigamento}</td>
            </tr>
                        <tr>
                <td>Nome do parente</td><td>${abrigadaPsicologia.parenteNome}</td>
            </tr>
                        <tr>
                <td>Endereco do parente</td><td>${abrigadaPsicologia.parenteEndereco}</td>
            </tr>
                        <tr>
                <td>Telefone do parente</td><td>${abrigadaPsicologia.parenteTelefone}</td>
            </tr>
                        <tr>
                <td>Sexo masculino acima de 13 anos</td><td>${abrigadaPsicologia.sexoMasculinoAcima}</td>
            </tr>
                        <tr>
                <td>Não corre risco</td><td>${abrigadaPsicologia.naoCorreRisco}</td>
            </tr>
                        <tr>
                <td>Outros</td><td>${abrigadaPsicologia.outrosAbrigamento}</td>
            </tr>
                        <tr>
                <td>Demais membros da Familia</td><td>${abrigadaPsicologia.demaisMembrosDaFamilia}</td>
            </tr>
                        <tr>
                <td>Laqueadura Tubaria</td><td>${abrigadaPsicologia.laqueaduraTubaria}</td>
            </tr>
                        <tr>
                <td>Gestante</td><td>${abrigadaPsicologia.gestante}</td>
            </tr>
                        <tr>
                <td>Em caso de sim. Onde?</td><td>${abrigadaPsicologia.simOnde}</td>
            </tr>
                        <tr>
                <td>Em caso de não. Por quê?</td><td>${abrigadaPsicologia.naoPorque}</td>
            </tr>
                        <tr>
                <td>Contracepcao Oral/Injetavel</td><td>${abrigadaPsicologia.contracepcaoOralInjetavel}</td>
            </tr>
                        <tr>
                <td>Usa DIU</td><td>${abrigadaPsicologia.diu}</td>
            </tr>
                        <tr>
                <td>Não faz uso de contracepcao</td><td>${abrigadaPsicologia.naoFazUsoDeContracepcao}</td>
            </tr>
                        <tr>
                <td>Visual</td><td>${abrigadaPsicologia.visual}</td>
            </tr>
                        <tr>
                <td>Auditiva /de Fala:</td><td>${abrigadaPsicologia.auditivaFala}</td>
            </tr>
                        <tr>
                <td>Fisica</td><td>${abrigadaPsicologia.fisica}</td>
            </tr>
                        <tr>
                <td>Mental</td><td>${abrigadaPsicologia.mental}</td>
            </tr>
                        <tr>
                <td>Historico de acompanhamento psiquiatrico?</td><td>${abrigadaPsicologia.historicoAcompanhamentoMental}</td>
            </tr>
                        <tr>
                <td>Outra</td><td>${abrigadaPsicologia.outra}</td>
            </tr>
                        <tr>
                <td>Uso de drogas Licitas e ou Ilicitas</td><td>${abrigadaPsicologia.drogasLicitasIlicitas}</td>
            </tr>
                        <tr>
                <td>Em caso de sim. Quais?</td><td>${abrigadaPsicologia.simQuais}</td>
            </tr>
                        <tr>
                <td>Com que frequencia?</td><td>${abrigadaPsicologia.comQueFrequencia}</td>
            </tr>
                        <tr>
                <td>Possui alguma doença?</td><td>${abrigadaPsicologia.possuiAlgumaDoenca}</td>
            </tr>
            <tr>
                <td>Crônica</td><td>${abrigadaPsicologia.cronica}</td>
            </tr>
            <tr>
                <td>Outras. Quais?</td><td>${abrigadaPsicologia.outrasQuais}</td>
            </tr>
                        <tr>
                <td>Possui alergias?</td><td>${abrigadaPsicologia.possuiAlergias}</td>
            </tr>
                        <tr>
                <td>Medicamentos</td><td>${abrigadaPsicologia.medicamentos}</td>
            </tr>
                        <tr>
                <td>Outros</td><td>${abrigadaPsicologia.outrosAlergia}</td>
            </tr>
                        <tr>
                <td>Faz uso de medicações controladas?</td><td>${abrigadaPsicologia.medicacoesControladas}</td>
            </tr>
                        <tr>
                <td>Em caso de sim. Quais medicações?</td><td>${abrigadaPsicologia.simQuaisMedicacoes}</td>
            </tr>
                        <tr>
                <td>Usuario de substancias psicoativas</td><td>${abrigadaPsicologia.substanciasPsicoativas}</td>
            </tr>
                                    <tr>
                <td>Em caso de sim. Quais substancias psicoativas?</td><td>${abrigadaPsicologia.simQuaisPsicoativas}</td>
            </tr>
                        <tr>
                <td>E agressivo com os filhos?</td><td>${abrigadaPsicologia.agressivoFilhos}</td>
            </tr>
                        <tr>
                <td>É agressivo com os familiares?</td><td>${abrigadaPsicologia.agressivoFamiliares}</td>
            </tr>
                        <tr>
                <td>É agressivo com outras pessoas?</td><td>${abrigadaPsicologia.agressivoOutros}</td>
            </tr>
                        <tr>
                <td>Está sendo acompanhado em Núclero, CRAM/ outro?</td><td>${abrigadaPsicologia.estaSendoAcompanhadaEmNucleoCramOutro}</td>
            </tr>
                        <tr>
                <td>Tem conhecimento historico psiquiatrico ou uso de medicamentos controlado?</td><td>${abrigadaPsicologia.temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado}</td>
            </tr>
            <tr>
                <td>Em caso de sim. Especificar</td><td>${abrigadaPsicologia.simEspecificar}</td>
            </tr>
                        <tr>
                <td>Encaminhamentos/ Observações</td><td>${abrigadaPsicologia.encaminhamentosObservacoes}</td>
            </tr>
                        <tr>
                <td>ID Abrigada </td><td>${abrigadaPsicologia.idAbrigada}</td>
            </tr>

        </table>
    </body>
</html>
