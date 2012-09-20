/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.entity;

import br.com.caelum.vraptor.ioc.Component;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Leonn Ferreira
 */
@Entity
@Component
public class Processo {
    @Id
    @GeneratedValue
    private String id;
    private long numeroBoletimOcorrencia;
    private String orgaoEncaminhamento;
    private String medidasProtetivas;
    private String tipoViolencia;
    private boolean primeiraAgressao;
    private String primeiraOcorrencia;
    private String tempoAgressao;
    private boolean processosJudiciais;
    
    //dados processuais - medidas protetivas de urgencia
    
    private String numeroMedidas;
    private String dataAudienciaProtetiva;
    private String juizado;
    private boolean intimacaoAgressor;
    private String medidasDeferidas;
    
    //acoes civeis
    
    private String encaminhamentoDefensoria;
    private String acaoCivil;
    private String numeroProcessoCivil;
    private String juizoCivil;
    private String dataAudienciaCivil;
   

    public Processo() {
    }

    public Processo(String id, long numeroBoletimOcorrencia, String orgaoEncaminhamento, String medidasProtetivas, String tipoViolencia, boolean primeiraAgressao, String primeiraOcorrencia, String tempoAgressao, boolean processosJudiciais, String numeroMedidas, String dataAudienciaProtetiva, String juizado, boolean intimacaoAgressor, String medidasDeferidas, String encaminhamentoDefensoria, String acaoCivil, String numeroProcessoCivil, String juizoCivil, String dataAudienciaCivil) {
        this.id = id;
        this.numeroBoletimOcorrencia = numeroBoletimOcorrencia;
        this.orgaoEncaminhamento = orgaoEncaminhamento;
        this.medidasProtetivas = medidasProtetivas;
        this.tipoViolencia = tipoViolencia;
        this.primeiraAgressao = primeiraAgressao;
        this.primeiraOcorrencia = primeiraOcorrencia;
        this.tempoAgressao = tempoAgressao;
        this.processosJudiciais = processosJudiciais;
        this.numeroMedidas = numeroMedidas;
        this.dataAudienciaProtetiva = dataAudienciaProtetiva;
        this.juizado = juizado;
        this.intimacaoAgressor = intimacaoAgressor;
        this.medidasDeferidas = medidasDeferidas;
        this.encaminhamentoDefensoria = encaminhamentoDefensoria;
        this.acaoCivil = acaoCivil;
        this.numeroProcessoCivil = numeroProcessoCivil;
        this.juizoCivil = juizoCivil;
        this.dataAudienciaCivil = dataAudienciaCivil;
    }
    
    

    public String getAcaoCivil() {
        return acaoCivil;
    }

    public void setAcaoCivil(String acaoCivil) {
        this.acaoCivil = acaoCivil;
    }

    public String getDataAudienciaCivil() {
        return dataAudienciaCivil;
    }

    public void setDataAudienciaCivil(String dataAudienciaCivil) {
        this.dataAudienciaCivil = dataAudienciaCivil;
    }

    public String getJuizoCivil() {
        return juizoCivil;
    }

    public void setJuizoCivil(String juizoCivil) {
        this.juizoCivil = juizoCivil;
    }

    public String getNumeroProcessoCivil() {
        return numeroProcessoCivil;
    }

    public void setNumeroProcessoCivil(String numeroProcessoCivil) {
        this.numeroProcessoCivil = numeroProcessoCivil;
    }

    
    
    public String getDataAudienciaProtetiva() {
        return dataAudienciaProtetiva;
    }

    public void setDataAudienciaProtetiva(String dataAudienciaProtetiva) {
        this.dataAudienciaProtetiva = dataAudienciaProtetiva;
    }

    public String getEncaminhamentoDefensoria() {
        return encaminhamentoDefensoria;
    }

    public void setEncaminhamentoDefensoria(String encaminhamentoDefensoria) {
        this.encaminhamentoDefensoria = encaminhamentoDefensoria;
    }

    public boolean isIntimacaoAgressor() {
        return intimacaoAgressor;
    }

    public void setIntimacaoAgressor(boolean intimacaoAgressor) {
        this.intimacaoAgressor = intimacaoAgressor;
    }

    public String getJuizado() {
        return juizado;
    }

    public void setJuizado(String juizado) {
        this.juizado = juizado;
    }

    public String getMedidasDeferidas() {
        return medidasDeferidas;
    }

    public void setMedidasDeferidas(String medidasDeferidas) {
        this.medidasDeferidas = medidasDeferidas;
    }

    public String getNumeroMedidas() {
        return numeroMedidas;
    }

    public void setNumeroMedidas(String numeroMedidas) {
        this.numeroMedidas = numeroMedidas;
    }

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getMedidasProtetivas() {
        return medidasProtetivas;
    }

    public void setMedidasProtetivas(String medidasProtetivas) {
        this.medidasProtetivas = medidasProtetivas;
    }

    public long getNumeroBoletimOcorrencia() {
        return numeroBoletimOcorrencia;
    }

    public void setNumeroBoletimOcorrencia(long numeroBoletimOcorrencia) {
        this.numeroBoletimOcorrencia = numeroBoletimOcorrencia;
    }


    public String getOrgaoEncaminhamento() {
        return orgaoEncaminhamento;
    }

    public void setOrgaoEncaminhamento(String orgaoEncaminhamento) {
        this.orgaoEncaminhamento = orgaoEncaminhamento;
    }

    public boolean isPrimeiraAgressao() {
        return primeiraAgressao;
    }

    public void setPrimeiraAgressao(boolean primeiraAgressao) {
        this.primeiraAgressao = primeiraAgressao;
    }

    public String getPrimeiraOcorrencia() {
        return primeiraOcorrencia;
    }

    public void setPrimeiraOcorrencia(String primeiraOcorrencia) {
        this.primeiraOcorrencia = primeiraOcorrencia;
    }

    public boolean isProcessosJudiciais() {
        return processosJudiciais;
    }

    public void setProcessosJudiciais(boolean processosJudiciais) {
        this.processosJudiciais = processosJudiciais;
    }

    public String getTempoAgressao() {
        return tempoAgressao;
    }

    public void setTempoAgressao(String tempoAgressao) {
        this.tempoAgressao = tempoAgressao;
    }

    public String getTipoViolencia() {
        return tipoViolencia;
    }

    public void setTipoViolencia(String tipoViolencia) {
        this.tipoViolencia = tipoViolencia;
    }

    @Override
    public String toString() {
        return "Processo{  id=" + id + ", numeroBoletimOcorrencia=" + numeroBoletimOcorrencia + ", orgaoEncaminhamento=" + orgaoEncaminhamento + ", medidasProtetivas=" + medidasProtetivas + ", tipoViolencia=" + tipoViolencia + ", primeiraAgressao=" + primeiraAgressao + ", primeiraOcorrencia=" + primeiraOcorrencia + ", tempoAgressao=" + tempoAgressao + ", processosJudiciais=" + processosJudiciais + ", numeroMedidas=" + numeroMedidas + ", dataAudiencia=" + dataAudienciaProtetiva + ", juizado=" + juizado + ", intimacaoAgressor=" + intimacaoAgressor + ", medidasDeferidas=" + medidasDeferidas + ", encaminhamentoDefensoria=" + encaminhamentoDefensoria + ", acaoCivil=" + acaoCivil + ", numeroProcessoCivil=" + numeroProcessoCivil + ", juizoCivil=" + juizoCivil + ", dataAudienciaCivil=" + dataAudienciaCivil + '}';
    }

   
    

  

    
    
}
