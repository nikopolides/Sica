/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
//import com.sica.dao.ProcessoDependenteDAO; Comentado por ATHOS, apagar quando parar de quebrar
import com.sica.entity.ProcessoDependente;

/**
 *
 * @author Acer
 */
@Resource
public class ProcessoDependenteController {

    //private ProcessoDependenteDAO dao; Comentado por ATHOS, apagar quando parar de quebrar
    private Result result;
    private Validator validator;

    /*public ProcessoDependenteController(ProcessoDependenteDAO d, Result r, Validator v) {
        this.dao = d;
        this.result = r;
        this.validator = v;
        
    } Comentado por ATHOS, apagar quando parar de quebrar*/

    @Path("/processoDependente/form/{idProcessoDependente}")
    public void form(long idProcessoDependente) {
        result.include("idProcessoDependente", idProcessoDependente);
    }

    @Path("/processoDependente/edita/{processoDependente.id}")
    public void edita(ProcessoDependente processoDependente) {

        result.include("action", 1);
        //result.include("processoDependente", dao.findById(processoDependente)); Comentado por ATHOS, apagar quando parar de quebrar
        //result.include("abrigada", dao.findAbrigadaById(dao.findById(processoDependente).getIdAbrigada())); Comentado por ATHOS, apagar quando parar de quebrar
        result.redirectTo("/processoDependente/form/" + processoDependente.getId());
    }

    @Path("/processoDependente/atualizar")
    public void atualizar(final ProcessoDependente processoDependente) {
        // Valida
        validator.checking(new Validations() {

            {
                //that(processoDependente.getNumeroBoletimOcorrencia() != null, "processoDependente.numeroBoletimOcorrencia", "numeroBoletimOcorrencia.vazio"); Comentado por ATHOS, apagar quando parar de quebrar
            }
        });

        // Em caso de erro
        result.include("action");
        result.include("abrigada", processoDependente);
        //validator.onErrorUsePageOf(this.getClass()).form(processoDependente.getId()); Comentado por ATHOS, apagar quando parar de quebrar

        // Adiciona
        //dao.edita(processoDependente); Comentado por ATHOS, apagar quando parar de quebrar

        // Redireciona para a listagem
        //result.redirectTo(this.getClass()).lista();
    }
}
