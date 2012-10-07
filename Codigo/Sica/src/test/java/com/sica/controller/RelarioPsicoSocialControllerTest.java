/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.controller;

import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.util.test.JSR303MockValidator;
import br.com.caelum.vraptor.util.test.MockResult;
import br.com.caelum.vraptor.util.test.MockValidator;
import br.com.caelum.vraptor.validator.AbstractValidator;
import br.com.caelum.vraptor.validator.DefaultValidator;
import com.sica.dao.AbrigadaDAO;
import com.sica.dao.RelatorioPsicoSocialDAO;
import com.sica.entity.Abrigada;
import com.sica.entity.RelatorioPsicoSocial;
import java.util.Iterator;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Tales
 */
/*public class RelarioPsicoSocialControllerTest {
    
    static EntityManager em;
    static RelatorioPsicoSocialController relatorioPsicoSocialController;
    static RelatorioPsicoSocialDAO relatorioPsicoSocialDao;
    static Result result;
    static Validator validator;
    static RelatorioPsicoSocial rpsResult;
    
    @Before
    public void inicializarTest() {
        result = new MockResult();
        validator = new MockValidator();
        em = Persistence.createEntityManagerFactory("default").createEntityManager();
        em.getTransaction().begin();
        relatorioPsicoSocialDao = new RelatorioPsicoSocialDAO(em);
        relatorioPsicoSocialController = new RelatorioPsicoSocialController(relatorioPsicoSocialDao, result, validator);
    }
    
    @Test
    public void infoTest() {
        Abrigada a = new Abrigada();
        Long idA = null;
        a.setNome("Maria");
        a.setRg("123456");
        AbrigadaDAO aDAO = new AbrigadaDAO(em);
        aDAO.adiciona(a);
        Iterator<Abrigada> iteratorAbrigadas = aDAO.listaTodos().iterator();
        Abrigada tempA;
        while(iteratorAbrigadas.hasNext()) {
            tempA = iteratorAbrigadas.next();
            if(tempA.getRg() == a.getRg()) {
                idA = tempA.getId();
                return;
            }
        }
        
        RelatorioPsicoSocial rps = new RelatorioPsicoSocial();
        rps.setDescricao("Vai bem obrigado.");
        rps.setIdAbrigada(idA);
        relatorioPsicoSocialDao.adiciona(rps);
        

        RelatorioPsicoSocial relatorioPsicoSocial = new RelatorioPsicoSocial();
        relatorioPsicoSocial.setId(idA);
        rpsResult = relatorioPsicoSocialController.info(relatorioPsicoSocial);
        
        Assert.assertNotNull(rpsResult);
        Assert.assertEquals(idA.longValue(), rpsResult.getIdAbrigada());
        Assert.assertEquals("Vai bem obrigado.", rpsResult.getDescricao());
        
        a.setId(idA);
        aDAO.deleta(a);
        //relatorioPsicoSocialDao.deleta(relatorioPsicoSocial); //TODO: descomentar quando existir metodo excluir!
    }
    
    
}*/
