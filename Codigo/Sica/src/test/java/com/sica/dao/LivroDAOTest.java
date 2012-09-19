/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import com.sica.entity.Livro;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.*;

/**
 *
 * @author sica
 */
public class LivroDAOTest {
    static EntityManager em;
    
    public LivroDAOTest() {
    }
    
    @BeforeClass
    public void setUp() {
        em = Persistence.createEntityManagerFactory("default").createEntityManager();
        em.getTransaction().begin();    
    }
    
    @AfterClass
    public void tearDown() {
    }

    /**
     * Test of adiciona method, of class LivroDAO.
     */
    @Test
    public void testAdiciona() {
        Livro livro = new Livro();
        livro.setTitulo("E o vento Levou");
        livro.setAutor("Cotrim");
        livro.setEditora("Nas alturas");
        livro.setPublicacao("1988");
        LivroDAO dao = new LivroDAO(em);
        dao.adiciona(livro);
    }
    
    
}
