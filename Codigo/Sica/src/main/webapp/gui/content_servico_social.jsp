<%-- 
    Document   : content_servico_social
    Created on : 03/10/2012, 21:57:32
    Author     : TonGarcia
--%>

<div class="tab-pane" id="tabs1-pane5">
    <h4>Serviço Social</h4>
    
    <!-- Div que contem as abas verticais, div que faz o efeito acordeon -->
    <div class="accordion" id="accordion2">
        <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse_abrigadaOne">
                    ABRIGADA
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapse_abrigadaOne" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/abrigada/form.jsp" %>
                </div>
            </div>
        </div>
        <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse_registro_procedimentoTwo">
                    REGISTRO PROCEDIMENTO SERVIÇO SOCIAL
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapse_registro_procedimentoTwo" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/regristroProcedimento/form.jsp" %>
                </div>
            </div>
        </div>
         <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse_abrigada_servico_socialThree">
                    ABRIGADA SERVIÇO SOCIAL
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapse_abrigada_servico_socialThree" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/abrigadaServicoSocial/form.jsp" %>
                </div>
            </div>
        </div>
        <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#dependente_servico_social">
                    DEPENDENTE SERVIÇO SOCIAL
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="dependente_servico_social" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/dependenteServicoSocial/form.jsp" %>
                </div>
            </div>
        </div>
        <!-- Grupo de item de menus -->
    </div>
</div>
