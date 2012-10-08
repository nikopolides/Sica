/** @return 0 = sucess;
 ** @return 1 = warning;
 ** @return 2 = error; **/
function validaAbrigada(){
	//O retorno default � 0, pois se nada, de errado, aconteceu, este valor que ser� retornado
	var retorno = 0;
        var alerta = null; //guarda o objeto alerta, que � a div que aparece dizendo o que ocorreu com o sistema.
	var atributosEmBranco = "";

//Percorre os atributos da array
	for(var count = 0; count < camposFormAbrigada.length; count++){
	   atributoID = camposFormAbrigada[count];
	   atributo = document.getElementById(atributoID);
	   
           if(atributo == null)
               alert('O item: ' + count + ' retornou um erro.\n' + camposFormAbrigada[count]);
           
	   //Valida se algum dos atributos est� nulo
	   if(atributo.value == '' || atributo.value == null){
		   atributosEmBranco += "<br>" + count + "- " + atributoID + ";";
		   retorno = 2; //aqui retorna 2 que � o fatal erro
	   }//fim da valida��o se h� atributos em branco
	}//fim do for
	
        //Passando mensagem aos alertas
	if(retorno == ALERT_ERROR){
            alerta = document.getElementById('error-msg');
            alerta.innerHTML = "<i>Atributos em branco:</i>" + atributosEmBranco;
        }else if(retorno == ALERT_WARNING){
           
        }
            
	return retorno;
}//fim da fun��o que valida a abrigada

function validaLivro(){
    //O retorno default � 0, pois se nada, de errado, aconteceu, este valor que ser� retornado
	var retorno = 0;
        var alerta = null; //guarda o objeto alerta, que � a div que aparece dizendo o que ocorreu com o sistema.
	var atributosEmBranco = "";

//Percorre os atributos da array
	for(var count = 0; count < camposFormLivro.length; count++){
	   atributoID = camposFormLivro[count];
	   atributo = document.getElementById(atributoID);
	   
           if(atributo == null)
               alert('O item: ' + count + ' retornou um erro.\n' + camposFormLivro[count]);
           
	   //Valida se algum dos atributos est� nulo
	   if(atributo.value == '' || atributo.value == null){
		   atributosEmBranco += "<br>" + count + "- " + atributoID + ";";
		   retorno = 2; //aqui retorna 2 que � o fatal erro
	   }//fim da valida��o se h� atributos em branco
	}//fim do for
	
        //Passando mensagem aos alertas
	if(retorno == ALERT_ERROR){
            alerta = document.getElementById('error-msg');
            alerta.innerHTML = "<i>Atributos em branco:</i>" + atributosEmBranco;
        }else if(retorno == ALERT_WARNING){
           
        }
            
	return retorno;
}


/** Valida se o campo vindo no parametro est� nulo **/
function campoNulo(campoId) {
	//Puxando o elemento
	elemento = document.getElementById(campoId);
	
	//Valida se o campo est� nulo
	if(elemento.value == null || elemento.value == "")
		return true;
	else
		return false;
}//fim da fun��o

