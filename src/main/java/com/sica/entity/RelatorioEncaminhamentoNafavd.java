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
 * @author Matheus Fonseca
 */
@Entity
@Component
public class RelatorioEncaminhamentoNafavd {
    @Id
    @GeneratedValue
    private long id;
    private long idAbrigada;
    private long idNafavd;
    private String crp;
    private String observacoes;
    private String dataEmissao;
    private long tempoAbrigamento;

    public RelatorioEncaminhamentoNafavd() 
    {   
    }

    public RelatorioEncaminhamentoNafavd(long id, long idAbrigada, long idNafavd, String crp, String observacoes, String dataEmissao, long tempoAbrigamento) {
        this.id = id;
        this.idAbrigada = idAbrigada;
        this.idNafavd = idNafavd;
        this.crp = crp;
        this.observacoes = observacoes;
        this.dataEmissao = dataEmissao;
        this.tempoAbrigamento = tempoAbrigamento;
    }

    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdAbrigada() {
        return idAbrigada;
    }

    public void setIdAbrigada(long idAbrigada) {
        this.idAbrigada = idAbrigada;
    }

    public long getIdNafavd() {
        return idNafavd;
    }

    public void setIdNafavd(long idNafavd) {
        this.idNafavd = idNafavd;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public long getTempoAbrigamento() {
        return tempoAbrigamento;
    }

    public void setTempoAbrigamento(long tempoAbrigamento) {
        this.tempoAbrigamento = tempoAbrigamento;
    }

    @Override
    public String toString() {
        return "RelatorioEncaminhamentoNafavd{" + "id=" + id + ", idAbrigada=" + idAbrigada + ", idNafavd=" + idNafavd + ", crp=" + crp + ", observacoes=" + observacoes + ", dataEmissao=" + dataEmissao + ", tempoAbrigamento=" + tempoAbrigamento + '}';
    }
    
}
