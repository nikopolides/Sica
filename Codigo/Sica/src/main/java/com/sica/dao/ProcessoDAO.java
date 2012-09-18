/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.Abrigada;
import com.sica.entity.Processo;
import javax.persistence.EntityManager;

/**
 *
 * @author Acer
 */
@Component
public class ProcessoDAO {

    private EntityManager manager;

    public ProcessoDAO(EntityManager manager) {
        this.manager = manager;
        
    }
    
    public void edita(Processo processo){
        manager.merge(processo);
        manager.getTransaction().commit();
    }
    
    public Processo findById(Processo processo){
        return manager.find(Processo.class, processo.getId());
    }
    public Abrigada findAbrigadaById(Long id){
        return manager.find(Abrigada.class, id);
    }
}
