/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.AbrigadaServicoSocial;
import com.sica.entity.RegistroProcedimento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bryan
 */
@Component
public class AbrigadaServicoSocialDAO {
    private EntityManager manager;
    
    public AbrigadaServicoSocialDAO(EntityManager manager){
        this.manager = manager;
    }
    
    public void adiciona(AbrigadaServicoSocial abrigadaServicoSocial){
        manager.persist(abrigadaServicoSocial);
        //manager.getTransaction().commit();
    }
    
    public List<AbrigadaServicoSocial> listaTodos() {
        Query query = manager.createQuery("from AbrigadaServicoSocial abrigadaServicoSocial");
        List<AbrigadaServicoSocial> lista = query.getResultList();
        System.out.println("Resultado"+lista);
        manager.close();
        return lista;
    }
    
    public void deleta (AbrigadaServicoSocial abrigadaServicoSocial){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        abrigadaServicoSocial = manager.getReference(AbrigadaServicoSocial.class, abrigadaServicoSocial.getId());
        manager.remove(abrigadaServicoSocial);
        manager.getTransaction().commit();
    }
    
    public AbrigadaServicoSocial findById(AbrigadaServicoSocial abrigadaServicoSocial){
        return manager.find(AbrigadaServicoSocial.class, abrigadaServicoSocial.getId());
    }
    
    public void edita(AbrigadaServicoSocial abrigadaServicoSocial){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.merge(abrigadaServicoSocial);
        manager.getTransaction().commit();
    }

    
}
