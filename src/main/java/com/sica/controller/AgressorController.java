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
import com.sica.dao.AgressorDAO;
import com.sica.entity.Agressor;
import java.util.List;

/**
 *
 * @author Winstein
 */
@Resource
public class AgressorController {
    
    private AgressorDAO dao;
    private Result result;
    private Validator validator;
    
    public AgressorController(AgressorDAO dao, Result result, Validator validator) {
        this.dao = dao;
        this.result = result;
        this.validator = validator;
    }
    
    @Path("/agressor/form/{idAbrigada}")
    public void form(long idAbrigada){
        result.include("idAbrigada",idAbrigada);
    }
    
    //@Get("/agressor")
    @Path("/agressor/lista/{agressor.idAbrigada}")
    public List<Agressor> lista(Agressor agressor){
        return dao.listaTodos(agressor);
    }
    
    //@Post("/agressor")
    public void adiciona(final Agressor agressor){
        // Valida
        validator.checking(new Validations(){{
            that(agressor.getNome() != null, "agressor.nome", "nome.vazio");            
        }});
        
        // Em caso de erro
        validator.onErrorUsePageOf(this.getClass()).form(agressor.getIdAbrigada()); 
        
        // Adiciona
        dao.adiciona(agressor); 

        // Redireciona para a listagem
        result.redirectTo("/agressor/lista/"+agressor.getIdAbrigada());
    }
    
    @Path("/agressor/edita/{agressor.id}")
    public void edita(Agressor agressor){        
        // Redireciona para o form de cadastro
        result.include("action", 1);
        result.include("agressor", dao.findById(agressor));
        result.include("idAbrigada",dao.findById(agressor).getIdAbrigada());
        result.redirectTo("/agressor/form/"+agressor.getIdAbrigada());
    }
    
    @Path("/agressor/atualizar")
    public void atualizar(final Agressor agressor){
         // Valida
        validator.checking(new Validations(){{
            that(agressor.getNome() != null, "agressor.nome", "nome.vazio");
        }});

        // Em caso de erro
        result.include("action");
        result.include("agressor", agressor);
        validator.onErrorUsePageOf(this.getClass()).form(agressor.getIdAbrigada()); 
        
        // Adiciona
        dao.edita(agressor); 
        
        // Redireciona para a listagem
        result.redirectTo("/agressor/lista/"+agressor.getIdAbrigada());
    }
    
    @Path("/agressor/deleta/{agressor.idAbrigada}/{agressor.id}")
    public void deleta(Agressor agressor){
        dao.deleta(agressor);
        // Redireciona para a listagem
        result.redirectTo("/agressor/lista/"+agressor.getIdAbrigada());
    }
    
    @Path("/agressor/info/{agressor.id}")
    public Agressor info(Agressor agressor){
       return dao.findById(agressor);
    }
}
