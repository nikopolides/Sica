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
import com.sica.dao.RegistroProcedimentoDAO;
import com.sica.entity.RegistroProcedimento;
import java.util.List;

/**
 *
 * @author bryan
 */
@Resource
public class RegistroProcedimentoController {
    
    private RegistroProcedimentoDAO dao;
    private Result result;
    private Validator validator;

    public RegistroProcedimentoController(RegistroProcedimentoDAO dao, Result result, Validator validator) {
        this.dao = dao;
        this.result = result;
        this.validator = validator;
    }
        
    public void form(){
    }
        
    //@Get("/registroProcedimento")
    @Path("/registroProcedimento/lista")
    public List<RegistroProcedimento> lista(){
        return dao.listaTodos();
    }
    
    //@Post("/registroProcedimento")
    public void adiciona(final RegistroProcedimento registroProcedimento){
        /* Valida procidmen
        validator.checking(new Validations(){{
            that(registroProcedimento.getProcedimentos() != null, "registroProcedimento.procedimentos", "procedimentos.vazio");
        
        }});
        
        // Valida observacaoDesligamento
        validator.checking(new Validations(){{
            that(registroProcedimento.getObservacaoDesligamento() != null, "registroProcedimento.observacaoDesligamento", "observacaoDesligamento.vazio");
        
        }});
        
        // Em caso de erro
        validator.onErrorUsePageOf(this.getClass()).form();
        */
        // Adiciona
        dao.adiciona(registroProcedimento); 

        // Redireciona para a listagem
        result.redirectTo("/registroProcedimento/lista/"+registroProcedimento.getIdAbrigada());
    }
    
     @Path("/registroProcedimento/deleta/{registroProcedimento.id}")
    public void deleta(RegistroProcedimento registroProcedimento){
        dao.deleta(registroProcedimento);
        // Redireciona para a listagem
        result.redirectTo("/registroProcedimento/lista/"+registroProcedimento.getIdAbrigada());
    }
    
    @Path("/registroProcedimento/info/{registroProcedimento.id}")
    public RegistroProcedimento info(RegistroProcedimento registroProcedimento){
       return dao.findById(registroProcedimento);
    }
    
    @Path("/registroProcedimento/edita/{registroProcedimento.id}")
    public void edita(RegistroProcedimento registroProcedimento){        
        // Redireciona para o form de cadastro
        result.include("action", 1);
        result.include("registroProcedimento", dao.findById(registroProcedimento));
        result.redirectTo(this.getClass()).form();
    }
    
    @Path("/registroProcedimento/atualizar")
    public void atualizar(final RegistroProcedimento registroProcedimento){
         /* Valida
        validator.checking(new Validations(){{
            that(registroProcedimento.getProcedimentos() != null, "registroProcedimento.procedimentos", "procedimentos.vazio");
        }});

        // Em caso de erro
        result.include("action");
        result.include("registroProcedimento", registroProcedimento);
        validator.onErrorUsePageOf(this.getClass()).form(); 
        */
        // Adiciona
        dao.edita(registroProcedimento); 
        
        // Redireciona para a listagem
        result.redirectTo(this.getClass()).lista();
    }    
}
