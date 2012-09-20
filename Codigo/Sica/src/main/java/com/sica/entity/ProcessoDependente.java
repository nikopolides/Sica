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
public class ProcessoDependente extends Processo{
    
    private Long idDependente;
    private String pastaVaraInfancia;;
    private boolean presenciouAgressao;   
   

    public ProcessoDependente() {
    }

    public ProcessoDependente(Long idDependente, String pastaVaraInfancia, boolean presenciouAgressao, Long idAbrigada, String id, long numeroBoletimOcorrencia, String orgaoEncaminhamento, String medidasProtetivas, String tipoViolencia, boolean primeiraAgressao, String primeiraOcorrencia, String tempoAgressao, boolean processosJudiciais, String numeroMedidas, String dataAudienciaProtetiva, String juizado, boolean intimacaoAgressor, String medidasDeferidas, String encaminhamentoDefensoria, String acaoCivil, String numeroProcessoCivil, String juizoCivil, String dataAudienciaCivil) {
        super(id, numeroBoletimOcorrencia, orgaoEncaminhamento, medidasProtetivas, tipoViolencia, primeiraAgressao, primeiraOcorrencia, tempoAgressao, processosJudiciais, numeroMedidas, dataAudienciaProtetiva, juizado, intimacaoAgressor, medidasDeferidas, encaminhamentoDefensoria, acaoCivil, numeroProcessoCivil, juizoCivil, dataAudienciaCivil);
        this.idDependente = idDependente;
        this.pastaVaraInfancia = pastaVaraInfancia;
        this.presenciouAgressao = presenciouAgressao;
    }

    
    public Long getIdDependente() {
        return idDependente;
    }

    public void setIdDependente(Long idDependente) {
        this.idDependente = idDependente;
    }

    public String getPastaVaraInfancia() {
        return pastaVaraInfancia;
    }

    public void setPastaVaraInfancia(String pastaVaraInfancia) {
        this.pastaVaraInfancia = pastaVaraInfancia;
    }

    public boolean isPresenciouAgressao() {
        return presenciouAgressao;
    }

    public void setPresenciouAgressao(boolean presenciouAgressao) {
        this.presenciouAgressao = presenciouAgressao;
    }

    @Override
    public String toString() {
        return "ProcessoDependente{" + "idDependente=" + idDependente + ", pastaVaraInfancia=" + pastaVaraInfancia + ", presenciouAgressao=" + presenciouAgressao + '}';
    }

    
  

    
    
}
