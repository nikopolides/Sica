/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;


import com.sica.entity.Livro;
import java.util.List;
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
        livro = new Livro(0,"Saconi","E o vento levou","Cotrim","1968","Primeira Edição");
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

    @Test
    public void testEdita(){     
        livro.setTitulo("livro");
        livro.setAutor("Sheldon");
        livro.setEditora("Saraiva");
        livro.setId(1);
        livro.setPublicacao("2012");
        instance.edita(livro);
        assertNotNull(instance.findById(livro));
        assertEquals("livro", instance.findById(livro).getTitulo());
        assertEquals("Sheldon", instance.findById(livro).getAutor());
        assertEquals("Saraiva", instance.findById(livro).getEditora());
        assertEquals("2012", instance.findById(livro).getPublicacao());
        assertEquals(1, instance.findById(livro).getId());
    
    }

    @Test
    public void testListarLivro(){
        List result = instance.listaTodos();
        assertNotNull(result);
        
    }
    
     @Test
    public void testListarLivroAutor(){
        List result = instance.listaAutor();
        assertNotNull(result);
        
    }
    
    @Test
    public void testDeleta(){
        livro.setId(1);
        instance.deleta(livro);
        assertNull(instance.findById(livro));
    }
    
        
}
