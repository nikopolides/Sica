/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.Dependente;
import com.sica.entity.ProcessoDependente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author João Guilherme
 */
@Component
public class ProcessoDependenteDAO {

    private EntityManager entityManager;

    public ProcessoDependenteDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void edita(ProcessoDependente processoDependente) {
        entityManager.merge(processoDependente);
        entityManager.getTransaction().commit();
    }

    public ProcessoDependente findById(ProcessoDependente processoDependente) {
        return entityManager.find(ProcessoDependente.class, processoDependente.getId());
    }

    public Dependente findDependenteById(Long id) {
        return entityManager.find(Dependente.class, id);
    }

    public List<ProcessoDependente> listaTodos() {
        Query query = entityManager.createQuery("from processos");
        List<ProcessoDependente> lista = query.getResultList();
        entityManager.close();
        return lista;
    }
}
