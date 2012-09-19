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
import com.sica.dao.ProcessoDependenteDAO;
import com.sica.entity.ProcessoDependente;

/**
 *
 * @author Acer
 */
@Resource
public class ProcessoDependenteController {

    private ProcessoDependenteDAO dao;
    private Result result;
    private Validator validator;

    public ProcessoDependenteController(ProcessoDependenteDAO d, Result r, Validator v) {
        this.dao = d;
        this.result = r;
        this.validator = v;
        
    }

    @Path("/processoDependente/form/{idProcessoDependente}")
    public void form(long idProcessoDependenteDependente) {
        result.include("idProcessoDependente", idProcessoDependente);
    }

    @Path("/processoDependente/edita/{processoDependente.id}")
    public void edita(ProcessoDependente processoDependente) {

        result.include("action", 1);
        result.include("processoDependente", dao.findById(processoDependente));
        result.include("abrigada", dao.findAbrigadaById(dao.findById(processoDependente).getIdAbrigada()));
        result.redirectTo("/processoDependente/form/" + processoDependente.getId());
    }

    @Path("/processoDependente/atualizar")
    public void atualizar(final ProcessoDependente processoDependente) {
        // Valida
        validator.checking(new Validations() {

            {
                that(processoDependente.getDescricao() != null, "processoDependente.descricao", "descricao.vazio");
            }
        });

        // Em caso de erro
        result.include("action");
        result.include("abrigada", processoDependente);
        validator.onErrorUsePageOf(this.getClass()).form(processoDependente.getId());

        // Adiciona
        dao.edita(processoDependente);

        // Redireciona para a listagem
        //result.redirectTo(this.getClass()).lista();
    }
}
