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
    
    public RelatorioPsicoSocialDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        //AnnotationConfiguration config = new AnnotationConfiguration();
       // config.addAnnotatedClass(Abrigada.class);
       // config.configure();
        //new SchemaExport(config).create(true, true); 
        em = Persistence.createEntityManagerFactory("default").createEntityManager();
        em.getTransaction().begin();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of adiciona method, of class RelatorioPsicoSocialDAO.
     */
    @Test
    public void testAdiciona() {
        System.out.println("adiciona");
        RelatorioPsicoSocial relatorioPsicoSocial = new RelatorioPsicoSocial();
        relatorioPsicoSocial.setDescricao("bla bla bla XPTO");
        relatorioPsicoSocial.setAtivo(true);
        RelatorioPsicoSocialDAO instance = new RelatorioPsicoSocialDAO(em);
        instance.adiciona(relatorioPsicoSocial);
        relatorioPsicoSocial.setId(1);
        assertNotNull(instance.findById(relatorioPsicoSocial));
        assertEquals(1,instance.findById(relatorioPsicoSocial).getId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class RelatorioPsicoSocialDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        RelatorioPsicoSocial relatorioPsicoSocial = new RelatorioPsicoSocial();
        RelatorioPsicoSocialDAO instance = new RelatorioPsicoSocialDAO(em);
        relatorioPsicoSocial.setDescricao("bla bla bla XPTO");
        relatorioPsicoSocial.setAtivo(true);
        relatorioPsicoSocial.setId(1);
        assertNotNull(instance.findById(relatorioPsicoSocial));
        assertEquals(1,instance.findById(relatorioPsicoSocial).getId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
