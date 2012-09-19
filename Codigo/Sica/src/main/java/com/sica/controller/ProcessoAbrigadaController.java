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
import com.sica.dao.ProcessoAbrigadaDAO;
import com.sica.entity.ProcessoAbrigada;

/**
 *
 * @author Acer
 */
@Resource
public class ProcessoAbrigadaController {

    private ProcessoAbrigadaDAO dao;
    private Result result;
    private Validator validator;

    public ProcessoAbrigadaController(ProcessoAbrigadaDAO d, Result r, Validator v) {
        this.dao = d;
        this.result = r;
        this.validator = v;
        System.out.println("Criando processoAbrigadaController");
    }

    @Path("/processoAbrigada/form/{idProcessoAbrigada}")
    public void form(long idProcessoAbrigada) {
        result.include("idProcessoAbrigada", idProcessoAbrigada);
    }

    @Path("/processoAbrigada/edita/{processoAbrigada.id}")
    public void edita(ProcessoAbrigada processoAbrigada) {

        result.include("action", 1);
        result.include("processoAbrigada", dao.findById(processoAbrigada));
        result.include("abrigada", dao.findAbrigadaById(dao.findById(processoAbrigada).getIdAbrigada()));
        result.redirectTo("/processoAbrigada/form/" + processoAbrigada.getId());
    }

    @Path("/processoAbrigada/atualizar")
    public void atualizar(final ProcessoAbrigada processoAbrigada) {
        // Valida
        validator.checking(new Validations() {

            {
                that(processoAbrigada.getNumeroBoletimOcorrencia() != null, "processoAbrigada.numeroBoletimOcorrencia", "numeroBoletimOcorrencia.vazio");
            }
        });

        // Em caso de erro
        result.include("action");
        result.include("abrigada", processoAbrigada);
        validator.onErrorUsePageOf(this.getClass()).form(processoAbrigada.getId());

        // Adiciona
        dao.edita(processoAbrigada);

        // Redireciona para a listagem
        //result.redirectTo(this.getClass()).lista();
    }
}
