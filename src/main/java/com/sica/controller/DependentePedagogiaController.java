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
import com.sica.dao.DependentePedagogiaDAO;
import com.sica.entity.DependentePedagogia;
import java.util.List;

/**
 *
 * @author sica
 */
@Resource
public class DependentePedagogiaController {
    private DependentePedagogiaDAO dao;
    private Result result;
    //private Validator validator;

    public DependentePedagogiaController(DependentePedagogiaDAO dao, Result result) {
        this.dao = dao;
        this.result = result;
        //this.validator = validator;
    }
    
    @Path("/dependentePedagogia/form")
    public void form(){      
    }
    
    //@Get("/dependentePedagogia")
    @Path("/dependentePedagogia/lista")
    public List<DependentePedagogia>lista(){
        return dao.listaTodos();
    }
    
    //@Get("/dependentePedagogia/{dependentePedagogia.id}")
    public DependentePedagogia visualiza(DependentePedagogia dependentePedagogia){
        return dependentePedagogia;    
    }
    
    public void adiciona(final DependentePedagogia dependentePedagogia){
        // Valida
        /*validator.checking(new Validations(){{
            //campos obrigatórios que devem ser preenchidos
            that(dependente.getDataAdmissao() != null, "", "data.vazio");
                that(dependente.getNomeAbrigada() != null, "Abrigada","nome.vazio");
            that(dependente.getNome() != null, "Dependente", "nome.vazio");
            that(dependente.getIdade() != null, "Idade: ", "descricao.vazio");
            that(dependente.getSexo() != null, "Sexo: ", "descricao.vazio");
            that(dependente.getProntuario() != null, "Prontuario: ", "descricao.vazio");
            that(dependente.getDataNascimento() != null, "Nascimento: ","data.vazio");
            //Situacao escolar
            that(dependente.getSerie() != null, "","serie.vazio");
            
            if(dependente.getMatriculado() == true)
                that(dependente.getEscolaMatriculado() != null, "escola:","descricao.vazio");
            else
                that(dependente.getPorqueNaoMatriculado() != null, "campo porque não matriculado: ","descricao.vazio");
            
            //Situação de saúde
            if(dependente.isPortadorNecessidadeEspeciais() == true){
              that(dependente.getPortadorNecessidadeEspeciaisSim() != null, "portador de necessidades especiais:", "seleciono pelo menos um checkbox");
            }   
            
            that(dependente.getHistoricoAcompanhamentoPsiquiatrico() != null, "Historico psiquiatrico: ","descricao.vazio");
            
            if(dependente.isUsaDrogas() == true){
                that(dependente.getQualDroga() != null, "Qual droga usa: ", "descricao.vazio");
                that(dependente.getFrequenciaUsoDrogas() != null, "Frequencia uso de drogas: ","descricao.vazio");
            }
            that(dependente.getPossuiDoenca() != null, "Possui doença: ","descricao.vazio");
            that(dependente.getMedicacaoControlada() != null, "","medicamento.vazio");
            
            //Violencia com dependente
            //Fisica
            if(dependente.isViolenciaFisica() == true){
                that(dependente.getQualFormaFisica() != null,"qual forma fisica: ","descricao.vazio");
                that(dependente.getLesaoAparente() != null, "lesao aparente: ","descricao.vazio");
                that(dependente.getEncaminhadaIMLFisica() != null, "encaminhamento IML: ", "descricao.vazio");
            }
            
            //Sexual
            if(dependente.isViolenciaMoral() == true){
                that(dependente.getQualFormaSexual() != null, "qual Forma sexual: ", "descricao.vazio");
                that(dependente.getEncaminhadaIMLSexual() != null, "Encaminhamento IML: ", "descricao.vazio");
            }
            
            //Patrimonial
            if(dependente.isViolenciaPatrimonial() == true)
                that(dependente.getQualFormaPatrimonial() != null,"qual forma patrimonial: ","descricao.vazio");
            //Moral
            if(dependente.isViolenciaMoral() == true)
                that(dependente.getQualFormaMoral() != null, "qual forma moral: ", "descricao.vazio");
            //Psicologico
            if(dependente.isViolenciaPsicologica() == true)
                that(dependente.getQualFormaPsicologica() != null, "qual forma psicologica: ", "descricao.vazio");
            
            //Agressor
            that(dependente.getRelacaoDependente() != null, "Relacao parentesco entre dependete e agressor: ","descricao.vazio");
            
        }});
        
        // Em caso de erro
        validator.onErrorUsePageOf(this.getClass()).form(dependente.getIdAbrigada()); 
        **/
        // Adiciona
        dao.adiciona(dependentePedagogia); 

        // Redireciona para a listagem
        result.redirectTo(this.getClass()).lista();
    }
    
    @Path("/dependentePedagogia/edita/{dependentePedagogia.idDependente}")
    public void edita(DependentePedagogia dependentePedagogia){        
        // Redireciona para o form de cadastro
        result.include("action", 1);
        result.include("dependentePedadogia", dao.findById(dependentePedagogia));
        result.redirectTo("/dependentePedagogia/form");  
    }
    
    @Path("/dependentePedagogia/atualizar")
    public void atualizar(final DependentePedagogia dependentePedagogia){
         // Validação
//        validator.checking(new Validations(){{
//            that(dependentePedagogia.getNome() != null, "dependentePedagogia.nome", "nome.vazio");
//        }});
        
//        validator.onErrorUsePageOf(this.getClass()).form(dependentePedagogia.getIdAbrigada()); 
        // Adiciona
        dao.edita(dependentePedagogia); 
        // Redireciona para a listagem
        result.redirectTo("/dependentePedagogia/lista");
    }
    
    @Path("/dependentePedagogia/info/{dependentePedagogia.idDependente}")
    public DependentePedagogia info(DependentePedagogia dependentePedagogia){
       return dao.findById(dependentePedagogia);
    }
    
    @Path("/dependentePedagogia/procura")
    public void procura(){
        
        //Validação
        
  //      validator.checking(new Validations(){{
  //          that(nomePesquisado != null ,"","nome.vazio");
  //      }});
        
        // Em caso de erro
//        validator.onErrorUsePageOf(this.getClass()).form(dependentePedagogia.getIdAbrigada()); 
        //faz procura
        //redireciona para listagem
        //result.redirectTo(this.getClass()).resultado(nomePesquisado);
  
    }
    
    @Path("/dependentePedagogia/listaResultado")
    public List<DependentePedagogia> listaResultado(String nomePesquisado) {
        result.include("action", 1);        
        result.include("dependentePedadogiaList",dao.findByName(nomePesquisado));
        result.redirectTo(this.getClass()).procura();
        return dao.findByName(nomePesquisado);    
    }
}
