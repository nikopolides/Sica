/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.DependenteServicoSocial;
import com.sica.entity.RegistroProcedimento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bryan
 */
public class DependenteServicoSocialDAO {
    private EntityManager manager;
    
    public DependenteServicoSocialDAO(EntityManager manager){
        this.manager = manager;
    }
    
    public void adiciona(DependenteServicoSocial dependenteServicoSocial){
        manager.persist(dependenteServicoSocial);
        manager.getTransaction().commit();
    }
    
    public List<DependenteServicoSocial> listaTodos(){
        Query query = manager.createQuery("from DependenteServicoSocial dependenteServicoSocial");
        List<DependenteServicoSocial> lista = query.getResultList();
        System.out.println("Resultado "+lista);
        return lista;
    }
    
    public void deleta (DependenteServicoSocial dependenteServicoSocial){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        dependenteServicoSocial = manager.getReference(DependenteServicoSocial.class, dependenteServicoSocial.getId());
        manager.remove(dependenteServicoSocial);
        manager.getTransaction().commit();
    }
    
    public DependenteServicoSocial findById(DependenteServicoSocial dependenteServicoSocial){
        return manager.find(DependenteServicoSocial.class, dependenteServicoSocial.getId());
    }
    
    public void edita(DependenteServicoSocial dependenteServicoSocial){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.merge(dependenteServicoSocial);
        manager.getTransaction().commit();
    }

}
