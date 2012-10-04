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
public class DependentePedagogiaTest {
    
    public DependentePedagogiaTest() {
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
     * Test of getPortadorNecessidadeEspeciaisSim method, of class DependentePedagogia.
     */
    @Test
    public void testGetPortadorNecessidadeEspeciaisSim() {
        
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Ha necessidade";
        instance.setPortadorNecessidadeEspeciaisSim("Ha necessidade");
        String result = instance.getPortadorNecessidadeEspeciaisSim();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPortadorNecessidadeEspeciaisSim method, of class DependentePedagogia.
     */
    @Test
    public void testSetPortadorNecessidadeEspeciaisSim() {
        System.out.println("setPortadorNecessidadeEspeciaisSim");
        String portadorNecessidadeEspeciaisSim = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setPortadorNecessidadeEspeciaisSim(portadorNecessidadeEspeciaisSim);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMedicamentoControlado method, of class DependentePedagogia.
     */
    @Test
    public void testGetMedicamentoControlado() {
        System.out.println("getMedicamentoControlado");
        DependentePedagogia instance = new DependentePedagogia();
        
        String expResult = "medicamento";
        instance.setMedicamentoControlado("medicamento");
        String result = instance.getMedicamentoControlado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMedicamentoControlado method, of class DependentePedagogia.
     */
    @Test
    public void testSetMedicamentoControlado() {
        System.out.println("setMedicamentoControlado");
        String medicamentoControlado = "medicamento";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setMedicamentoControlado(medicamentoControlado);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isNecessitaAcompanhamento method, of class DependentePedagogia.
     */
    @Test
    public void testIsNecessitaAcompanhamento() {
        System.out.println("isNecessitaAcompanhamento");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isNecessitaAcompanhamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isNecessitaAcompanhamentoPsicologico method, of class DependentePedagogia.
     */
    @Test
    public void testIsNecessitaAcompanhamentoPsicologico() {
        System.out.println("isNecessitaAcompanhamentoPsicologico");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isNecessitaAcompanhamentoPsicologico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNecessitaAcompanhamentoPsicologico method, of class DependentePedagogia.
     */
    @Test
    public void testSetNecessitaAcompanhamentoPsicologico() {
        System.out.println("setNecessitaAcompanhamentoPsicologico");
        boolean necessitaAcompanhamentoPsicologico = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setNecessitaAcompanhamentoPsicologico(necessitaAcompanhamentoPsicologico);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNecessitaAcompanhamento method, of class DependentePedagogia.
     */
    @Test
    public void testSetNecessitaAcompanhamento() {
        System.out.println("setNecessitaAcompanhamento");
        boolean necessitaAcompanhamento = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setNecessitaAcompanhamento(necessitaAcompanhamento);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getObservacaoPosDesligamento method, of class DependentePedagogia.
     */
    @Test
    public void testGetObservacaoPosDesligamento() {
        System.out.println("getObservacaoPosDesligamento");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "desligada";
        instance.setObservacaoPosDesligamento("desligada");
        String result = instance.getObservacaoPosDesligamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setObservacaoPosDesligamento method, of class DependentePedagogia.
     */
    @Test
    public void testSetObservacaoPosDesligamento() {
        System.out.println("setObservacaoPosDesligamento");
        String observacaoPosDesligamento = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setObservacaoPosDesligamento(observacaoPosDesligamento);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getIdAbrigada method, of class DependentePedagogia.
     */
    @Test
    public void testGetIdAbrigada() {
        System.out.println("getIdAbrigada");
        DependentePedagogia instance = new DependentePedagogia();
        long expResult = 0L;
        long result = instance.getIdAbrigada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setIdAbrigada method, of class DependentePedagogia.
     */
    @Test
    public void testSetIdAbrigada() {
        System.out.println("setIdAbrigada");
        long idAbrigada = 0L;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setIdAbrigada(idAbrigada);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getIdDependente method, of class DependentePedagogia.
     */
    @Test
    public void testGetIdDependente() {
        System.out.println("getIdDependente");
        DependentePedagogia instance = new DependentePedagogia();
        long expResult = 0L;
        long result = instance.getIdDependente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setIdDependente method, of class DependentePedagogia.
     */
    @Test
    public void testSetIdDependente() {
        System.out.println("setIdDependente");
        long idDependente = 0L;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setIdDependente(idDependente);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDataAdmissao method, of class DependentePedagogia.
     */
    @Test
    public void testGetDataAdmissao() {
        System.out.println("getDataAdmissao");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "05/06/2000";
        instance.setDataAdmissao("05/06/2000");
        String result = instance.getDataAdmissao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDataAdmissao method, of class DependentePedagogia.
     */
    @Test
    public void testSetDataAdmissao() {
        System.out.println("setDataAdmissao");
        String dataAdmissao = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setDataAdmissao(dataAdmissao);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isApresentaDefasagemEscolar method, of class DependentePedagogia.
     */
    @Test
    public void testIsApresentaDefasagemEscolar() {
        System.out.println("isApresentaDefasagemEscolar");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isApresentaDefasagemEscolar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setApresentaDefasagemEscolar method, of class DependentePedagogia.
     */
    @Test
    public void testSetApresentaDefasagemEscolar() {
        System.out.println("setApresentaDefasagemEscolar");
        boolean apresentaDefasagemEscolar = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setApresentaDefasagemEscolar(apresentaDefasagemEscolar);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isApresentaDeficuldadeAprendizagem method, of class DependentePedagogia.
     */
    @Test
    public void testIsApresentaDeficuldadeAprendizagem() {
        System.out.println("isApresentaDeficuldadeAprendizagem");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isApresentaDeficuldadeAprendizagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setApresentaDeficuldadeAprendizagem method, of class DependentePedagogia.
     */
    @Test
    public void testSetApresentaDeficuldadeAprendizagem() {
        System.out.println("setApresentaDeficuldadeAprendizagem");
        boolean apresentaDeficuldadeAprendizagem = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setApresentaDeficuldadeAprendizagem(apresentaDeficuldadeAprendizagem);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDataNascimento method, of class DependentePedagogia.
     */
    @Test
    public void testGetDataNascimento() {
        System.out.println("getDataNascimento");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "05/06/1990";
        instance.setDataNascimento("05/06/1990");
        String result = instance.getDataNascimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDataNascimento method, of class DependentePedagogia.
     */
    @Test
    public void testSetDataNascimento() {
        System.out.println("setDataNascimento");
        String dataNascimento = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setDataNascimento(dataNascimento);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDesligamento method, of class DependentePedagogia.
     */
    @Test
    public void testGetDesligamento() {
        System.out.println("getDesligamento");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.getDesligamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDesligamento method, of class DependentePedagogia.
     */
    @Test
    public void testSetDesligamento() {
        System.out.println("setDesligamento");
        boolean desligamento = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setDesligamento(desligamento);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDocumentosPessoais method, of class DependentePedagogia.
     */
    @Test
    public void testGetDocumentosPessoais() {
        System.out.println("getDocumentosPessoais");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "documentos";
        instance.setDocumentosPessoais("documentos");
        String result = instance.getDocumentosPessoais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDocumentosPessoais method, of class DependentePedagogia.
     */
    @Test
    public void testSetDocumentosPessoais() {
        System.out.println("setDocumentosPessoais");
        String documentosPessoais = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setDocumentosPessoais(documentosPessoais);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getFrequenciaUsoDrogas method, of class DependentePedagogia.
     */
    @Test
    public void testGetFrequenciaUsoDrogas() {
        System.out.println("getFrequenciaUsoDrogas");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "2 vezes ao dia";
        instance.setFrequenciaUsoDrogas("2 vezes ao dia");
        String result = instance.getFrequenciaUsoDrogas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setFrequenciaUsoDrogas method, of class DependentePedagogia.
     */
    @Test
    public void testSetFrequenciaUsoDrogas() {
        System.out.println("setFrequenciaUsoDrogas");
        String frequenciaUsoDrogas = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setFrequenciaUsoDrogas(frequenciaUsoDrogas);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getHistoricoAcompanhamentoPsiquiatrico method, of class DependentePedagogia.
     */
    @Test
    public void testGetHistoricoAcompanhamentoPsiquiatrico() {
        System.out.println("getHistoricoAcompanhamentoPsiquiatrico");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Era uma vez";
        instance.setHistoricoAcompanhamentoPsiquiatrico("Era uma vez");
        String result = instance.getHistoricoAcompanhamentoPsiquiatrico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHistoricoAcompanhamentoPsiquiatrico method, of class DependentePedagogia.
     */
    @Test
    public void testSetHistoricoAcompanhamentoPsiquiatrico() {
        System.out.println("setHistoricoAcompanhamentoPsiquiatrico");
        String historicoAcompanhamentoPsiquiatrico = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setHistoricoAcompanhamentoPsiquiatrico(historicoAcompanhamentoPsiquiatrico);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getIdade method, of class DependentePedagogia.
     */
    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "15";
        instance.setIdade("15");
        String result = instance.getIdade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setIdade method, of class DependentePedagogia.
     */
    @Test
    public void testSetIdade() {
        System.out.println("setIdade");
        String idade = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setIdade(idade);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getLesaoAparente method, of class DependentePedagogia.
     */
    @Test
    public void testGetLesaoAparente() {
        
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "fratura exposta";
        instance.setLesaoAparente("fratura exposta");
        String result = instance.getLesaoAparente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setLesaoAparente method, of class DependentePedagogia.
     */
    @Test
    public void testSetLesaoAparente() {
        String lesaoAparente = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setLesaoAparente(lesaoAparente);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMatriculado method, of class DependentePedagogia.
     */
    @Test
    public void testGetMatriculado() {
        System.out.println("getMatriculado");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.getMatriculado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isMatriculado method, of class DependentePedagogia.
     */
    @Test
    public void testIsMatriculado_boolean() {
        System.out.println("isMatriculado");
        boolean matriculado = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.isMatriculado(matriculado);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMedicacaoControlada method, of class DependentePedagogia.
     */
    @Test
    public void testGetMedicacaoControlada() {
        System.out.println("getMedicacaoControlada");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Trileptal";
        instance.setMedicacaoControlada("Trileptal");
        String result = instance.getMedicacaoControlada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMedicacaoControlada method, of class DependentePedagogia.
     */
    @Test
    public void testSetMedicacaoControlada() {
        System.out.println("setMedicacaoControlada");
        String medicacaoControlada = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setMedicacaoControlada(medicacaoControlada);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMedicamentoAlergico method, of class DependentePedagogia.
     */
    @Test
    public void testGetMedicamentoAlergico() {
        System.out.println("getMedicamentoAlergico");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Nenhum";
        instance.setMedicamentoAlergico("Nenhum");
        String result = instance.getMedicamentoAlergico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMedicamentoAlergico method, of class DependentePedagogia.
     */
    @Test
    public void testSetMedicamentoAlergico() {
        System.out.println("setMedicamentoAlergico");
        String medicamentoAlergico = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setMedicamentoAlergico(medicamentoAlergico);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getnBoletimOcorrencia method, of class DependentePedagogia.
     */
    @Test
    public void testGetnBoletimOcorrencia() {
        System.out.println("getnBoletimOcorrencia");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "102030";
        instance.setnBoletimOcorrencia("102030");
        String result = instance.getnBoletimOcorrencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setnBoletimOcorrencia method, of class DependentePedagogia.
     */
    @Test
    public void testSetnBoletimOcorrencia() {
        System.out.println("setnBoletimOcorrencia");
        String nBoletimOcorrencia = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setnBoletimOcorrencia(nBoletimOcorrencia);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNome method, of class DependentePedagogia.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Cotrim";
        instance.setNome("Cotrim");
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNome method, of class DependentePedagogia.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNomeAbrigada method, of class DependentePedagogia.
     */
    @Test
    public void testGetNomeAbrigada() {
        System.out.println("getNomeAbrigada");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "mamae";
        instance.setNomeAbrigada("mamae");
        String result = instance.getNomeAbrigada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNomeAbrigada method, of class DependentePedagogia.
     */
    @Test
    public void testSetNomeAbrigada() {
        System.out.println("setNomeAbrigada");
        String nomeAbrigada = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setNomeAbrigada(nomeAbrigada);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNomeAgressor method, of class DependentePedagogia.
     */
    @Test
    public void testGetNomeAgressor() {
        System.out.println("getNomeAgressor");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Adelaide";
        instance.setNomeAgressor("Adelaide");
        String result = instance.getNomeAgressor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNomeAgressor method, of class DependentePedagogia.
     */
    @Test
    public void testSetNomeAgressor() {
        System.out.println("setNomeAgressor");
        String nomeAgressor = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setNomeAgressor(nomeAgressor);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getOrgaoDeEncaminhamento method, of class DependentePedagogia.
     */
    @Test
    public void testGetOrgaoDeEncaminhamento() {
        System.out.println("getOrgaoDeEncaminhamento");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "policia";
        instance.setOrgaoDeEncaminhamento("policia");
        String result = instance.getOrgaoDeEncaminhamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setOrgaoDeEncaminhamento method, of class DependentePedagogia.
     */
    @Test
    public void testSetOrgaoDeEncaminhamento() {
        System.out.println("setOrgaoDeEncaminhamento");
        String orgaoDeEncaminhamento = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setOrgaoDeEncaminhamento(orgaoDeEncaminhamento);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPastaEspecialVIJ method, of class DependentePedagogia.
     */
    @Test
    public void testGetPastaEspecialVIJ() {
        System.out.println("getPastaEspecialVIJ");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Pasta";
        instance.setPastaEspecialVIJ("Pasta");
        String result = instance.getPastaEspecialVIJ();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPastaEspecialVIJ method, of class DependentePedagogia.
     */
    @Test
    public void testSetPastaEspecialVIJ() {
        System.out.println("setPastaEspecialVIJ");
        String pastaEspecialVIJ = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setPastaEspecialVIJ(pastaEspecialVIJ);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isPortadorNecessidadeEspeciais method, of class DependentePedagogia.
     */
    @Test
    public void testIsPortadorNecessidadeEspeciais() {
        System.out.println("isPortadorNecessidadeEspeciais");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isPortadorNecessidadeEspeciais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPortadorNecessidadeEspeciais method, of class DependentePedagogia.
     */
    @Test
    public void testSetPortadorNecessidadeEspeciais() {
        System.out.println("setPortadorNecessidadeEspeciais");
        boolean portadorNecessidadeEspeciais = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setPortadorNecessidadeEspeciais(portadorNecessidadeEspeciais);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPossuiAlergia method, of class DependentePedagogia.
     */
    @Test
    public void testGetPossuiAlergia() {
        System.out.println("getPossuiAlergia");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Nenhuma";
        instance.setPossuiAlergia("Nenhuma");
        String result = instance.getPossuiAlergia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPossuiAlergia method, of class DependentePedagogia.
     */
    @Test
    public void testSetPossuiAlergia() {
        System.out.println("setPossuiAlergia");
        String possuiAlergia = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setPossuiAlergia(possuiAlergia);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPossuiDoenca method, of class DependentePedagogia.
     */
    @Test
    public void testGetPossuiDoenca() {
        System.out.println("getPossuiDoenca");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Todas";
        instance.setPossuiDoenca("Todas");
        String result = instance.getPossuiDoenca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPossuiDoenca method, of class DependentePedagogia.
     */
    @Test
    public void testSetPossuiDoenca() {
        System.out.println("setPossuiDoenca");
        String possuiDoenca = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setPossuiDoenca(possuiDoenca);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPqNaoDenunciouAntes method, of class DependentePedagogia.
     */
    @Test
    public void testGetPqNaoDenunciouAntes() {
        System.out.println("getPqNaoDenunciouAntes");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Medo";
        instance.setPqNaoDenunciouAntes("Medo");
        String result = instance.getPqNaoDenunciouAntes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPqNaoDenunciouAntes method, of class DependentePedagogia.
     */
    @Test
    public void testSetPqNaoDenunciouAntes() {
        System.out.println("setPqNaoDenunciouAntes");
        String pqNaoDenunciouAntes = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setPqNaoDenunciouAntes(pqNaoDenunciouAntes);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isPresenciouVilenciaContraParentescos method, of class DependentePedagogia.
     */
    @Test
    public void testIsPresenciouVilenciaContraParentescos() {
        System.out.println("isPresenciouVilenciaContraParentescos");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isPresenciouVilenciaContraParentescos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPresenciouVilenciaContraParentescos method, of class DependentePedagogia.
     */
    @Test
    public void testSetPresenciouVilenciaContraParentescos() {
        System.out.println("setPresenciouVilenciaContraParentescos");
        boolean presenciouVilenciaContraParentescos = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setPresenciouVilenciaContraParentescos(presenciouVilenciaContraParentescos);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isPrimeiraAgressao method, of class DependentePedagogia.
     */
    @Test
    public void testIsPrimeiraAgressao() {
        System.out.println("isPrimeiraAgressao");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isPrimeiraAgressao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPrimeiraAgressao method, of class DependentePedagogia.
     */
    @Test
    public void testSetPrimeiraAgressao() {
        System.out.println("setPrimeiraAgressao");
        boolean primeiraAgressao = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setPrimeiraAgressao(primeiraAgressao);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isPrimeiraDenuncia method, of class DependentePedagogia.
     */
    @Test
    public void testIsPrimeiraDenuncia() {
        System.out.println("isPrimeiraDenuncia");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isPrimeiraDenuncia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPrimeiraDenuncia method, of class DependentePedagogia.
     */
    @Test
    public void testSetPrimeiraDenuncia() {
        System.out.println("setPrimeiraDenuncia");
        boolean primeiraDenuncia = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setPrimeiraDenuncia(primeiraDenuncia);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getProntuario method, of class DependentePedagogia.
     */
    @Test
    public void testGetProntuario() {
        System.out.println("getProntuario");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Prontuario";
        instance.setProntuario("Prontuario");
        String result = instance.getProntuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setProntuario method, of class DependentePedagogia.
     */
    @Test
    public void testSetProntuario() {
        System.out.println("setProntuario");
        String prontuario = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setProntuario(prontuario);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getQualDroga method, of class DependentePedagogia.
     */
    @Test
    public void testGetQualDroga() {
        System.out.println("getQualDroga");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Ritalina 60mg";
        instance.setQualDroga("Ritalina 60mg");
        String result = instance.getQualDroga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setQualDroga method, of class DependentePedagogia.
     */
    @Test
    public void testSetQualDroga() {
        System.out.println("setQualDroga");
        String qualDroga = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setQualDroga(qualDroga);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getQuantasVezes method, of class DependentePedagogia.
     */
    @Test
    public void testGetQuantasVezes() {
        System.out.println("getQuantasVezes");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Muitas";
        instance.setQuantasVezes("Muitas");
        String result = instance.getQuantasVezes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setQuantasVezes method, of class DependentePedagogia.
     */
    @Test
    public void testSetQuantasVezes() {
        System.out.println("setQuantasVezes");
        String quantasVezes = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setQuantasVezes(quantasVezes);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRelacaoDependente method, of class DependentePedagogia.
     */
    @Test
    public void testGetRelacaoDependente() {
        System.out.println("getRelacaoDependente");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Tia";
        instance.setRelacaoDependente("Tia");
        String result = instance.getRelacaoDependente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setRelacaoDependente method, of class DependentePedagogia.
     */
    @Test
    public void testSetRelacaoDependente() {
        System.out.println("setRelacaoDependente");
        String relacaoDependente = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setRelacaoDependente(relacaoDependente);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSerie method, of class DependentePedagogia.
     */
    @Test
    public void testGetSerie() {
        System.out.println("getSerie");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "5";
        instance.setSerie("5");
        String result = instance.getSerie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setSerie method, of class DependentePedagogia.
     */
    @Test
    public void testSetSerie() {
        System.out.println("setSerie");
        String serie = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setSerie(serie);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTempoOcorreAgressoes method, of class DependentePedagogia.
     */
    @Test
    public void testGetTempoOcorreAgressoes() {
        System.out.println("getTempoOcorreAgressoes");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Muitos anos";
        instance.setTempoOcorreAgressoes("Muitos anos");
        String result = instance.getTempoOcorreAgressoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTempoOcorreAgressoes method, of class DependentePedagogia.
     */
    @Test
    public void testSetTempoOcorreAgressoes() {
        System.out.println("setTempoOcorreAgressoes");
        String tempoOcorreAgressoes = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setTempoOcorreAgressoes(tempoOcorreAgressoes);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTipoDeViolenciaSofrida method, of class DependentePedagogia.
     */
    @Test
    public void testGetTipoDeViolenciaSofrida() {
        System.out.println("getTipoDeViolenciaSofrida");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Psicologica";
        instance.setTipoDeViolenciaSofrida("Psicologica");
        String result = instance.getTipoDeViolenciaSofrida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTipoDeViolenciaSofrida method, of class DependentePedagogia.
     */
    @Test
    public void testSetTipoDeViolenciaSofrida() {
        System.out.println("setTipoDeViolenciaSofrida");
        String tipoDeViolenciaSofrida = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setTipoDeViolenciaSofrida(tipoDeViolenciaSofrida);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTipoDoenca method, of class DependentePedagogia.
     */
    @Test
    public void testGetTipoDoenca() {
        System.out.println("getTipoDoenca");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Crônica";
        instance.setTipoDoenca("Crônica");
        String result = instance.getTipoDoenca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTipoDoenca method, of class DependentePedagogia.
     */
    @Test
    public void testSetTipoDoenca() {
        System.out.println("setTipoDoenca");
        String tipoDoenca = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setTipoDoenca(tipoDoenca);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isUsaDrogas method, of class DependentePedagogia.
     */
    @Test
    public void testIsUsaDrogas() {
        System.out.println("isUsaDrogas");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isUsaDrogas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setUsaDrogas method, of class DependentePedagogia.
     */
    @Test
    public void testSetUsaDrogas() {
        System.out.println("setUsaDrogas");
        boolean usaDrogas = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setUsaDrogas(usaDrogas);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSexo method, of class DependentePedagogia.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Macho";
        instance.setSexo("Macho");
        String result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setSexo method, of class DependentePedagogia.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEscolaMatriculado method, of class DependentePedagogia.
     */
    @Test
    public void testGetEscolaMatriculado() {
        System.out.println("getEscolaMatriculado");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Tamandua";
        instance.setEscolaMatriculado("Tamandua");
        String result = instance.getEscolaMatriculado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setEscolaMatriculado method, of class DependentePedagogia.
     */
    @Test
    public void testSetEscolaMatriculado() {
        System.out.println("setEscolaMatriculado");
        String escolaMatriculado = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setEscolaMatriculado(escolaMatriculado);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPorqueNaoMatriculado method, of class DependentePedagogia.
     */
    @Test
    public void testGetPorqueNaoMatriculado() {
        System.out.println("getPorqueNaoMatriculado");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Falta transporte";
        instance.setPorqueNaoMatriculado("Falta transporte");
        String result = instance.getPorqueNaoMatriculado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPorqueNaoMatriculado method, of class DependentePedagogia.
     */
    @Test
    public void testSetPorqueNaoMatriculado() {
        System.out.println("setPorqueNaoMatriculado");
        String porqueNaoMatriculado = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setPorqueNaoMatriculado(porqueNaoMatriculado);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEncaminhadaIMLFisica method, of class DependentePedagogia.
     */
    @Test
    public void testGetEncaminhadaIMLFisica() {
        System.out.println("getEncaminhadaIMLFisica");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Não";
        instance.setEncaminhadaIMLFisica("Não");
        String result = instance.getEncaminhadaIMLFisica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setEncaminhadaIMLFisica method, of class DependentePedagogia.
     */
    @Test
    public void testSetEncaminhadaIMLFisica() {
        System.out.println("setEncaminhadaIMLFisica");
        String encaminhadaIMLFisica = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setEncaminhadaIMLFisica(encaminhadaIMLFisica);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEncaminhadaIMLSexual method, of class DependentePedagogia.
     */
    @Test
    public void testGetEncaminhadaIMLSexual() {
        System.out.println("getEncaminhadaIMLSexual");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Não";
        instance.setEncaminhadaIMLSexual("Não");
        String result = instance.getEncaminhadaIMLSexual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setEncaminhadaIMLSexual method, of class DependentePedagogia.
     */
    @Test
    public void testSetEncaminhadaIMLSexual() {
        System.out.println("setEncaminhadaIMLSexual");
        String encaminhadaIMLSexual = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setEncaminhadaIMLSexual(encaminhadaIMLSexual);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isMatriculado method, of class DependentePedagogia.
     */
    @Test
    public void testIsMatriculado_0args() {
        System.out.println("isMatriculado");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isMatriculado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMatriculado method, of class DependentePedagogia.
     */
    @Test
    public void testSetMatriculado() {
        System.out.println("setMatriculado");
        boolean matriculado = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setMatriculado(matriculado);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getQualFormaFisica method, of class DependentePedagogia.
     */
    @Test
    public void testGetQualFormaFisica() {
        System.out.println("getQualFormaFisica");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Nenhuma";
        instance.setQualFormaFisica("Nenhuma");
        String result = instance.getQualFormaFisica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setQualFormaFisica method, of class DependentePedagogia.
     */
    @Test
    public void testSetQualFormaFisica() {
        System.out.println("setQualFormaFisica");
        String qualFormaFisica = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setQualFormaFisica(qualFormaFisica);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getQualFormaMoral method, of class DependentePedagogia.
     */
    @Test
    public void testGetQualFormaMoral() {
        System.out.println("getQualFormaMoral");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Xingamento";
        instance.setQualFormaMoral("Xingamento");
        String result = instance.getQualFormaMoral();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setQualFormaMoral method, of class DependentePedagogia.
     */
    @Test
    public void testSetQualFormaMoral() {
        System.out.println("setQualFormaMoral");
        String qualFormaMoral = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setQualFormaMoral(qualFormaMoral);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getQualFormaPatrimonial method, of class DependentePedagogia.
     */
    @Test
    public void testGetQualFormaPatrimonial() {
        System.out.println("getQualFormaPatrimonial");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Nenhuma";
        instance.setQualFormaPatrimonial("Nenhuma");
        String result = instance.getQualFormaPatrimonial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setQualFormaPatrimonial method, of class DependentePedagogia.
     */
    @Test
    public void testSetQualFormaPatrimonial() {
        System.out.println("setQualFormaPatrimonial");
        String qualFormaPatrimonial = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setQualFormaPatrimonial(qualFormaPatrimonial);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getQualFormaPsicologica method, of class DependentePedagogia.
     */
    @Test
    public void testGetQualFormaPsicologica() {
        System.out.println("getQualFormaPsicologica");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Todas as imaginadas";
        instance.setQualFormaPsicologica("Todas as imaginadas");
        String result = instance.getQualFormaPsicologica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setQualFormaPsicologica method, of class DependentePedagogia.
     */
    @Test
    public void testSetQualFormaPsicologica() {
        System.out.println("setQualFormaPsicologica");
        String qualFormaPsicologica = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setQualFormaPsicologica(qualFormaPsicologica);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getQualFormaSexual method, of class DependentePedagogia.
     */
    @Test
    public void testGetQualFormaSexual() {
        System.out.println("getQualFormaSexual");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = "Nenhuma";
        instance.setQualFormaSexual("Nenhuma");
        String result = instance.getQualFormaSexual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setQualFormaSexual method, of class DependentePedagogia.
     */
    @Test
    public void testSetQualFormaSexual() {
        System.out.println("setQualFormaSexual");
        String qualFormaSexual = "";
        DependentePedagogia instance = new DependentePedagogia();
        instance.setQualFormaSexual(qualFormaSexual);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isViolenciaFisica method, of class DependentePedagogia.
     */
    @Test
    public void testIsViolenciaFisica() {
        System.out.println("isViolenciaFisica");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isViolenciaFisica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setViolenciaFisica method, of class DependentePedagogia.
     */
    @Test
    public void testSetViolenciaFisica() {
        System.out.println("setViolenciaFisica");
        boolean violenciaFisica = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setViolenciaFisica(violenciaFisica);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isViolenciaMoral method, of class DependentePedagogia.
     */
    @Test
    public void testIsViolenciaMoral() {
        System.out.println("isViolenciaMoral");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isViolenciaMoral();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setViolenciaMoral method, of class DependentePedagogia.
     */
    @Test
    public void testSetViolenciaMoral() {
        System.out.println("setViolenciaMoral");
        boolean violenciaMoral = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setViolenciaMoral(violenciaMoral);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isViolenciaPatrimonial method, of class DependentePedagogia.
     */
    @Test
    public void testIsViolenciaPatrimonial() {
        System.out.println("isViolenciaPatrimonial");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isViolenciaPatrimonial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setViolenciaPatrimonial method, of class DependentePedagogia.
     */
    @Test
    public void testSetViolenciaPatrimonial() {
        System.out.println("setViolenciaPatrimonial");
        boolean violenciaPatrimonial = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setViolenciaPatrimonial(violenciaPatrimonial);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isViolenciaPsicologica method, of class DependentePedagogia.
     */
    @Test
    public void testIsViolenciaPsicologica() {
        System.out.println("isViolenciaPsicologica");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isViolenciaPsicologica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setViolenciaPsicologica method, of class DependentePedagogia.
     */
    @Test
    public void testSetViolenciaPsicologica() {
        System.out.println("setViolenciaPsicologica");
        boolean violenciaPsicologica = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setViolenciaPsicologica(violenciaPsicologica);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isViolenciaSexual method, of class DependentePedagogia.
     */
    @Test
    public void testIsViolenciaSexual() {
        System.out.println("isViolenciaSexual");
        DependentePedagogia instance = new DependentePedagogia();
        boolean expResult = false;
        boolean result = instance.isViolenciaSexual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setViolenciaSexual method, of class DependentePedagogia.
     */
    @Test
    public void testSetViolenciaSexual() {
        System.out.println("setViolenciaSexual");
        boolean violenciaSexual = false;
        DependentePedagogia instance = new DependentePedagogia();
        instance.setViolenciaSexual(violenciaSexual);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class DependentePedagogia.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DependentePedagogia instance = new DependentePedagogia();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
