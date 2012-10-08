<%-- 
    Document   : content_servico_social
    Created on : 03/10/2012, 21:57:32
    Author     : TonGarcia
--%>

<div class="tab-pane" id="tabs1-pane4">
    <h4>Psicologia</h4>
    
    <!-- Div que contem as abas verticais, div que faz o efeito acordeon -->
    <div class="accordion" id="accordion2">
        <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse_psicologiaOne">
                    AGRESSOR
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapse_psicologiaOne" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/agressor/form.jsp" %>
                </div>
            </div>
        </div>
        <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse_psicologiaTwo">
                    ACOMPANHAMENTO DA ABRIGADA
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapse_psicologiaTwo" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/acompanhamentoAbrigada/form.jsp" %>
                </div>
            </div>
        </div>
         <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse_psicologiaThree">
                    ABRIGADA PSICOLOGIA
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapse_psicologiaThree" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/abrigadaPsicologia/form.jsp" %>
                </div>
            </div>
        </div>
        <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse_psicologiaFour">
                    QUANTIDADE DE ABRIGAMENTPOS
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapse_psicologiaFour" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/quantidadeAbrigamentos/form.jsp" %>
                </div>
            </div>
        </div>
        <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse_psicologiaFive">
                    NAFAVD 
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapse_psicologiaFive" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/nafavd/form.jsp" %>
                </div>
            </div>
        </div>
        <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse_psicologiaSix">
                    RELATÓRIO DE ENCAMINHAMENTO AO NAFAVD
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapse_psicologiaSix" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/relatorioEncaminhamentoNafavd/form.jsp" %>
                </div>
            </div>
        </div>
        <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse_psicologiaSeven">
                    DIÁRIO DE ACOMPANHAMENTO
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapse_psicologiaSeven" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/diarioAcompanhamento/form.jsp" %>
                </div>
            </div>
        </div>
        <!-- Grupo de item de menus -->
    </div>
</div>
