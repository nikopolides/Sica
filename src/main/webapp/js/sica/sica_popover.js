	var count = 0;
	$(function() {
		$("#enviar").click(function() {  
			//TODO validate and process form here
			count++;
			$('#entrada1ID').attr("data-original-title", "Alguma coisa a esquerda");
			$('#entrada1ID').popover('show');
			elemento = document.getElementById('entrada1ID');
			if(elemento.value == "") {
				$('#entrada1ID').attr("data-original-title", "Alguma coisa a esquerda");
			}else {
				$('#entrada1ID').tooltip('destroy');
				alert("Tem algo!");
			}
		});
	});
	
	function someBalao(id){
		$(id).popover('hide');
		$(id).popover('destroy');
		campo = document.getElementById(id).removeAttribute("rel", 0);
		campo = document.getElementById(id).removeAttribute("data-original-title", 0);
		campo = document.getElementById(id).removeAttribute("data-content", 0);
	}