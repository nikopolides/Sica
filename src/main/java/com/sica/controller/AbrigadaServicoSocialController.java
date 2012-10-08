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
import com.sica.dao.AbrigadaServicoSocialDAO;
import com.sica.entity.Abrigada;
import com.sica.entity.AbrigadaServicoSocial;
import java.util.List;


/**
 *
 * @author thiago honorato
 */
@Resource
public class AbrigadaServicoSocialController {
    
    private AbrigadaServicoSocialDAO dao;
    private Result result;
    private Validator validator;
    
    public AbrigadaServicoSocialController(AbrigadaServicoSocialDAO dao, Result result, Validator validator){
        this.dao = dao;
        this.result = result;
        this.validator = validator;
        System.out.println("Criando AbrigadaServicoSocialController");
    }
    
    public void form(){}
    
    public void adiciona(final AbrigadaServicoSocial abrigadaServicoSocial){
        
        validator.checking(new Validations(){{
            that(abrigadaServicoSocial.getDataAdmissao() != null, "abrigadaServicoSocial.dataAdmissao", "dataAdmissao.vazio");
            
        }});
        
        validator.onErrorUsePageOf(this.getClass()).form(); 
        
        dao.adiciona(abrigadaServicoSocial); 

        //result.redirectTo("/abrigadaServicoSocial/lista/"+abrigadaServicoSocial.getIdAbrigada());
    }
    
     @Path("/abrigadaServicoSocial/edita/{AbrigadaServicoSocial.id}")
    public void edita(AbrigadaServicoSocial abrigadaServicoSocial){        
        // Redireciona para o form de cadastro
        result.include("action", 1);
        result.include("abrigadaServicoSocial", dao.findById(abrigadaServicoSocial));
        result.include("idAbrigada",dao.findById(abrigadaServicoSocial).getIdAbrigada());
        result.redirectTo("/abrigadaServicoSocial/form/"+abrigadaServicoSocial.getIdAbrigada());
    }
     
@Path("/abrigadaServicoSocial/atualizar")
    public void atualizar(final AbrigadaServicoSocial abrigadaServicoSocial){
         
         // Em caso de erro
        result.include("action");
        result.include("abrigadaServicoSocial", abrigadaServicoSocial);
        
        
        // Adiciona
        dao.edita(abrigadaServicoSocial); 
        
        // Redireciona para a listagem
        result.redirectTo("/abrigadaServicoSocial/lista/"+abrigadaServicoSocial.getIdAbrigada());
    }

    @Path("/abrigadaServicoSocial/deleta/{abrigadaServicoSocial.id}")
    public void deleta(AbrigadaServicoSocial abrigadaServicoSocial){
        dao.deleta(abrigadaServicoSocial);
        
        result.redirectTo("/abrigadaServicoSocial/lista/"+abrigadaServicoSocial.getIdAbrigada());
    }
    
    @Path("/abrigadaServicoSocial/info/{abrigada.id}")
    public AbrigadaServicoSocial info(AbrigadaServicoSocial abrigadaServicoSocial){
       return dao.findById(abrigadaServicoSocial);
    }
    
    public List<AbrigadaServicoSocial>listaTodos(){
        return dao.listaTodos();
    }
}

