/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//TESTE COMMIT 2
//////teste teste
package com.sica.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import com.sica.dao.AbrigadaPsicologiaDAO;
import com.sica.entity.AbrigadaPsicologia;
import java.util.List;


/**
 *
 * @author Victor Hugo
 */
@Resource
public class AbrigadaPsicologiaController {
    private AbrigadaPsicologiaDAO dao;
    private Result result;
    private Validator validator;


public AbrigadaPsicologiaController(AbrigadaPsicologiaDAO d, Result r, Validator v){
        this.dao = d;
        this.result = r;
        this.validator = v;
        System.out.println("Criando AbrigadaPsicologiaController");
    }
@Path("/abrigadaPsicologia/form/{idAbrigada}")
    public void form(long idAbrigada){
        result.include("idAbrigada",idAbrigada);
    }
//@Get("/abrigadaPsicologia")
    @Path("/abrigadaPsicologia/lista/{abrigadaPsicologia.idAbrigada}")
    public List<AbrigadaPsicologia> lista(AbrigadaPsicologia abrigadaPsicologia){
        return dao.listaTodos(abrigadaPsicologia);
    }
//@Get("/abrigadaPsicologia/{abrigadaPsicologia.id}")
    public AbrigadaPsicologia visualiza(AbrigadaPsicologia abrigadaPsicologia){
        return abrigadaPsicologia;
    }
    
     //@Post("/AbrigadaPsicologia")
    public void adiciona(final AbrigadaPsicologia abrigadaPsicologia){
        // Valida
        validator.checking(new Validations(){{
            that(abrigadaPsicologia.getParenteNome() != null, "AbrigadaPsicologia.parenteNome", "nome.vazio");            
        }});
        
        // Em caso de erro
        validator.onErrorUsePageOf(this.getClass()).form(abrigadaPsicologia.getIdAbrigada()); 
        
        // Adiciona
        dao.adiciona(abrigadaPsicologia); 

        // Redireciona para a listagem
        result.redirectTo("/abrigadaPsicologia/lista/"+abrigadaPsicologia.getIdAbrigada());
    }
    
    @Path("/abrigadaPsicologia/atualizar")
    public void atualizar(final AbrigadaPsicologia abrigadaPsicologia){
         // Valida
        validator.checking(new Validations(){{
            that(abrigadaPsicologia.getParenteNome() != null, "abrigadaPsicologia.parenteNome", "nome.vazio");
        }});

        // Em caso de erro
        result.include("action");
        result.include("abrigadaPsicologia", abrigadaPsicologia);
        validator.onErrorUsePageOf(this.getClass()).form(abrigadaPsicologia.getIdAbrigada()); 
        
        // Adiciona
        dao.edita(abrigadaPsicologia); 
        
        // Redireciona para a listagem
        result.redirectTo("/abrigadaPsicologia/lista/"+abrigadaPsicologia.getIdAbrigada());
    }
    @Path("/abrigadaPsicologia/deleta/{abrigadaPsicologia.idAbrigada}/{abrigadaPsicologia.id}")
    public void deleta(AbrigadaPsicologia abrigadaPsicologia){
        dao.deleta(abrigadaPsicologia);
        // Redireciona para a listagem
        result.redirectTo("/abrigadaPsicologia/lista/"+abrigadaPsicologia.getIdAbrigada());
    }
    @Path("/abrigadaPsicologia/info/{abrigadaPsicologia.id}")
    public AbrigadaPsicologia info(AbrigadaPsicologia abrigadaPsicologia){
       return dao.findById(abrigadaPsicologia);
    }
    
    @Path("/abrigadaPsicologia/edita/{abrigadaPsicologia.id}")
    public void edita(AbrigadaPsicologia abrigadaPsicologia){        
        // Redireciona para o form de cadastro
        result.include("action", 1);
        result.include("abrigadaPsicologia", dao.findById(abrigadaPsicologia));
        result.include("idAbrigada",dao.findById(abrigadaPsicologia).getIdAbrigada());
        result.redirectTo("/abrigadaPsicologia/form/"+abrigadaPsicologia.getIdAbrigada());
    }
}