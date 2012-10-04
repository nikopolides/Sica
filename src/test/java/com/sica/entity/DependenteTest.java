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
public class DependenteTest {
    
    public DependenteTest() {
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
     * Test of getId method, of class Dependente.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Dependente instance = new Dependente();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setId method, of class Dependente.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Dependente instance = new Dependente();
        instance.setId(id);
        
        
    }

    /**
     * Test of getIdAbrigada method, of class Dependente.
     */
    @Test
    public void testGetIdAbrigada() {
        System.out.println("getIdAbrigada");
        Dependente instance = new Dependente();
        long expResult = 0L;
        instance.setIdAbrigada(0L);
        long result = instance.getIdAbrigada();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setIdAbrigada method, of class Dependente.
     */
    @Test
    public void testSetIdAbrigada() {
        System.out.println("setIdAbrigada");
        long idAbrigada = 0L;
        Dependente instance = new Dependente();
        instance.setIdAbrigada(idAbrigada);
        
        
    }

    /**
     * Test of getIdade method, of class Dependente.
     */
    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        Dependente instance = new Dependente();
        int expResult = 0;
        instance.setIdade(0);
        int result = instance.getIdade();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setIdade method, of class Dependente.
     */
    @Test
    public void testSetIdade() {
        System.out.println("setIdade");
        int idade = 0;
        Dependente instance = new Dependente();
        instance.setIdade(idade);
        
        
    }

    /**
     * Test of getNome method, of class Dependente.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Dependente instance = new Dependente();
        String expResult = "nome valido";
        instance.setNome("nome valido");
        String result = instance.getNome();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setNome method, of class Dependente.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Dependente instance = new Dependente();
        instance.setNome(nome);
        
        
    }

    /**
     * Test of getSexo method, of class Dependente.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Dependente instance = new Dependente();
        String expResult = "sexo valido";
        instance.setSexo("sexo valido");
        String result = instance.getSexo();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setSexo method, of class Dependente.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Dependente instance = new Dependente();
        instance.setSexo(sexo);
        
        
    }

    /**
     * Test of toString method, of class Dependente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Dependente instance = new Dependente();
        String expResult = "Dependente{id=0, nome=null, idade=0, sexo=null, idAbrigada=0}";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        
    }
}
