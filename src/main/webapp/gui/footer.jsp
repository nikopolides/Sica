<%-- 
    Document   : footer
    Created on : 18/09/2012, 00:51:26
    Author     : TonGarcia
--%>

		<!-- fim da parte do conteúdo dentro -->
		</div>
		<!-- Fim do menu de abas -->
	</div>
	<!-- Fim do container -->
        <!-- Div de auxilio a esconder a tela -->
        <div id="pagina_tela">
            &nbsp;
	</div>	
	<!-- Script de mascaras -->
	<script>
		//Funções jQuery
		jQuery(function($){
			$("#abrigada_cpf").mask("999.999.999-99");
			$("#abrigada_cep").mask("99.999-999");
                        $("#agressor_telefone").mask("(99)9999-9999");
                        $("#agressor_nascimento").mask("99/99/9999");
		});
	</script>
</body>
</html>