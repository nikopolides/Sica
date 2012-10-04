<%-- 
    Document   : content_listaAbrigadas
    Created on : 18/09/2012, 00:49:55
    Author     : TonGarcia
--%>

					<div class="tab-pane" id="tabs1-pane3">
						<h4>Pedagogia</h4>
						<!-- Div que contem as abas verticais, div que faz o efeito acordeon -->
                                                <div class="accordion" id="accordion3">
                                                    <!-- Grupo de item de menus -->
                                                    <div class="accordion-group">
                                                        <!-- Parte do titulo do item do menu  -->
                                                        <div class="accordion-heading item-menu">
                                                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse_livroOne">
                                                                LIVRO
                                                            </a>
                                                        </div>
                                                        <!-- Content do que deve aparecer com a a nimação -->
                                                        <div id="collapse_livroOne" class="accordion-body collapse">
                                                            <div class="accordion-inner well">
                                                                <%@include file="nucleo/livro/form.jsp" %>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- Grupo de item de menus -->
                                                    <div class="accordion-group">
                                                        <!-- Parte do titulo do item do menu  -->
                                                        <div class="accordion-heading item-menu">
                                                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse_dependenteTwo">
                                                                DEPENDENTE
                                                            </a>
                                                        </div>
                                                        <!-- Content do que deve aparecer com a a nimação -->
                                                        <div id="collapse_dependenteTwo" class="accordion-body collapse">
                                                            <div class="accordion-inner well">
                                                                <%@include file="nucleo/dependente/form.jsp" %>
                                                            </div>
                                                        </div>
                                                    </div>
                                                     <!-- Grupo de item de menus -->
                                                    <div class="accordion-group">
                                                        <!-- Parte do titulo do item do menu  -->
                                                        <div class="accordion-heading item-menu">
                                                            <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse_dependente_pedagogiaThree">
                                                                DEPENDENTE PEDAGOGIA
                                                            </a>
                                                        </div>
                                                        <!-- Content do que deve aparecer com a a nimação -->
                                                        <div id="collapse_dependente_pedagogiaThree" class="accordion-body collapse">
                                                            <div class="accordion-inner well">
                                                                <%@include file="nucleo/dependentePedagogia/form.jsp" %>
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