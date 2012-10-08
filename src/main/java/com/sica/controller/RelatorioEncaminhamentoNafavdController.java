/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import com.sica.dao.*;
import com.sica.entity.*;
import java.util.ArrayList;
import java.util.List;
import com.sica.util.DatasUtil;

/**
 *
 * @author Matheus Fonseca
 */
@Resource
public class RelatorioEncaminhamentoNafavdController {
        
    private RelatorioEncaminhamentoNafavdDAO dao;
    private AbrigadaDAO abrigadaDAO;
    private AgressorDAO agressorDAO;
    private DependenteDAO dependenteDAO;
    private NafavdDAO nafavdDAO;
    private Result result;
    private Validator validator;
    
    
    public RelatorioEncaminhamentoNafavdController(RelatorioEncaminhamentoNafavdDAO dao, AbrigadaDAO abrigadaDAO, AgressorDAO agressorDAO, DependenteDAO dependenteDAO, NafavdDAO nafavdDAO, Result result, Validator validator) {
        this.dao = dao;
        this.abrigadaDAO = abrigadaDAO;
        this.agressorDAO = agressorDAO;
        this.dependenteDAO = dependenteDAO;
        this.nafavdDAO = nafavdDAO;
        this.result = result;
        this.validator = validator;
    }
    
    @Path("/relatorioEncaminhamentoNafavd/form/{relatorioEncaminhamentoNafavd.idAbrigada}")
    public void form(RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd){
        Abrigada abrigada = new Abrigada();
        abrigada.setId(relatorioEncaminhamentoNafavd.getIdAbrigada());
        
        Agressor agressor = new Agressor();
        agressor.setIdAbrigada(abrigada.getId());
        try {
            List listAgressor = agressorDAO.listaTodos(agressor);
            agressor = (Agressor) listAgressor.get(0);
        } catch (IndexOutOfBoundsException i) {
            
        }
            
        Dependente dependente = new Dependente();
        dependente.setIdAbrigada(abrigada.getId());
        List dependenteList = dependenteDAO.listaTodos(dependente);
        
        result.include("dependenteList", dependenteList);
        result.include("abrigada",abrigadaDAO.findById(abrigada));
        result.include("agressor",agressor);
        result.include("nafavdList",nafavdDAO.listaTodos());
    }
    
    @Path("/relatorioEncaminhamentoNafavd/info/{relatorioEncaminhamentoNafavd.id}")
    public void info(RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd){
        relatorioEncaminhamentoNafavd = dao.findById(relatorioEncaminhamentoNafavd);
        
        Abrigada abrigada = new Abrigada();
        abrigada.setId(relatorioEncaminhamentoNafavd.getIdAbrigada());
        
        Agressor agressor = new Agressor();
        agressor.setIdAbrigada(abrigada.getId());
        try {
        List listAgressor = agressorDAO.listaTodos(agressor);
        agressor = (Agressor) listAgressor.get(0);
        } catch (IndexOutOfBoundsException i) {
            
        }
        Nafavd nafavd = new Nafavd();
        nafavd.setId(relatorioEncaminhamentoNafavd.getIdNafavd());
        
        Dependente dependente = new Dependente();
        dependente.setIdAbrigada(abrigada.getId());
        List dependenteList = dependenteDAO.listaTodos(dependente);
        
        result.include("dependenteList", dependenteList);
        result.include("relatorioEncaminhamentoNafavd", relatorioEncaminhamentoNafavd);
        result.include("abrigada",abrigadaDAO.findById(abrigada));
        result.include("agressor",agressor);
        result.include("nafavd",nafavdDAO.findById(nafavd));
    }
    
    public void adiciona(final RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd){
        // Valida
        validator.checking(new Validations(){{
            that(relatorioEncaminhamentoNafavd.getObservacoes() != null, "relatorioEncaminhamentoNafavd.observacoes", "observacoes.vazio");
        
        }});
        
        // Em caso de erro
        validator.onErrorUsePageOf(this.getClass()).form(relatorioEncaminhamentoNafavd);
        
        Abrigada abrigada = new Abrigada();
        abrigada.setId(relatorioEncaminhamentoNafavd.getIdAbrigada());
        abrigada = abrigadaDAO.findById(abrigada);
        
        relatorioEncaminhamentoNafavd.setTempoAbrigamento(DatasUtil.diferencaDeDias(abrigada.getDataEntrada(),relatorioEncaminhamentoNafavd.getDataEmissao()));
        
        // Adiciona
        dao.adiciona(relatorioEncaminhamentoNafavd); 

        // Redireciona para a listagem
        result.redirectTo("/relatorioEncaminhamentoNafavd/lista/"+relatorioEncaminhamentoNafavd.getIdAbrigada());
    }
    
    @Path("/relatorioEncaminhamentoNafavd/lista/{relatorioEncaminhamentoNafavd.idAbrigada}")
    public void lista(RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd){
        Abrigada abrigada = new Abrigada();
        abrigada.setId(relatorioEncaminhamentoNafavd.getIdAbrigada());
        
        Agressor agressor = new Agressor();
        agressor.setIdAbrigada(abrigada.getId());
        
        try {
            List listAgressor = agressorDAO.listaTodos(agressor);
            agressor = (Agressor) listAgressor.get(0);
        } catch (IndexOutOfBoundsException i) {
            
        }

        List <RelatorioEncaminhamentoNafavd> relatorioEncaminhamentoNafavdList = dao.listaTodosAbrigada(relatorioEncaminhamentoNafavd);
        List <Nafavd> nafavdList =  new ArrayList();
        for (int i=0; i<relatorioEncaminhamentoNafavdList.size(); i++)
        {
            Nafavd nafavd = new Nafavd();
            nafavd.setId(relatorioEncaminhamentoNafavdList.get(i).getIdNafavd());
            nafavd = nafavdDAO.findById(nafavd);
            nafavdList.add(nafavd);
        }
        
        Dependente dependente = new Dependente();
        dependente.setIdAbrigada(abrigada.getId());
        List dependenteList = dependenteDAO.listaTodos(dependente);
        
        result.include("dependenteList", dependenteList);
        result.include("relatorioEncaminhamentoNafavdList", relatorioEncaminhamentoNafavdList);
        result.include("abrigada", abrigadaDAO.findById(abrigada));
        result.include("agressor", agressorDAO.findById(agressor));
        result.include("nafavdList", nafavdList);
    }
    
    @Path("/relatorioEncaminhamentoNafavd/edita/{relatorioEncaminhamentoNafavd.id}")
    public void edita(RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd){        
        // Redireciona para o form de cadastro
        result.include("action", 1);
        result.include("relatorioEncaminhamentoNafavd", dao.findById(relatorioEncaminhamentoNafavd));
        result.redirectTo("/relatorioEncaminhamentoNafavd/form/"+relatorioEncaminhamentoNafavd.getIdAbrigada());
    }
    
    @Path("/relatorioEncaminhamentoNafavd/deleta/{relatorioEncaminhamentoNafavd.idAbrigada}/{relatorioEncaminhamentoNafavd.id}")
    public void deleta(RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd){        
        dao.deleta(relatorioEncaminhamentoNafavd);
        // Redireciona para a listagem
        result.redirectTo("/relatorioEncaminhamentoNafavd/lista/"+relatorioEncaminhamentoNafavd.getIdAbrigada());
    }
    
    @Path("/relatorioEncaminhamentoNafavd/atualizar")
    public void atualizar(final RelatorioEncaminhamentoNafavd relatorioEncaminhamentoNafavd){
         // Valida
        validator.checking(new Validations(){{
            that(relatorioEncaminhamentoNafavd.getObservacoes() != null, "relatorioEncaminhamentoNafavd.observacoes", "observacoes.vazio");
        
        }});

        // Em caso de erro
        result.include("action");
        result.include("relatorioEncaminhamentoNafavd", relatorioEncaminhamentoNafavd);
        validator.onErrorUsePageOf(this.getClass()).form(relatorioEncaminhamentoNafavd); 
        
        Abrigada abrigada = new Abrigada();
        abrigada.setId(relatorioEncaminhamentoNafavd.getIdAbrigada());
        abrigada = abrigadaDAO.findById(abrigada);
        
        relatorioEncaminhamentoNafavd.setTempoAbrigamento(DatasUtil.diferencaDeDias(abrigada.getDataEntrada(),relatorioEncaminhamentoNafavd.getDataEmissao()));
        
        // Adiciona
        dao.edita(relatorioEncaminhamentoNafavd); 
        
        // Redireciona para a listagem
        result.redirectTo("/relatorioEncaminhamentoNafavd/lista/"+relatorioEncaminhamentoNafavd.getIdAbrigada());
    }
}
