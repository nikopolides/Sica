/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.RelatorioEncaminhamentoNafavd;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Matheus Fonseca
 */

@Component
public class RelatorioEncaminhamentoNafavdDAO {
    private EntityManager manager;

    public RelatorioEncaminhamentoNafavdDAO(EntityManager manager){
        this.manager = manager;
    }
    
    public void adiciona(RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd) {
        manager.persist(relatorioEncaminhamentoNafavd);
        manager.getTransaction().commit();
    }
    public RelatorioEncaminhamentoNafavd findById(RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd) {
        return manager.find(RelatorioEncaminhamentoNafavd.class, relatorioEncaminhamentoNafavd.getId());
    }
    
    /*
    public List<RelatorioEncaminhamentoNafavd> listaTodos() {
        Query query = manager.createQuery("from RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd");
        List<RelatorioEncaminhamentoNafavd> lista = query.getResultList();
        //manager.close();
        return lista;
    }*/
    
    public List<RelatorioEncaminhamentoNafavd> listaTodosAbrigada(RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd) {
        Query query = manager.createQuery("from RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd where idAbrigada="+relatorioEncaminhamentoNafavd.getIdAbrigada());
        List<RelatorioEncaminhamentoNafavd> lista = query.getResultList();
        //manager.close();
        return lista;
    }
    
     public void edita(RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd){
        manager.merge(relatorioEncaminhamentoNafavd);
        manager.getTransaction().commit();
    }

    public void deleta(RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd) {
        relatorioEncaminhamentoNafavd = manager.getReference(RelatorioEncaminhamentoNafavd.class, relatorioEncaminhamentoNafavd.getId());
        manager.remove(relatorioEncaminhamentoNafavd);
        manager.getTransaction().commit();
    }
}