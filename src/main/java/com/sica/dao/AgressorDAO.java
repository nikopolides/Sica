/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.Agressor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Winstein
 */

@Component
public class AgressorDAO {
    
    private EntityManager manager;
    
    public AgressorDAO (EntityManager manager) {
        this.manager = manager;
    }
    
    public void adiciona(Agressor agressor) {
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.persist(agressor);
        manager.getTransaction().commit();
    }
    
    public void edita(Agressor agressor){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.merge(agressor);
        manager.getTransaction().commit();
    }
    
    public List<Agressor> listaTodos(Agressor agressor) {
        Query query = manager.createQuery("from Agressor agressor where idAbrigada = "+agressor.getIdAbrigada());
        List<Agressor> lista = query.getResultList();
        //manager.close();
        return lista;
    }
    
    public void deleta(Agressor agressor){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        agressor = manager.getReference(Agressor.class, agressor.getId());
        manager.remove(agressor);
        manager.getTransaction().commit();
    }
    
    public Agressor findById(Agressor agressor){
        return manager.find(Agressor.class, agressor.getId());
    }
}
