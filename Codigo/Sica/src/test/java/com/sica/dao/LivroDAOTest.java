/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;


import com.sica.entity.Livro;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author sica
 */
public class LivroDAOTest {
    static EntityManager em;
    static Livro livro;
    static LivroDAO instance;
    
    public LivroDAOTest() {
    
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception{
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(Livro.class);
        config.configure();
        new SchemaExport(config).create(true, true);
        em = Persistence.createEntityManagerFactory("default").createEntityManager();
        em.getTransaction().begin();
        livro = new Livro(0,"Saconi","E o vento levou","Cotrim","1968");
        instance = new LivroDAO(em);
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception{
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
     * Test of adiciona method, of class LivroDAO.
     */
    @Test
    public void testAdiciona() {
        instance.adiciona(livro);
        livro.setId(1);
        assertNotNull(instance.findById(livro));
        assertEquals(1, instance.findById(livro).getId());
    }
    
    
}
