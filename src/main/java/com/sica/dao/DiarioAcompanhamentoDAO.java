/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.DiarioAcompanhamento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author sica
 */
@Component
public class DiarioAcompanhamentoDAO {
 
    private EntityManager entityManager;
    
    public DiarioAcompanhamentoDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    
    public void adiciona(DiarioAcompanhamento diarioAcompanhamento){ 
        if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
        entityManager.persist(diarioAcompanhamento);
        entityManager.getTransaction().commit();    
    }
    
    public void edita(DiarioAcompanhamento diarioAcompanhamento){
        entityManager.merge(diarioAcompanhamento);
    }
    
    public List<DiarioAcompanhamento> listaTodos(){
        Query query = entityManager.createQuery("from DiarioAcompanhamento");
        List<DiarioAcompanhamento> lista = query.getResultList();
        return lista;
    }
    
    public void deleta(DiarioAcompanhamento diarioAcompanhamento){
         if (!entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().begin();
        }
        diarioAcompanhamento = entityManager.getReference(DiarioAcompanhamento.class, diarioAcompanhamento.getId());
        entityManager.remove(diarioAcompanhamento);
        entityManager.getTransaction().commit();
    }
    
    public DiarioAcompanhamento findById(DiarioAcompanhamento diarioAcompanhamento){
        return entityManager.find(DiarioAcompanhamento.class, diarioAcompanhamento.getId());
    }
    
}
