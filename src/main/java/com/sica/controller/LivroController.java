/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import com.sica.dao.LivroDAO;
import com.sica.entity.Livro;
import java.util.List;

/**
 *
 * @author leonn
 */
@Resource
public class LivroController {
    private Result result;
    private LivroDAO livroDAO;
    private Validator validator;

    public LivroController(Result result, LivroDAO livroDAO, Validator validator) {
        this.result = result;
        this.livroDAO = livroDAO;
        this.validator = validator;
    }

    public LivroController() {
    }
    
    public void form(){
       
    }
    
    public void adiciona(Livro livro){
        livroDAO.adiciona(livro);        
        result.redirectTo(this.getClass()).lista();
    }
    
    public List<Livro> lista(){
       return livroDAO.listaTodos();
    }
    
}
