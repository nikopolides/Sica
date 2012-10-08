/** @return 0 = sucess;
 ** @return 1 = warning;
 ** @return 2 = error; **/
function validaArray(formArray){
	//O retorno default � 0, pois se nada, de errado, aconteceu, este valor que ser� retornado
	var retorno = 0;
        var alerta = null; //guarda o objeto alerta, que � a div que aparece dizendo o que ocorreu com o sistema.
	var atributosEmBranco = "";
        var array = formArray;

        //Percorre os atributos da array
	for(var count = 0; count < array.length; count++){
	   atributoID = array[count];
	   var atributo = document.getElementById(atributoID);
	   
           if(atributo == null)
               alert('O item: ' + count + ' retornou um erro.\n' + array[count]);
           
	   //Valida se algum dos atributos est� nulo
	   if(atributo.value == '' || atributo.value == null){
		   atributosEmBranco += "<br>" + count + "- " + atributoID + ";";
		   retorno = 2; //aqui retorna 2 que � o fatal erro
	   }//fim da valida��o se h� atributos em branco
           
           //alert('Passou no for ' + count + '\n\n\n' + atributosEmBranco + '\n' + retorno);
	}//fim do for
        
        //Passando mensagem aos alertas
	if(retorno == ALERT_ERROR){
            alerta = document.getElementById('error-msg');
            alerta.innerHTML = "<i>Atributos em branco:</i>" + atributosEmBranco;
        }else if(retorno == ALERT_WARNING){
           
        }
                
        return retorno;
}//fim da fun��o que valida array


