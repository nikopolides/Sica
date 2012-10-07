/** Função ao ser tentado cadastrar uma abrigada **/
//Dizendo que o evento de alguma tecla sendo pressionada deve receber a função tal
window.onkeydown = capturaTecla;
function capturaTecla( event ){
	var tecla = event.keyCode;
	var ESC = 27;
	if(tecla == ESC){
		esconde();
                
	}//fim do valida se esc foi pressionado
}//fim do método que caotura a tecla


function escurecerTela(){
	var pagina_tela = document.getElementById('pagina_tela');
	pagina_tela.style.height = (screen.height)*2+'px';
	pagina_tela.style.display = 'block';
        document.body.style.overflowY = 'hidden';
}

function iluminarTela(){
	var pagina_tela = document.getElementById('pagina_tela');
	pagina_tela.style.display = 'none';
        document.body.style.overflowY = 'scroll';
}

//overflow-y:hidden --> Usado para esconder a barra de rolagem com o JS.
function showAlert(idAlert){
        escurecerTela();
        document.getElementById(idAlert).style.display="block";
        document.getElementById(idAlert).style.visibility="visible";
}

function esconde(){
	iluminarTela()
	document.getElementById("alert-success").style.display="none";
	document.getElementById("alert-error").style.display="none";
	document.getElementById("alert-warning").style.display="none";
}