
package com.sica.controller;

import br.com.caelum.vraptor.*;
import br.com.caelum.vraptor.validator.Validations;
import com.sica.dao.NafavdDAO;
import com.sica.entity.Nafavd;
import java.util.List;

/**
 *
 * @author Matheus Fonseca
 */
@Resource
public class NafavdController {
    private NafavdDAO dao;
    private Result result;
    private Validator validator;
    
    public NafavdController(NafavdDAO dao, Result result, Validator validator){
        this.dao = dao;
        this.result = result;
        this.validator = validator;
    }
    
    public void form(){
    }
    
    //@Get("/nafavd")
    public List<Nafavd> lista(){
        return dao.listaTodos();
    }
    
    //@Post("/nafavd")
    public void adiciona(final Nafavd nafavd){
        // Valida
        validator.checking(new Validations(){{
            that(nafavd.getCidade() != null, "nafavd.cidade", "cidade.vazio");
            that(nafavd.getEstado() != null, "nafavd.estado", "estado.vazio");
        }});
        
        // Em caso de erro
        validator.onErrorUsePageOf(this.getClass()).form(); 
        
        //result.include("nafavd", nafavd);
        //result.redirectTo(this.getClass()).teste();
        // Adiciona
        dao.adiciona(nafavd);

        // Redireciona para a listagem
        result.redirectTo(this.getClass()).lista();
    }
    
    @Path("/nafavd/edita/{nafavd.id}")
    public void edita(Nafavd nafavd){        
        // Redireciona para o form de cadastro
        result.include("action", 1);
        result.include("nafavd", dao.findById(nafavd));
        result.redirectTo(this.getClass()).form();
    }
    
    @Path("/nafavd/atualizar")
    public void atualizar(final Nafavd nafavd){
         // Valida
        validator.checking(new Validations(){{
            that(nafavd.getCidade() != null, "nafavd.cidade", "cidade.vazio");
            that(nafavd.getEstado() != null, "nafavd.estado", "estado.vazio");
        }});

        // Em caso de erro
        result.include("action");
        result.include("nafavd", nafavd);
        validator.onErrorUsePageOf(this.getClass()).form(); 
        
        // Adiciona
        dao.edita(nafavd); 
        
        // Redireciona para a listagem
        result.redirectTo(this.getClass()).lista();
    }
    
    @Path("/nafavd/deleta/{nafavd.id}")
    public void deleta(Nafavd nafavd){
        dao.deleta(nafavd);
        // Redireciona para a listagem
        result.redirectTo(this.getClass()).lista();
    }
    @Path("/nafavd/info/{nafavd.id}")
    public Nafavd info(Nafavd nafavd){
       return dao.findById(nafavd);
    }
}
