/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.Livro;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author leonn
 */
@Component
public class LivroDAO {
    private EntityManager entityManager;
    
    public LivroDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    
    public void adiciona(Livro livro){
        if(!entityManager.getTransaction().isActive()){
            entityManager.getTransaction().begin();
        }
        entityManager.persist(livro);
        entityManager.getTransaction().commit();    
    }
    
    public void edita(Livro livro){
        entityManager.merge(livro);
        entityManager.getTransaction().commit();
    }
    
    public List<Livro> listaTodos(){
        Query query = entityManager.createQuery("from Livro order by titulo asc");
        List<Livro> lista = query.getResultList();
        /*Collections.sort(lista, new Comparator<Livro>(){
        
        @Override
        public int compare (Livro l1, Livro l2){
            return l1.getTitulo().compareTo(l2.getTitulo());
                          
        }
    });*/
        //entityManager.close();
        return lista;
    }
    
    public List<Livro> listaAutor(){
        Query query = entityManager.createQuery("from Livro order by autor asc");
        List<Livro> listaAutor = query.getResultList();
        /*Collections.sort(listaAutor, new Comparator<Livro>(){
        
            @Override
        public int compare (Livro l1, Livro l2){
            return l1.getAutor().compareTo(l2.getAutor());
                          
        }*/
        //entityManager.close();
        
        return listaAutor;
    }
    
    public void deleta(Livro livro){
        livro = entityManager.getReference(Livro.class, livro.getId());
        entityManager.remove(livro);
        entityManager.getTransaction().commit();
    }
    
    public Livro findById(Livro livro){
        return entityManager.find(Livro.class, livro.getId());
    }
    
    /*
    public List<Livro> findByTitulo(String tituloPesquisado){
        Query query = entityManager.createQuery("from Livro where titulo like '%"+tituloPesquisado+"%'");
        List <Livro>lista=query.getResultList();
        return lista;        
    } */
    public List<Livro> findByAutor(String autorPesquisado){
        Query query = entityManager.createQuery("from Livro where autor like '%"+autorPesquisado+"%'");
        List <Livro>lista=query.getResultList();
        return lista;        
    }
    
    public List<Livro> findByAutorOuTitulo(String termoPesquisado) {
        Query query = entityManager.createQuery("from Livro where autor like '%"+termoPesquisado+"%' or titulo like '%"+termoPesquisado+"%'");
        // 
        return query.getResultList();
    }
    
}
