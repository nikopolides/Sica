/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.Abrigada;
import com.sica.entity.ProcessoAbrigada;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Kalil Mota
 */
@Component
public class ProcessoAbrigadaDAO {

    private EntityManager entityManager;

    public ProcessoAbrigadaDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void edita(ProcessoAbrigada processoAbrigada) {
        entityManager.merge(processoAbrigada);
        entityManager.getTransaction().commit();
    }

    public ProcessoAbrigada findById(ProcessoAbrigada processoAbrigada) {
        return entityManager.find(ProcessoAbrigada.class, processoAbrigada.getId());
    }

    public Abrigada findAbrigadaById(Long id) {
        return entityManager.find(Abrigada.class, id);
    }

    public List<ProcessoAbrigada> listaTodos() {
        Query query = entityManager.createQuery("from processos");
        List<ProcessoAbrigada> lista = query.getResultList();
        entityManager.close();
        return lista;
    }
}
