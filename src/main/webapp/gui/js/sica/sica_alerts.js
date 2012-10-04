/* Função responsável por esconder o alerta sobre a ação (CRUD) */
function esconde_alert(num_alert){
	//Escondendo o alerta
	document.getElementById("alerta"+num_alert).style.display="none";
}//fim do escondeAlert


/* Função responsável por fazer aparecer o alerta sobre a ação (CRUD) */
function chama_alert(num_alert){
	//Escondendo o alerta
	document.getElementById("alerta"+num_alert).style.display="block";
}//fim do escondeAlert