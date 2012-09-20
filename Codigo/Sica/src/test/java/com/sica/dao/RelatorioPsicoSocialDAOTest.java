/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import com.sica.entity.RelatorioPsicoSocial;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author athos
 */
public class RelatorioPsicoSocialDAOTest {
    static EntityManager em;
    static RelatorioPsicoSocial relatorioPsicoSocial;
    static RelatorioPsicoSocialDAO instance;
    
    public RelatorioPsicoSocialDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(RelatorioPsicoSocial.class);
        config.configure();
        new SchemaExport(config).create(true, true); 
        em = Persistence.createEntityManagerFactory("default").createEntityManager();
        em.getTransaction().begin();
        relatorioPsicoSocial = new RelatorioPsicoSocial(0, "bla bla bla xpto", Long.parseLong("1"));
        instance = new RelatorioPsicoSocialDAO(em);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
          if(!em.getTransaction().isActive())
              em.getTransaction().begin();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of adiciona method, of class RelatorioPsicoSocialDAO.
     */
    @Test
    public void testAdiciona() {
        instance.adiciona(relatorioPsicoSocial);
        relatorioPsicoSocial.setId(1);
        assertNotNull(instance.findById(relatorioPsicoSocial));
        assertEquals(1,instance.findById(relatorioPsicoSocial).getId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of listaTodos method, of class RelatorioPsicoSocialDAO.
     */
    @Test
    public void testListaTodos() {
        List result = instance.listaTodos(relatorioPsicoSocial);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of findById method, of class RelatorioPsicoSocialDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        relatorioPsicoSocial.setId(1);
        RelatorioPsicoSocial result = instance.findById(relatorioPsicoSocial);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
