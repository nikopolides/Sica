/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.AbrigadaPsicologia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Leonn Ferreira
 */
@Component
public class AbrigadaPsicologiaDAO {
    private EntityManager manager;
    
    public AbrigadaPsicologiaDAO(EntityManager manager){
        this.manager = manager;
    }
    
    public void adiciona(AbrigadaPsicologia abrigadaPsicologia){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.persist(abrigadaPsicologia);
        manager.getTransaction().commit();
    }
    
    public void edita(AbrigadaPsicologia abrigadaPsicologia ){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.merge(abrigadaPsicologia);
    }
    
    public List<AbrigadaPsicologia> listaTodos(AbrigadaPsicologia abrigadaPsicologia) {
        Query query = manager.createQuery("from AbrigadaPsicologia abrigadaPsicologia where idAbrigada = "+abrigadaPsicologia.getIdAbrigada());
        List<AbrigadaPsicologia> lista = query.getResultList();
        //manager.close();
        return lista;
    }
    
    
    public void deleta(AbrigadaPsicologia abrigadaPsicologia){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        abrigadaPsicologia = manager.getReference(AbrigadaPsicologia.class, abrigadaPsicologia.getId());
        manager.remove(abrigadaPsicologia);
        manager.getTransaction().commit();
    }
    public AbrigadaPsicologia findById(AbrigadaPsicologia abrigadaPsicologia){
        return manager.find(AbrigadaPsicologia.class, abrigadaPsicologia.getId());
    }
}
