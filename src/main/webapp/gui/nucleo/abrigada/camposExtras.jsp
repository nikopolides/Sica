<%-- 
    Document   : camposExtras
    Created on : 05/10/2012, 21:41:35
    Author     : TonGarcia
--%>


<legend><i>Campos extras</i></legend>
<div id="form_extra_abrigada_esquerda" class="alpha grid_5 omega">
    <label>Qual? Se n�o, porque? <br>
        <textarea name="abrigadaServicoSocial.qualPorqueNao" value="${abrigadaServicoSocial.qualPorqueNao}" ></textarea>
    </label>
    <label>CRAS. Qual e por qual motivo? 
        <textarea name="abrigadaServicoSocial.cras" value="${abrigadaServicoSocial.cras}" ></textarea>
    </label>
    <label>CREAS. Qual e por qual motivo? 
        <textarea name="abrigadaServicoSocial.creas" value="${abrigadaServicoSocial.creas}" ></textarea>
    </label>
</div>
<div id="form_extra_abrigada_direita" class="alpha grid_5 omega">
    <label>Conselho Tutelar. Qual e por qual motivo?
        <textarea name="abrigadaServicoSocial.conselhoTutelar" value="${abrigadaServicoSocial.conselhoTutelar}" ></textarea>
    </label>
    <label>Vara de Inf�ncia. Qual e por qual motivo? 
        <textarea name="abrigadaServicoSocial.varaInfancia" value="${abrigadaServicoSocial.varaInfancia}" ></textarea>
    </label>
    <label>Outra Institui��o. Qual e por qual motivo? 
        <textarea name="abrigadaServicoSocial.outraInstituicao" value="${abrigadaServicoSocial.outraInstituicao}" ></textarea>
    </label>
</div>
<!--<label></label>Recebe aux�lio: <input type="checkbox" name="dependenteServicoSocial.documentos" value="${dependenteServicoSocial.recebeAuxilio}" />-->