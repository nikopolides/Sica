/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import com.sica.dao.DiarioAcompanhamentoDAO;
import com.sica.entity.DiarioAcompanhamento;
import java.util.List;

/**
 *
 * @author sica
 */

@Resource
public class DiarioAcompanhamentoController {
    
    private DiarioAcompanhamentoDAO dao;
    private Result result;
    private Validator validator;
    
    public DiarioAcompanhamentoController(DiarioAcompanhamentoDAO dao, Result result, Validator validator) {
        this.dao = dao;
        this.result = result;
        this.validator = validator;
    }
   @Path("/diarioAcompanhamento/form")
    public void form(){

    }
    
    public List<DiarioAcompanhamento> lista(){
        return dao.listaTodos();
    }
    
    //@Path("/diarioAcompanhamento/adiciona/{diarioAcompanhamento.id}")
    public void adiciona(final DiarioAcompanhamento diarioAcompanhamento){  
        dao.adiciona(diarioAcompanhamento); 
        result.redirectTo(this.getClass()).lista();
    }
    
    @Path("/diarioAcompanhamento/edita/{diarioAcompanhamento.id}")
    public void edita(DiarioAcompanhamento diarioAcompanhamento){        
        result.include("action", 1);
        result.include("diarioAcompanhamento", dao.findById(diarioAcompanhamento));
        result.redirectTo(this.getClass()).form();
    }
    
    @Path("/diarioAcompanhamento/atualizar")
    public void atualizar(final DiarioAcompanhamento diarioAcompanhamento){               
        dao.edita(diarioAcompanhamento); 
        result.redirectTo(this.getClass()).lista();
    }
    
    @Path("/diarioAcompanhamento/deleta/{diarioAcompanhamento.id}")
    public void deleta(DiarioAcompanhamento diarioAcompanhamento){
        dao.deleta(diarioAcompanhamento);
        result.redirectTo(this.getClass()).lista();
    }
    
    @Path("/diarioAcompanhamento/info/{diarioAcompanhamento.id}")
    public DiarioAcompanhamento info(DiarioAcompanhamento DiarioAcompanhamento){
       return dao.findById(DiarioAcompanhamento);
    }
    
}
