/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.AcompanhamentoAbrigada;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Victor Hugo
 */
@Component
public class AcompanhamentoAbrigadaDAO {
    private EntityManager manager;
    
    public AcompanhamentoAbrigadaDAO(EntityManager manager){
        this.manager = manager;
    }
    
    public void adiciona(AcompanhamentoAbrigada acompanhamentoAbrigada){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.persist(acompanhamentoAbrigada);
        manager.getTransaction().commit();
    }
    
    public void edita(AcompanhamentoAbrigada acompanhamentoAbrigada){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.merge(acompanhamentoAbrigada);
        manager.getTransaction().commit();
    }
    
    public List<AcompanhamentoAbrigada> listaTodos(AcompanhamentoAbrigada acompanhamentoAbrigada) {
        Query query = manager.createQuery("from AcompanhamentoAbrigada acompanhamentoAbrigada where idAbrigada = "+acompanhamentoAbrigada.getIdAbrigada());
        List<AcompanhamentoAbrigada> lista = query.getResultList();
        //manager.close();
        return lista;
    }
    
    public AcompanhamentoAbrigada findById(AcompanhamentoAbrigada acompanhamentoAbrigada){
        return manager.find(AcompanhamentoAbrigada.class, acompanhamentoAbrigada.getId());
    }
}
