/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import com.sica.entity.DiarioAcompanhamento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author sica
 */
public class DiarioAcompanhamentoDAO {
 
    private EntityManager entityManager;
    
    public DiarioAcompanhamentoDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    
    public void adiciona(DiarioAcompanhamento Diario){
        entityManager.persist(Diario);
        entityManager.getTransaction().commit();    
    }
    
    public void edita(DiarioAcompanhamento Diario){
        entityManager.merge(Diario);
        entityManager.getTransaction().commit();
    }
    
    public List<DiarioAcompanhamento> listaTodos(){
        Query query = entityManager.createQuery("from DiarioAcompanhamento");
        List<DiarioAcompanhamento> lista = query.getResultList();
        entityManager.close();
        return lista;
    }
    
    public void deleta(DiarioAcompanhamento Diario){
        Diario = entityManager.getReference(DiarioAcompanhamento.class, Diario.getId());
        entityManager.remove(Diario);
        entityManager.getTransaction().commit();
    }
    
    public DiarioAcompanhamento findById(DiarioAcompanhamento Diario){
        return entityManager.find(DiarioAcompanhamento.class, Diario.getId());
    }
    
}
