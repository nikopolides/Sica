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
import com.sica.dao.RelatorioPsicoSocialDAO;
import com.sica.entity.RelatorioPsicoSocial;
import java.util.List;

/**
 *
 * @author athos
 */
@Resource
public class RelatorioPsicoSocialController {
    
    private RelatorioPsicoSocialDAO dao;
    private Result result;
    private Validator validator;

    public RelatorioPsicoSocialController(RelatorioPsicoSocialDAO dao, Result result, Validator validator) {
        this.dao = dao;
        this.result = result;
        this.validator = validator;
    }
    
    @Path("/relatorioPsicoSocial/form/{idAbrigada}")
    public void form(long idAbrigada){
        result.include("idAbrigada",idAbrigada);
    }
    
    @Path("/relatoriopsicosocial/adiciona")
    public void adiciona(final RelatorioPsicoSocial relatorioPsicoSocial){
        // Valida
        validator.checking(new Validations(){{
            that(relatorioPsicoSocial.getDescricao() != null, "relatorioPsicoSocial.descricao", "descricao.vazio");
        
        }});
        
        // Em caso de erro
        validator.onErrorUsePageOf(this.getClass()).form(relatorioPsicoSocial.getIdAbrigada());
        
        // Adiciona
        dao.adiciona(relatorioPsicoSocial); 

        // Redireciona para a listagem
        //result.redirectTo(this.getClass()).lista();
    }
    
    @Path("/relatorioPsicoSocial/info/{relatorioPsicoSocial.id}")
    public RelatorioPsicoSocial info(RelatorioPsicoSocial relatorioPsicoSocial){
       return dao.findById(relatorioPsicoSocial);
    }
    
}
