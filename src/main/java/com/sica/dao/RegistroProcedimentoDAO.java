/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.RegistroProcedimento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author bryan
 */
@Component
public class RegistroProcedimentoDAO {
    private EntityManager manager;
    
    public RegistroProcedimentoDAO(EntityManager manager){
        this.manager = manager;
    }
    
    public void adiciona(RegistroProcedimento registroProcedimento) {
        registroProcedimento.setAtivo(true);
        manager.persist(registroProcedimento);
        manager.getTransaction().commit();
    }
    
    public List<RegistroProcedimento> listaTodos() {
        Query query = manager.createQuery("from RegistroProcedimento registroProcedimento where ativo=1");
        List<RegistroProcedimento> lista = query.getResultList();
        System.out.println("Resultado"+lista);
        //manager.close();
        return lista;
    }
    
    public void deleta(RegistroProcedimento registroProcedimento){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        registroProcedimento = manager.getReference(RegistroProcedimento.class, registroProcedimento.getId());
        manager.remove(registroProcedimento);
        manager.getTransaction().commit();
    }
    
    public RegistroProcedimento findById(RegistroProcedimento registroProcedimento) {
        return manager.find(RegistroProcedimento.class, registroProcedimento.getId());
    }
    
    public void edita(RegistroProcedimento registroProcedimento){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.merge(registroProcedimento);
        manager.getTransaction().commit();
        
    }
}