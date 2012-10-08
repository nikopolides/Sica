/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.QuantidadeAbrigamentos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Winstein
 */

@Component
public class QuantidadeAbrigamentosDAO {
    
    private EntityManager manager;

    public QuantidadeAbrigamentosDAO(EntityManager manager) {
        this.manager = manager;
    }    
    
    public void adiciona(QuantidadeAbrigamentos qtde) {
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.persist(qtde);
        manager.getTransaction().commit();
    }
    
    public void edita(QuantidadeAbrigamentos qtde) {
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.merge(qtde);
        manager.getTransaction().commit();
    }
    
    public List<QuantidadeAbrigamentos> listaTodos(QuantidadeAbrigamentos qtde) {
        Query query = manager.createQuery("from QuantidadeAbrigamentos qtde where idAbrigada = "+qtde.getIdAbrigada());
        List<QuantidadeAbrigamentos> lista = query.getResultList();
        //manager.close();
        return lista;
    }
    
    public QuantidadeAbrigamentos findById(QuantidadeAbrigamentos qtde) {
        return manager.find(QuantidadeAbrigamentos.class, qtde.getId());
    }
}
