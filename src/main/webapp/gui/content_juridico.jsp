<%-- 
    Document   : content_editar
    Created on : 18/09/2012, 00:48:56
    Author     : TonGarcia
--%>

<!-- conteúdo do cadastro, como aqui vai segurar o conteúdo devemos colocá-lo dentro de uma grid_12 -->
<div class="tab-pane" id="tabs1-pane2">
    <h4>Jurídico</h4>
    <div class="accordion" id="accordion2">
        <!-- Grupo de item de menus -->
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
                    PROCESSO ABRIGADA
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapseOne" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/processoAbrigada/form.jsp" %>
                </div>
            </div>
        </div>
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseTwo">
                    PROCESSO DEPENDENTE
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapseTwo" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%--<%@include file="nucleo/processoDependente/form.jsp" %>--%>
                </div>
            </div>
        </div>
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseThree">
                    AGENDA DE CONTATOS
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapseThree" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/contatosJuridico/form.jsp" %>
                </div>
            </div>
        </div>
        <div class="accordion-group">
            <!-- Parte do titulo do item do menu  -->
            <div class="accordion-heading item-menu">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseFour">
                    DESLIGAMENTO JURIDICO
                </a>
            </div>
            <!-- Content do que deve aparecer com a a nimação -->
            <div id="collapseFour" class="accordion-body collapse">
                <div class="accordion-inner well">
                    <%@include file="nucleo/desligamentoJuridico/form.jsp" %>
                </div>
            </div>
        </div>
    </div>
</div>
