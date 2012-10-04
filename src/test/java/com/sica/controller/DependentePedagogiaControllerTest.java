/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.controller;

import br.com.caelum.vraptor.util.test.MockResult;
import com.sica.dao.DependentePedagogiaDAO;
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
public class DependentePedagogiaControllerTest {
    
    static DependentePedagogia dependente;
    static DependentePedagogiaDAO instance;
    static DependentePedagogiaController controller;
    static EntityManager entityManager;
    static MockResult result;
    //static Validator validator;
    
    public DependentePedagogiaControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
         AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(DependentePedagogia.class);
        config.configure();
        new SchemaExport(config).create(true, true);
        entityManager = Persistence.createEntityManagerFactory("default").createEntityManager();
        entityManager.getTransaction().begin();
        dependente = new DependentePedagogia(0, "prontuario", "24/04/2012", Long.parseLong("1"), "Ale", true, true, "Cotrim", "22", "M", "05/06/1990", "Certidao de Nascimento", "6", true,"Escola MAtriculados","Pq não matriculado", true, true, true, "visual", "não", false, "", "", "nao", "", "não", "nenhum", "não","nenhum", "n boletim 101020203030", "Policia", "Violencia Sofrida",
                true,"qual forma fisica","Lesao","IMLFisica",
                true,"qual Forma sexual","Encaminhamento iml sexual",
                true,"qual forma patrimonial", 
                true,"qual forma moral",
                true,"qual forma psicologica",
                "nome Agressor", "relacao depdente agressor", true, true, "", "", "", "", true, true, ""); 
        instance = new DependentePedagogiaDAO(entityManager);
        result = new MockResult();
        controller = new DependentePedagogiaController(instance,result);

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        if(!entityManager.getTransaction().isActive())
            entityManager.getTransaction().begin();        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of adiciona method, of class DependentePedagogiaController.
     */
    @Test
    public void testAdiciona() {
        //instance.adiciona(dependente);
        //dependente = new DependentePedagogia();
        dependente.setIdAbrigada(1);
        //dependente.setIdDependente(2);
        controller.adiciona(dependente);
        assertNotNull(instance.findById(dependente));
        assertEquals(1, instance.findById(dependente).getIdDependente());
    }
    
    
    @Test
    public void testEdita() {
      //  dependente = new DependentePedagogia();
       // dependente.setIdAbrigada(1);
       // dependente.setIdDependente(2);
        controller.adiciona(dependente);
        dependente.setIdade("30");
        controller.edita(dependente);
        assertEquals("30", instance.findById(dependente).getIdade());
    }
    
    
//    @Test
//    public void testResultado(){
//        List <DependentePedagogia>resultado = controller.resultado("Cotrim");
//        assertNotNull(resultado);
//        assertEquals("Cotrim", resultado.get(0).getNome());        
//    }
        
//    @Test
//    public void testResultadoVazia() {
//        List <DependentePedagogia>resultado = controller.resultado("Vazio");
//        assertNotNull(resultado);
//        assertTrue(resultado.isEmpty()); 
//    }
    
    @Test
    public void testAtualizar() {
       // entityManager.getTransaction().begin();
        controller.adiciona(dependente);
        dependente.setIdade("22");
        controller.atualizar(dependente);
        assertEquals("22",instance.findById(dependente).getIdade());
    }
    
    @Test
    public void testListarTodos(){
        List <DependentePedagogia>resultado = controller.lista();
        assertNotNull(resultado);
    }
    
    @Test
    public void testVisualizar(){
        assertNotNull(controller.visualiza(dependente));
    }
    
    @Test
    public void testMetodoInfo(){
        DependentePedagogia dependenteP = new DependentePedagogia();
        controller.adiciona(dependenteP);
        assertNotNull(controller.info(dependenteP));
        assertEquals(2, controller.info(dependenteP).getIdDependente());
    }
}
