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
   // private Validator validator;

    public LivroController(Result result, LivroDAO livroDAO) {
        this.result = result;
        this.livroDAO = livroDAO;
    //    this.validator = validator;
    }

    
    @Path("/livro/form")
    public void form(long Id){
        result.include("id",Id);
    }
    
    public void adiciona(final Livro livro){
        //valida
        /*validator.checking(new Validations(){{
            //Campos obrigatórios que devem ser preenchidos
            that(livro.getTitulo()!= null,"","titulo.vazio");
            that(livro.getAutor()!= null,"","autor.vazio");
            that(livro.getPublicacao()!= null,"","publicacao.vazio");
            that(livro.getEdicao()!= null,"","edicao.vazio");
        }});
        
        validator.onErrorUsePageOf(this.getClass()).form(livro.getId());
        */
        livroDAO.adiciona(livro);        
        result.redirectTo(this.getClass()).lista();
    }
    
    public List<Livro> lista(){
       return livroDAO.listaTodos();
    }
    
    public List<Livro> listaAutor(){
       return livroDAO.listaAutor();
    }
    
    @Path("/livro/edita/{livro.id}")
    public void edita(Livro livro){        
        // Redireciona para o form de cadastro
        result.include("action", 1);
        result.include("livro", livroDAO.findById(livro));
        result.redirectTo(this.getClass()).form(livro.getId());
    }
    
    @Path("/livro/atualizar")
    public void atualizar(final Livro livro){
        //valida
      /*  validator.checking(new Validations(){{
            //Campos obrigatórios que devem ser preenchidos
            that(livro.getTitulo()!= null,"","titulo.vazio");
            that(livro.getAutor()!= null,"","autor.vazio");
            that(livro.getPublicacao()!= null,"","publicacao.vazio");
            that(livro.getEdicao()!= null,"","edicao.vazio");
        }});
        
        validator.onErrorUsePageOf(this.getClass()).form(livro.getId());
        */
        livroDAO.edita(livro); 
        // Redireciona para a listagem
        result.include("mensagem", "Livro atualizado com sucesso.");
        result.redirectTo(this.getClass()).lista();
    }
    
    @Path("/livro/deleta/{livro.id}")
    public void deleta(Livro livro){
        livroDAO.deleta(livro);
        // Redireciona para a listagem
        result.include("mensagem", "Livro Excluido com sucesso.");
        result.redirectTo(this.getClass()).lista();
    }
    
    @Path("/livro/info/{livro.id}")
    public Livro info(Livro livro){
       return livroDAO.findById(livro);
    }
   
    @Path("/livro/busca")
    public void busca(){
    }
    
    ///@Path("/livro/listaResultado")
    //public List<Livro> listaResultado(String pesquisa) {
       // result.include("action", 1);
        
        //if(!tituloPesquisado.isEmpty()){
          //  result.include("livroList",livroDAO.findByTitulo(tituloPesquisado));
            //result.redirectTo(this.getClass()).busca();
          //  return livroDAO.findByTitulo(tituloPesquisado); 
        //}
        //else{
          //  result.include("livroList",livroDAO.findByAutor(autorPesquisado));            
            //result.redirectTo(this.getClass()).busca();
           // return livroDAO.findByAutor(autorPesquisado);    
        //}
  //  }
    
}
