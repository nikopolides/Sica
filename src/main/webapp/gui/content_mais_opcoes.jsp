<%-- 
    Document   : content_mais_opcoes
    Created on : 03/10/2012, 21:57:49
    Author     : TonGarcia
--%>

<div class="tab-pane" id="tabs1-pane6">
    <h4>Mais Opções</h4>
    <!-- Div que contem as abas verticais, div que faz o efeito acordeon -->
    <div class="accordion" id="accordion2">
        <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseTwo">
                    DEPENDENTE
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapseTwo" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%-- <%@include file="../WEB-INF/jsp/abrigada/form.jsp" %> --%>
                </div>
            </div>
        </div>
        <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseThree">
                    PERTENCES
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapseThree" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%-- <%@include file="forms/form_cadastro_abrigada.jsp" %> --%>
                    <%-- <%@include file="../WEB-INF/jsp/abrigada/form.jsp" %> --%>
                    <%-- <%@include file="abrigada/form.jsp" %> --%>
                </div>
            </div>
        </div>
        <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseFour">
                    RELATÓRIO PSICOSSOCIAL
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapseFour" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/relatorioPsicoSocial/form.jsp" %>
                </div>
            </div>
        </div>
        <!-- fim do terceiro item do drop -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseFive">
                    PROCESSO ABRIGADA
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapseFive" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/processoAbrigada/form.jsp" %>
                </div>
            </div>
        </div>
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseSix">
                    AGENDA DE CONTATOS
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapseSix" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/contatosJuridico/form.jsp" %>
                </div>
            </div>
        </div>
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseSeven">
                    AGRESSOR
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapseSeven" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/agressor/form.jsp" %>
                </div>
            </div>
        </div>
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseEight">
                    NAFAVD
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapseEight" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/nafavd/form.jsp" %>
                </div>
            </div>
        </div>
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseNine">
                    DIARIO ACOMPANHAMENTO
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapseNine" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/diarioAcompanhamento/form.jsp" %>
                </div>
            </div>
        </div>
    </div>
    <!-- FIM do content -->
</div>

