/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.Livro;
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
        entityManager.persist(livro);
        entityManager.getTransaction().commit();    
    }
    
    public void edita(Livro livro){
        entityManager.merge(livro);
        entityManager.getTransaction().commit();
    }
    
    public List<Livro> listaTodos(){
        Query query = entityManager.createQuery("from Livro");
        List<Livro> lista = query.getResultList();
        entityManager.close();
        return lista;
    }
    
    public void deleta(Livro livro){
        livro = entityManager.getReference(Livro.class, livro.getId());
        entityManager.remove(livro);
        entityManager.getTransaction().commit();
    }
    
    public Livro findById(Livro livro){
        return entityManager.find(Livro.class, livro.getId());
    }
    
}
