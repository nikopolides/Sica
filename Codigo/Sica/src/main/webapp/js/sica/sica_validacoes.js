/** @return 0 = sucess;
 ** @return 1 = warning;
 ** @return 2 = error; **/
function validaArray(formArray){
	//O retorno default é 0, pois se nada, de errado, aconteceu, este valor que será retornado
	var retorno = 0;
        var alerta = null; //guarda o objeto alerta, que é a div que aparece dizendo o que ocorreu com o sistema.
	var atributosEmBranco = "";
        var array = formArray;

//Percorre os atributos da array
	for(var count = 0; count < array.length; count++){
	   atributoID = array[count];
	   atributo = document.getElementById(atributoID);
	   
           if(atributo == null)
               alert('O item: ' + count + ' retornou um erro.\n' + array[count]);
           
	   //Valida se algum dos atributos está nulo
	   if(atributo.value == '' || atributo.value == null){
		   atributosEmBranco += "<br>" + count + "- " + atributoID + ";";
		   retorno = 2; //aqui retorna 2 que é o fatal erro
	   }//fim da validação se há atributos em branco
	}//fim do for
	
        //Passando mensagem aos alertas
	if(retorno == ALERT_ERROR){
            alerta = document.getElementById('error-msg');
            alerta.innerHTML = "<i>Atributos em branco:</i>" + atributosEmBranco;
        }else if(retorno == ALERT_WARNING){
           
        }
            
	return retorno;
}//fim da função que valida array


/** Valida se o campo vindo no parametro está nulo **/
function campoNulo(campoId) {
	//Puxando o elemento
	elemento = document.getElementById(campoId);
	
	//Valida se o campo está nulo
	if(elemento.value == null || elemento.value == "")
		return true;
	else
		return false;
}//fim da função

