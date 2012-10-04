/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.entity;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author sica
 */
public class LivroTest {
    
    public LivroTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
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
     * Test of getEdicao method, of class Livro.
     */
    @Test
    public void testGetEdicao() {
        System.out.println("getEdicao");
        Livro instance = new Livro();
        String expResult = "Primeira";
        instance.setEdicao("Primeira");
        String result = instance.getEdicao();
        assertEquals(expResult, result);
         
        
    }

    /**
     * Test of setEdicao method, of class Livro.
     */
    @Test
    public void testSetEdicao() {
        System.out.println("setEdicao");
        String edicao = "";
        Livro instance = new Livro();
        instance.setEdicao(edicao);
        
        
    }

    /**
     * Test of getAutor method, of class Livro.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        Livro instance = new Livro();
        String expResult = "Autor";
        instance.setAutor("Autor");
        String result = instance.getAutor();
        assertEquals(expResult, result);
         
        
    }

    /**
     * Test of setAutor method, of class Livro.
     */
    @Test
    public void testSetAutor() {
        System.out.println("setAutor");
        String autor = "";
        Livro instance = new Livro();
        instance.setAutor(autor);
         
        
    }

    /**
     * Test of getEditora method, of class Livro.
     */
    @Test
    public void testGetEditora() {
        System.out.println("getEditora");
        Livro instance = new Livro();
        String expResult = "Editora";
        instance.setEditora("Editora");
        String result = instance.getEditora();
        assertEquals(expResult, result);
         
        
    }

    /**
     * Test of setEditora method, of class Livro.
     */
    @Test
    public void testSetEditora() {
        System.out.println("setEditora");
        String editora = "";
        Livro instance = new Livro();
        instance.setEditora(editora);
         
        
    }

    /**
     * Test of getId method, of class Livro.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Livro instance = new Livro();
        long expResult = 0L;
        instance.setId(0L);
        long result = instance.getId();
        assertEquals(expResult, result);
         
        
    }

    /**
     * Test of setId method, of class Livro.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Livro instance = new Livro();
        instance.setId(id);
         
        
    }

    /**
     * Test of getPublicacao method, of class Livro.
     */
    @Test
    public void testGetPublicacao() {
        System.out.println("getPublicacao");
        Livro instance = new Livro();
        String expResult = "Publicacao";
        instance.setPublicacao("Publicacao");
        String result = instance.getPublicacao();
        assertEquals(expResult, result);
         
        
    }

    /**
     * Test of setPublicacao method, of class Livro.
     */
    @Test
    public void testSetPublicacao() {
        System.out.println("setPublicacao");
        String publicacao = "";
        Livro instance = new Livro();
        instance.setPublicacao(publicacao);
         
        
    }

    /**
     * Test of getTitulo method, of class Livro.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Livro instance = new Livro();
        String expResult = "Titulo";
        instance.setTitulo("Titulo");
        String result = instance.getTitulo();
        assertEquals(expResult, result);
         
        
    }

    /**
     * Test of setTitulo method, of class Livro.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Livro instance = new Livro();
        instance.setTitulo(titulo);
         
        
    }

    /**
     * Test of toString method, of class Livro.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Livro instance = new Livro();
        String expResult = "Livro{id=0, editora=null, titulo=null, autor=null, publicacao=null}";
        
        String result = instance.toString();
        assertEquals(expResult, result);
         
        
    }
}
