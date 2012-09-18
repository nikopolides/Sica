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
import com.sica.dao.ProcessoDAO;
import com.sica.entity.Processo;

/**
 *
 * @author Acer
 */
@Resource
public class ProcessoController {

    private ProcessoDAO dao;
    private Result result;
    private Validator validator;

    public ProcessoController(ProcessoDAO d, Result r, Validator v) {
        this.dao = d;
        this.result = r;
        this.validator = v;
        System.out.println("Criando processoController");
    }

    @Path("/processo/form/{idProcesso}")
    public void form(long idProcesso) {
        result.include("idProcesso", idProcesso);
    }

    @Path("/processo/edita/{processo.id}")
    public void edita(Processo processo) {

        result.include("action", 1);
        result.include("processo", dao.findById(processo));
        result.include("abrigada", dao.findAbrigadaById(dao.findById(processo).getIdAbrigada()));
        result.redirectTo("/processo/form/" + processo.getId());
    }

    @Path("/processo/atualizar")
    public void atualizar(final Processo processo) {
        // Valida
        validator.checking(new Validations() {

            {
                that(processo.getDescricao() != null, "processo.descricao", "descricao.vazio");
            }
        });

        // Em caso de erro
        result.include("action");
        result.include("abrigada", processo);
        validator.onErrorUsePageOf(this.getClass()).form(processo.getId());

        // Adiciona
        dao.edita(processo);

        // Redireciona para a listagem
        //result.redirectTo(this.getClass()).lista();
    }
}
