
/** Vetores globais que armazenam todos os atributos dos objetos (abrigada, dependente, pertences)
 * Indices dos atributos:
 * 1 - abrigada_nome;
 * 2 - abrigada_cpf;
 * 3 - abrigada_rg;
 * 4 - abrigada_data_entrada;
 * 5 - abrigada_nacionalidade;
 * 6 - abrigada_naturalidade;
 * 7 - abrigada_endereco;
 * 8 - abrigada_cep;
 * 9 - abrigada_nascimento;
 * 10 - abrigada_estado_civil;
 * 11 - abrigada_profissao;
 * 12 - abrigada_escolaridade;
 * 13 - abrigada_dependenteSim;
 * 14 - abrigada_dependenteNao.  **/
camposFormAbrigada = new Array("abrigada_nome", "abrigada_cpf", "abrigada_rg", "abrigada_data_entrada", "abrigada_nacionalidade", "abrigada_naturalidade_estado", "abrigada_naturalidade_cidade",
					 "abrigada_telefone", "abrigada_endereco", "abrigada_cep", "abrigada_nascimento", "abrigada_estado_civil", "abrigada_profissao", 
					 "abrigada_escolaridade", "dependenteSim", "dependenteNao");

ALERT_SUCCESS = 0;
ALERT_WARNING = 1;
ALERT_ERROR = 2;

/** @param idForm --> id do formulário a ser validado, em questão. **/
function validaCampos(idForm){
	//SWITCH de qual o tipo de formulário
	switch(idForm){
            case 'cadastro_abrigada':
                return validaArray(camposFormAbrigada);
            break;
            case 'edita_abrigada':
                return validaArray(camposFormAbrigada);
            break;
            default:
                alert('Função (validaCampos) recebeu um parametro que não foi tratado: ' + idForm);
            break;
	}//fim do switch
        
        return null;
}//fim da função validaCampos



/** Função que prepara chama/executa tudo que deve ser feito antes e depois da submição do form da abrigada (tanto cadastro quanto edição) **/
function submitForm(idForm){
	alerta = validaCampos(idForm);
        
		if(alerta == ALERT_SUCCESS){
			showAlert('alert-success');
                        //document.forms[idForm].submit();
		}else if(alerta == ALERT_WARNING){
			showAlert('alert-warning');
		}else if(alerta == ALERT_ERROR){
			showAlert('alert-error');
		}else
			alert("A FUNÇÃO 'submitForm()' detectou que a FUNÇÃO 'validaCampos()' retornou um parametro INESPERADO!"+'\nRetorno: ' + alerta);
		
                
}//Fim da função submitAbrigada