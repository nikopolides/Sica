/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.entity;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.Processo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Leonn Ferreira
 */
@Entity
@Component
public class ProcessoAbrigada extends Processo {
   
    private Long idAbrigada;  
    private String acao;
    private String numeroProcesso;
    private String juizo;
    private String dataAudiencia;
    
    //agressor
    
    private String nomeAgressor;
    private String parentesco;
    private int idade;
    private String sexo;
    private String endereco;
    private String antecedentesCriminais;
    
   
    public ProcessoAbrigada() {
    }

    public ProcessoAbrigada(Long idAbrigada, String acao, String numeroProcesso, String juizo, String dataAudiencia, String nomeAgressor, String parentesco, int idade, String sexo, String endereco, String antecedentesCriminais, String id, long numeroBoletimOcorrencia, String orgaoEncaminhamento, String medidasProtetivas, String tipoViolencia, boolean primeiraAgressao, String primeiraOcorrencia, String tempoAgressao, boolean processosJudiciais, String numeroMedidas, String dataAudienciaProtetiva, String juizado, boolean intimacaoAgressor, String medidasDeferidas, String encaminhamentoDefensoria, String acaoCivil, String numeroProcessoCivil, String juizoCivil, String dataAudienciaCivil) {
        super(id, numeroBoletimOcorrencia, orgaoEncaminhamento, medidasProtetivas, tipoViolencia, primeiraAgressao, primeiraOcorrencia, tempoAgressao, processosJudiciais, numeroMedidas, dataAudienciaProtetiva, juizado, intimacaoAgressor, medidasDeferidas, encaminhamentoDefensoria, acaoCivil, numeroProcessoCivil, juizoCivil, dataAudienciaCivil);
        this.idAbrigada = idAbrigada;
        this.acao = acao;
        this.numeroProcesso = numeroProcesso;
        this.juizo = juizo;
        this.dataAudiencia = dataAudiencia;
        this.nomeAgressor = nomeAgressor;
        this.parentesco = parentesco;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.antecedentesCriminais = antecedentesCriminais;
    }

   
    public Long getIdAbrigada() {
        return idAbrigada;
    }

    public void setIdAbrigada(Long idAbrigada) {
        this.idAbrigada = idAbrigada;
    }
    public String getDataAudiencia(){
        return this.dataAudiencia;
    }
    public void setDataAudiencia(String dataAudiencia){
        this.dataAudiencia = dataAudiencia;
    }
    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getAntecedentesCriminais() {
        return antecedentesCriminais;
    }

    public void setAntecedentesCriminais(String antecedentesCriminais) {
        this.antecedentesCriminais = antecedentesCriminais;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getJuizo() {
        return juizo;
    }

    public void setJuizo(String juizo) {
        this.juizo = juizo;
    }

    public String getNomeAgressor() {
        return nomeAgressor;
    }

    public void setNomeAgressor(String nomeAgressor) {
        this.nomeAgressor = nomeAgressor;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    
}
