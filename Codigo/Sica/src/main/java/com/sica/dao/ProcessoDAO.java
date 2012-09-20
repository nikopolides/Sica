/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.Abrigada;
import com.sica.entity.Processo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Kalil Mota
 */
@Component
public class ProcessoDAO {

    private EntityManager entityManager;
    
    public ProcessoDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    
    
    public void edita(Processo processo){
        entityManager.merge(processo);
        entityManager.getTransaction().commit();
    }
    
    public Processo findById(Processo processo){
        return entityManager.find(Processo.class, processo.getId());
    }
    public Abrigada findAbrigadaById(Long id){
        return entityManager.find(Abrigada.class, id);
    }
    public List<Processo> listaTodos(){
        Query query = entityManager.createQuery("from processos");
        List<Processo> lista = query.getResultList();
        entityManager.close();
        return lista;
    }
}
