/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import com.sica.dao.AcompanhamentoAbrigadaDAO;
import com.sica.entity.AcompanhamentoAbrigada;
import java.util.List;

/**
 *
 * @author Winstein
 */

@Resource
public class AcompanhamentoAbrigadaController {
    private AcompanhamentoAbrigadaDAO dao;
    private Result result;
    private Validator validator;

    public AcompanhamentoAbrigadaController(AcompanhamentoAbrigadaDAO dao, Result result, Validator validator) {
        this.dao = dao;
        this.result = result;
        this.validator = validator;
    }
    
    @Path("/acompanhamentoAbrigada/form/{idAbrigada}")
    public void form(long idAbrigada){
        result.include("idAbrigada",idAbrigada);
    }
    
    //@Get("/acompanhamentoAbrigada")
    @Path("/acompanhamentoAbrigada/lista/{acompanhamentoAbrigada.idAbrigada}")
    public List<AcompanhamentoAbrigada> lista(AcompanhamentoAbrigada acompanhamentoAbrigada){
        return dao.listaTodos(acompanhamentoAbrigada);
    }
    
    //@Get("/acompanhamentoAbrigada/{acompanhamentoAbrigada.id}")
    public AcompanhamentoAbrigada visualiza(AcompanhamentoAbrigada acompanhamentoAbrigada){
        return acompanhamentoAbrigada;
    }
    
    //@Post("/acompanhamentoAbrigada")
    public void adiciona(final AcompanhamentoAbrigada acompanhamentoAbrigada){
        // Adiciona
        dao.adiciona(acompanhamentoAbrigada); 

        // Redireciona para a listagem
        result.redirectTo("/acompanhamentoAbrigada/lista/"+acompanhamentoAbrigada.getIdAbrigada());
    }
    
    @Path("/acompanhamentoAbrigada/edita/{acompanhamentoAbrigada.id}")
    public void edita(AcompanhamentoAbrigada acompanhamentoAbrigada){        
        // Redireciona para o form de cadastro
        result.include("action", 1);
        result.include("acompanhamentoAbrigada", dao.findById(acompanhamentoAbrigada));
        result.include("idAbrigada",dao.findById(acompanhamentoAbrigada).getIdAbrigada());
        result.redirectTo("/acompanhamentoAbrigada/form/"+acompanhamentoAbrigada.getIdAbrigada());
    }
    
    @Path("/acompanhamentoAbrigada/atualizar")
    public void atualizar(final AcompanhamentoAbrigada acompanhamentoAbrigada){
        // Adiciona
        dao.edita(acompanhamentoAbrigada); 
        
        // Redireciona para a listagem
        result.redirectTo("/acompanhamentoAbrigada/lista/"+acompanhamentoAbrigada.getIdAbrigada());
    }
    
    @Path("/acompanhamentoAbrigada/info/{acompanhamentoAbrigada.id}")
    public AcompanhamentoAbrigada info(AcompanhamentoAbrigada acompanhamentoAbrigada){
       return dao.findById(acompanhamentoAbrigada);
    }
}
