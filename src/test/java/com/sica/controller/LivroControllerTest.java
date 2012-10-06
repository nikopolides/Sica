/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.controller;

import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.util.test.MockResult;
import com.sica.entity.Livro;
import com.sica.dao.LivroDAO;
import com.sica.controller.LivroController;
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
 


public class LivroControllerTest {
  
    static Livro livro;
    static LivroDAO livroDAO;
    static EntityManager entityManager;
    static LivroController livroController;
    static Result result;
 //   static Validator validator;
 
    public LivroControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(Livro.class);
        config.configure();
        new SchemaExport(config).create(true, true);
        entityManager = Persistence.createEntityManagerFactory("default").createEntityManager();
        entityManager.getTransaction().begin();
        livro = new Livro(0,"Livro Controller","Livro Controller","Livro Controller","Livro Controller 1968","Livro Controller");
        livroDAO = new LivroDAO(entityManager); 
        result=new MockResult();
        livroController=new LivroController(result, livroDAO);   
    }

    @Before
    public void setUp(){
        if(!entityManager.getTransaction().isActive())
            entityManager.getTransaction().begin();
    }
    
    /*
     * Test of adiciona method, of class LivroController.
     */
    
    
    @Test
    public void testAdiciona() {
     livroController.adiciona(livro);
     livro.setId(1);
     assertNotNull(livroDAO.findById(livro));
     assertEquals(1,livroDAO.findById(livro).getId());
    } 
    
    /**
     * Test of lista method, of class LivroController.
     */
    
    /*
    @Test
    public void testLista() {
        assertNotNull(livroController.lista());
    } 
    
    @Test
    public void testListaAutor() {
       assertNotNull(livroController.listaAutor());
    } */
   
     /**
     * Test of edita method, of class LivroController.
     */
    
    @Test
    public void testEdita() {
        livro.setAutor("Pedro");
        livroController.edita(livro);
        assertEquals("Pedro", livroDAO.findById(livro).getAutor()); 
    }
 
    /**
    * Test of atualizar method, of class LivroController.
    */
    @Test
    public void testAtualizar() {
       livro.setTitulo("livro");
       livroController.atualizar(livro);
       assertEquals("livro", livroDAO.findById(livro).getTitulo());
    }
    
    /**
     * Test of deleta method, of class LivroController.
     */
    
    @Test
    public void testDeleta() {
       livro.setId(1);
       livroController.deleta(livro);
       assertNull(livroDAO.findById(livro));
    } 
    
    @Test
    public void testMetodoInfo(){
        Livro livroL = new Livro();
        Livro livroM = new Livro();
        livroController.adiciona(livroL);
        livroController.adiciona(livroM);
        assertNotNull(livroController.info(livroM));
        assertEquals(3, livroController.info(livroM).getId());
    }
}
