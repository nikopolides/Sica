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
import com.sica.dao.QuantidadeAbrigamentosDAO;
import com.sica.entity.QuantidadeAbrigamentos;
import java.util.List;

/**
 *
 * @author Victor Hugo
 */
@Resource
public class QuantidadeAbrigamentosController {
    
    private QuantidadeAbrigamentosDAO dao;
    private Result result;
    private Validator validator;

    public QuantidadeAbrigamentosController(QuantidadeAbrigamentosDAO d, Result r, Validator v) {
        this.dao = d;
        this.result = r;
        this.validator = v;
        System.out.println("Criando QuantidadeAbrigamentosController");
    }
    
    @Path("/quantidadeAbrigamentos/form/{idAbrigada}")
    public void form(long idAbrigada){
        result.include("idAbrigada",idAbrigada);
    }
    
    //@Get("/quantidadeAbrigamentos")
    @Path("/quantidadeAbrigamentos/lista/{quantidadeAbrigamentos.idAbrigada}")
    public List<QuantidadeAbrigamentos> lista(QuantidadeAbrigamentos quantidadeAbrigamentos){
        result.include("quantidade", dao.listaTodos(quantidadeAbrigamentos).size());
        return dao.listaTodos(quantidadeAbrigamentos);
    }

    //@Get("/quantidadeAbrigamentos/{QuantidadeAbrigamentos.id}")
    public QuantidadeAbrigamentos visualiza(QuantidadeAbrigamentos quantidadeAbrigamentos){
        return quantidadeAbrigamentos;
    }
    
    //@Post("/quantidadeAbrigamentos")
    public void adiciona(final QuantidadeAbrigamentos quantidadeAbrigamentos){
        // Valida
        validator.checking(new Validations(){{
            that(quantidadeAbrigamentos.getDataEntrada() != null, "quantidadeAbrigamentos.DataEntrada", "DataEntrada.vazio");
            that(quantidadeAbrigamentos.getDataSaida() != null, "quantidadeAbrigamentos.DataSaida", "DataSaida.vazio");
        }});
        
        // Em caso de erro
        validator.onErrorUsePageOf(this.getClass()).form(quantidadeAbrigamentos.getIdAbrigada()); 
        
        // Adiciona
        dao.adiciona(quantidadeAbrigamentos); 

        // Redireciona para a listagem
        result.redirectTo("/quantidadeAbrigamentos/lista/"+quantidadeAbrigamentos.getIdAbrigada());
    }

    @Path("/quantidadeAbrigamentos/edita/{quantidadeAbrigamentos.id}")
    public void edita(QuantidadeAbrigamentos quantidadeAbrigamentos){        
        // Redireciona para o form de cadastro
        result.include("action", 1);
        result.include("quantidadeAbrigamentos", dao.findById(quantidadeAbrigamentos));
        result.include("idAbrigada",dao.findById(quantidadeAbrigamentos).getIdAbrigada());
        result.redirectTo("/quantidadeAbrigamentos/form/"+quantidadeAbrigamentos.getIdAbrigada());
    }
    
    @Path("/quantidadeAbrigamentos/atualizar")
    public void atualizar(final QuantidadeAbrigamentos quantidadeAbrigamentos){
         // Valida
        validator.checking(new Validations(){{
            that(quantidadeAbrigamentos.getDataEntrada() != null, "quantidadeAbrigamentos.DataEntrada", "DataEntrada.vazio");
            that(quantidadeAbrigamentos.getDataSaida() != null, "quantidadeAbrigamentos.DataSaida", "DataSaida.vazio");
        }});

        // Em caso de erro
        result.include("action");
        result.include("quantidadeAbrigamentos", quantidadeAbrigamentos);
        validator.onErrorUsePageOf(this.getClass()).form(quantidadeAbrigamentos.getIdAbrigada()); 
        
        // Adiciona
        dao.edita(quantidadeAbrigamentos); 
        
        // Redireciona para a listagem
        result.redirectTo("/quantidadeAbrigamentos/lista/"+quantidadeAbrigamentos.getIdAbrigada());
    }
    @Path("/quantidadeAbrigamentos/info/{quantidadeAbrigamentos.id}")
    public QuantidadeAbrigamentos info(QuantidadeAbrigamentos quantidadeAbrigamentos){
       return dao.findById(quantidadeAbrigamentos);
    }
    
    
}
