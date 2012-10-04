/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.DependentePedagogia;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;

/**
 *
 * @author sica
 */
@Component
public class DependentePedagogiaDAO {
    private EntityManager manager;
    
    public DependentePedagogiaDAO(EntityManager entity){
        this.manager = entity;
    }
    
    public void adiciona(DependentePedagogia dependente){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }
        manager.persist(dependente);
        //manager.getTransaction().commit();
    }
    
    public void edita(DependentePedagogia dependentePedagogia){
        if(!manager.getTransaction().isActive()){
            manager.getTransaction().begin();
        }        
        
        manager.merge(dependentePedagogia);
        manager.getTransaction().commit();   
    }
    
    public List<DependentePedagogia>listaTodos(){
        Query query = manager.createQuery("from DependentePedagogia");
        List <DependentePedagogia>lista=query.getResultList();
        //manager.close();
        return lista;
    }
    
    public DependentePedagogia findById(DependentePedagogia dependente){
        return manager.find(DependentePedagogia.class, dependente.getIdDependente());
    }
    
    public List<DependentePedagogia> findByName(String nomePesquisado){
        Query query = manager.createQuery("from DependentePedagogia where nome like '%"+nomePesquisado+"%'");
        List <DependentePedagogia>lista=query.getResultList();
        
        
        return lista;
        
    }
    
} //realmente precisa desse dependentePedagogia como parametro? ele não ta fazendo nada aí nao sei
//precisa ele vai pegar os dados dai nao? //não, ele usa o método listaTodos pra trazer todos os dependentes
//daew percorre eles pra ver quais tem 1 nome igual ao pesquisado
//e retorna essa lista de  // aaaaa entao nao precisa dele


