
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.Nafavd;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Matheus Fonseca
 */

@Component
public class NafavdDAO {
    private EntityManager manager;
    
    public NafavdDAO(EntityManager manager){
        this.manager = manager;
    }
    
    public void adiciona(Nafavd nafavd){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.persist(nafavd);
        manager.getTransaction().commit();
    }
    
    public void edita(Nafavd nafavd){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.merge(nafavd);
        manager.getTransaction().commit();
    }
    
    public List<Nafavd> listaTodos() {
        Query query = manager.createQuery("from Nafavd");
        List<Nafavd> lista = query.getResultList();
       // manager.close();
        return lista;
    }
    
    public void deleta(Nafavd nafavd){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        nafavd = manager.getReference(Nafavd.class, nafavd.getId());
        manager.remove(nafavd);
        manager.getTransaction().commit();
    }
    
    public Nafavd findById(Nafavd nafavd){
        return manager.find(Nafavd.class, nafavd.getId());
    }
}
