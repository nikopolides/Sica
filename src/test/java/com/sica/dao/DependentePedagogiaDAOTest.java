/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import com.sica.entity.DependentePedagogia;
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
public class DependentePedagogiaDAOTest {
    static EntityManager em;
    static DependentePedagogia dependente;
    static DependentePedagogiaDAO instance;
    
    public DependentePedagogiaDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
         AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(DependentePedagogia.class);
        config.configure();
        new SchemaExport(config).create(true, true);
        em = Persistence.createEntityManagerFactory("default").createEntityManager();
        em.getTransaction().begin();
        dependente = new DependentePedagogia(0, "prontuario", "24/04/2012", Long.parseLong("1"), "Ale", true, true, "Cotrim", "22", "M", "05/06/1990", "Certidao de Nascimento", "6", true,"Escola MAtriculados","Pq não matriculado", true, true, true, "visual", "não", false, "", "", "nao", "", "não", "nenhum", "não", "nehum", "n boletim 101020203030", "Policia", "Violencia Sofrida",
                true,"qual forma fisica","Lesao","IMLFisica",
                true,"qual Forma sexual","Encaminhamento iml sexual",
                true,"qual forma patrimonial", 
                true,"qual forma moral",
                true,"qual forma psicologica",
                "nome Agressor", "relacao depdente agressor", true, true, "", "", "", "", true, true, "");
        instance = new DependentePedagogiaDAO(em);
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
     * Test of adiciona method, of class DependentePedagogiaDAO.
     */
    @Test
    public void testAdiciona() {
        instance.adiciona(dependente);
        dependente.setIdDependente(1);
        assertNotNull(instance.findById(dependente));
        assertEquals(1, instance.findById(dependente).getIdDependente());
        
    }
    
    /**
     * Test of edita method, of class DependentePedagogiaDAO.
     */
    @Test
    public void testEdita() {
        Assert.assertNotSame("45",instance.findById(dependente).getIdade());
        dependente.setIdade("45");
        dependente.setDataAdmissao("01/05/2012");
        dependente.setDataNascimento("05/06/2001");
        instance.edita(dependente);
        assertNotNull(instance.findById(dependente));
        assertEquals("45",instance.findById(dependente).getIdade());
        assertEquals("01/05/2012", instance.findById(dependente).getDataAdmissao());
        assertEquals("05/06/2001", instance.findById(dependente).getDataNascimento());
        // TODO review the generated test code and remove the default call to fail.        
    }
    
    /**
     * Test of listaTodos method, of class DependentePedagogiaDAO.
     */
    @Test
    public void testListaTodos() {
        List result = instance.listaTodos();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testPesquisaDependentePorNome(){
        List <DependentePedagogia>result = instance.findByName("Cotrim");
        System.out.println(result.size());
        assertNotNull(result);
        assertEquals("Cotrim", result.get(0).getNome());
    }
    
    @Test
    public void testPesquisaDependentePorNomeNaoExistente() {
        List<DependentePedagogia>resultado = instance.findByName("Não existe");
        assertNotNull(resultado);
        assertTrue(resultado.isEmpty());
    }
}
