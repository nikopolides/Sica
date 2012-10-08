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
import com.sica.dao.DependenteServicoSocialDAO;
import com.sica.entity.DependenteServicoSocial;
import java.util.List;


/**
 *
 * @author Cristovao Frinhani
 */
@Resource
public class DependenteServicoSocialController {
    
    private DependenteServicoSocialDAO dao;
    private Result result;
    private Validator validator;
    
    public DependenteServicoSocialController(DependenteServicoSocialDAO dao, Result result, Validator validator){
        this.dao = dao;
        this.result = result;
        this.validator = validator;
        System.out.println("Criando DependenteServicoSocialController");
    }
    
    public void form() {}
    
    
    //@Get("/abrigada")
    public void adiciona(final DependenteServicoSocial dependenteServicoSocial){
            dao.adiciona(dependenteServicoSocial);
            result.redirectTo("/dependenteServicoSocial/lista/"+dependenteServicoSocial.getIdAbrigada());
    }
    
    @Path("/dependenteServicoSocial/edita/{DependenteServicoSocial.id}")
    public void edita(DependenteServicoSocial dependenteServicoSocial){
        //Redireciona para o form de cadastro
        result.include("action", 1);
        result.include("dependenteServicoSocial", dao.findById(dependenteServicoSocial));
        result.include("idAbrigada", dao.findById(dependenteServicoSocial).getIdAbrigada());
        result.include("/dependenteServicoSocial/form/"+dependenteServicoSocial.getIdAbrigada());
    }
    
    @Path("/dependenteServicoSocial/atualizar")
    public void atualizar(final DependenteServicoSocial dependenteServicoSocial){
        
        //Em caso de erro
        result.include("action");
        result.include("dependenteServicoSocial", dependenteServicoSocial);
        
        //Adiciona
        dao.edita(dependenteServicoSocial);
        
        result.redirectTo("/dependenteServicoSocial/lista/"+dependenteServicoSocial.getIdAbrigada());
    }
    
    @Path("/dependenteServicoSocial/deleta/{dependenteServicoSocial.id}")
    public void deleta(DependenteServicoSocial dependenteServicoSocial){
        dao.deleta(dependenteServicoSocial);
        result.redirectTo("/dependenteServicoSocial/lista/"+dependenteServicoSocial.getIdAbrigada());
    }
    
    @Path("/dependenteServicoSocial/info/{abrigada.id}")
    public DependenteServicoSocial info(DependenteServicoSocial dependenteServicoSocial){
        return dao.findById(dependenteServicoSocial);
    }
    
    public List<DependenteServicoSocial> listaTodos(){
        return dao.listaTodos();
    }
    
}
